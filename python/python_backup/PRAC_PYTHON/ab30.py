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
s=0
for i in range(0,n,1):
      for j in range(0,m,1):
            s=s+ a[i][j]
print"Row major order sum:",s
s1=0
for i in range(0,n,1):
      for j in range(0,m,1):
            s1=s1+ a[j][i]
print"Column major order sum:",s1
#print left(main) diagonal
print "Left(main)diagonal:"
for i in range(0,n,1):
      print a[i][i]
#print right diagonal
print "Right diagonal:"
for i in range(0,n,1):
      print a[i][n-i-1]
#print element below left diagonal
for i in range(0,n,1):
      for j in range(0,i,1):
            print a[i][j],
      print""
#print element above left diagonal
for i in range(0,n,1):
      for j in range(i+1,n,1):
            print a[i][j],
      print""
#print element below right diagonal
k=n-1
for i in range(0,n,1):
       j=k
       for j in range(j+1,n,1):
            print a[i][j],
       k=k-1   
       print""
#print element above right diagonal
k=n-1
for i in range(0,n,1):
       for j in range(0,k,1):
            print a[i][j],
       k=k-1 
       print""

      




            




     

