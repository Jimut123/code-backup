import urllib.request, urllib.parse, urllib.error
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file


from urllib.request import urlopen
import re
from bs4 import BeautifulSoup
import ssl


#conn = sqlite3.connect('wiki3.sqlite')
#cur = conn.cursor()




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
fhand = urllib.request.urlopen('https://stackoverflow.com/questions/4998629/python-split-string-with-multiple-delimiters')
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
			print(ext_wrd)
