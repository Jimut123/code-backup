def insertion_sort[L]:
	for i in range(0,len(L)):
		temp=L[i]
		ptr=i-1
	while (ptr>=0) and L[ptr]>temp:
		L[ptr+1]=L[ptr]
		ptr=ptr-1
		L[ptr]=temp
	print L,
