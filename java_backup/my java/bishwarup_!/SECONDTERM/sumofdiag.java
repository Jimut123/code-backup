package SECONDTERM;

import java.io.*;
class sumofdiag
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENETR ROWS");
int a[][]=new int[50][50];
int s,s1,i,k,n,j;
System.out.println("Give value:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
s=0;
for(i=0;i<n;i++)
s=s+a[i][i];
s1=0;
k=n-1;
for(i=0;i<n;i++)
{
s1=s1+a[i][k];
k--;
}
System.out.println(s);
System.out.println(s1);
}
}