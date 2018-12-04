
fname = input("Enter file name: ")
fh = open(fname)
lst = list()
for line in fh:
	line1 = line.rstrip()
	words = line1.split()
	for word in words:
		if word in lst:
			continue
		lst.append(word)
		#print(word)
	#print(line1,' ==')
lst.sort()
print(lst)

