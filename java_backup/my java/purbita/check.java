
import java.io.*;
class check
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int y,a,b,c;
int ch;
        System.out.println("menu");
   System.out.println("Press 1 for check whether a year is a leap year or not");
System.out.println("Press 2 for check the type of triangle");
ch =Integer.parseInt(br.readLine());
switch(ch)
{case 1:
    System.out.println("Enter Year:");
    y=Integer.parseInt(br.readLine());
    if(y%4 ==0 || y%400 ==0)
System.out.println("leap year");
else
System.out.println("Non leap year");
break;
case 2:
System.out.println("Enter 3 sides of traingle:");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
if(a==b|| b==c|| c==a)
System.out.println("isosceles triangle");
else if (a==b&& b==c&& c==a)
System.out.println("equilateral triangle");
else 
System.out.println("scalene triangle");
break;
default:System.out.println("Invalid choice");
}
}
}	