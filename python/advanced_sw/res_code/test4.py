## https://www.pexels.com/photo/68147
##url_s = " https://www.pexels.com/photo/753626"

# url_s = "https://www.pexels.com/photo/33109"

## https://www.pexels.com/photo/87452/
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re
import sqlite3
import requests
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

import wget
from urllib.request import Request, urlopen

url_s = input("Enter url:")
url = Request(url_s, headers={'User-Agent': 'Mozilla/5.0'})
file_na1 = "lll"
# Download the file from `url` and save it locally under `file_name`:
with urllib.request.urlopen(url) as response, open(file_na1, 'wb') as out_file:
            data = response.read() # a `bytes` object
            out_file.write(data)

