import java.io.*;
class stringrev
{
public static void main(String args[])throws IOException
{
int j;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i=0;
String s,w;
w="";
System.out.println("Give String:");
s=br.readLine();
int l=s.length();
for(i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c==' ')
{
for(j=w.length()-1;j>=0;j--)
{
System.out.print(w.charAt(j));
}
System.out.print(" ");
w="";
}
else
{
w=w+c;
}
}
System.out.print(" ");
for(j=w.length()-1;j>=0;j--)
{
System.out.print(w.charAt(j));
}
}
}