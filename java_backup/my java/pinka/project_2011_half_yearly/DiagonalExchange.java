package project_2011_half_yearly;

import java.io.*;
class DiagonalExchange
{
public static void main(int n)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [100][100];
int b[][]=new int [100][100];
int i,j,c;
c=0;
System.out.println("Give the 1st set of array elements:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
System.out.println("");
System.out.println("Give the 2nd set of array elements:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
b[i][j]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(b[i][j]+",");
System.out.println("");
}
System.out.println("");
System.out.println("matrix with exchanged diagonals:");
for(i=0;i<n;i++)
{
c=a[i][i];
a[i][i]=b[i][i];
b[i][i]=c;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
System.out.println("");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(b[i][j]+",");
System.out.println("");
}
}
}
