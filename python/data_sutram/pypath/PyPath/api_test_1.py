from pypath import api
import json
a=api()

get_approach_data = {}
get_approach_data['data'] = []
#for i in range(3055):
get_data_json = a.get_route_path_bw_2_stops('30B:UP',183,138)
    
with open('13_get_route_path_bw_2_stops().json', 'w') as outfile:  
    json.dump(get_data_json, outfile,indent=4, sort_keys=True)


