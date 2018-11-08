## https://www.pexels.com/photo/68147
url_s = " https://www.pexels.com/photo/753626"

### url_s = "https://www.pexels.com/photo/33109"

## https://www.pexels.com/photo/87452/
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re
import requests
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

import wget
from urllib.request import Request, urlopen



url = Request(url_s, headers={'User-Agent': 'Mozilla/5.0'})
#webpage = urlopen(req).read()


html = urllib.request.urlopen(url, context=ctx).read()  # html parser
soup = BeautifulSoup(html, 'html.parser')
#print(soup)
#mydivs = soup.findAll("img", {"class": "image-section__image js-photo-zoom"})
mydivs = soup.find_all("img", class_="image-section__image js-photo-zoom")
#print(mydivs)

for divs in mydivs:
    str_1 = str(divs)
print(str_1)

# https://images.pexels.com/photos/39672/globe-thistle-thistle-plant-flower-39672.jpeg?auto=compress&amp;cs=tinysrgb&amp;h=750&amp;w=1260
# https://images.pexels.com/photos/39672/globe-thistle-thistle-plant-flower-39672.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260


pos1 = str_1.find('data-pin-media=')
print(pos1)
str_1 = str_1[pos1:]
str_1 = str_1[16:]
pos2 = str_1.find('"')
str_1 = str_1[:pos2]
print(str_1)
url_final = Request(str_1, headers={'User-Agent': 'Mozilla/5.0'})

file_name = "lll"

'''
import urllib.request
...
# Download the file from `url` and save it locally under `file_name`:
urllib.request.urlretrieve(url_final, file_name)
'''


import urllib.request
...
# Download the file from `url` and save it locally under `file_name`:
with urllib.request.urlopen(url_final) as response, open(file_name, 'wb') as out_file:
    data = response.read() # a `bytes` object
    out_file.write(data)




