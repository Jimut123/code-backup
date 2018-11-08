a=[]
for i in range(0,5,1):
     k=input("Enter value:")
     a.insert(i,k)
for i in range(0,5,1):
     print a[i]
b=[]
for i in range(0,5,1):
     k=input("Enter value:")
     b.insert(i,k)
for i in range(0,5,1):
     print b[i] 
for i in range(0,5-1,1):
     for j in range((i+1),5,1):
          if a[i]>a[j] :
             t=a[i]
             a[i]=a[j]
             a[j]=t
             s=b[i]
             b[i]=b[j]
             b[j]=s
for i in range(0,5,1):
     print a[i],":", b[i]  
     