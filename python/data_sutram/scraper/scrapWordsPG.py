"""
This program will scrap each of the word from the wiktionary page. The starting page will be "https://en.wiktionary.org/wiki/Wiktionary:All_Thesaurus_pages".

Firstly we aim at constructing the scraper with 1 table and postgresql database.


"""
from datetime import tzinfo, timedelta, datetime

import time
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re
import os.path
import urllib.request
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

import psycopg2
conn_pg = psycopg2.connect("host=localhost dbname=postgres user=postgres password=jim12")
cur_pg = conn_pg.cursor()



commit_var = 0
def url_crawl(url,pid):
    global commit_var
    unique_nurl = 0
    commit_var += 1
    try:
        headers = {'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36'}
        req = urllib.request.Request(url, headers=headers)
        html = urllib.request.urlopen(req).read()	# html parser
        soup = BeautifulSoup(html, 'html.parser')
        cur_pg.execute('''UPDATE public.wiki_data SET cnc = %s WHERE url = %s''',(1,url,))
        cur_pg.execute('''UPDATE public.wiki_data SET html = %s WHERE url = %s''',(str(soup),url,))
        
        print(url,pid)
        test_li = re.findall(r'<li>(.+)</li>',str(soup))
        #print(test_li) # it have all the list element
        url_str = 'https://en.wiktionary.org'
        cur_pg.execute(''' SELECT max(sid) FROM wiki_data''')
        
        sid_max = cur_pg.fetchone()[0] #converts the cursor object to number
        print("max sid =-------------------------------------------------------------------------- ===> ",sid_max)
        if sid_max == None:
            sid_max = 0
        sid = sid_max + 1
        
        for item_li in test_li:
            find_first = item_li.find('href="')
            cut_first = find_first+6
            string_cut = item_li[cut_first:]
            find_sec = string_cut.find('"')
            get_url_part = string_cut[:find_sec]
            #print(get_url_part)
            next_url = url_str + get_url_part
            #print(next_url)
            cur_pg.execute('''INSERT OR IGNORE INTO public.wiki_data (cnc, pid, sid, url, html)
                        VALUES (%s, %s, %s, %s, %s)''', ( 0,pid,sid, next_url, "" ) )
            unique_nurl += 1
            sid += 1
        
    except:
        #fucked up
        print("Ops something is wrong!")
        print("url : ",url," BLOWN OFF !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        #set the cnc
        cur_pg.execute('''UPDATE public.wiki_data SET cnc = %s WHERE url = %s''',(1,url))
        #continue
    cur_pg.execute('''SELECT min(sid) FROM public.wiki_data WHERE cnc = %s''',[0])
    
    sid_ = cur_pg.fetchone()[0] #converts the cursor object to number
    print("min sid= ",sid_)
    print("NEW UNIQUE URL FOUND :: ",unique_nurl)
    get_next_url = cur_pg.execute('''SELECT url FROM wiki_data WHERE sid = %s''',[sid_])
    print("next url :  ",get_next_url)
    if commit_var%10==0:
        print("CCCCCCCCCCCCCCCCCCCCCCCCCCOOOOOOOOOOOOOOOOOOOOOOOOOOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMIIIIIIIIIIIIIIITTTTTTTTTTTTTTTTIIIIIIIIIIIIIIINNNNNNNNGGGGGGGGG")
        conn_pg.commit()
    #print("*************************************************** sid  ================",sid)
    #time.sleep(3)
    print("Current time  : ",datetime.now().isoformat(timespec='seconds'))
    print("Commit var : ",commit_var)
    url_crawl(str(get_next_url),sid_-1)
    
    

if __name__ == "__main__":
    cur_pg.execute(''' SELECT max(sid) FROM wiki_data''')
    
    sid_max = cur_pg.fetchone()[0] #converts the cursor object to number
    print("max sid = ",sid_max)
    if sid_max == None:
        sid_max = 0
        print("none-----------")
        #For the first time :)
        url = "https://en.wiktionary.org/wiki/Wiktionary:All_Thesaurus_pages"			# The first url that is entered, required for ignition
        pid = 0    #parent id : 0
        sid = 1    #self id : 0   
        cur_pg.execute('''INSERT OR IGNORE INTO wiki_data (cnc, pid, sid, url, html)
                            VALUES ( %s, %s, %s, %s, %s )''', ( 0,pid,sid, url,"", ) )
        # insert the cnc, pid, sid and url 
        url_crawl(url,1)
    else:
        # If the db exists
        cur_pg.execute('''SELECT min(sid) FROM wiki_data WHERE cnc = %s''',[0])
        
        sid_ = cur_pg.fetchone()[0] #converts the cursor object to number
        print("min sid= ",sid_)
        get_next_url = cur_pg.execute('''SELECT url FROM wiki_data WHERE sid = %s''',[sid_])
        url_crawl(str(get_next_url),sid_-1)

        




