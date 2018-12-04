
fname = input("Enter file name: ")
if len(fname) < 1 : fname = "mbox-short.txt"

fh = open(fname)
count = 0

for line in fh:
	line1 = line.rstrip()
	if "From:" in line1:
		continue
	if "From " in line1:
		words = line.split()
		count = count + 1
		print(words[1])
	



print("There were", count, "lines in the file with From as the first word")



