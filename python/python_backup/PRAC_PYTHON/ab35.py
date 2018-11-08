#2darray input
# sum of row major and column major order using square matrix
#define row and column
r=input("Give row:");
#c=input("Give column:");
n=r
m=r
# define matrix filled with 0
a=[[0 for i in range(r)] for j in range(r)]
#input into matrix
for i in range(0,r,1):
      for j in range(0,r,1):
            k=input("value:")
            a[i].insert(j,k)
#print the matrix
for i in range(0,n,1):
      for j in range(0,m,1):
            print a[i][j],
      print""

for i in range(0,n,1):
     s=0
     for j in range(0,m,1):
            s=s+ a[i][j]
     print"Row major order sum:",s

for i in range(0,n,1):
      s1=0      
      for j in range(0,m,1):
            s1=s1+ a[j][i]
      print"Column major order sum:",s1

     

