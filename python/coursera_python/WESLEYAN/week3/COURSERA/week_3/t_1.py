def problem3_1(txtfilename):
	infile = open(txtfilename)
	let = 0
	for line in infile:
		lin_len = len(line)
		let = let + lin_len
		#for letter in line:
		#	let = let + 1		
		print(line,end="")
	print()
	let = let - 1
	print("There are",let,"letters in the file.")
	print()
	infile.close()
#file1 = input("Enter the filename :")
#problem3_1(file1)
