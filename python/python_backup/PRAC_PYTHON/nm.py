def insertion_sort():
	a=[]
	n=input("enter range:")
	for i in range(0,n,1):
		k=input("value:")
		a.insert(i,k)
               for i in a:
	             print (i)
                                temp=a[i]
		ptr=i-1
	while (ptr>=0) and a[ptr]>temp:
		a[ptr+1]=a[ptr]
		ptr=ptr-1
		a[ptr]=temp
for i in a:
	print (i)
