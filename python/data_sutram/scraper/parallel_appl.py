
# https://satellites.pro/

import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import os
import wget
import imghdr
import numpy as np
import os
import requests
from time import time as timer
from multiprocessing.pool import ThreadPool
import time
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE
import math
PI = math.pi
cdn = [1,2,3,4]
headers = {
    'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:21.0) Gecko/20100101 Firefox/21.0'#,
    #'From': 'youremail@domain.com'  # This is another valid field
}

#URL_ALL = []

def ret_max_latlon():
    import math
    from os import listdir
    from os.path import isfile, join
    mypath = "./satellite_data"
    onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
    max_file = max(onlyfiles)
    #print()
    print(max_file)
    _ = max_file.find('_')
    jp = max_file.find('.jpeg')
    x_tyle = max_file[:_]
    y_tyle = max_file[_+1:jp]

    print(x_tyle,y_tyle)
    """
    n = 2 ^ zoom
    lon_deg = xtile / n * 360.0 - 180.0
    lat_rad = arctan(sinh(π * (1 - 2 * ytile / n)))
    lat_deg = lat_rad * 180.0 / π
    """
    zoom = 19
    n = 2**zoom
    lon_deg = int(x_tyle)/n * 360.0 - 180.0
    print(lon_deg)

    lat_rad = math.atan(math.asinh(math.pi * (1 - 2 * int(y_tyle)/n)))
    lat_deg = lat_rad * 180.0 / math.pi

    print(lat_deg)
    return lat_deg, lon_deg

def ret_xy_tiles(lat_deg,lon_deg,zoom):
    n = 2**zoom
    #lon_deg = xtile / n * 360.0 - 180.0
    
    #lat_deg = lat_rad * 180.0 / π
    xtile = n * ((lon_deg + 180) / 360)
    #lat_rad = math.atan(math.asinh(PI * (1 - 2 * ytile / n)))
    lat_rad = lat_deg * PI / 180.0
    ytile = n * (1 - (math.log(math.tan(lat_rad) + 1/math.cos(lat_rad)) / PI)) / 2
    return math.floor(xtile),math.floor(ytile)

def make_url(lat_deg,lon_deg,zoom):
    x_tyle,y_tyle = ret_xy_tiles(lat_deg,lon_deg,zoom)
    for i in cdn:
        #now_time = time.time()
        #url_str = "https://sat-cdn"+str(i)+".apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x="+str(x_tyle)+"&y="+str(y_tyle)+"&v=4002&accessKey="+str(math.floor(now_time)-10)+"_8618194673608956327_%2F_AaK0kkbh9QXsy5VX35tXlchP3bjj1%2FkjYGmHywouu0E%3D&emphasis=standard&tint=dark"
        return str("https://sat-cdn"+str(i)+".apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x="+str(x_tyle)+"&y="+str(y_tyle)+"&v=4002&accessKey=1549213526_270258227594088540_%2F_zEocKL1wElJH5mObWXJ7XRLtazasJDk1TQ9Hkt265eA%3D&emphasis=standard&tint=dark")
def get_img(url_str):
    global headers
    #print("Trying :: ",url_str)
    try:
        x_ = url_str.find('&x=')
        y_ = url_str.find('&y=')
        v_ = url_str.find('&v=')
        x_tyle = url_str[x_+3:y_]
        y_tyle = url_str[y_+3:v_]
        file_name = str(x_tyle)+"_"+str(y_tyle)+".jpeg"
        #file_name = wget.download(url_str)
        #file_name.replace(".tmp", "{x_tyle}_{y_tyle}.jpg")
        r = requests.get(url_str, #allow_redirects=True,
                        headers=headers)
        open(file_name, 'wb').write(r.content)
        
        if imghdr.what(file_name) is 'jpeg':
            print(file_name,"JPEG")
        else:
            os.remove(file_name)
            print(file_name,"NOT JPEG")
    except:
        print("Ops Blown Off!")
    #time.sleep(0.01)

if __name__ == "__main__":
    
    #make_url(38.085668,-122.235644,19)
    i_l, j_l = ret_max_latlon()
    for i in np.arange(i_l,43,0.1):
        URL_ALL = []
        for j in np.arange(10,43,0.1):
            #print("i=",i,"j=",j)
            URL_ALL.append(make_url(i,j,19))
        #print(URL_ALL)
        print("ALL URL CREATED! ...")
        ThreadPool(100).imap_unordered(get_img, URL_ALL)
        time.sleep(3)
    #print(URL_ALL)
    
