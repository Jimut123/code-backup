import java . io . * ;
public class phibonacci_series
{
public static void main (String args[] )throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int a=0,b=1,c,count=2,n;
System.out.println();
System.out.println("Enter the choice or terms:::");
n=Integer.parseInt(cd.readLine());
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
