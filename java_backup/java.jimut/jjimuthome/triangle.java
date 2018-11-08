import java .io.*;
public class triangle
{
public static void main ( int a , int b , int c ) 
{
if (a == b && a == c && b == c)
System.out.println("Eequilateral triangle");
else
if ( a == b || b == c || a == c )
System.out.println("Isoceles triangle");
else
System.out.println("Scelene triangle");
}
}