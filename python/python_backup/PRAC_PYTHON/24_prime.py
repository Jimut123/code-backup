def prime(n):
	k=0
	for i in range(2,n):
		#print(n,i)
		if n%i==0:
			k=1
			break;
		i=i+1;
	if k==0:
		return 1
	elif k==1 :
		return 0

n=int(input("Enter a number :"))
if(prime(n)==1):
	print("Prime")
else:
	print("Not prime")
