# To run this, you can install BeautifulSoup
# https://pypi.python.org/pypi/beautifulsoup4

# Or download the file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file

import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

import re

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('Enter - ')
html = urllib.request.urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, 'html.parser')

print(soup)

#x = re.findall('[0-9]+',soup)

#for line in soup:
#	line = line.rstrip()
#	if re.search('[0-9]+',line):
#		print(re.search('[0-9]+',line))



# Retrieve all of the anchor tags

#tags = soup('')
#for tag in tags:
#    print(tag.get('href', None))


span=soup.find_all(["span"])
print(span)

num=re.findall('[0-9]+',span)
print(num)




