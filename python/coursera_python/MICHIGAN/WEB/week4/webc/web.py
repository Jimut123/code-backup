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

#print(soup.prettify())
all_tags = soup('a')

#print(all_tags)

#for link in all_tags:
#    tag1 = all_tags[link]
#    print(tag1.get('href',None))

#print(links)

#t = """< a href = "https://link1.html">"""
#print(t.get('href',None))




