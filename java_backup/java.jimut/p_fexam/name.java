import java.io.*;
class name
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
String p="";
int i,l;
char ch;
System.out.println("Enter a name containing three words:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(i==0)
p=p+ch;
else if(ch==' ')
p=p+'.'+n.charAt(i+1);
System.out.println(p);
}
}
}