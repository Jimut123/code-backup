package iisscc;
import java.util.Scanner;
class mat_trnsps
{
public static void main(int n)
{
Scanner ob=new Scanner (System.in);
int i,j,t=0;
if(n>20)
{
System.out.println("input limit <=20");
System.exit(0);
}
int a[][]=new int [n][n];
System.out.println("input elements  ");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=ob.nextInt();
System.out.println("your original matrix ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
for(i=0;i<n;i++)
for(j=0;j<n;j++)
if(i>j)
{
t=a[j][i];
a[j][i]=a[i][j];
a[i][j]=t;
}
System.out.println("your transposed matrix  ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
}
}

