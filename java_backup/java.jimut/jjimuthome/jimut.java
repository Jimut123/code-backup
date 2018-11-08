
import java . io .*;
public class jimut
{
public static void main(String args[]) throws IOException
{
int n1,n,s,a,k;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
a = Integer.parseInt(br.readLine());
System.out.println("the number is" +a);
s = 0;
n = 1;
n1 = n;
while (n > 0) ;
{
k = n % 10;
s = s + (k*k*k);
n = n / 10;
}
if (s == n1)
System.out.println("armsgstrom" +n1);
else
System.out.println("it is not a armsgstrom number");
}
}




