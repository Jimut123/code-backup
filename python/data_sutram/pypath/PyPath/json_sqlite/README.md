#### Details of program and database
run 
```
python 7_get_vehicles_by_rec_boundary.py

```
This will store the JSON object's list in the database continuously against each of the timestamp.

        Program                                       Database        Table Name
_________________________________________________________________________________________________________
    * 2_get_all_routes_sqlite.py           -->        db.sqlite       get_all_routes
    * 3_get_all_stoppages_sqlite.py        -->        db.sqlite       get_all_stoppages
    * 7_get_vehicles_by_rec_boundary.py    -->        live_db.sqlite  vehicle_list_ts