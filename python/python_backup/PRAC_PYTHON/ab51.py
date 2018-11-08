#array sequential search of array
from array import* 
#from numeric import*
a=[]
n=input("Enter range:")
for i in range(0,n,1):
     k=input("value:")
     a.insert(i,k)
for i in a:
     print(i)
v=input("Enter searching element")
f=0
for i in range(0,n,1):
     if  (a[i]==v):
          f=1
          break
if (f==1):
    print("element found...")
else:
    print("element not found...")    
 





     

