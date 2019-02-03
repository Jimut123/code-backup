import time
import json
from selenium import webdriver
driver = webdriver.Firefox()
driver.get('https://satellites.pro/#9.470736,20.478516,7')
time.sleep(5)
timings = driver.execute_script("return window.performance.getEntries();")
#print (timings)
#parsed_json = json.loads(str(timings))
with open('sat_json_obj.json', 'w') as outfile:  
    json.dump(timings, outfile,indent=4, sort_keys=True)
