import java.io.*;
class coding2
{
public static void main(String args[])throws IOException
{
int i,p,nw,n;
String s;
char ch,h;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();
System.out.println("Enter incrementer of code:");
n=Integer.parseInt(input.readLine());
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch!=' ')
{
p=(int)ch;
nw=p+n;
h=(char)nw;
System.out.print(h);
}
else
{
System.out.print(" ");
}
}
}
}