package testpaper.proj;

import java.util.Scanner;
class mtrx_mltply
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int a[][]=new int [4][4];
int b[][]=new int [4][4];
int c[][]=new int [4][4];
int i,j,k;
System.out.println("give elements for matrix A :");
for(i=0;i<4;i++)
for(j=0;j<4;j++)
a[i][j]=ob.nextInt();
System.out.println("");
System.out.println("give elements for matrix B :");
for(i=0;i<4;i++)
for(j=0;j<4;j++)
b[i][j]=ob.nextInt();
System.out.println("");
System.out.println("matrix A :");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
System.out.print(a[i][j]+", ");
System.out.println("");
}
System.out.println("");
System.out.println("matrix B :");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
System.out.print(b[i][j]+", ");
System.out.println("");
}
System.out.println("");
for(i=0;i<4;i++)
for(j=0;j<4;j++)
{
c[i][j]=0;
for(k=0;k<4;k++)
c[i][j]+=a[i][k]*b[k][j];
}
System.out.println("result of multiplication of matrices A and B :::");
System.out.println("matrix C :");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
System.out.print(c[i][j]+", ");
System.out.println("");
}
System.out.println("");
}
}