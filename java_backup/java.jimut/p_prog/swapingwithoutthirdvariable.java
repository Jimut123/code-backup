import java.io.*;
class swapingwithoutthirdvariable
{
public static void main(String[]args)
{
int a=2,b=5;
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
}
}