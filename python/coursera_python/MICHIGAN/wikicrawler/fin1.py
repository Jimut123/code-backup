# To run this, you can install BeautifulSoup
# https://pypi.python.org/pypi/beautifulsoup4

# Or download the file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file
import sqlite3

conn = sqlite3.connect('wiki1.sqlite')
cur = conn.cursor()

cur.executescript('''

CREATE TABLE IF NOT EXISTS data (
    id     INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
    link   TEXT UNIQUE 
);

''')



import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE
url='0'
dummy = 1
next_url = '0'
while(1):
	if dummy == 1:
		url = input('Enter - ')

	if dummy == 0:
		url = next_url
	html = urllib.request.urlopen(url, context=ctx).read()
	soup = BeautifulSoup(html, 'html.parser')

	# Retrieve all of the anchor tags
	tags = soup('a')
	i=1
	for tag in tags:
		link_get = tag.get('href', None)

		if 'http:' in link_get or 'https:' in link_get:
			i=i+1
			print(link_get,i )
			next_url = link_get
			cur.execute('''INSERT OR IGNORE INTO data (link)
				VALUES ( ? )''', ( link_get, ) )
		
		if(i%10 == 0):
			conn.commit()
	dummy = 0
conn.commit()
