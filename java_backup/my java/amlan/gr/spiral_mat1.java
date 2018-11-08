package gr;

//reverse order
import java.io.*;
class spiral_mat1
{
public static void main(String args[])throws IOException
{
int n;
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println("Enter the number");
n=Integer.parseInt(input.readLine());
int ar[][]=new int[n][n];
int i,j;
int p,k,u,c=n-1,u1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
ar[i][j]=0;
}
}
p=n*n;
k=1;
int r=0;
u=n;
i=j=0;
u1=0;
while(k<=p)
{
i=r;
j=c;
while(j>=u1)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
j--;
}
j=j+1;
i=i+1;
while(i<u)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
i++;
}
i=i-1;
j=j+1;

while(j<u)
{
//System.out.println(i+","+j);
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
j++;
}

j=j-1;
i=i-1;
//System.out.println(i+","+j);
while(i>u1)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
i--;
}

r=r+1;
c=c-1;
//u=c;
u1=u1+1;
//if(r>=n)
//r=n-1;
//if(c>=n)
//c=n-1;
//System.out.println(r+","+c);
u=u-1;
//break;
}
System.out.println("the spiral matrix is: ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(ar[i][j]+",");
}
System.out.println("");
}
}
}
