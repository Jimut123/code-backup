import java.io.*;
class octalbinary
{
public static void main(String args[])throws IOException
{
int i;
char p;
String n;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any octal no.:");
n=input.readLine();
System.out.println("Your no. is:");
for(i=0;i<n.length();i++)
{
p=n.charAt(i);
if(p=='0')
System.out.print("000");
else
if(p=='1')
System.out.print("001");
else
if(p=='2')
System.out.print("010");
else
if(p=='3')
System.out.print("011");
else
if(p=='4')
System.out.print("100");
else
if(p=='5')
System.out.print("101");
else
if(p=='6')
System.out.print("110");
else
if(p=='7')
System.out.print("111");
else
if(p=='.')
System.out.print(".");
else
if(p=='-')
System.out.print("-");
else
System.out.println("Error");
}
}
}

