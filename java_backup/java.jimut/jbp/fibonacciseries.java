import java . io .*;
public class fibonacciseries
{
public static void main(String args[]) throws IOException
{
int ch,s=0,p,n,a=0,b=1,count=2,c;
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
System.out.println("ENTER THE NO. OF TERMS::"); 
n = Integer.parseInt(cd.readLine());
System.out.print(a+","+b);
while (count <= n) 
{
c = a + b;
a = b;
b = c;
System.out.print(","+c);
count++;
}
}
}
