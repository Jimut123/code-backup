import java .io.*;
public class jimut
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader (ab);
String a;
System.out.println("ENTER YOUR WORD");
a = cd.readLine();
int i,j,l;
l = a.length();
for (i=0;i<=l-1;i--)
{
for (j=i;j<=l-1;j++)
{
System.out.print(a.charAt(j));
}
System.out.println();
}
}
}

