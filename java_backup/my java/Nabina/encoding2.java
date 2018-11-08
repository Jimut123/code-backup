import java.io.*;
class encoding2
{
public static void main(String args[])throws IOException
{
int i,j,p,l;
String s,w="";
char h;
String a[]={"A","E","I","O","U"};
String b[]={"a","e","i","o","u"};
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();
l=0;
for(i=0;i<s.length();i++)
{
h=s.charAt(i);
if(h!=' ')
{
if((h!='a')&&(h!='A')&&(h!='e')&&(h!='E')&&(h!='i')&&(h!='I')&&(h!='o')&&(h!='O')&&(h!='u')&&(h!='U'))
{
p=(int)h;
if(p<97)
{
l=p-65;
for(j=0;j<l;j++)
w=w+a[j];
}
else
if(p>=97)
{
if(l>4)
{
l=0;
}
System.out.print(b[l]);
l++;
}
}
else
System.out.print(h);
}
else
System.out.print(" ");
}
}
}