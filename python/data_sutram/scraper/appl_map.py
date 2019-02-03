"""
https://sat-cdn1.apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x=84135&y=202065&v=4002&accessKey=1549129912_6641142575737855346_%2F_9%2F4MX0U5yhJDc3LDXazhcQj3xjCJU%2BYsiKcviN%2FnWxE%3D&emphasis=standard&tint=dark

https://sat-cdn4.apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x=84135&y=202061&v=4002&accessKey=1549129912_6641142575737855346_%2F_9%2F4MX0U5yhJDc3LDXazhcQj3xjCJU%2BYsiKcviN%2FnWxE%3D&emphasis=standard&tint=dark

https://sat-cdn4.apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x=84135&y=202064&v=4002&accessKey=1549129912_6641142575737855346_%2F_9%2F4MX0U5yhJDc3LDXazhcQj3xjCJU%2BYsiKcviN%2FnWxE%3D&emphasis=standard&tint=dark

https://sat-cdn3.apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x=84122&y=202064&v=4002&accessKey=1549131702_8398681963599501052_%2F_oQrt5vqvzaVZBN%2FLBc5baLQgg5kEhfpKMYQDRlmZ36Q%3D&emphasis=standard&tint=dark

https://sat-cdn3.apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x=84127&y=202067&v=4002&accessKey=1549131702_8398681963599501052_%2F_oQrt5vqvzaVZBN%2FLBc5baLQgg5kEhfpKMYQDRlmZ36Q%3D&emphasis=standard&tint=dark
x
38.089967/84127
0.0004527674468363308
y
-122.236446/202067
-0.0006049302756016569

x_conv = 2208.8242126933765

y_conv = -1653.078168433501

https://sat-cdn1.apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x=371353&y=184495&v=4002&accessKey=1549132809_7090421196284837684_%2F_gT3s2ghdt72RemReCoMIf13JXH%2BE0rbJKjODBV6pfQc%3D&emphasis=standard&tint=dark
https://sat-cdn1.apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x=323660&y=198484&v=4002&accessKey=1549132809_7090421196284837684_/_gT3s2ghdt72RemReCoMIf13JXH+E0rbJKjODBV6pfQc=&emphasis=standard&tint=dark


"""
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import os
import wget
import imghdr
import numpy as np
import requests
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
        now_time = time.time()
        #url_str = "https://sat-cdn"+str(i)+".apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x="+str(x_tyle)+"&y="+str(y_tyle)+"&v=4002&accessKey="+str(math.floor(now_time)-10)+"_8618194673608956327_%2F_AaK0kkbh9QXsy5VX35tXlchP3bjj1%2FkjYGmHywouu0E%3D&emphasis=standard&tint=dark"
        url_str = "https://sat-cdn"+str(i)+".apple-mapkit.com/tile?style=7&size=1&scale=1&z=19&x="+str(x_tyle)+"&y="+str(y_tyle)+"&v=4002&accessKey=1549197942_115647566105935154_%2F_b3rw2rvOuQvkjh0rILQSaaW3GxphOI%2BXJo48fORdf0Y%3D&emphasis=standard&tint=dark"
        print("Trying :: ",url_str)
        try:
            file_name = str(x_tyle)+"_"+str(y_tyle)+".jpeg"
            #file_name = wget.download(url_str)
            #file_name.replace(".tmp", "{x_tyle}_{y_tyle}.jpg")
            r = requests.get(url_str, allow_redirects=True,headers=headers)
            open(file_name, 'wb').write(r.content)
            
            if imghdr.what(file_name) is 'jpeg':
                print("JPEG")
            else:
                os.remove(file_name)
                print("NOT JPEG")
        except:
            print("Ops Blown Off!")

if __name__ == "__main__":
    #make_url(38.085668,-122.235644,19)
    for i in np.arange(10,45,0.1):
        for j in np.arange(10,100,0.1):
            print("i=",i,"j=",j)
            make_url(i,j,19)