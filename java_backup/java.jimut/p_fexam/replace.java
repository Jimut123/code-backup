import java.io.*;
class replace
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
String p="";
int i,l;
char ch;
System.out.println("Enter a word in lower case:");
n=cd.readLine();
l=n.length();
for(i=1;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch=='e')
ch='*';
p=p+ch;
}
System.out.println("Word="+p);
}
}