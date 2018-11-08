package project_xii;

import java.io.*;
class stackprime
{
public static void main(String args[])throws IOException
{
int i,j,f=0,k=0,k1,n;
int prime[]=new int[100];

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
for(i=1;i<=100;i++)
{
f=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
{
prime[k]=i;
k++;
}
}

k1=0;
do
{
System.out.println("Press 1 to PUSH:");
System.out.println("Press 2 to POP:");
System.out.println("Press 3 to DISPLAY:");
System.out.println("Press 4 to EXIT:");
n=Integer.parseInt(input.readLine());
switch(n)
{
case 1:k1++;
       break;
case 2:k1--;
       break;
case 3:for(i=k1-1;i>=0;i--)
       {
       System.out.println(prime[i]+" ");
       }
       break;
case 4:System.exit(0);
default:System.out.println(" Press 1/2/3/4 only");
}
}while(true);
}
}      