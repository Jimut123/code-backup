package finalprojectwork.threefunction;

import java.io.*;
public class series2
{
int product(int a,int b)
{
int c;
c=a*b;
return(c);
}
public static void main(String[]args)
{
int i,k,s=0;
series ob=new series();
for(i=1;i<=9;i++)
{
k=ob.product(i,i+1);
s=s+k;
}
System.out.println("The sum of the series="+s);
}
}