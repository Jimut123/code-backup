import java.io.*;
class DiagonalSearch
{
public static void main(String[]args)throws IOException
{
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
int a[][]=new int[100][100];
int b[]=new int[100];
int n,i,j,f;
System.out.print("input range=");
n=Integer.parseInt(bb.readLine());
a=new int[n][n];
b=new int[n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("input number 2 array=");
a[i][j]=Integer.parseInt(bb.readLine());
}
}
for(i=0;i<n;i++)
b[i]=a[i][i];


for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(b[i]>b[j])
{
f=b[i];
b[i]=b[j];
b[j]=f;
}
}
}
System.out.print("The minimum value="+b[0]);
System.out.print("The minimum value="+b[n-1]);
}
}
