def fact(n):
	f=1
	a=0
	for i in range(n):
		a=i+1
		f=f*a
	print("The factorial of ",a)
	print(f)

l=int(input("Enter a number which you want to find the factorial of :"))
fact(l)