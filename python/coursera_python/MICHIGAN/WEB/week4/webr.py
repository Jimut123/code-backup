import urllib.request, urllib.parse, urllib.error
import pyttsx
engine = pyttsx.init()
#engine.say('Greetings!')
#engine.say('How are you today?')
engine.runAndWait()
fhand = urllib.request.urlopen('http://data.pr4e.org/romeo.txt')
for line in fhand:
	h=line.decode().strip()
	print(h)
	engine.say(h)
	engine.runAndWait()

	

