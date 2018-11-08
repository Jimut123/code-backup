package SECONDTERM;

import java.io.*;
class detectmax_matrix
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [50][50];
System.out.println("ENTER VALUE");
int i=0,j=0,max,n;
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
max=a[0][0];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
if(a[i][j]>max)
max=a[i][j];
System.out.println(max);
}
}
