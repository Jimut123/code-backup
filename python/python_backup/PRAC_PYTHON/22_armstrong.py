def armstrong1(n):
	a0=n
	s=0
	d=0
	while a0>0:
		d=a0%10
		s=s+d*d*d
		a0=a0//10

	print(s)
	if s==n:
		return 1
	else :
		return 0

d=int(input("Enter a number :"))
if armstrong1(d) == 1 :
	print("armstrong number")
else:
	print("not an armstrong number")

