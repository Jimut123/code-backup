import requests,json,random
# random reqId generator for post req get_approaching_veichles()
def s4():
    return ''.join([random.choice('0123456789abcdef') for x in range(4)])
def guid():
    return s4()+s4()+'-'+s4()+'-'+s4()+'-'+s4()+s4()+s4()

#req header 
headers={'content-type': 'application/json','accept':'application/json'}


class api:
    def __init__(self):
        self.baseurl="http://167.114.174.89:8080/"
        self.baseurl_tp="http://167.114.174.89:2080/"
        self.req_id=""
        self.stops=self.get_all_stoppages()["data"]
        
    #utility
    def get_stop_id_by_name(self,stop_name):
        for stop in self.stops:
            if stop["stopName"]==stop_name:
                return stop["stopId"]
        return "0"
    
    # Get req working all
    def get_all_routes(self):
        r = requests.get(self.baseurl+"app/routes/getAllRoutes.json")
        return json.loads(r.text)
        
    def get_all_stoppages(self):
        r = requests.get(self.baseurl+"app/stops/getAllStops.json")
        return json.loads(r.text)
        
    def get_last_update_time(self):
        r = requests.get(self.baseurl+"app/routes/getLastUpdateTime.json")
        return json.loads(r.text)
        
    def get_kolkata_traffic_update(self):
        r = requests.get(self.baseurl+"app/sm/kolkatatrafficupdate.json")
        return json.loads(r.text)
    
    
    # Post req . working n tested
    def get_approaching_vehicles(self,stop_id):
        data=json.dumps({'requestId':guid(),'stopId':stop_id})
        r=requests.post(self.baseurl+"app/travel/getApproachingVehicles.json",data=data,headers=headers)
        self.req_id=json.loads(r.text)['requestId']
        return json.loads(r.text)
        
    def get_vehicle_ETA(self,veichle_no):
        data=json.dumps({'vehicleNo':veichle_no})
        r=requests.post(self.baseurl+"app/eta/getVehicleETA.json",data=data,headers=headers)
        return json.loads(r.text)
        
    def get_vehicles_by_rec_boundary(self,rec):
        data=json.dumps({'pointNW':{'latitude':rec[0],'longitude':rec[1]},'pointSE':{'latitude':rec[2],'longitude':rec[3]}})
        r=requests.post(self.baseurl+"app/vehicles/getVehicleList.json",data=data,headers=headers)
        return json.loads(r.text)
        
    def get_stoppages_by_rec_boundary(self,rec):
        data=json.dumps({'pointNW':{'latitude':rec[0],'longitude':rec[1]},'pointSE':{'latitude':rec[2],'longitude':rec[3]}})
        r=requests.post(self.baseurl+"app/stops/getStopList.json",data=data,headers=headers)
        return json.loads(r.text)
    
    def find_nearest_stop(self,loc,dist):
        data=json.dumps({"location": {"latitude": loc[0],"longitude": loc[1]},"searchDistance": dist})
        r=requests.post(self.baseurl+"app/stops/getNearbyStops.json",data=data,headers=headers)
        return json.loads(r.text)
        
    def get_vehicle_pos(self,veichle_no):
        data=json.dumps({'vehicleNo':veichle_no})
        r=requests.post(self.baseurl+"app/vehicles/getVehicleByRegNo.json",data=data,headers=headers)
        return json.loads(r.text)
    
    def get_vehicle_by_route(self,route_code):
        data=json.dumps({ "routeCode": route_code })
        r=requests.post(self.baseurl+"app/vehicles/getVehicleByRoute.json",data=data,headers=headers)
        return json.loads(r.text)
        
    def get_trip_plans(self,from_stop,to_stop,hop_count):
        url_params="startStopName=" + from_stop + "&endStopName=" + to_stop + "&hopCount=" + str(hop_count)
        r=requests.get(self.baseurl_tp+"/app/tripplanner/routes?"+url_params)
        return json.loads(r.text)
    
    def get_route_path_bw_2_stops(self,route_code,from_stop_id,to_stop_id):
        data=json.dumps({"requestId":guid(),"routeCode":route_code,"startStopId":from_stop_id,"endStopId":to_stop_id})
        r=requests.post(self.baseurl+"app/paths/getPathByRoute.json",data=data,headers=headers)
        return json.loads(r.text)
