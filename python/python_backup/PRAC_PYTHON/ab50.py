#array selection sort of array
from array import* 
#from numeric import*
a=[]
n=input("Enter range:")
for i in range(0,n,1):
     k=input("value:")
     a.insert(i,k)
for i in a:
     print(i)

for i in range(0,n-1,1):
     pos=i 
     for j in range(i+1,n,1):
           if  (a[pos]>a[j]):
                  pos=j
     t=a[i]
     a[i]=a[pos]
     a[pos]=t
 
for i in a:
     print(i) 




     

