import java.io.*;
class power
{
int i,a,b,c; 
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
 public void intake()throws IOException
{

System.out.print("Input any number=");
a=Integer.parseInt(ll.readLine());
System.out.print("\n Input the power of the number=");
b=Integer.parseInt(ll.readLine());
c=1;
}
public void calculate()
{
for (i=1;i<=b;i++)
c=c*a;
System.out.print("\n the powered number is="+c);
}
public static void main(String[]args)throws IOException
{
power mm=new power();
mm.intake();
mm.calculate();
}
}