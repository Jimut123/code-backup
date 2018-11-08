import java.io.*;
class program4
{
public static void main(String args[ ])throws IOException
{
String s;int n;
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int i;String s1="";int c;
System.out.println("Enter the string:");
s=in.readLine(); 
System.out.println("Enter the word number to be eliminated:");
n=Integer.parseInt(in.readLine());
c=0;
s=s+" ";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
c++;
if(c!=n)
System.out.print( s1 );
s1=" ";
}
else
s1=s1+s.charAt(i);
}
}
}
