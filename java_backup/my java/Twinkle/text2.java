import java.io.*;
class text2
{
int i,j,p,f=0;
String s,w;
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter text:");
s=input.readLine();
convert();
}

void convert()
{
w="";
System.out.print("First word:");
f=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
System.out.print(w);
f=1;
}
else
w=w+ch;
if(f==1)
break;
}

System.out.println();
System.out.print("Last word:");
f=0;
for(i=s.length()-1;i>=0;i--)
{
ch=s.charAt(i);
if(ch==' ')
{
p=i;
for(j=p;j<s.length();j++)
{
System.out.print(s.charAt(j));
f=1;
}
}
if(f==1)
break;
}
}
}