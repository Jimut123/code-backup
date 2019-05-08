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
import wget
import os

#jim_json = {}
FOLDER_TREE = {}

"""
https://github.com/ines/spacy-course/tree/master/binder

https://github.com/ines/spacy-course/blob/master/binder/requirements.txt

https://raw.githubusercontent.com/ines/spacy-course/master/binder/requirements.txt
"""

# setting profile
profile = webdriver.FirefoxProfile()
profile.set_preference("general.useragent.override", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
driver = webdriver.Firefox(profile)

url = 'https://github.com/ines/spacy-course'
driver.get(url)

get_file_names = []
#get_file_names = driver.find_element_by_xpath("//a[@class='js-navigation-open']")
get_file_names = driver.find_elements_by_class_name("js-navigation-open")
#print(get_file_names)



for items in get_file_names:
    item_ = items.text 
    href_ = items.get_attribute('href')
    try:
        split_1,split_2 = str(href_).split('/')[5], str(href_).split('/')[6]
        #print(split_1,split_2)
        """
        jim_json[item_] = {
                "url":str(href_),
                "type":"{}/{}".format(split_1,split_2),
                "collected":True,
                "content":""
            }
        """
        
        if split_1 == "tree":
            if not os.path.exists(item_):
                os.makedirs(item_)
            FOLDER_TREE[item_] = {"visited":False,"url":href_}
        if split_1 == "blob":
            "https://github.com/ines/spacy-course/blob/master/theme.sass"
            "https://raw.githubusercontent.com/ines/spacy-course/master/theme.sass"
            s = href_.split('/')
            get_url = s[0]+"//"+"raw.githubusercontent.com/"+s[3]+"/"+s[4]+"/"+s[6]+"/"+s[7]
            #if not str(os.path.exists(get_url.split('/')[-1:]):
            wget.download(get_url)

    except Exception as e:
        print(e)
    driver.close()
    #print(items.text)
    #print(items.get_attribute('href'))
#print(json.dumps(FOLDER_TREE, indent=2, sort_keys=True))

if len(FOLDER_TREE) == 0:
    pass
else:
    # to do the real shit
    while len(FOLDER_TREE)>0:
        for item in FOLDER_TREE:
            url_ = FOLDER_TREE[item]["url"]
            break
        FOLDER_TREE.pop(item)
        driver.get(url_)
        os.chdir(item)
        get_file_names = []
        #get_file_names = driver.find_element_by_xpath("//a[@class='js-navigation-open']")
        get_file_names = driver.find_elements_by_class_name("js-navigation-open")
        for items in get_file_names:
            item_ = items.text 
            href_ = items.get_attribute('href')
            try:
                split_1,split_2 = str(href_).split('/')[5], str(href_).split('/')[6]
                if split_1 == "tree":
                    if not os.path.exists(item_):
                        os.makedirs(item_)
                    FOLDER_TREE[item_] = {"visited":False,"url":href_}
                if split_1 == "blob":
                    "https://github.com/ines/spacy-course/blob/master/theme.sass"
                    "https://raw.githubusercontent.com/ines/spacy-course/master/theme.sass"
                    s = href_.split('/')
                    get_url = s[0]+"//"+"raw.githubusercontent.com/"+s[3]+"/"+s[4]+"/"+s[6]+"/"+s[7]
                    #if not str(os.path.exists(get_url.split('/')[-1:]):
                    wget.download(get_url)
            except Exception as e:
                print(e)
            driver.close()
                



#print(json.dumps(jim_json, indent=2, sort_keys=True))


