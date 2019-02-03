from tqdm import tqdm
import json
import sqlite3
import re

from pypath import api

a=api()
#data = {}
#data['stoppages'] = []

get_all_stoppages = a.get_all_stoppages()
get_all_routes = a.get_all_routes()
get_last_update_time = a.get_last_update_time()
#get_kolkata_traffic_update = a.get_kolkata_traffic_update()


with open('get_all_routes.json', 'w') as outfile:  
    json.dump(get_all_routes, outfile,indent=4, sort_keys=True)



with open('get_all_stoppages.json', 'w') as outfile:  
    json.dump(get_all_stoppages, outfile,indent=4, sort_keys=True)


with open('get_last_update_time.json', 'w') as outfile:  
    json.dump(get_last_update_time, outfile,indent=4, sort_keys=True)

"""
with open('get_kolkata_traffic_update.json', 'w') as outfile:  
    json.dump(get_kolkata_traffic_update, outfile,indent=4, sort_keys=True)
"""


