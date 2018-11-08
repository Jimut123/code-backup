import java.io.*;
import java.util.*;
public class rev_print_matrix
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

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[n-i-1][j]+"  ");
}
System.out.println();
}
}
}
