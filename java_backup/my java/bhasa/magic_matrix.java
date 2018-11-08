import java.io.*;
class magic_matrix
{
public static void main(String args[])throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER ROW AND COLOUMN NO.(greater than 5 and odd no. will be better)");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
a[i][j]=1;
}
else
if(i+j==n-1)
{
a[i][j]=1;
}
else
{
a[i][j]=0;
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i<n/2)
{
if(j!=0 && j<n-1 && a[i][j]==0)
{
a[i][j]=2;
}
}
if(j<n/2)
{
if(i!=0 && i<n-1 && a[i][j]==0)
{
a[i][j]=3;
}
}
if(i>n/2)
{
if(j!=0 && j<n-1 && a[i][j]==0)
{
a[i][j]=4;
}
}
if(j>n/2)
{
if(i!=0 && i<n-1 && a[i][j]==0)
{
a[i][j]=5;
}
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}