import java.io.*;
class add
{
int i,x,n;
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
public void intake()throws IOException
{


System.out.print("print any number=");
x=Integer.parseInt(ll.readLine());
System.out.print("\n print the limit=");
n=Integer.parseInt(ll.readLine());
}
public void calculate()
{
for(i=1;i<=n;i++)
x=x*n;
System.out.print("\n the number is="+x);
}
public static void main(String[]args)throws IOException
{
add gg=new add();
gg.intake();
gg.calculate();
}
}