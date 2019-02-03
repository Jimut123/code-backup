import requests
import browsercookie
cj = browsercookie.firefox()
r = requests.get('http://stackoverflow.com', cookies=cj)
print(str(r))