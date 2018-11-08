import java . io . * ;
public class reverse_2
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
s = (s*10) + k;
n = n/10;
}
System.out.println ("The reversed number of "+a+"is=="+s);
}
}
