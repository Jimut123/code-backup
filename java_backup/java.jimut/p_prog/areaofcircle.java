import java.io.*;
class areaofcircle
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int r;
double p=3.14;
double area=0;
System.out.print("Enter radius:");
r=Integer.parseInt(cd.readLine());
p=3/4;
area=p*(r*r);
System.out.println("Area of circle:"+area);
}
}