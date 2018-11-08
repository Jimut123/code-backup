#array input
from array import* 
#from numeric import*
a=[]
n=input("Enter range:")
for i in range(0,n,1):
     k=input("value:")
     a.insert(i,k)
for i in a:
     print(i)
#bubble sort
for i in range(0,n,1):
     for j in range(0,n-i-1,1):
           if  (a[j]>a[j+1]):
                  t=a[j]
                  a[j]=a[j+1]
                  a[j+1]=t
 
for i in a:
     print(i) 




     

