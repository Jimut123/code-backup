package iscxi;

import java.io.*;
import java.util.*;
public class Boundary
{
public static void main(String args[]) throws IOException
{
DataInputStream in=new DataInputStream(System.in);
Scanner sc=new Scanner(System.in);
System.out.println("enter side");
int n=sc.nextInt();
int a[][]=new int[n][n];

System.out.println("enter array 1");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("row"+(i+1)+"column"+(j+1));
a[i][j]=Integer.parseInt(in.readLine());

}
}

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+"  ");
}
System.out.println();
}

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==0||i==n-1||j==0||j==n-1)
{
System.out.print(a[i][j]+" ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}