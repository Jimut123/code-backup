"""
import requests
import json

send_url = 'http://freegeoip.net/json'
r = requests.get(send_url)
j = json.loads(r.text)
#lat = j['latitude']
#lon = j['longitude']
print(j)
#print (lat,lon)


###############################

[22.5697, 88.3697]
Loading formatted geocoded file...
[OrderedDict([('lat', '22.56263'),
              ('lon', '88.36304'),
              ('name', 'Kolkata'),
              ('admin1', 'West Bengal'),
              ('admin2', 'Kolkata'),
              ('cc', 'IN')])]
<[REQUEST_DENIED] Google - Reverse [empty]>
Kolkata
West Bengal
IN
700131

#################################
"""
import reverse_geocoder as rg 
import pprint 

def reverseGeocode(coordinates): 
    result = rg.search(coordinates) 
    # result is a list containing ordered dictionary. 
    pprint.pprint(result)  
# Driver function 

import geocoder
g = geocoder.ip('me')
print(g.latlng)
coordinates = g.latlng
reverseGeocode(coordinates)
print(geocoder.google(coordinates, method='reverse'))
print(g.city)
print(g.state)
print(g.country)
print(g.postal)