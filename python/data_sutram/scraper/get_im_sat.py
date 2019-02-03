"""
code to get the satellite images from Zoom Earth
https://satellites.pro/
https://ecn.t3.tiles.virtualearth.net/tiles/a300101321312212320.jpeg?g=6856&mkt=en-US

"""
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import wget
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE
from random import randint

encrypt_ = ["t0","t1","t2","t3"]


tile_id = 300101321312212320
for i in range(100):
    next_id = tile_id + i
    final_url = "https://ecn."+encrypt_[randint(0, 3)]+".tiles.virtualearth.net/tiles/a"+str(next_id)+".jpeg?g=6856&mkt=en-US"
    print(final_url)
    try:
        filename = wget.download(final_url)
    except:
        print("Blown off")

