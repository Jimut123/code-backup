m=[[0 for j in range(5)] for  i in range(5)]
for i in range(5):
for j in range(5):
m[i][j]=input()
for i in range(5):
for j in range(5):
	if i==j:
		print "1",
	if i==(j-1):
		print "0",
	if i==(j-2):
		print"1",
	if i==(j-3):
		print "0",
	if i==(j-4):
		print "1",
	else:
		print" ",
	print

		
	
	