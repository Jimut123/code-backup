import java . io.*;
class stringpatt
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s;
int i,l,j,m=2,k,n;
System.out.println("Enter any word");
s = cd.readLine();
l = s.length();
for(i=0;i<=l-1;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}
