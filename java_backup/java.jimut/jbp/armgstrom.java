import java .io.*;
public class armgstrom
{
public static void main ( String name , int a) 
{
int n1,n,s,k;
s = 0;
n = 1;
n1 = n;
while (n > 0) ;
{
k = n % 10;
s = s + (k*k*k);
n = n / 10;
}
if (s == n1)
System.out.println("armsgstrom" +n1);
else
System.out.println("it is not a armsgstrom number");
if (n1 == a)
System.out.println("it is a armgstrom number"+a);
else
System.out.println("it is not a armsgstrom number");
}
}


