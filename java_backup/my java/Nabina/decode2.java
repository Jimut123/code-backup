import java.io.*;
class decode2
{
public static void main(String args[])throws IOException
{
int i,j,m,n,l,f=0,p=0,k;
String s,w="";
char ch,h;
String a[]={"A","E","I","O","U"};
String b[]={"a","e","i","o","u"};
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
if((h!='A')||(h!='a')||(h!='E')||(h!='e')||(h!='I')||(h!='i')||(h!='O')||(h!='o')||(h!='U')||(h!='u'))
{
l=(int)h;
for(m=65;m<=91;m++)
{
if(l==m)
{
p=m;
f=65;
}
else
if(l==(m+32))
{
p=m;
f=97;
}
}
k=0;
for(n=f;n<=p;n++)
{
k++;
}
if(f==65)
System.out.print(a[k]);
else
if(f==97)
System.out.print(b[k]);
}
}
w="";
}
else
w=w+ch;
}
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
if((h!='A')||(h!='a')||(h!='E')||(h!='e')||(h!='I')||(h!='i')||(h!='O')||(h!='o')||(h!='U')||(h!='u'))
{
l=(int)h;
for(m=65;m<=91;m++)
{
if(l==m)
{
p=m;
f=65;
}
else
if(l==(m+32))
{
p=m;
f=97;
}
}
k=0;
for(n=f;n<=p;n++)
{
k++;
}
if(f==65)
System.out.print(a[k]);
else
if(f==97)
System.out.print(b[k]);
}
}
}
}