# To run this, you can install BeautifulSoup
# https://pypi.python.org/pypi/beautifulsoup4

# Or download the file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file
import sqlite3
from tqdm import tqdm
conn = sqlite3.connect('wiki2.sqlite')
cur = conn.cursor()

cur.executescript('''

CREATE TABLE IF NOT EXISTS data (
    flag   INTEGER,
    link   TEXT UNIQUE PRIMARY KEY
);

''')

def delay():
	for i in tqdm(range(900000)):
		i=i+1




import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

# The function to return the soup object of an url

start = 0 # dummy variable
url = '' # the url which we will be working on
next_url = ''   # collect the next url
commit_var = 0    # commit variable to commit after certain iterations
link_get = None
count = 0 # test counter
while(1):
	delay()
	if start == 0:
		# contains the url 
		url = input('Enter - ')
		html = urllib.request.urlopen(url, context=ctx).read()
		soup = BeautifulSoup(html, 'html.parser')
		#print(soup)
	tags = soup('a')	# retrieve all anchor tags
	count = count + 1
	for tag in tags:
		#print("tag = ",tag)	
		link_get = tag.get('href',None)
		if link_get == None:
			continue
		#print(link_get)
		#delay()
		if 'http:' in link_get or 'https:' in link_get:
			print(link_get, "https / http found!")
			commit_var = commit_var + 1 # incremented the commit var
			cur.execute('''INSERT OR IGNORE INTO data (flag, link)
					VALUES ( ?, ? )''', ( 0,link_get, ) )
			if commit_var % 5==0:
				conn.commit()
	#delay()
	print("-------------------------------------------------")
	start = 1 # to make the dummy to 1
	total_link = cur.execute(''' SELECT link FROM data where flag = ?''',(0,))
	dummyVar = 1
	tlink=''
	for tlink in total_link:
		#if dummyVar ==1:
		#	continue
		dummyVar = 0
		print(tlink, "========")
		tlink1 = ''.join(tlink)
		print(tlink1)
		# test db contains testing whether 0 is present or 1
		# if 1 is present in the flag then just ignore
		testdb = 0
		testdb = cur.execute('''SELECT flag FROM data where link = ?''',(tlink1,))
		print ("testdb = ",testdb)
		if testdb == 1:
			continue
			# continues as already the link has been used up
		# testdb = 0  -- passed case
		try:
			url = tlink
			html = urllib.request.urlopen(url, context=ctx).read()
			soup = BeautifulSoup(html, 'html.parser')
			cur.execute('''UPDATE data SET flag = 1 WHERE link = ?''',(url,))
			print("Not blown off and set flag to 1 sucessfully for url = ",url)
		except ValueError:
			print("Blown off url == ",url)
			continue
		#delay()
conn.commit()	

















