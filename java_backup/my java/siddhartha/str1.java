import java.io.*;
class str1
{
public static void main(String args[])throws IOException
{
String s,d;int i,v,a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter string:");
s=br.readLine();
d="";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)!=' ')
{
 d=d+s.charAt(i);
}
else
{
System.out.print(d.charAt(0));
System.out.print(".");
d="";
}
}
System.out.print(d);
}
}
