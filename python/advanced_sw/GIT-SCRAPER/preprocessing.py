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
