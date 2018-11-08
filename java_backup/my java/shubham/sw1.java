import java.io.*;
class sw1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER 1 FOR VOLUME OF  CUBOID");
System.out.println("ENTER 2 FOR VOLUME OF CYLINDER ");
System.out.println("ENTER 3 FOR VOLUME OF CONE");
System.out.println("ENTER YOUE CHOICE");
int ch;
ch=Integer.parseInt(br.readLine());
switch (ch)
{
case 1:
int n,v,l,b,h;
System.out.println("Entre l,b,h");
l=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
h=Integer.parseInt(br.readLine());
//v=Integer.parseInt(br.readLine());
n=l*b*h;
System.out.println("VOLUME OF CUBOID="+n);
break;
case 2:
double a,p=3.14,r,c,h1;
r=Double.parseDouble(br.readLine());
c=Double.parseDouble(br.readLine());
h1=Double.parseDouble(br.readLine());
a=p*r*r*h1;
System.out.println("VOLUME OF CYLINDER="+a);
break;
case 3:
double v1,p1,r1,h2;
p1=Double.parseDouble(br.readLine());
r1=Double.parseDouble(br.readLine());
h2=Double.parseDouble(br.readLine());
v1=1/3*p1*r1*r1*h2;
System.out.println("VOLUME OF CONE="+v1);
break;
default:
System.out.println("WRONG CHOICE");
}
}
}
