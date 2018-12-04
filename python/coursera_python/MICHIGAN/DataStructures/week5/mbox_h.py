fname = input("Enter file name: ")

fh = open(fname)

counts = dict()
for line in fh:
	line1 = line.rstrip()
	if "From:" in line1:
		continue
	if "From " in line1:
		words = line.split()
		#count = count + 1
		mail = words[1]
		counts[mail] = counts.get(mail,0) + 1
bigcount = None
bigword = None
for mail,count in counts.items():
	if bigcount is None or count > bigcount:
		bigword = mail
		bigcount = count

print(bigword,bigcount)





