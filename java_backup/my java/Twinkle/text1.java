import java.io.*;
class text1
{
int i,p;
String s,s1;
char ch,h;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter text:");
s=input.readLine();
convert();
}

void convert()
{
s1="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
p=(int)ch;
if(p>=65&&p<91)
{
p++;
p=p+32;
h=(char)p;
s1=s1+h;
}
else
if(p==91)
{
p=65;
p=p+32;
h=(char)p;
s1=s1+h;
}
else
if(p>=97&&p<123)
{
p++;
p=p-32;
h=(char)p;
s1=s1+h;
}
else
if(p==123)
{
p=97;
p=p-32;
h=(char)p;
s1=s1+h;
}
else
s1=s1+ch;
}
disp();
}

void disp()
{
System.out.println(" Your text:"+s1);
}
}