import java.io.*;
class threesidesoftriangleareaamlan
{
public static void main(String[]args)
{
int a=3,b=4,c=5,area,s=(a+b+c)/2;
area=(int)Math.sqrt(s)*((s-a)*(s-b)*(s-c));
System.out.println(area);
}
}
