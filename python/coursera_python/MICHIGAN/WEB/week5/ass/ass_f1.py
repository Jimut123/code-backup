
serviceurl = 'http://maps.googleapis.com/maps/api/geocode/xml?'





tree = ET.fromstring(data)
lst = tree.findall('comments/comment')

print("count = ",len(lst))
s = 0
for item in lst:
	count = int(item.find('count').text)
	s = s + count

print("Sum : ",s)

while True:
    address = input('Enter location: ')
    if len(address) < 1: break

    url = serviceurl + urllib.parse.urlencode({'address': address})
    print('Retrieving', url)
    uh = urllib.request.urlopen(url)
    data = uh.read()
    print('Retrieved', len(data), 'characters')
    print(data.decode())
    tree = ET.fromstring(data)

