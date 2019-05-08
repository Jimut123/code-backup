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


def get_files(get_file_names,ret_dat):
    for items in get_file_names:
        href_ = items.get_attribute('href')
        try:
            split_1,split_2 = str(href_).split('/')[5], str(href_).split('/')[6]
            
            if split_1 == "blob":
                s = href_.split('/')
                get_url = s[0]+"//"+"raw.githubusercontent.com/"+s[3]+"/"+s[4]+"/"+s[6]+"/"+s[7]
                ret_dat[get_url]="file"
        except:
            pass
    return ret_dat


def get_urls(url,data={},k=0):
    print(json.dumps(data, indent=2, sort_keys=True))

    profile = webdriver.FirefoxProfile()
    profile.set_preference("general.useragent.override", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
    driver = webdriver.Firefox(profile)
    driver.get(url)
    
    get_file_names = []
    get_file_names = driver.find_elements_by_class_name("js-navigation-open")
    for items in get_file_names:
        #item_ = items.text 
        href_ = items.get_attribute('href')
        try:
            split_1,split_2 = str(href_).split('/')[5], str(href_).split('/')[6]
            if split_1 == "tree":
                get_files(get_file_names,data)
                data[str(href_)] = get_urls(href_,data,k=1)
        except:
            pass
    
    driver.close()


if __name__ == "__main__":
    URL = "https://github.com/ines/spacy-course"
    get_urls(URL)
    #print(json.dumps(FOLDER_TREE, indent=2, sort_keys=True))
    #while FOLDER_COUNT>0:
