def convertToBinary(n):
	if(n>1):
		convertToBinary(n//2)
	print(n%2,end='')

n=int(input("Enter a number : "))
convertToBinary(n)