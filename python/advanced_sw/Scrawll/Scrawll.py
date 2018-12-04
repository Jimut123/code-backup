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
import datetime
import os
import sys
import argparse
import random

import wget
from urllib.request import Request, urlopen
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE
if sys.version_info < (3, 0, 0):
	print("\n" + '\033[1;38m' + \
            "You need Python3 or later to run this script." + \
            '\033[1;m' + "\n")
	exit(1)
global_start_t = datetime.datetime.now().time()
def time_(dum):
	timet = datetime.datetime.now().time()
	date = datetime.datetime.now().date()
	if dum == 'date':
		return date
	else:
		return timet
def logo():
	print("\n\n\n\n\n")
	date1 = time_('date')
	print("\t\t\t\tDate : ",date1)
	timet1 = time_('time')
	global_start_t = timet1
	print("\t\t\t\tTime : ",timet1)    
	hello = """
                                                                           NAME : Scrawll
       ,________________________PYTHON_3___SCRAPER_________________________________,
      [ ,.__.____,                                                                 ]
      |[_,, $,__+] (@)                     ,_____,                                 |
      |    |#|     ,~, ,,      ,, , ,  , , |((~))| Systems                         |
      |    |#|     [#] |^.    .^| |=|  |=|   '^'                                   |
      | .._|#|     |$| || '\// || |$'__'$|   |^|                                   |
      |  \%_./     [%] [_] '' [_] [..__..]   [*]   ---- Wallpaper Scraper            |
      [,__________________________________________________________________________,]
"""
	color_list = ['\033[1;30m','\033[1;31m','\033[1;32m','\033[1;33m','\033[1;34m','\033[1;35m','\033[1;36m','\033[1;37m','\033[1;38m','\033[1;41m','\033[1;42m','\033[1;43m','\033[1;44m','\033[1;45m','\033[1;45m','\033[1;46m','\033[1;47m',]
	end_c = '\033[1;m'
	import random
	k = 17
	ran = int(random.random()*k)
	print(color_list[ran] + hello + end_c)
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
	file_na1 = str_1[:im_pf+4]
	#print(file_na1)
	im_pi = str_1.rfind("/")
	file_na1 = file_na1[im_pi+1:]
	print("File name : ",file_na1)
	print("Url : ",str_1)
	# Download the file from `url` and save it locally under `file_name`:
	with urllib.request.urlopen(url_final) as response, open(file_na1, 'wb') as out_file:
		data = response.read() # a `bytes` object
		out_file.write(data)
def main():
	logo()
	conn = sqlite3.connect('wallpaper.sqlite')
	cur = conn.cursor()
	cur.executescript('''
	CREATE TABLE IF NOT EXISTS data (
	    i   INTEGER,
	    url  TEXT UNIQUE PRIMARY KEY
	);
	''')
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
			print("\n\n\nCHECK YOUR INTERNET CONNECTION...")
			continue
if __name__ == "__main__":
    main()

