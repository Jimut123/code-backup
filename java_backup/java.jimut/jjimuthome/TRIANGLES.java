import java .io.*;
public class TRIANGLES
{
public static void main ( int a , int b , int c ) 
{
int s = ( a + b + c ) / 2;
int A;
if (a == b && a == c && b == c)
A = ((int) Math.sqrt (3)/4)* (int) Math.pow(a,2);
else
A = ( s * ( s - a ) * ( s - b )* ( s - c ));
System.out.println( A );
}
}