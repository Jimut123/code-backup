import json
from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

options = webdriver.ChromeOptions()
#options.binary_location = "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome"
chrome_driver_binary = "../chromedriver"
driver = webdriver.Chrome(chrome_driver_binary, chrome_options=options)
"""
caps = DesiredCapabilities.CHROME
caps['loggingPrefs'] = {'performance': 'ALL'}
driver = webdriver.Chrome(desired_capabilities=caps)
"""
driver.get('https://stackoverflow.com/questions/52633697/selenium-python-how-to-capture-network-traffics-response')

def process_browser_log_entry(entry):
    response = json.loads(entry['message'])['message']
    return response

browser_log = driver.get_log('performance') 
events = [process_browser_log_entry(entry) for entry in browser_log]
events = [event for event in events if 'Network.response' in event['method']]
print(events)