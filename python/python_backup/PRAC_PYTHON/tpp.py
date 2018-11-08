n=input("Enter term:")
l=[]
for i in range(0,n,1):
     k=input("Enter value")
     l.insert(0,k)
t=()
t=tuple(l)
print max(t)
print min(t)
max=min=t[0]
for i in range(0,n,1):
     if t[i]>max :
         max=t[i]
     else:
        if t[i]<min :
            min=t[i]
  
print max
print min 