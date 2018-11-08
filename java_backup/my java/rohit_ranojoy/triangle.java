public class triangle
{
    public static void main(int a,int b,int c)
    {
        if(a==b&&a==c&&b==c)
        System.out.println("is a equilateral triangle");
    else
    if(a==b||a==c||b==c)
    {
        System.out.println("is a isosceles triangle");
    }
    else
    {
        System.out.println("is a scalene triangle");
    }
}}