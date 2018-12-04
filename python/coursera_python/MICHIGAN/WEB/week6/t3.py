import json
import urllib

location = raw_input("Enter locaiton: ")
url = "http://python-data.dr-chuck.net/geojson"
print "Retrieving", url
params = {"sensor": False, "address": location}
data = urllib.urlopen(url + "?" + urllib.urlencode(params)).read()
print "Retrieved", len(data), "characters"
results = json.loads(data)
print "Place id", results["results"][0]["place_id"]
