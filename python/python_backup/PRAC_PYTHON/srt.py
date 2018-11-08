l=[]
l1=[]
for i in range(0,5,1):
	k=input("enter no")
	k1=input("enter name")
	l.insert(i,k)
	l1.insert(i,k1)
for i in range(0,5,1):
     print l[i]
     print l1[i]
for i in range(0,4,1):
	for j in range(i+1,5,1):
		if l[i]>l[j]:
		   t=l[i]
		   l[i]=l[j]
		   l[j]=t
		   
for i in range(0,5,1):
     print l[i]
     print l1[i]
