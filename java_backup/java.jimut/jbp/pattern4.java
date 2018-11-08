
import java . io .*;
public class pattern4
{
public static void main(String args[]) throws IOException
{
int n,i,sp,k,j,m,a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
a = Integer.parseInt(br.readLine());
System.out.println("the number is" +a);
m = 1;
sp = 25;
n = 0;
for (i = 1 ; i <= n; i++)
{
for (k = 1 ; k <= sp ; k++)
System.out.println(" ");
for (j = 1 ; j <= m ; j++)
System.out.println("*" + " ");
m = m + 2;
sp = sp - 2;
System.out.println(" ");
}
}
}



