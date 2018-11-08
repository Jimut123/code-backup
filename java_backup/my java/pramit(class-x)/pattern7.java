import java.io.*;
class pattern7
{
int m,l,i,j,n,k;
public void disppatt7()
{
m=0;
l=69;
for( i=1;i<=5;i++)
{
for( n=65;n<=l;n++)
System.out.print((char)n);
for( k=1;k<=m;k++)
System.out.print(" ");
if(i==1)
n=n-2;
else
n=n-1;
while(n>=65)
{
System.out.print((char)n);
n--;
}
l=l-1;
m=m+2;
System.out.println("");
}
}
}
