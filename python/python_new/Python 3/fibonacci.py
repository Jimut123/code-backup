nterms=10
#A = int(input("How many terms? "))
n1=0
n2=1
count=0
if nterms <= 0:
 print("Enter a positive integer")
elif nterms == 1:
 print("Fibonacci sequence upto",nterms,":")
 print(n1)
else:
 print("Fibonacci sequence upto",nterms,":")
while count < nterms:
 print (n1,end=' , ')
 n3=n1+n2
 #update values
 n1=n2
 n2=n3
 count+=1
