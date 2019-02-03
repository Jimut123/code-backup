"""
This piece of code will send :

INPUT = stop_id [can be got from "get_all_stoppages" table in db.sqlite]

and get 

OUTPUT = 
{
    {
            "angle": 62,
            "crowd": "null",
            "dataSource": "Chalo-VTU",
            "directMatch": true,
            "direction": "SW",
            "distanceToDestinationStop": 228.5,
            "eventLocation": null,
            "journeyStarted": true,
            "lastLocation": {
                "latitude": 22.639183,
                "longitude": 88.428284
            },
            "lastTime": 1547288111000,
            "nearbyStop": null,
            "outOfPath": false,
            "routeCode": "223:UP",
            "speed": 0.0,
            "stopped": false,
            "tags": [],
            "timeToDestinationStop": 47,
            "vehicle": {
                "agencyName": "Kolkata Traffic Police",
                "isValid": "Y",
                "publiclyVisible": "Y",
                "vehicleId": 182362,
                "vehicleRegNo": "WB04E5881",
                "vehicleRegNoAlias": "Chalo-VTU",
                "vehicleType": "BUS"
            },
            "vehicleNo": "WB04E5881",
            "vehicleType": "BUS",
            "violatesPath": "false"
    }
    "stop": {
        "isJunction": "Y",
        "isValid": "Y",
        "locationType": "TERMINAL",
        "stopId": 1,
        "stopLat": 22.642036,
        "stopLon": 88.431122,
        "stopName": "AIRPORT (GATE NO.1)"
    }
}

Since this is a live update, so this can be run continuously and should be stored in another database.
Probably, this should be requested after 1 mins. Which means there will be 60 * 24 instances of the same db.



"""