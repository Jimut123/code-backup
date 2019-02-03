
"""
__author__ : Jimut Bahan Pal

It has been found that most of the data are not there, so try and except is used for every data-fetch.

This program converts the get_all_stoppages() JSON object to sqlite database.

Stores in db.sqlite under the table get_all_stoppages

TOTAL OF 1673 entries found.

"""

import sqlite3

conn = sqlite3.connect('db.sqlite')
cur = conn.cursor()


cur.executescript('''
CREATE TABLE IF NOT EXISTS get_all_stoppages (
    isJunction            TEXT,
    isValid               TEXT,
    locationType          TEXT,
    stopId                TEXT,
    stopLat               TEXT,
    stopLon               TEXT,
    stopName              TEXT
);
''')

"""
isJunction isValid locationType stopId stopLat stopLon stopName
"""

from pypath import api
import json
a = api()

get_all_stoppages1 = json.dumps(a.get_all_stoppages())

get_all_stoppages_ = json.loads(get_all_stoppages1)

get_all_stoppages = get_all_stoppages_['data']

for data_items in get_all_stoppages:
    try:
        isJunction = data_items['isJunction']
    except:
        isJunction = ""
    
    try:
        isValid = data_items['isValid']
    except:
        isValid = ""
    
    try:
        locationType = data_items['locationType']
    except:
        locationType = ""
    
    try:
        stopId = data_items['stopId']
    except:
        stopId = ""
    
    try:
        stopLat = data_items['stopLat']
    except:
        stopLat = ""
    
    try:
        stopLon = data_items['stopLon']
    except:
        stopLon = ""
    
    try:
        stopName = data_items['stopName']
    except:
        stopName = ""
    
    #print(isJunction," ", isValid," ", locationType, " ",stopId," ", stopLat," ", stopLon," ", stopName)
    cur.execute('''INSERT INTO get_all_stoppages (isJunction, isValid, locationType, stopId, stopLat, stopLon, stopName)
                VALUES ( ?, ?, ?, ?, ?, ?, ? )''', ( isJunction, isValid, locationType, stopId, stopLat, stopLon, stopName, ) )
    
conn.commit()