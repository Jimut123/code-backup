import java.io.*;
class piglatin
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s,s1="",s2="";
int l,i,x=0;
char c=0;
System.out.println("enter");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
x=i;
break;
}
else
{
s2=s2+c;
}
}
for(i=x;i<l;i++)
{
s1=s1+s.charAt(i);
}
System.out.print(s1+s2+"ay");
}
}