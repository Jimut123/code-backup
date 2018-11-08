
import java.io.*;
class overloading
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
double e,r;
void area(int a,int b)throws IOException
{
System.out.println("Enter The Length");
a=Integer.parseInt(Input.readLine());
System.out.println("Enter The Breadth");
b=Integer.parseInt(Input.readLine());
int k=a*b;
System.out.println(k);
}
void area(int h)throws IOException
{
System.out.println("Enter The Length");
int g=h*h;
System.out.println(g);
}
void area(double b,double h)
{
double k=.5*b*h;
System.out.println(k);
}
void area(double r)
{
double k=3.14*r*r;
System.out.println(k);
}
}

