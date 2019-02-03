from datetime import tzinfo, timedelta, datetime
import sqlite3
import time
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re
import os.path
import urllib.request
from tqdm import tqdm
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

conn_sqlite = sqlite3.connect('wikiDB.sqlite')
cur_sqlite = conn_sqlite.cursor()

import psycopg2
conn_pg = psycopg2.connect("host=localhost dbname=postgres user=postgres password=jim12")
cur_pg = conn_pg.cursor()

#cur_pg.execute("INSERT INTO public.wiki_data VALUES (%s, %s, %s, %s, %s)", (1, 1, 1, "https://test","html - text"))

max_val = cur_sqlite.execute('''SELECT max(sid) FROM wiki_data''').fetchone()[0]
print(max_val)
db_sqlite_get = cur_sqlite.execute(''' SELECT * FROM wiki_data''')
print(db_sqlite_get)

commit_var = 0
for items in tqdm(db_sqlite_get):
    
    #print(items[1])
    try:
        cur_pg.execute("INSERT INTO public.wiki_data VALUES (%s, %s, %s, %s, %s)", (items[0], items[1], items[2], items[3],items[4]))
    except:
        print("DUPLICATE ENTRIES!!")
    print("-----------------------------------------------------------------------------------------------------------",items[2],"/",max_val)
    if commit_var%10000 == 0 :
        conn_pg.commit()
    commit_var += 1
    print ("Current sid : ",items[2])
    print ("Current pid : ",items[1])
    print("current commit var : ",commit_var)
conn_pg.commit()
"""

cur_sqlite.execute(''' SELECT max(sid) FROM wiki_data''')
    
sid_max = cur_sqlite.fetchone()[0] #converts the cursor object to number
print("max sid = ",sid_max)
commit_var = 0
for c_sid in tqdm(range(sid_max)):
    c_sid +=1
    print("Current sid : ",c_sid)
    url_c = cur_sqlite.execute('''SELECT url FROM wiki_data WHERE sid = ?''',(c_sid,)).fetchone()[0]
    pid_c = cur_sqlite.execute('''SELECT pid FROM wiki_data WHERE sid = ?''',(c_sid,)).fetchone()[0]
    html_c = cur_sqlite.execute('''SELECT html FROM wiki_data WHERE sid = ?''',(c_sid,)).fetchone()[0]
    cnc_c = cur_sqlite.execute('''SELECT cnc FROM wiki_data WHERE sid = ?''',(c_sid,)).fetchone()[0]
    '''
    print(url_c)
    time.sleep(2)
    print(pid_c)
    time.sleep(2)
    print(html_c)
    time.sleep(2)
    print(cnc_c)
    time.sleep(2)
    '''
    try:
        cur_pg.execute("INSERT INTO public.wiki_data VALUES (%s, %s, %s, %s, %s)", (cnc_c, pid_c, c_sid, url_c,html_c))
    except:
        print("DUPLICATE ENTRIES!!")

    if commit_var%100 == 0 :
        conn_pg.commit()
    commit_var += 1

    print ("Current pid : ",pid_c)
    print("current commit var : ",commit_var)
"""
