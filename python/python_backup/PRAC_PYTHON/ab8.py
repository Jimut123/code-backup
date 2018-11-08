n=input("Give number:");
m=input("Give number:");
if(n>m):
   c=n
   d=m
else:
   c=m
   d=n
while(c%d !=0):
     k=c%d
     c=d
     d=k
print"HCF:",d
     

