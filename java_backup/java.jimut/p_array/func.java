import java.io.*;
class func
{
void compare(int a,int b)
{
if(a>b)
{
System.out.println("Greater no.="+a);
}
else if(a<b)
{
System.out.println("Greater no.="+b);
}
}
void compare(char ch,char ch1)
{
ch=(char)ch;
ch1=(char)ch1;
if(ch>ch1)
{
System.out.println("Character with higher numeric value:"+ch);
}
else if(ch<ch1)
{
System.out.println("Character with higher numeric value:"+ch1);
}
}
void compare(String n,String p)
{
if(n.length()>p.length())
{
System.out.println("Longer string:"+n);
}
else if(n.length()<p.length())
{
System.out.println("Longer string:"+p);
}
}
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int c,d;
char ch2,ch3;
String m="",q="";
func ob=new func();
System.out.println("Enter 2 integers:");
c=Integer.parseInt(cd.readLine());
d=Integer.parseInt(cd.readLine());
System.out.println("Enter 2 characters:");
ch2=(char)(cd.read());
ch3=(char)(cd.read());
System.out.println("Enter 2 strings:");
m=cd.readLine();
q=cd.readLine();
ob.compare(c,d);
ob.compare(ch2,ch3);
ob.compare(m,q);
}
}