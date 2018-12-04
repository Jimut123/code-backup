import re
hand = open('Spam.txt')
numlist = list()
for line in hand:
	line = line.rstrip()    # Strips a line
	stuff = re.findall('^X-DSPAM-Confidence: ([0-9.]+)',line) # Matches with this type of architecture
	if len(stuff)!= 1: continue
	num=float(stuff[0])
	numlist.append(num)
print('Mximum:',max(numlist))



