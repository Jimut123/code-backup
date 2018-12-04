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
i=10


#######
print("i = ",i)

while(1):
	i=i+1
	
	##########
	print("i = ",i)
	
	if dummy == 1:
		url = input('Enter - ')
		
		#######
		print("url entered = ",url)
		print("dummy = ",dummy)
	
	if dummy == 0:
		
		#######
		print("dummy = ",dummy)
		url = next_url
		
		#######
		print("url = ",url)
	
	html = urllib.request.urlopen(url, context=ctx).read()
	soup = BeautifulSoup(html, 'html.parser')

	# Retrieve all of the anchor tags
	tags = soup('a')
	
	######
	print(tags)
	
	for tag in tags:
		dummy3=0
		while dummy3==0:
			
			######
			print("dummy3 = ",dummy3)
			dummy3=1
			try:
				######
				link_get = tag.get('href', None)
				dummy3=1
				
				#######
				print("link_get = ",link_get)
				print("dummy3 = ",1)
			
			except ValueError:
				
				link_get = cur.execute(''' SELECT link FROM data where id = ?''',(i,))
				
				#######
				print("link_get = ",link_get)
				i=i-1
				#######
				print("i = ",i)
				
				#html = urllib.request.urlopen(url, context=ctx).read()
				#soup = BeautifulSoup(html, 'html.parser')
				#tags = soup('a')
	
		#i=i+1
		
		########
		print(link_get)
		
		while(link_get == None):
			########
			print(link_get)
			if link_get == None:
				i=i-1
				link_get = cur.execute(''' SELECT link FROM data where id = ?''',(i,))	
				
				#####
				
				print("Entered here !! safe !!")
				print(link_get)
		while 'https:' not in link_get:
			try :
				if 'https:' in link_get:
					print(link_get," no https: protocol changing mode");	
			
			except ValueError:
				
				link_get = cur.execute(''' SELECT link FROM data where id = ?''',(i,))
				print("link_get = ",link_get)
				
				i=i-1
				print("i = ",i)
		if 'https:' in link_get:
			i=i+1
			print("link_get  = ",link_get,"i = ",i )
			
			if 'https:' in link_get:
				next_url = link_get
				print("next_url = ", next_url)
				k=0
				while k==0:
					i=i-1
					print("i = ",i)
					try:
						url = next_url
						print("next_url : ",next_url)
						print("url : ",url)
						html = urllib.request.urlopen(url, context=ctx).read()
						print(html)
						soup = BeautifulSoup(html, 'html.parser')
						print(soup)
						tags = soup('a')
						print(tags)
						k=1
					
					except:
						url = cur.execute(''' SELECT link FROM data where id = ?''',(i,))
						print(next_url," == is not valid")
						print("====================================")
			cur.execute('''INSERT OR IGNORE INTO data (link)
				VALUES ( ? )''', ( link_get, ) )
			#i=150
		if(i%10 == 0):
			conn.commit()
	dummy = 0
conn.commit()
