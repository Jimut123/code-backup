//using catch & throw
class error3
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=5;
int x,y;
try
{
x=a/(b-c);//exception here
}
catch(ArithmeticException e)
{
System.out.println("divisor by zero");
}
y=a/(b+c);
System.out.println("y="+y);
}
}