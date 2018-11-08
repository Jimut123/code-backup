import java.io.*;
class ov2
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
double e,r;
void area(int a,int b)throws IOException
{
int k=a*b;
System.out.println("Area of rectangle"+k);
}
void area(int h)throws IOException
{
System.out.println("Enter The Length");
int g=h*h;
System.out.println("Area of square"+g);
}
void area(double b,double h)
{
double k=.5*b*h;
System.out.println("Area of traingle"+k);
}
void area(double r)
{
double k=3.14*r*r;
System.out.println("Area of square"+k);
}
}
class deb
{
public static void main( String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
ov2 c=new ov2();
System.out.println("The Length"+a);
int a=Integer.parseInt(Input.readLine());
System.out.println("The Length"+a);
int b=Integer.parseInt(Input.readLine());
c.area(a,b);
System.out.println("The Length of square");
