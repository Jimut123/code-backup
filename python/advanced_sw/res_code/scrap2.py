'''
Note :: some songs donot have JSON, cannot be downloaded! 
__author__ : Jimut Bahan Pal
__date__ : June 11 2018

'''
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

id1 = input('Enter  the song id :- ')			# The first url that is entered, required for ignition
url = 'https://secure.hungama.com/newTwitter_Audio/audio/index-g.php?songid='+str(id1)
#print(url)
html = urllib.request.urlopen(url, context=ctx).read()	# html parser
soup = BeautifulSoup(html, 'html.parser')
#print(soup)
heap = str(soup)
heap1 = heap.split('\"')

import wget

try:
    link_needed = heap1[27]
except:
    print("Sorry! song cannot be downloaded!")
    exit(3)
#print(link_needed)
fin_link = str(link_needed)
#print(fin_link)
string_1 = fin_link.replace('&amp;h;','&h')
string_2 = string_1.replace('&amp;track;','&track')


string_3 = string_2.replace("\\","/")
#print(" :: ",string_2)
string_4 = string_3.replace("////","//")
#print("final link ::  ",string_4)

try:
    filename = wget.download(string_4)
except:
    print("Sorry! song cannot be downloaded!")
    exit(4)
