import java.io.*;
class lcm
{
int j,n,m;
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
public void intake()throws IOException
{
System.out.print("print 1st number=");
m=Integer.parseInt(ll.readLine());
System.out.print("\n print 2nd nimber=");
n=Integer.parseInt(ll.readLine());

}
public  void calculate()
{
j=1;
while((m*j)%n!=0)
j++;
System.out.println((m*j));
}  
public static void main(String[]args)throws IOException
{
lcm dd=new lcm();
dd.intake();
dd.calculate();
}
}