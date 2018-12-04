import json
import urllib.request

info = json.loads(data)
print('User count:',len(info))
s=0
count1=0
for item in info:
	print('Name : ',item["name"])
	print('Count : ',item["count"])
	s=s+int(item["count"])
	count1=count1+1

print("Sum : ",s)
print("Count : ",count1)	
	
	



