import java.io.*;
class areas
{
int area(int b,int h)
{
int pg;
pg = b*h;
return(pg);
}
float area(float d1, float d2)
{
float rh;
rh = (float)((0.5)*d1*d2);
return(rh);
}
float area(int a, int b , int h)
{
float  tr;
tr = (float)((0.5)*(a+b)*h);
return(tr);
}
public static void main (String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
areas ob = new areas();
int pg1,b1,h1,a1,br1,he1;
float di1,di2,tr1,rh1;
System.out.println("ENTER THE BASE AND HEIGHT OF PARALLELOGRAM::");
b1 = Integer.parseInt(cd.readLine());
h1 = Integer.parseInt(cd.readLine());
System.out.println("ENTER THE TWO DIAGONALS OF RHOMBUS::");
di1 = Float.parseFloat(cd.readLine());
di2 = Float.parseFloat(cd.readLine());
System.out.println("ENTER THE PARALLEL SIDES AND PERPENDICULAR OF TRAPEZIUM::");
a1 = Integer.parseInt(cd.readLine());
br1 = Integer.parseInt(cd.readLine());
he1 = Integer.parseInt(cd.readLine());
pg1 = ob.area(b1,h1);
rh1 = ob.area(di1,di2);
tr1 = ob.area(a1,br1,he1);
System.out.println("AREA OF PARALLELOGRAM::"+pg1);
System.out.println("AREA OF RHOMBUS::"+rh1);
System.out.println("AREA OF TRAPEZIUM::"+tr1);
}
}


