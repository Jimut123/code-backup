# This program is designed by Jimut Bahan Pal										#
# This is a crawller, a perfect crawller, moves through every link it collects and uses a stack to store the links	#
# It uses the try exception block to remove error in execution, works perfectly fine when networks is unavailable	#
# Stops, till the network becomes available again. It moves through every link it collects, stacks it as it collects	#
# It can collect approximately 60K links in 5 hr time, it is stored in wiki2.sqlite, creates a new db if not present	#
# If present then continues throught the existing database.								#

# To run this, you can install BeautifulSoup
# https://pypi.python.org/pypi/beautifulsoup4

# Or download the file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file
import sqlite3

conn = sqlite3.connect('wiki2.sqlite')
cur = conn.cursor()

cur.executescript('''

CREATE TABLE IF NOT EXISTS data (
    flag   INTEGER,
    link   TEXT UNIQUE PRIMARY KEY
);

''')


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
while(1):			# always true so that it can continue indefinitely
	#delay()
	if start == 0:		
		# contains the url 
		url = input('Enter - ')			# The first url that is entered, required for ignition
		html = urllib.request.urlopen(url, context=ctx).read()	# html parser
		soup = BeautifulSoup(html, 'html.parser')
		#print(soup)
	tags = soup('a')	# retrieve all anchor tags
	count = count + 1
	for tag in tags:
		#print("tag = ",tag)	
		link_get = tag.get('href',None)	# finds the href tags
		if link_get == None:
			continue
		#print(link_get)
		#delay()
		if 'http:' in link_get or 'https:' in link_get:	# collects only links with http or https protocol
			print(link_get, "https / http found!")
			commit_var = commit_var + 1 # incremented the commit var
			cur.execute('''INSERT OR IGNORE INTO data (flag, link)
					VALUES ( ?, ? )''', ( 0,link_get, ) )	# stacks the link found at the bottom
			if commit_var % 5==0:
				conn.commit()	# commits after 5 sucessful link finding
	print("Type of link_get : ",type(link_get))
	#delay()
	print("-------------------------------------------------")
	start = 1 # to make the dummy to 1
	total_link = cur.execute(''' SELECT link FROM data where flag = ?''',(0,))	# collects the untravelled links
	dummyVar = 1	
	tlink=''
	for tlink in total_link:	# parses through the untravelled links
		#if dummyVar ==1:
		#	continue
		dummyVar = 0
		print(tlink, "========")
		tlink1 = ''.join(tlink)		# to convert tuple to string / from db blob to string
		print(tlink1)
		# test db contains testing whether 0 is present or 1
		# if 1 is present in the flag then just ignore
		testdb = int(0)
		print("Type of tlink = ",type(tlink)," Type of tlink1 = ",type(tlink1))
		#print(cur.execute(''' SELECT flag FROM data where link = ?''',(tlink1,)))
		testdb = cur.execute(''' SELECT flag FROM data where link = ?''',(tlink1,))
		tdb = cur.fetchone()[0] #converts the cursor object to number
		print("tdb = ",tdb)
		print ("testdb = ",testdb)
		if tdb == 1:
			continue
			# continues as already the link has been used up
		# testdb = 0  -- passed case
		try:
			url = tlink1
			html = urllib.request.urlopen(url, context=ctx).read()
			soup = BeautifulSoup(html, 'html.parser')
			cur.execute('''UPDATE data SET flag = 1 WHERE link = ?''',(url,))	# the link is visited once
			print("Not blown off and set flag to 1 sucessfully for url = ",url)
			#break
			continue
		except:			# it doesn't stops if even networks fails or the link doesn't opens
			print("Blown off url == ",url)
			cur.execute('''UPDATE data SET flag = 1 WHERE link = ?''',(url,))	# the link is visited once
			continue	# the ace in the whole code, removes all sort of stopping potentials 
		#break  # to get out of the for loop
		#delay()
conn.commit()	# final commit

















