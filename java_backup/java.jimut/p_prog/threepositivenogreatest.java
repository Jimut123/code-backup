import java.io.*;
class threepositivenogreatest
{
public static void main(String[]args)
{
int a=15,b=20,c=40;
if((a>b)&&(a>c))
{
System.out.println(a+  "is the greatest number");
}
else
if((b>a)&&(b>c))
{
System.out.println(b+"  is the greatest number");
}
else
if((c>a)&&(c>b))
{
System.out.println(c+  "is the greatest number");
}
else
System.out.println("All are same");
}
}