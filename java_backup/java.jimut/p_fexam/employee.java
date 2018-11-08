import java.io.*;
class employee
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
float basic;
basic=Float.parseFloat(cd.readLine());
double da,hra,pf,np,gp;
System.out.println("Enter gross pay:");
da=0.25*basic;
hra=0.15*basic;
pf=0.0833*basic;
np=basic+(da+hra);
gp=np-pf;
System.out.println(gp);
}
}