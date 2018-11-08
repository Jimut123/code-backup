import java . io . * ;
public class array_prime
{
public static void main (String args[] )throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j,c=1,a;
System.out.println ("Enter 20 nos.:::");
int n[]= new int[20];
for(i=0;i<=19;i++)
{
n[i]=Integer.parseInt(cd.readLine());
}
for(i=0;i<=19;i++)
{
a=n[i];
for(j=2;j<=a;j++)
{
if(a%j==0)
{
c=0;
}
if(c==1)
{
System.out.println (a+"is a prime number" );
c=1;
}
}
}
}
}



