import java .io.*;
public class ooo
{
public static void main ( String name , int n) 
{
int k,s=0,n1 = n;
while (n > 0)
{
k = n % 10;
s = (s*10) +  k;
n = n / 10;
}
System.out.println("the number is "+s);
if (s == n1)
System.out.println("it is a pallendrome number");
else
System.out.println("it is not a pallendrome number");
}
}
