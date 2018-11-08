package mock;

import java.io.*;
class TRIANGLE
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [50][50];
int i,j,n;
System.out.println("ENTRA YZUR VALE");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
for(j=0;j<i;j++)
a[i][j]=Integer.parseInt(br.readLine());
{
for(i=0;i<n;i++)
for(j=i+1;j<n;j++)
System.out.print(a[i][j]);
{
for(i=0;i<n;i--)
for(j=0;j<n;j--)
System.out.println(a[i][j]);
}
}
}
}