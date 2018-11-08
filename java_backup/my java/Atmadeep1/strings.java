import java.io.*;
class strings
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String s,w;
System.out.println("Enter the string");
s=input.readLine();
int l=s.length();
int i,j;
w="";
System.out.println("the string is");
for(i=65;i<=90;i++)
{
for(j=0;j<l;j++)
{
if(s.charAt(j)==' ')
{
if((int)w.charAt(0)==i)
{
System.out.print(w);
System.out.print(" ");
}
else
if((int)w.charAt(0)==(i+32))
{
System.out.print(w);
System.out.print(" ");
}
w="";
}
else
w=w+(s.charAt(j));
}
if((int)w.charAt(0)==i)
{
System.out.print(w);
System.out.print(" ");
}
else
if((int)w.charAt(0)==i+32)
{
System.out.print(w);
System.out.print(" ");
}
w="";
}
}
}



