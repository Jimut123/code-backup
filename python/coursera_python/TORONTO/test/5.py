def odd(n):
	if n%2 != 0:
		return 1

a=1523
sum1=0
while(a<=10503):
	if(odd(a)==1):
		sum1=sum1+a
	a=a+1

print(sum1)		
	
