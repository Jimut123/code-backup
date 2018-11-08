import java.io.*;
import java.util.*;
class Add_2D_arrayd
{
public static void main(String args[]) throws IOException
{
DataInputStream in=new DataInputStream(System.in);
Scanner sc=new Scanner(System.in);
System.out.println("enter side");
int n=sc.nextInt();
int a[][]=new int[n][n];
int b[][]=new int[n][n];
int c[][]=new int[n][n];
System.out.println("enter array 1");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("row"+(i+1)+"column"+(j+1));
a[i][j]=Integer.parseInt(in.readLine());

}
 System.out.println();
}
System.out.println("enter array 2");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{

System.out.println("row"+(i+1)+"column"+(j+1));
b[i][j]=sc.nextInt();
}
 System.out.println();
}


for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
    c[i][j]=a[i][j]+b[i][j];
}
}


for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(c[i][j]>9)
{
System.out.print(" "+c[i][j]);
}
else
{
System.out.print("  "+c[i][j]);
}
}
System.out.println();
}
}
}

