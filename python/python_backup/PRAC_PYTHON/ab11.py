#sum of  power upto n
s=0
n=input("Enter range:");
j=1
for i in range(1,n,1):
      print pow(j,j),
      s=s+pow(j,j)
      j=j+2 
print "Sum is:",s

     

