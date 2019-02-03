#!/usr/bin/env python
from selenium.webdriver import Firefox

url, filename = 'http://www.stackoverflow.com', '/tmp/stackoverflow.com.png'

browser = Firefox()

browser.get(url)
browser.get_screenshot_as_file(filename)