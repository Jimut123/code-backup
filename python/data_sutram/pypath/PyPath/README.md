
      _____       _____     _______ _    _ 
      |  __ \     |  __ \ /\|__   __| |  | |
      | |__) |   _| |__) /  \  | |  | |__| |
      |  ___/ | | |  ___/ /\ \ | |  |  __  |
      | |   | |_| | |  / ____ \| |  | |  | |
      |_|    \__, |_| /_/    \_\_|  |_|  |_|
             __/ |                         
            |___/                          
            
# PyPath-0.1
PyPath is the unoffical Python wrapper of the PathaDisha App . 

# Pathadisha APP Description

This application is for commuters of Kolkata metropolitan area. By this application, commuters can view all incoming or outgoing buses for a particular stop or current location.

Commuter can also view all the buses operating on a particular route in real time on the map along with expected time of arrival (ETA).

<a href="https://play.google.com/store/apps/details?id=com.wbtransport.commuter&hl=en"> PlayStore Link </a>

# Implementations

## PathaDisha API

[:heavy_check_mark:] getAllRoutes<br>
[:heavy_check_mark:] getAllStoppages<br>
[:heavy_check_mark:] getVehicleListByRecBoundary<br>
[:grey_exclamation:] getVehicleListByCirBoundary<br>
[:heavy_check_mark:] getVehicleETA<br>
[:heavy_check_mark:] getVehicleByRoute<br>
[:grey_exclamation:] getPointByRoute<br>
[:heavy_check_mark:] getTripPlans<br>
[:heavy_check_mark:] findNearestStop<br>
[:heavy_check_mark:] getStoppagesInBoundary<br>
[:heavy_check_mark:] getVehiclePosition<br>
[:heavy_check_mark:] getRoutePathBetween2Stops<br>
[:grey_exclamation:] getTokenForRideShare<br>
[:heavy_check_mark:] getApproachingVehicles<br>
[:heavy_check_mark:] getLastRoueUpdateTime<br>
[:heavy_check_mark:] getKolkataTrafficUpdate<br>

## External API

[:grey_exclamation:] getVehicleETAGoogleTraffic<br>

# Endpoints

baseurl="http://167.114.174.89:8080/"<br>
baseurl_trip_planner="http://167.114.174.89:2080/"<br>

# Usage

	>>> from pypath import api
	>>> a=api()
	>>> a.get_all_stoppages()
	{u'duration': 0, u'status': u'SUCCESS', u'message': u'', u'data': [{u'stopName': u'AIRPORT (GATE NO.1)', u'stopLat': 22.642036, u'locationType': u'STOP', u'isJunction': u'N', u'stopLon': 88.431122, u'stopId': 1, u'isValid': u'Y'}, {u'stopName': u'AIRPORT (GATE NO.3)
	...
	'N', u'stopLon': 88.34848, u'stopId': 1377, u'isValid': u'Y'}, {u'stopName': u'SHWABHUMI', u'stopLat': 22.57091, u'locationType': u'STOP', u'isJunction': u'N', u'stopLon': 88.404058, u'stopId': 1378, u'isValid': u'Y'}], u'requestId': u'1d459b40-4acc-4ac4-be60-d9367d45c3f1'}
	>>> a.get_approaching_vehicles("1")
	{u'duration': 0, u'status': u'SUCCESS', u'message': u'', u'data': [{u'direction': u'W', u'crowd': u'null', u'speed': 0.0, u'timeToDestinationStop': 189, u'outOfPath': False, u'routeCode': u'AC39:DN', u'lastLocation': {u'latitude': 22.6448038333, u'longitude': 88.4388711667}, u'journeyStarted': True, u'lastTime': 1489764597669, u'vehicleNo': u'WB050841', u'dataSource': u'TRIMAX'}], u'requestId': u'4fe0d6c4-d00f-a571-2e6830c6ecb8'}


gist : https://gist.github.com/zed41/a9573209d782f8254b0a6694934274ef