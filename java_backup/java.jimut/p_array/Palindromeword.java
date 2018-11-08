import java.io.*;
class Palindromeword
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n[]=new String[5];
int i,j,l;
char ch;
String m="";
System.out.println("Enter 5 words:");
for(i=0;i<=4;i++)
{
n[i]=cd.readLine();
}
for(i=0;i<=4;i++)
{
l=n[i].length();
for(j=l-1;j>=0;j--)
{
ch=n[i].charAt(j);
m=m+ch;
}
if(m.equalsIgnoreCase(n[i]))
{
System.out.print(n[i]+" ");
}
m="";
}
}
}