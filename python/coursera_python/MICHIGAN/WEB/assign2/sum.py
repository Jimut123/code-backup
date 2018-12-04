# To scrap off data and find the sum of the numbers present in that data

import re


hand = open('a.txt')
list_=[]
sum=0
for line in hand:
	line = line.rstrip()
	
	y = re.findall('[0-9]+',line)
	#print(y)	# prints the list
	for i in y:
		sum=sum+int(i)
#print(list_)
print(sum)
	

