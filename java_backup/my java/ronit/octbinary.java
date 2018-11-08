import java.io.*;
class octbinary
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i;
String s;
System.out.println("ENTER AN OCTAL NO.:");
 s=br.readLine();
int l=s.length();
for(i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch=='0')
System.out.print("000");
else
if(ch=='1')
System.out.print("001");
else
if(ch=='2')
System.out.print("010");
else
if(ch=='3')
System.out.print("011");
else
if(ch=='4')
System.out.print("100");
else
if(ch=='5')
System.out.print("101");
else
if(ch=='6')
System.out.print("110");
else
if(ch=='7')
System.out.print("111");
else
if(ch=='.')
System.out.print(".");
}
}
}