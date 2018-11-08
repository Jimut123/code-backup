a=input("enter a number")
b=input("enter another number")
if a>b:
   c=a
   d=b
else:
   c=b
   d=a
for i in range(1,c,1):
      if (c*i)%d==0:
          break;
print "L.C.M is:",c*i
	