"""
Check "get_all_routes" table to get all the start and end stopages along with the routeId. Get the corresponding stopId from get_all_stoppages
table. This is too static.

INPUT : route_code,from_stop_id,to_stop_id
route_code/routeId can be found out from the "get_all_routes" table.

OUTPUT :   {
            "linkId": 505,
            "pointLat": 22.565853,
            "pointLng": 88.368879,
            "pointSequence": 0,
            "routeId": 5541
        },

The output basically consists of all the coordinates of the route.


"""