import java.io.*;
class duplicate
{
public static void main(String args[])throws IOException
{
int i,j,k,m;
String s,w;
char ch,h1,h2,h3;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text.:");
s=input.readLine();

w="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if((ch==' ')||(ch=='.')||(ch==',')||(ch=='?')||(ch=='!'))
{
for(j=0;j<w.length();j++)
{
h1=w.charAt(j);
System.out.print(h1);
k=j;
for(m=j+1;m<w.length();m++)
{
h3=w.charAt(m);
if(h3==h1)
j++;
else
break;
}
}
w="";
System.out.print(ch);
}
else
w=w+ch;
}
w=w+" ";
for(j=0;j<w.length();j++)
{
h1=w.charAt(j);
System.out.print(h1);
k=j;
for(m=j+1;m<w.length();m++)
{
h3=w.charAt(m);
if(h3==h1)
j++;
else
break;
}
}
}
}
