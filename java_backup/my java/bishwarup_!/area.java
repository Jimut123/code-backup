import java.io.*;
class area
{
public static void area(double r)
{
double area=3.14*r*r;
System.out.print("area of circle"+area);
}
public void area1(double l)throws IOException
{
double area1=l*l;
System.out.print("area of square"+area1);
}
public void area2(double a,double b)
{

double area2=a*b;
System.out.print("area of rectangle"+area2);
}
public void user_choice (int choice)throws IOException
{
switch(choice)
{
case 1:area(12);
break;
case 2:area1(12.00);
break;
case 3:area2(45,67);
break;
default :System.out.print("INVALID CHOICE");
}
}
}


