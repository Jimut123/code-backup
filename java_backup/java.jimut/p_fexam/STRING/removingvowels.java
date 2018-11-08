package STRING;


import java.io.*;
class removingvowels
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,p="";
char ch,ch1;
int i,h,l,count=0;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
h=Integer.parseInt(cd.readLine());
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
ch1=n.charAt(h);
if(ch!='a' && ch!='A' && ch!='e' && ch!='E' && ch!='i' && ch!='I' && ch!='o' && ch!='O' && ch!='u' && ch!='U')
h=count+1;
p=p+ch+h;
}
System.out.println(p);
System.out.println(count);
}
}