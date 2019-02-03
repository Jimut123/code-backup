"""
__author__ : Jimut Bahan Pal

It has been found that most of the data are not there, so try and except is used for every data-fetch.

This program converts the get_all_routes() JSON object to sqlite database.

Stores in db.sqlite under the table get_all_routes

TOTAL OF 1167 entries found.

"""


import sqlite3

conn = sqlite3.connect('db.sqlite')
cur = conn.cursor()

cur.executescript('''
CREATE TABLE IF NOT EXISTS get_all_routes (
    agencyId            TEXT,
    agencyName          TEXT,
    agencyTimezone      TEXT,
    agencyType          TEXT,
    endStop             TEXT,
    hasPaths            TEXT,
    isValid             TEXT,
    routeDepotList      TEXT,
    routeId             TEXT,
    routeLongName       TEXT,
    routeShortName      TEXT,
    routeType           TEXT,
    skipCount           TEXT,
    startStop           TEXT
);
''')

"""
agencyId agencyName agencyTimezone agencyType endStop hasPaths isValid routeDepotList routeId routeLongName routeShortName routeType skipCount startStop 
"""
from pypath import api
import json
a = api()

get_all_routes_dumps = json.dumps(a.get_all_routes())

get_all_routes = json.loads(get_all_routes_dumps)

get_data_routes = get_all_routes['data']
err=0
for data_items in get_data_routes:
    try :
        agency_id = data_items['agency']['agencyId']
    except: 
        agency_id = ""
    
    try :
        agency_name = data_items['agency']['agencyName']
    except: 
        agency_name = ""
    
    try :
        agency_tz = data_items['agency']['agencyTimezone']
    except: 
        agency_tz = ""
    
    try :
        agency_type = data_items['agency']['agencyType']
    except: 
        agency_type = ""
    
    try :
        end_stp = data_items['endStop']
    except: 
        end_stp = ""
    
    try :
        hs_pth = data_items['hasPaths']
    except: 
        hs_pth = ""
    
    try :
        is_valid = data_items['isValid']
    except: 
        is_valid = ""
    
    try :
        route_dpt_list = data_items['routeDepotList']
    except: 
        route_dpt_list = ""
    
    try :
        route_id = data_items['routeId']
    except: 
        route_id = ""
    
    try :
        route_lng_name = data_items['routeLongName']
    except: 
        route_lng_name = ""
    
    try :
        route_srt_name = data_items['routeShortName']
    except: 
        route_srt_name = ""
    
    try :
        route_type = data_items['routeType']
    except: 
        route_type = ""
    
    try :
        skip_count = data_items['skipCount']
    except: 
        skip_count = ""
    
    try :
        start_stop = data_items['startStop']
    except: 
        start_stop = ""
    
    #print("agency_id : ",agency_id," agency_name : ",agency_name," agency_tz : ",agency_tz," agency_type : ",agency_type," end_stp : ",end_stp," hs_pth : ",hs_pth," is_valid : ",is_valid)
    #print(" route_dpt_list : ",route_dpt_list," route_id : ",route_id," route_lng_name : ",route_lng_name," route_srt_name : ",route_srt_name," route_type : ",route_type," skip_count : ",skip_count," start_stop : ",start_stop)
    cur.execute('''INSERT INTO get_all_routes (agencyId, agencyName, agencyTimezone, agencyType, endStop, hasPaths, isValid, routeDepotList, routeId, routeLongName, routeShortName, routeType, skipCount, startStop )
                VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )''', ( agency_id, agency_name, agency_tz, agency_type, end_stp, hs_pth, is_valid,  str(route_dpt_list),  route_id, route_lng_name,  route_srt_name, route_type, skip_count, start_stop,  ) )
    
conn.commit()