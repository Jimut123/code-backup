
import java.io.*;
class frequency
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s,s1,w="";
int i,l,f=0;
System.out.println("enter string");
s=br.readLine();
System.out.println("enter substring");
s1=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
char c=s.charAt(i);
if(c==' ')
{
if(w.equalsIgnoreCase(s1)==true)
{
f++;
}
w="";
}
else
{
w=w+c;
}
}
if(w.compareTo(s1)==0)
{
f++;
}
System.out.println(s1+" "+"appears"+" "+f+" "+"times");
}
}



