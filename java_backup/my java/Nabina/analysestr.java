import java.io.*;
class analysestr
{
public static void main(String args[])throws IOException
{
int i,j,p,q,c=0;
String s1,s2;
char ch,h;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text 1:");
s1=input.readLine();
System.out.println("Enter text 2:");
s2=input.readLine();
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
q=(int)ch;
c=0;
for(j=0;j<s2.length();j++)
{
h=s2.charAt(j);
p=(int)h;
if((p==q)||(p==(q-32))||(p==(q+32)))
{
c++;
}
}
System.out.println(ch+" appears : _"+c+"_ times");
c=0;
}
}
}