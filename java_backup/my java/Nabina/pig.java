import java.io.*;
class pig
{
public static void main(String args[])throws IOException
{
int i,j,k,p=0;
String s,w="",w1="",s2="",s1="";
char ch,h;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();
w="";
s2="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
w1="";
p=0;
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
if((h=='A')||(h=='a')||(h=='E')||(h=='e')||(h=='I')||(h=='i')||(h=='O')||(h=='o')||(h=='U')||(h=='u'))
{
p=j;
break;
}
else
w1=w1+h;
}
s1="";
for(k=p;k<w.length();k++)
{
s1=s1+w.charAt(k);
}
s1=s1+w1+"ay";
s2=s2+s1+" ";
s1="";
w1="";
w="";
p=0;
}
else
w=w+ch;
}
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
if((h=='A')||(h=='a')||(h=='E')||(h=='e')||(h=='I')||(h=='i')||(h=='O')||(h=='o')||(h=='U')||(h=='u'))
{
p=j;
break;
}
else
w1=w1+h;
}
s1="";
for(k=p;k<w.length();k++)
{
s1=s1+w.charAt(k);
}
s1=s1+w1+"ay";
s2=s2+s1+" ";
s1="";
w1="";
w="";
p=0;
System.out.println("Piglatin form:");
System.out.println(s2);
}
}