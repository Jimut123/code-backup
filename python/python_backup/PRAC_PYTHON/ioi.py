def no(n):
	for i in range(1,n+1,1):
		if i%2==0:
			m=0
		else:
			m=1
		for j in range(1,i+1,1):
			print m,
			if m==0:
				m=1
			else:
				m=0
		print " "