import java . io .*;
public class pattern_5
{
public static void main(String args[]) throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j,k;
for(i=1;i<=5;i++)
{
for(k=5-i;k>=0;k--)
{
System.out.print (" ");
}
for(j=i;j>=1;j--)
{
System.out.print (j);
}
System.out.println ();
}
}
}
