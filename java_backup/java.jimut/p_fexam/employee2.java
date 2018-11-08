import java.io.*;
class employee2
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int basic;
double da,hra,pf,np,gp=0;
System.out.println("Enter basic pay");
basic=Integer.parseInt(cd.readLine());
da=basic*25/100;
hra=basic*15/100;
pf=basic*8.33/100;
np=basic+da+hra;
gp=np-pf;
System.out.println("The net pay="+np);
System.out.println("The gross pay="+gp);
}
}