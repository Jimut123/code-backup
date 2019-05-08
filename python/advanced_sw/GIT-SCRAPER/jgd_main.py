import sqlite3
import json
from pprint import pprint
from selenium import webdriver
from bs4 import BeautifulSoup
from pathlib import Path
from tqdm import tqdm
import json
import time
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import wget
import os


conn = sqlite3.connect('git.sqlite')
cur = conn.cursor()

cur.executescript('''
CREATE TABLE IF NOT EXISTS data (
    url   TEXT UNIQUE PRIMARY KEY,
    type TEXT,
    parent TEXT,
    traversed INTEGER
);
''')

url = "https://github.com/ines/spacy-course"
while True:
    ol_url = url
    profile = webdriver.FirefoxProfile()
    profile.set_preference("general.useragent.override", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
    driver = webdriver.Firefox(profile)
    driver.get(url)
    get_file_names = []
    get_file_names = driver.find_elements_by_class_name("js-navigation-open")
    for items in get_file_names:
        #item_ = items.text 
        href_ = items.get_attribute('href')
        try:
            split_1,split_2 = str(href_).split('/')[5], str(href_).split('/')[6]
            if split_1 == "tree":
                print("folder =>",href_)
                cur.execute('''INSERT OR IGNORE INTO data (url, type, parent, traversed)
					VALUES ( ?, ?, ?, ? )''', (href_,"folder",url,0 ) )
            if split_1 == "blob":
                s = href_.split('/')
                get_url = s[0]+"//"+"raw.githubusercontent.com/"+s[3]+"/"+s[4]+"/"+s[6]+"/"+s[7]
                print("file =>",href_)
                cur.execute('''INSERT OR IGNORE INTO data (url, type, parent, traversed)
					VALUES ( ?, ?, ?, ? )''', (href_,"file",url,1 ) )
        except:
            pass
    driver.close()

    urls = cur.execute('''SELECT * FROM data WHERE traversed = ?''',(0,))

    for k in urls:
        url = k[0]
        print("URL ==",url)
        cur.execute('''UPDATE data SET traversed = ? WHERE url = ?''',(1,url,))
        conn.commit()
        break
    print("NOT TRAVERSED : ")
    urls = cur.execute('''SELECT * FROM data WHERE traversed = ?''',(0,))
    if ol_url == url:
        print("EXITING")
        break
    for j in urls:
        print(j)
    #print("URL ==",url)
    
    #print("SLEEPING!")
    #time.sleep(20)
conn.commit()


conn = sqlite3.connect('git.sqlite')
cur = conn.cursor()

data = cur.execute('''SELECT * FROM data''')

final_json = {}

for item in data:
    fin_item = item[0]
    split_it = fin_item.split('/')
    #print(fin_item)
    root_folder_1 = split_it[4]
    if split_it[4] == 'tree':
        next_2 = '/'
    else:
        next_2 = ''
    all_item = split_it[7:]
    all_item_3 = ''
    all_item_3 = '/'.join(all_item)
    #print()
    folder = root_folder_1+'/'+all_item_3

    s = item[0].split('/')
    if s[5] == 'blob':
        get_url = s[0]+"//"+"raw.githubusercontent.com/"+s[3]+"/"+s[4]+"/"+'/'.join(s[6:])
    else:
        get_url = ''
    final_json[folder] = get_url

print(json.dumps(final_json, indent=2, sort_keys=True))

import os
import wget
cur_wd = os.getcwd()
import json
from pprint import pprint

data = final_json

#pprint(data)

for item in data:
    #print(item)
    if data[item] != '':
        dir_ = item.split('/')[:-1]
        go_dir = '/'.join(dir_)
        link_ = data[item]
        #print(go_dir,link_)
        if not os.path.exists(go_dir):
            os.makedirs(go_dir)
        os.chdir(go_dir)
        wget.download(link_)
        os.chdir(cur_wd)
