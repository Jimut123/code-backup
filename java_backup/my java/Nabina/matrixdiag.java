import java.io.*;
class matrixdiag
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int n,i,j,k=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length of matrix n*n matrix:");
n=Integer.parseInt(input.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=0;
}
}
k=n-1;
for(i=0;i<n;i++)
{
a[i][i]=1;
a[k][i]=1;
k--;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
}
}