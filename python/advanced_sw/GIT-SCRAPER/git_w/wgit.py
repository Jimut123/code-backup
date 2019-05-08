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
print(get_file_names)



for items in get_file_names:
    item_ = items.text 
    href_ = items.get_attribute('href')
    #print(items.text)
    #print(items.get_attribute('href'))



