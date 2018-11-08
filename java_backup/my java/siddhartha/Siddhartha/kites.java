package Siddhartha;



public class kites 
{
public static void main(int n)
{
int c=5,i,j,a,k;
for ( i=1;i<=5;i++)
{
for ( j=1;j<=c;j++)
{
System.out.print("&");
}
c--;
 for ( k=1;k<=i;k++)
 {
     System.out.print("*");
}
for ( a=(i-1);a>=1;a--)
{
System.out.print("*");
}
System.out.println();
}
}
}