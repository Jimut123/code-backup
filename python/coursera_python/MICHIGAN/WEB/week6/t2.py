import urllib
import json


url = 'http://maps.googleapis.com/maps/api/geocode/json?'
location = raw_input('Enter location: ')

url = url + urllib.urlencode({'sensor':'false', 'address': location})
print 'Retrieving', url
uh = urllib.urlopen(url)
data = uh.read()
print 'Retrieved', len(data), 'characters'
json = json.loads(data) 
results = json['results']
for result in results:
print result['place_id']
