import java .io.*;
public class fi
{
public static void main ( String args[]) 
{
int a=0,b=1,c,n=3;
System.out.println(a+","+b);
while (n < 10) ;
{
c = a + b;
a = b;
b = c;
n = n + 1;
System.out.print("," +c);
}
}
}


