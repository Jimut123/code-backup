def p():
	for i in range(T):
		for j in range(4):
			print(A[i][j],end=" ")
		print()





A=[0][0]*100

T=int(input("Enter T"))
for i in range(T):
	for j in range(4):
		A[i][j]=int(input("Enter a number :"))

p()

