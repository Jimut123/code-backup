class triangle 
{
public static void main(int a , int b , int c)
{
if (a == b || a == c || b == c)
System.out.println ("isoceles triangle ");
else
if (a == b && b == c && a == c)
System.out.println ("equilateral triangle ");
else
System.out.println ("scelene triangle ");
}
}