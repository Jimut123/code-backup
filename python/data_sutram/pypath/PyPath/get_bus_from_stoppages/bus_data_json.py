"""

This program takes the req_stop.json file, containing all the lat and long of the stop. It then finds all the bus approaching it which have a speed of 
less than 5 km/hr in 2 Km diameter.

"""

import time
from datetime import tzinfo, timedelta, datetime
from tqdm import tqdm
# time.sleep(600) after 10 mins 
import json
from pypath import api
a = api() 

list_coord = []
with open('req_stop.json') as f:
    data = json.load(f)
    store_data = data['stores']
    for data_items in store_data:
        get_coord = data_items['geometry']['coordinates']
        #print(get_coord)
        list_coord.append(get_coord)
    #print(store_data)


# To get all the data in the list which have the latitude and longitude.
print(list_coord)
def get_timestmp():
    # to return the current timestamp for making it an unique primary key
    tmestmp = datetime.now().isoformat(timespec='seconds')
    #print(type(tmestmp))
    return tmestmp

whole_json = {}     # will contain the whole JSON object
# iterating over each of the coordinates
for iter_var in tqdm(range(10)):        #goes on and on and on
    
    
    for coord in list_coord:
        get_time = get_timestmp()   # to get the timestamp
        lat_i = float(coord[0])     #latitude of a coordinate
        lon_i = float(coord[1])     #longitude of a coordinate
        json_timestamp = {}

        rec =  [lat_i+0.01,lon_i-0.01,lat_i-0.01,lon_i+0.01]    # to get the coordinates in 2 km radius
        #rec = ['24','86','22','90']
        get_json = a.get_vehicles_by_rec_boundary(rec)
        #print(get_json)
        get_vbrb = get_json['data']
        get_list_json = []
        for data_items in get_vbrb:
            #print(data_items)
            data = {}
            try:
                journeyStarted = data_items['journeyStarted']

            except:
                journeyStarted = ""
            
            try:
                latitude = data_items["lastLocation"]["latitude"]
            except:
                latitude = ""
            
            try:
                longitude = data_items["lastLocation"]["longitude"]
            except:
                longitude = ""
                
            try:
                lastTime = data_items["lastTime"]
            except:
                lastTime = ""
            
            try:
                outOfPath = data_items["outOfPath"]
            except:
                outOfPath = ""
            
            try:
                routeCode = data_items["routeCode"]
            except:
                routeCode = ""
            
            try:
                speed = data_items["speed"]
            except:
                speed = ""
            
            try:
                stopped = data_items["stopped"]
            except:
                stopped = ""
            
            try:
                vehicleId = data_items["vehicle"]["vehicleId"]
            except:
                vehicleId = ""
            
            try:
                vehicleRegNo = data_items["vehicle"]["vehicleRegNo"]
            except:
                vehicleRegNo = ""
            
            try:
                vehicleType = data_items["vehicle"]["vehicleType"]
            except:
                vehicleType = ""
            
            try:
                violatesPath = data_items["violatesPath"]
            except:
                violatesPath = ""
            
            try:
                vehicleNo = data_items["vehicleNo"]
            except:
                vehicleNo = ""
            
            data['journeyStarted'] = journeyStarted
            data['latitude'] = latitude
            data['longitude'] = longitude
            data['lastTime'] = lastTime
            data['outOfPath'] = outOfPath
            data['routeCode'] = routeCode
            data['speed'] = speed
            data['stopped'] = stopped
            data['vehicleId'] = vehicleId
            data['vehicleRegNo'] = vehicleRegNo 
            data['vehicleType'] = vehicleType
            data['violatesPath'] = violatesPath
            data['vehicleNo'] = vehicleNo
            #print(journeyStarted," ", latitude," ", longitude," ", lastTime," ", outOfPath," ", routeCode," ", speed," ", stopped," ", vehicleId," ", vehicleRegNo," ", vehicleType," ", violatesPath," ", vehicleNo)
            #print(data)
            json_data = json.dumps(data)

            # speed check for the JSON data
            if speed < 5:
                get_list_json.append(json_data)
                print(get_list_json)        #get_list_json have the list of the vehicles!
        print(get_time)
        
        json_timestamp[get_time] = get_list_json

    whole_json[coord] = json_timestamp
    # require fix! we need to get the list of JSON timestamp and vehicles for each of the lat-long. It needs to be made dynammic! This will result 
    # in more processing power for it to be done! but how to append it ?

    #with open('test.json', 'w') as outfile:  
    #    json.dump(whole_json, outfile,indent=4, sort_keys=True)
    time.sleep(600)









