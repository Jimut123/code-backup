import java.io.*;
class coding1
{
public static void main(String args[])throws IOException
{
String a[]={"A","E","I","O","U"};
String b[]={"a","e","i","o","u"};
int i,j,m,k=0,p;
String s,w="";
char ch,h;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
System.out.print(" ");
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
if((h!='a')||(h!='A')||(h!='e')||(h!='E')||(h!='i')||(h!='I')||(h!='o')||(h!='O')||(h!='u')||(h!='U'))
{
p=(int)h;
k=0;
for(m=65;m<=91;m++)
{
if(p==m)
{
if(k>4)
{
k=0;
System.out.print(a[k]);
}
else
System.out.print(a[k]);
k++;
}
else
if(p==(m+32))
{
if(k>4)
{
k=0;
System.out.print(b[k]);
}
else
{
System.out.print(b[k]);
}
k++;
}

else
System.out.print(" ");
}
}
else
System.out.print(h);
w="";
}
}
else
w=w+ch;
}
System.out.print(" ");
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
if((h!='a')||(h!='A')||(h!='e')||(h!='E')||(h!='i')||(h!='I')||(h!='o')||(h!='O')||(h!='u')||(h!='U'))
{
p=(int)h;
k=0;
for(m=65;m<=91;m++)
{
if(p==m)
{
if(k>4)
{
k=0;
System.out.print(a[k]);
}
else
System.out.print(a[k]);
k++;
}
else
if(p==(m+32))
{
if(k>4)
{
k=0;
System.out.print(b[k]);
}
else
{
System.out.print(b[k]);
}
k++;
}

else
System.out.print(" ");
}
}
else
System.out.print(h);
w="";
}
}
}