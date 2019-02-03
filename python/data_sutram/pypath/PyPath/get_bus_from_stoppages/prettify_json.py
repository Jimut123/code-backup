import json

from pprint import pprint

with open('req_stop.json') as f:
    data = json.load(f)

pprint(data)

with open('req_stop.json', 'w') as outfile:  
    json.dump(data, outfile,indent=4, sort_keys=True)
