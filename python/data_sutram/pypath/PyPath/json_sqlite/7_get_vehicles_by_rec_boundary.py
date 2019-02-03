"""

Values obtained :

Minimum latitude of a stoppage : -6.786582
Maximum latitude of a stoppage : 25.40523

Minimum longitude of a stoppage : 22.382959
Maximum longitude of a stoppage : 88.963



Expected output :

{
            "angle": 5,
            "crowd": "null",
            "dataSource": "Chemito-VTU",
            "direction": "N",
            "distanceToDestinationStop": 0.0,
            "eventLocation": null,
            "journeyStarted": true,
            "lastLocation": {
                "latitude": 23.29142,
                "longitude": 88.441895
            },
            "lastTime": 1547299693000,
            "outOfPath": false,
            "routeCode": "E24:UP",
            "speed": 36.0,
            "stopped": false,
            "tags": [],
            "timeToDestinationStop": 0,
            "vehicle": {
                "agencyName": "CTC",
                "isValid": "Y",
                "vehicleId": 74799,
                "vehicleRegNo": "WB04H3873",
                "vehicleRegNoAlias": "Chemito-VTU",
                "vehicleType": "BUS"
            },
            "vehicleNo": "WB04H3873",
            "vehicleType": "BUS",
            "violatesPath": "false"
}

Aim : get the minimum and the maximum of both latitude and longitude. Pass and get all the vehicles.

This is also a live api request so, 60 * 24 instances of the same db, if 1 request is made per minute.

['24','86','22','90'] --> provides maximum no. of buses

"""
from pypath import api
import json
from datetime import tzinfo, timedelta, datetime
a=api()

import sqlite3

conn = sqlite3.connect('live_db.sqlite')
cur = conn.cursor()


cur.executescript('''
CREATE TABLE IF NOT EXISTS vehicle_list_ts (
    date_time DATE,
    json_list TEXT
);
''')


"""
date_time, json_list

journeyStarted, latitude, longitude, lastTime, outOfPath, routeCode, speed, stopped, vehicleId, vehicleRegNo, vehicleType, violatesPath, vehicleNo
"""

#rec = ["-6.786582", "25.40523", "22.382959", "88.963" ]
#rec = [-6, -6, 88, 88]

rec = ['24','86','22','90']    # --> max 2498
#rec = ['23','88','22','89']


#   get_approach_data = {}
#   get_approach_data['data'] = []
#for i in range(3055):
#   get_data_json = a.get_vehicles_by_rec_boundary(rec)
    
#with open('test_get_vehicles_by_rec_boundary_final_1().json', 'w') as outfile:  
#    json.dump(get_data_json, outfile,indent=4, sort_keys=True)

#   get_vbrb1 = json.dumps(get_data_json)

#   get_all_stoppages_ = json.loads(get_vbrb1)

#   get_vbrb = get_all_stoppages_['data']
def get_timestmp():
    # to return the current timestamp for making it an unique primary key
    tmestmp = datetime.now().isoformat(timespec='seconds')
    #print(type(tmestmp))
    return tmestmp
for iter in range(100000000):       ## to occur indefinitely
    get_time = get_timestmp()
    #get_approach_data['data'] = []
    #get_approach_data = {}
    get_data_json = a.get_vehicles_by_rec_boundary(rec)
    get_vbrb1 = json.dumps(get_data_json)
    get_all_stoppages_ = json.loads(get_vbrb1)
    get_vbrb = get_all_stoppages_['data']
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
        get_list_json.append(json_data)
    print(get_time)
    print(get_list_json)
    cur.execute('''INSERT INTO vehicle_list_ts (date_time, json_list )
                VALUES ( ?, ? )''', ( get_time, str(get_list_json), ) )
    conn.commit()

