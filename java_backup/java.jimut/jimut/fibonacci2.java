import java.io.*;
public class fibonacci2
{
public static void main(int n)
{
int a,b,c,i;
a = 0;
b = 1;
System.out.print(a+","+b);
for (i = 1;i<=n-2;i++)
{
c = a+b;
System.out.print(","+c);
a = b;
b = c;
}
}
}
