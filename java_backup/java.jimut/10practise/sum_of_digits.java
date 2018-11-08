import java . io . * ;
public class sum_of_digits
{
public static void main (String args[] )throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int k,s=0,n;
System.out.println ("Enter a no.:::");
n=Integer.parseInt(cd.readLine());
while(n>0)
{
k = n%10;
s = s + k;
n = n/10;
}
System.out.println ("Sum=="+s);

}
}

