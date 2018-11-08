import java.io.*;
class midarrange
{
public static void main(String args[])throws IOException
{
int i,j,l,l1,p;
String s,w="";
char ch;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
s=input.readLine();
p=s.length();
// for(i=0;i<s.length();i++)
// {
l=p/2;
System.out.println(s.charAt(l));
for(i=0,j=s.length()-1;i<l;i++,j--)
{

System.out.print(s.charAt(i)+"   ");
if(j==l)
break;
System.out.print(s.charAt(j)+"   ");
System.out.println("");

}
}
}