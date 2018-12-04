# To use the find function

hand = open('test.txt')
for line in hand:
	line=line.rstrip()
	if line.find("from")>=0:
		print(line)
