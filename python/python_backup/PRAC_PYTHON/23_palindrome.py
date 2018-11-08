def palindrome(n):
	a0=n
	s=0
	while a0>0:
		d=a0%10
		s=s*10+d
		a0=a0//10

	if s==n:
		return 1
	else:
		return 0


n=int(input("Enter a number "))
if palindrome(n)==1:
	print("palindrome ...")
else:
	print("Not palindrome..")