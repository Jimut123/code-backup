package STRING;


import java.io.*;
class sentence
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="";
int i,j,l,k,p=1;
char ch,c;
System.out.println("Enter a sentence:");
n=cd.readLine();
for(i=0;i<l;i++)
{
ch=n.charAt(i);
if(ch!=' ' && ch!='.')
{
n=m+ch;
}
else if(ch==' ' || ch=='.')
{
k=m.length();
for(j=0;j<k;j++)
{
c=m.charAt(i);
if(c=='a'&&c=='e'&&c=='i'&&c=='o'&&c='u'&&c=='A'&&c=='E'&&c=='I'&&c=='O'&&c='U')
{
p=0;
}
}
if(p==1)
{
System.out.println(m);
}
m="";
p=1;
}
}
}
}
