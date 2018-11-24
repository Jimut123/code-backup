## https://www.pexels.com/photo/68147
##url_s = " https://www.pexels.com/photo/753626"

url_s = "https://www.pexels.com/photo/33109"

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

html = urllib.request.urlopen(url, context=ctx).read()  # html parser
soup = BeautifulSoup(html, 'html.parser')
mydivs = soup.find_all("img", class_="image-section__image js-photo-zoom")

for divs in mydivs:
    str_1 = str(divs)
print(str_1)


pos1 = str_1.find('data-pin-media=')
print(pos1)
str_1 = str_1[pos1:]
str_1 = str_1[16:]
pos2 = str_1.find('"')
str_1 = str_1[:pos2]
print(str_1)
url_final = Request(str_1, headers={'User-Agent': 'Mozilla/5.0'})

file_name = "lll"

im_pf = str_1.find(".jpg")

print(im_pf)
file_na1 = str_1[:61]
print(file_na1)

im_pi = str_1.rfind("/")
file_na1 = file_na1[im_pi+1:]

print("File name : ",file_na1)
print("Url : ",str_1)
import urllib.request
'''
# Download the file from `url` and save it locally under `file_name`:
with urllib.request.urlopen(url_final) as response, open(file_name, 'wb') as out_file:
    data = response.read() # a `bytes` object
    out_file.write(data)

'''


