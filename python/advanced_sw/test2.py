

import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

from urllib.request import Request, urlopen

url = Request('https://www.pexels.com/photo/33109', headers={'User-Agent': 'Mozilla/5.0'})


webpage = urlopen(url).read()

#soup = BeautifulSoup(webpage, 'html.parser')

