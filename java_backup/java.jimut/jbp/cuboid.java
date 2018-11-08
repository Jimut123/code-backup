import java .io.*;
import java.lang.*;
public class cuboid 
{
int l,b,h,area,vol;
float d;
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
void input()throws IOException
{
System.out.println("ENTER LENGTH");
l = Integer.parseInt(cd.readLine());
System.out.println("ENTER BREADTH");
b = Integer.parseInt(cd.readLine());
System.out.println("ENTER HEIGHT");
h = Integer.parseInt(cd.readLine());
}
void calculate()
{
vol = (l*b*h);
area = 2*((l*b)+(b*h)+(h*l));
d = (float)Math.sqrt((l*l)+(b*b)+(h*h));
}
void display()
{
System.out.println("VOLUME: "+ vol);
System.out.println("SURFACE AREA: "+ area);
System.out.println("DIAGONAL :"+ d);
}
public static void main (String args[])throws IOException 
{
cuboid ob = new cuboid();
ob.input();
ob.calculate();
ob. display();
}
}
