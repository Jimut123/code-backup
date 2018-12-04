#To take the name of a file and print all the line in upper case

try:
	fname= input("Enter a file name :")
except:
	print("File ",fname," not present :(\n ...quitting")
	quit()

fh = open(fname)

for line in fh:
	line = line.upper().rstrip()
	print(line)



