# pascal's triangle using square matrix
#define row and column
r=input("Give row:");
n=r
m=r
# define matrix filled with 0
a=[[0 for i in range(r)] for j in range(r)]
#input  1 upto left diagonal of matrix
for i in range(0,r,1):
      for j in range(0,i,1):
            a[i][j]=1
#calculation of triangle
for i in range(2,r,1):
      for j in range(1,i,1):
            a[i][j]=a[i-1][j-1]+a[i-1][j]
#print the triangle
print "triangle upto",n-1
sp=15
for i in range(0,n,1):
      for k in range(1,sp,1):
                 print"  ",
      for j in range(0,m,1):
           if a[i][j]!=0:
                print a[i][j],"  ","  ",
      sp=sp-2
      print""
      print""
