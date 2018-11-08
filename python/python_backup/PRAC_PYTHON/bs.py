a=[]
n=input("enter range:")
for i in range(0,n,1):
	k=input("value:")
	a.insert(i,k)
for i in a:
	print (i)
v=input("enter searching element")
l=0
h=n-1
m=(l+h)/2
f=0
while l<=h:
	if (a[m]==v):
		f=1
		break
	if(v>a[m]):
		l=m+1
	if(v<a[m]):
		l=m-1
	m=(l+h)/2
if (f==1):
     print "element found"
else:
    print "not found"