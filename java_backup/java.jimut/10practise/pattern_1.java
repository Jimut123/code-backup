import java . io .*;
public class pattern_1
{
public static void main(String args[]) throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print (j);
}
System.out.println ();
}
}
}
