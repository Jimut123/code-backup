import json
from pprint import pprint
from selenium import webdriver
from bs4 import BeautifulSoup
from pathlib import Path
from tqdm import tqdm
import json
import time
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

# setting profile
profile = webdriver.FirefoxProfile()
profile.set_preference("general.useragent.override", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
driver = webdriver.Firefox(profile)


"""
lL16AQItG1
0ZuxGhiqo5U

https://www.youtube.com/watch?v=TEAGqUkQVdM&list=PLAwxTw4SYaPkQXg8TkVdIvYv4HfLG7SiH&index=80&t=0s
PLAwxTw4SYaPkQXg8TkVdIvYv4HfLG7SiH

pl-video-title-link yt-uix-tile-link yt-uix-sessionlink  spf-link



https://r4---sn-npoeenez.googlevideo.com/videoplayback?id=o-AEzO4sSvQGyOsTYltnKEJyK5mG3yLzpuWO38lOvC-
R7L&itag=43&source=youtube&requiressl=yes&pl=18&ei=wmDDXNaLEoG8yAXRw4O4CA&mime=video%2Fwebm&gir=yes
&clen=1973658&ratebypass=yes&dur=0.000&lmt=1412609098134912&fvip=15&beids=9466586&c=WEB&ip=109.70.189.56
&ipbits=0&expire=1556329762&sparams=clen,dur,ei,expire,gir,id,ip,ipbits,itag,lmt,mime,mip,mm,mn,ms,mv,pl,
ratebypass,requiressl,source&signature=2BAA31A34BF0D4AA60FBBE2B7DDD1C80B711A9.045DFCDC120404084BD068D4C88842E91F8D2952
&key=cms1&video_id=TEAGqUkQVdM&title=SVM+Response+to+Outliers+-+Intro+to+Machine+Learning&rm=sn-xaxjugvn8t51-hjml7z
&fexp=9466586&req_id=b00e1d5a1b74a3ee&redirect_counter=2&cm2rm=sn-n8vyle6&cms_redirect=yes&mip=157.40.127.61&mm=34
&mn=sn-npoeenez&ms=ltu&mt=1556308486&mv=m

https://r5---sn-npoe7nes.googlevideo.com/videoplayback?id=o-AA25BzPZ9DbOQ8zFL0SKyTCLhrGbl8AMAP-yp5_
7y9Ml&itag=43&source=youtube&requiressl=yes&pl=18&ei=MWPDXOC6DumgzLUP_a2H2Ac&mime=video%2Fwebm&gir=yes
&clen=3466902&ratebypass=yes&dur=0.000&lmt=1411417282671471&fvip=5&c=WEB&ip=173.234.194.248
&ipbits=0&expire=1556330385&sparams=clen,dur,ei,expire,gir,id,ip,ipbits,itag,lmt,mime,mip,mm,mn,ms,mv,pl,
ratebypass,requiressl,source&signature=60AA22CBF4759B159A2D8AFF4246265A3E829CFE.3F4414689A5963849DFCE75C134D087DDDCBB3F3
&key=cms1&video_id=0ZuxGhiqo5U&title=Introduction+Pt.+III&redirect_counter=1&cm2rm=sn-vgqeey76&req_id=95566288b0e0a3ee
&cms_redirect=yes&mip=157.40.127.61&mm=34&mn=sn-npoe7nes&ms=ltu&mt=1556308658&mv=m


#TODO


3.Set option for download all?


"""

def is_playList(this_item):
    # is it playlist(1) or video(0)
    if 'playlist' in str(this_item):
        return 1
    return 0



def download_video(this_link):
    # to download the video
    save_link = 'https://en.savefrom.net/#url='+str(this_link)
    driver.get(save_link)
    time.sleep(5)
    print(driver.page_source)
    pass

#url = 'https://www.youtube.com/playlist?list=PLAwxTw4SYaPkQXg8TkVdIvYv4HfLG7SiH'			# The first url that is entered, required for ignition
url = 'https://www.youtube.com/watch?v=TEAGqUkQVdM'

if is_playList(url) ==1:
    # it's playlist
    # get the links
    print('REQUESTING... please have patience!')
    driver.get(url)

    while True:
        try:
            loadMoreButton = driver.find_element_by_xpath("//button[contains(@aria-label,'Load more')]")
            time.sleep(2)
            loadMoreButton.click()
            time.sleep(5)
        except Exception as e:
            print(e) 
            break

    soup = BeautifulSoup(driver.page_source, 'html.parser')
    tags = soup.findAll("a", {"class": "pl-video-title-link"})
    get_all_href = []
    for item in tqdm(tags):
        item_ = str(item)
        first = str(item_).find('href="')
        #print(first)
        clean_item = item_[first+6:]
        #print(clean_item)
        sec = str(clean_item).find('"')
        #print(sec)
        total_clean = 'https://www.youtube.com'+clean_item[:sec]
        #print("TC::",total_clean)
        get_all_href.append(total_clean)
    NUM_LINKS = len(get_all_href)
    print(NUM_LINKS," video LINKS found")
    
else:
    # to download a particular video
    download_video(url)