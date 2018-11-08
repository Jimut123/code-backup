import java .io.*;
public class pattern3
{
public static void main(String args[])
{
int a,b,c,p=2;
for (a=1;a<=5;a++)
{
for (b=1;b<=a;b++)
{
System.out.print(a);
for (c=p;c<=5;c++)
{
System.out.println(c);
System.out.println( " ");
p = p+1;
}
}
}
}
}
