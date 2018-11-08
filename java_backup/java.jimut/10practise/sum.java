import java . io .*;
public class sum
{
public static void main(String args[]) throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int s=0,a,r=0,m=0;
System.out.println ("enter a number" );
a = Integer.parseInt(cd.readLine());

do
{
s = a / 10;
r = a % 10;
m = m+r+s;
}
while (r != 0);
System.out.println (m );
}
}

