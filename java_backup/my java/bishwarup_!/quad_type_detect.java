
import java.io.*;
class quad_type_detect
{
public static void main(String args[])throws IOException
{
float a,b,c;
double d,r1,r2;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE VALUE OF a,b,c");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
d=Math.sqrt(b*b*-4*a*c);
if((d<0)||(d==0))
{
r1=(-b+d)/(2*a);
r2=(-b-d)/(2*a);
System.out.println("ROOTS ARE"+r1+"and"+r2);
}
else
System.out.println("ROOTS ARE IMAGINARY & UNEQUAL");
}
}
