import java . io.*;
public class grading
{
public static void main( String name , int m1 , int m2 ,int m3 , int m4 , int m5 )
{
int total , percentage ;
total =   m1 +  m2 +  m3 +  m4 +  m5;
percentage = ( total * 100)/500;
if (percentage < 50)
System.out.println("pcna");
else
if (percentage < 60)
System.out.println("c");
else
if (percentage < 70)
System.out.println("b");
else
if (percentage <80)
System.out.println("b+");
else
if (percentage < 90)
System.out.println("a");
else
System.out.println("a+");
}
}
