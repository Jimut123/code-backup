import java.io.*;
class octalTobinary
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,l;
char h;
String n;
System.out.println("Enter The Octal No");
n=Input.readLine();
l=n.length();
for(i=0;i<l;i++)
{
h=n.charAt(i);
if(h=='0')
{
System.out.print("000");
}
if(h=='1')
{
System.out.print("001");
}
if(h=='2')
{
System.out.print("010");
}
if(h=='3')
{
System.out.print("011");
}
if(h=='4')
{
System.out.print("100");
}
if(h=='5')
{
System.out.print("101");
}
if(h=='6')
{
System.out.print("110");
}
if(h=='7')
{
System.out.print("111");
}
if(h=='.')
{
System.out.print(".");
}
}
}
}