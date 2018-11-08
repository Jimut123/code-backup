import java.io.*;
class volume
{
int vol(int s)
{
int vc;
vc = s*s*s;
return(vc);
}
float vol(int r)
{
float vs;
vs = ((4.0/3.0)*(22.0/7.0)*r*r*r);
return(vs);
}
int vol(int l,int b,int h)
{
int vcd;
vcd = l*b*h;
return(vcd);
}
public static void main(string args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
volume ob = new volume(); 
int a,rad,l1,b1,h1,vc1,vcd1;
float vs1;
System.out.println("Enter the side of cube : ");
a = Integer.parseInt(cd.readLine());
System.out.println("Enter the radius of sphere : ");
rad = Integer.parseInt(cd.readLine());
System.out.println("Enter the length ,breadth and height of cuboid : ");
l1 = Integer.parseInt(cd.readLine());
b1 = Integer.parseInt(cd.readLine());
h1 = Integer.parseInt(cd.readLine());
vc1 = ob.vol(a);
vs1 = ob.vol(rad);
vcd1 = ob.vol(l1,b1,h1);
System.out.println("Volume of cube : "+vc1);
System.out.println("Volume of sphere: "+vs1);
System.out.println("Volume of cuboid: "+vcd1);
}
}

