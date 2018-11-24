## https://www.pexels.com/photo/68147
##url_s = " https://www.pexels.com/photo/753626"

# url_s = "https://www.pexels.com/photo/33109"

## https://www.pexels.com/photo/87452/
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re
import sqlite3
import requests
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

import wget
from urllib.request import Request, urlopen


conn = sqlite3.connect('wallpaper.sqlite')
cur = conn.cursor()

cur.executescript('''
CREATE TABLE IF NOT EXISTS data (
    i   INTEGER,
    url  TEXT UNIQUE PRIMARY KEY
);
''')
def get_pic(url_s):
	url = Request(url_s, headers={'User-Agent': 'Mozilla/5.0'})

	html = urllib.request.urlopen(url, context=ctx).read()  # html parser
	soup = BeautifulSoup(html, 'html.parser')
	mydivs = soup.find_all("img", class_="image-section__image js-photo-zoom")
	for divs in mydivs:
	    str_1 = str(divs)
	#print(str_1)
	pos1 = str_1.find('data-pin-media=')
	#print(pos1)
	str_1 = str_1[pos1:]
	str_1 = str_1[16:]
	pos2 = str_1.find('"')
	str_1 = str_1[:pos2]
	#print(str_1)
	url_final = Request(str_1, headers={'User-Agent': 'Mozilla/5.0'})
	im_pf = str_1.find(".jpg")
	#print(im_pf)
	file_na1 = str_1[:im_pf]
	#print(file_na1)
	im_pi = str_1.rfind("/")
	file_na1 = file_na1[im_pi+1:]
	print("File name : ",file_na1)
	print("Url : ",str_1)
	# Download the file from `url` and save it locally under `file_name`:
	with urllib.request.urlopen(url_final) as response, open(file_na1, 'wb') as out_file:
	    data = response.read() # a `bytes` object
	    out_file.write(data)
##

i1 = cur.execute(''' SELECT MAX(i) FROM data ''')
i = cur.fetchone()[0]

track1 = 'https://www.pexels.com/photo/'

print(i)
if i == None:
    i=0

d=0
while(1):
    url_send =track1+str(i)
    i=i+1
    print(url_send)
    try:
        get_pic(url_send)
        cur.execute('''INSERT OR IGNORE INTO data (i, url)
					VALUES ( ?, ? )''', ( i,url_send, ))
        d=d+1
        if d%5==0 :
            conn.commit()
    except:
        print("Blown off url : ",url_send)
        continue

