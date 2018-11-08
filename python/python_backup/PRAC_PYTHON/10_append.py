def fib2(n):
	result =[]
	a,b=0,1
	while a<n:
		result.append(a)
		a,b=b,a+b
	return result
f100=fib2(100)
print(f100)