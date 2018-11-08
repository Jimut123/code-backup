package iisscc;
import java.util.*;
class matrix_op
{
Scanner ob=new Scanner (System.in);
int m,n,i,j,k,t=0,s=0;
int a[][];
matrix_op()
{
System.out.println("enter the row limit : ");
m=ob.nextInt();
System.out.println("enter the column limit : ");
n=ob.nextInt();
if(m<=2 || n<=2 || m>=20 || n>=20)
{
System.out.println("give row and column values >2 and <20  ");
System.exit(0);
}
a=new int [m][n];
}
void input()
{
System.out.println("enter the matrix elements  ");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=ob.nextInt();
display();
for(i=0;i<1;i++)
for(j=0;j<n;j++)
for(k=j+1;k<n;k++)
if(a[i][j]>a[i][k])
{
t=a[i][j];
a[i][j]=a[i][k];
a[i][k]=t;
}
for(i=m-1;i<m;i++)
for(j=0;j<n;j++)
for(k=j+1;k<n;k++)
if(a[i][j]>a[i][k])
{
t=a[i][j];
a[i][j]=a[i][k];
a[i][k]=t;
}
for(i=0;i<1;i++)
for(j=0;j<m-1;j++)
for(k=j+1;k<m;k++)
if(a[j][i]>a[k][i])
{
t=a[j][i];
a[j][i]=a[k][i];
a[k][i]=t;
}
for(i=n-1;i<n;i++)
for(j=0;j<m-1;j++)
for(k=j+1;k<m;k++)
if(a[j][i]>a[k][i])
{
t=a[j][i];
a[j][i]=a[k][i];
a[k][i]=t;
}
System.out.println("after sorting accordingly,");
display();
}
void display()
{
System.out.println("your matrix  ");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
}
void sum()
{
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
if(i==0 || i==m-1 || j==0 || j==n-1)
s=s+a[i][j];
}
System.out.println("sum of outer row and column elements "+s);
}
void disp_boundary()
{
System.out.println("your matrix boundary elements ");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
if(i==0 || i==m-1 || j==0 || j==n-1)
System.out.print(a[i][j]+" ");
else
System.out.print("  ");
System.out.println("");
}
}
public static void main()
{
matrix_op b=new matrix_op();
b.input();
b.disp_boundary();
b.sum();
}
}
