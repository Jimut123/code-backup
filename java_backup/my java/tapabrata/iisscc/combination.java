package iisscc;
import java.io.*;
class combination
{
String str;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int c=0;
public void take()throws IOException
{
System.out.println(" Enter word ");
str=br.readLine();
show("",str);
System.out.println(" Total no of combinations " +c);
}
public void show(String s,String str)
{
if(str.length()<=1)
{
c++;
System.out.println(s+str);
}
else
{
for(int i=0;i<str.length();i++)
{
String str1=str.substring(i,i+1);
String str2=str.substring(0,i);
String str3=str.substring(i+1);
show(s+str1,str2+str3);
}
}
}
public static void main(String args[])throws IOException
{
combination ob=new combination();
ob.take();
}
}