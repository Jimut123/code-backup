def tuple():
	t=(1,2,3,4,5,6,7,8)
	maxvalue=t[0]
	minvalue=t[0]
	for i in range(0,len(t),1):
		if t[i]>maxvalue:
			max=t[i]
		if t[i]<minvalue:
			min=t[i]
			print max,
			print min,
	