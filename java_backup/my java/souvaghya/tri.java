class tri
{
public static void main(int a,int b,int c)
{
if(a==b&& b==c&& c==a)
System.out.println("eqilateral triangle");
else
if(a==b||b==c||c==a)
System.out.println("isosceles triangle");
else
if(a!=b&&b!=c&&c!=a)
System.out.println("scalene triangle");
else
System.out.println("not a triangle");
}
}