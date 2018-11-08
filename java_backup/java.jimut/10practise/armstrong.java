import java . io . * ;
public class armstrong
{
public static void main (String args[] )throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int k,s=0,a,n;
System.out.println ("Enter a no.:::");
a=Integer.parseInt(cd.readLine());
n = a;
while(n>0)
{
k = n%10;
s = s +(k*k*k);
n = n/10;
}
if(s==a)
{
System.out.println (a+" is an armstrong number");
}
else
{
System.out.println (a+" is not an armstrong number");
}
}
}
