#2darray input
#from array import* 
#from numeric import*
#define row and column
r=input("Give row:");
c=input("Give column:");
n=r
m=c
# define matrix filled with 0
a=[[0 for i in range(r)] for j in range(c)]
#input into matrix
for i in range(0,r,1):
      for j in range(0,c,1):
            k=input("value:")
            a[i].insert(j,k)
#print whole matrix
print a
# print rows
for r in a:
      print r
#print columns
for c in a:
      print c
#print row column .....

for i in range(0,n,1):
      for j in range(0,m,1):
            print a[i][j],
      print""

            




     

