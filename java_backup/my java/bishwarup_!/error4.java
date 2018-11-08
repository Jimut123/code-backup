//using multiple catch
class error4
{
public static void main(String args[])
{
int a[] = {5,10};
int b= 5;
try
{
int x=a[2]/b-a[1];
}
catch(ArithmeticException e)
{
System.out.println("Division by Zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index error");
}
catch(ArrayStoreException e)
{
System.out.print("Wrong data type");
}
int y=a[1]/a[0];
System.out.println("y= "+y);
}
}