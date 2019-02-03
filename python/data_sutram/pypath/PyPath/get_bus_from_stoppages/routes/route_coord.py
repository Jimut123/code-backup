"""
Note: Needs db.sqlite in the same folder!!!!


This program takes a route ID and returns all the coorinates present in the route,
i.e., the coordinates in a list of tuple [(lat,lon),(lat,lon),...,(lat,lon)]

This takes the route short name, start stop name and end stop name as Input.
"""

import json
from pypath import api
a = api() 
import sqlite3

conn = sqlite3.connect('db.sqlite')
cur = conn.cursor()

def return_route_by_id(route_short_name,start_stop_name,end_stop_name):
    #returns the list of tuples

    
    cur.execute('''select stopId from get_all_stoppages where stopName = ?''',(start_stop_name,))
    start_stop_id = cur.fetchone()[0]
    #print(start_stop_id)
    cur.execute('''select stopId from get_all_stoppages where stopName = ?''',(end_stop_name,))
    end_stop_id = cur.fetchone()[0]
    #print(end_stop_id)
    data_json_raw = a.get_route_path_bw_2_stops(route_short_name,start_stop_id,end_stop_id)
    #print(data_json_raw)

    get_need_data = data_json_raw['data']
    #print(get_need_data)
    coord_list = []
    for data_item in get_need_data:
        pointLat = data_item['pointLat']
        pointLng = data_item['pointLng']
        tuple_coord = (pointLat,pointLng)
        coord_list.append(tuple_coord)
    #print(coord_list)
    return coord_list

def get_all_routes_by_stopname(stop_name):
    #this piece of fkn code returns all the routeId corresponding to a particular stop name
    cur.execute('''select routeId from get_all_routes where startStop = ?''',(stop_name,))
    total_routes_list = []
    list_stop_1 = cur.fetchall()
    for item_ in list_stop_1:
        get_stop, = item_
        total_routes_list.append(get_stop)
    cur.execute('''select routeId from get_all_routes where endStop = ?''',(stop_name,))
    list_stop_2 = cur.fetchall()
    for item_ in list_stop_2:
        get_stop, = item_
        total_routes_list.append(get_stop)
    #print(total_routes_list)
    return total_routes_list

def get_start_end_stop_by_route_id(route_id):
    #return a tuple of (start stop Name, start stop Id, End stop name, end stop id) by route ID
    start_stop_name = cur.execute('''select startStop from get_all_routes where routeId = ? ''',(route_id,)).fetchone()[0]
    #print("Start stop name : ",start_stop_name)
    start_stop_id = cur.execute('''select stopId from get_all_stoppages where stopName = ? ''',(start_stop_name,)).fetchone()[0]
    #print("Start stop ID : ",start_stop_id)
    end_stop_name = cur.execute('''select endStop from get_all_routes where routeId = ? ''',(route_id,)).fetchone()[0]
    #print("End stop name : ",end_stop_name)
    end_stop_id = cur.execute('''select stopId from get_all_stoppages where stopName = ? ''',(end_stop_name,)).fetchone()[0]
    #print("Start stop ID : ",end_stop_id)
    return (start_stop_name,start_stop_id,end_stop_name,end_stop_id)


def return_all_list_coord_by_stop_name(stop_name):
    # first gets all the routes by the stop name
    stop_routes = get_all_routes_by_stopname(stop_name)
    #print(stop_routes)
    #find the start stop ID and end stop Id by routeID

    ret_all_stop_coord_list = []
    for route_id_ in stop_routes:
        get_start_stop_name, get_start_stop_id, get_end_stop_name, get_end_stop_id = get_start_end_stop_by_route_id(route_id_)
        #get route short name for easy calculations and fetching
        get_route_short_name = cur.execute(''' select routeShortName from get_all_routes where routeId = ?''',(route_id_,)).fetchone()[0]
        #print(get_route_short_name,route_id_,get_start_stop_id,get_end_stop_id)
        #return the route by these datas
        
        list_routes = return_route_by_id(get_route_short_name,get_start_stop_name,get_end_stop_name)
        #print(list_routes)
        ret_all_stop_coord_list.append(list_routes)
    return ret_all_stop_coord_list





if __name__ == "__main__":
    #return_route_by_id('104:UP','JODHPUR PARK','BALLYGUNGE PHARI')
    #get_all_routes_by_stopname('PARNASREE')
    #get_start_end_stop_by_route_id('6155')
    get_list = return_all_list_coord_by_stop_name('PARNASREE')
    print(get_list)




