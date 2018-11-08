def count1(n):
	k=n
	s=0
	while(k!=0):
		s=s+1
		k=k//10

	return s


l=int(input("Enter a number :"))
l=count1(l)
l=l**l
print(l)

