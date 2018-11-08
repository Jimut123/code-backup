import java.io.*;
class prime1to100_array
{
public static void main(String args[]) throws IOException
{
int a[]=new int[50];
int i=0,f=0,j,n,t;
System.out.print(" GIVE TERM");
t=0;
for(i=1;i<=100;i++)
{
f=0;
for(j=2;j<i;j++)
if(i%j==0)
{
f=1;
break;
}
if(f==0)
{
a[t]=i;
t++;
}
}
for(i=0;i<t;i++)
System.out.println(a[i]);
}
}