import java.io.*;
class volume
{
int vol(int s)
{
int vc;
vc = s*s*s;
return(vc);
}
double vol(float r)
{
double vs;
vs = ((4.0/3.0)*(22.0/7.0)*r*r*r);
return(vs);
}
int vol(int l, int b , int h)
{
int vcd;
vcd = l*b*h;
return(vcd);
}
public static void main (String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
volume ob = new volume();
int a,l1,b1,h1,vc1,vcd1;
float rad;
double vs1;
System.out.println("ENTER THE SIDE OF CUBE::");
a = Integer.parseInt(cd.readLine());
System.out.println("ENTER THE RADIUS OF THE SPHERE::");
rad = Integer.parseInt(cd.readLine());
System.out.println("ENTER THE LENGTH,BREADTH AND HEIGHT OF THE CUBOID::");
l1 = Integer.parseInt(cd.readLine());
b1 = Integer.parseInt(cd.readLine());
h1 = Integer.parseInt(cd.readLine());
vc1 = ob.vol(a);
vs1 = ob.vol(rad);
vcd1 = ob.vol(l1,b1,h1);
System.out.println("VOLUME OF CUBE::"+vc1);
System.out.println("VOLUME OF SPHERE::"+vs1);
System.out.println("VOLUME OF CUBOID::"+vcd1);
}
}





















