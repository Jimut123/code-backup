import urllib.request, urllib.parse, urllib.error

fhand = urllib.request.urlopen('http://arduino.cc/')
for line in fhand:
	print(line.decode().strip().split(' '))
	#print()
