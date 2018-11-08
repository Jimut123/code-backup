import java.io.*;
class func
{
void compare(int a, int b)
{
if(a>b)
{
System.out.println("The value of"+a+"is greater than "+b);
}
else
{
System.out.println("The value of "+b+" is greater ");
}}
void compare(char x,char y)
{
int val = (int)x;
int vall = (int)y;
if(val>vall)
{
System.out.println("The value of"+x+"is greater" );
}
else
{
System.out.println("The value of "+y+" is greater ");
}}
void compare(String p,String q)
{
int l = p.length();
int len = q.length() ;
if( l>len)
{
System.out.println(p+" is greater" );
}
else
{
System.out.println(q+" is greater");
}}
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
System.out.println("Enter 2 numbers::");
int n1=Integer.parseInt(cd.readLine());
int n2=Integer.parseInt(cd.readLine());
System.out.println("Enter two characters::");
char ch1 = (char)(cd.read());
char ch2 = (char)(cd.read());
System.out.println("Enter two strings::");
String s1 = (cd.readLine());
String s2 = (cd.readLine());
func ob = new func();
ob.compare(n1,n2);
ob.compare(ch1,ch2);
ob.compare(s1,s2);
}
}
















