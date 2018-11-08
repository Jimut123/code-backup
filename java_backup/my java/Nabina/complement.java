import java.io.*;
class complement
{
public static void main(String args[])throws IOException
{
int i;
int a[]=new int[100];
String s,s1="",w="",sum="",carry="";
char ch,p;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter binary no.:");
s=input.readLine();
s1="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch=='1')
{
s1=s1+'0';
}
else 
if(ch=='0')
{
s1=s1+'1';
}
}
System.out.println("Ones complement: "+s1);

carry="1";
sum="0";
w="";
for(i=s1.length()-1;i>=0;i--)
{
p=s1.charAt(i);
if((p=='0')&&(carry=="0"))
{
sum="0";
carry="0";
}
if((p=='0')&&(carry=="1"))
{
sum="1";
carry="0";
}
if((p=='1')&&(carry=="0"))
{
sum="1";
carry="0";
}
if((p=='1')&&(carry=="1"))
{
sum="0";
carry="1";
}
w=w+sum;
}
System.out.println("Two's complement: ");
for(i=w.length()-1;i>=0;i--)
{
System.out.print(w.charAt(i));
}
System.out.println("");
}
}