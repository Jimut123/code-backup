import urllib.request, urllib.parse, urllib.error
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file



from urllib.request import urlopen
import re
from bs4 import BeautifulSoup
import ssl
import sqlite3

conn = sqlite3.connect('wiki3.sqlite')
cur = conn.cursor()


cur.executescript('''

CREATE TABLE IF NOT EXISTS dict (
    word   TEXT UNIQUE PRIMARY KEY
);

''')

fhand=''
comm = 0

list_link = cur.execute(''' SELECT link FROM data where flag = ?''',(1,))

print(list_link)


# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

#url = input('Enter - ')
#html = urlopen(url, context=ctx).read()

# html.parser is the HTML parser included in the standard Python 3 library.
# information on other HTML parsers is here:
# http://www.crummy.com/software/BeautifulSoup/bs4/doc/#installing-a-parser
#soup = BeautifulSoup(html, "html.parser")

arr_junk =['http:','https:','/','<','>','=','1','2','3','4','5','6','7','8','9','0','\'','\"','}','{',']','[','(',')',':','-','+','!','~','|','\\','*','?',';','_','.','#','$','@','%','^','&','`'] 


def ext_wrd():
	for line in fhand:
		big_junk=line.decode().strip().split(' ')
		for junk in big_junk:
			flag=1
			for needle in arr_junk:
				if needle in junk:
					flag=0
			if ',' in junk:
				com_pos = junk.find(',')	# comma postion
				ext_wrd = junk[:com_pos]	# to extract word
			else:
				ext_wrd = junk
			if flag==1:
				#commit_Var = commit_Var + 1
				if ext_wrd != '':
					#print(ext_wrd)
					ex_wrd_l = ext_wrd.lower()
					print(ex_wrd_l)
					cur.execute('''INSERT OR IGNORE INTO dict (word)
                                        	VALUES ( ? )''', ( ex_wrd_l, ) )
					cur.execute('''UPDATE data SET flag = 2 WHERE link = ?''',(tlink1,))

for tlink in list_link:
	tlink1 = ''.join(tlink)
	print(tlink1)
	try:
		fhand = urllib.request.urlopen(tlink1)
	except:
		print("Sorry Link cannot be opened!",tlink1)
		cur.execute('''UPDATE data SET flag = 2 WHERE link = ?''',(tlink1,))
		continue
	print("Extracting words in the link .... : ",tlink1)
	ext_wrd()
	#comm = comm + 1
	#if comm % 4 == 0:
		#conn.commit()
	#print("???????????")
conn.commit()

#print("Var comm = ",comm)
