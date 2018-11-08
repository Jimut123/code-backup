import java . io.*;
class atelephone
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
long  a[] = new long [10];
String n[] = new String[10];
int i;
System.out.println("ENTER 10 NAMES::");
for(i=0;i<=9;i++)
{
n[i]=cd.readLine();
}
System.out.println("ENTER THEIR TELEPHONE NOS.:::");
for(i=0;i<=9;i++)
{
a[i]=Long.parseLong(cd.readLine());
}
for(i=0;i<=9;i++)
{
System.out.println(n[i]+"::::::::::::::::::::::::::"+a[i]);
}
}
}

