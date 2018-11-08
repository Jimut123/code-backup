//2012 Questn 9
import java.io.*;
class Distance
{
int f1,f2,in1,in2;
Distance(int f, int n1, int ff, int n2)
{
f1=f;
in1=n1;
f2=ff;
in2=n2;
}
void showdistance()
{
System.out.println("Distance1="+f1+" feet "+in1+" inches");
System.out.println("Distance1="+f2+" feet "+in2+" inches");
}
void sumofdistance()
{
int x,y,z,p;
x=f1+f2;
y=in1+in2;
z=y/12;
p=y%12;
x=x+z;
y=p;
System.out.println("Sum Of Distance="+x+" feet "+y+" inches");
}
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int a,b,c,d;
System.out.println("Enter 1st distance in feet");
a=Integer.parseInt(cd.readLine());
System.out.println("Enter 1st distance in inches");
b=Integer.parseInt(cd.readLine());
System.out.println("Enter 2nd distance in feet");
c=Integer.parseInt(cd.readLine());
System.out.println("Enter 2nd distance in inches");
d=Integer.parseInt(cd.readLine());
Distance ob=new Distance(a,b,c,d);
ob.showdistance();
ob.sumofdistance();
}
}