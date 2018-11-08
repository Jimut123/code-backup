 
import java.io.*;
class overload3
{
String a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void string1(String a1)throws IOException
{
String a=a1;

int i,j,f;

j=a.length()-1;
f=0;
for(i=0; i<=a.length()/2;i++,j--) 
{
if (a.charAt(i)!=a.charAt(j))
{
f=1;
break;
}
}
if(f==0)
System.out.println ("Palinodrom number:"+a);
else
System.out.println ("Non-palinodrom number:"+a);
}
void string1 (String a1, char ch)
{
String z; z=a1;
int i, v;
v=0;
for (i=0; i<z.length(); i++)
{
if (z.charAt(i)==ch)
{
v++;
}
}
System.out.println(v);
}
void string1 (String a1, String a2)
{
String w="";
int c=0,i;
a1=a1+" ";
for (i=0; i<a1.length(); i++)
{
if(a1.charAt(i)==' ')
{
if (w.equalsIgnoreCase(a2)==true)
c++;
w="";
}
else
w=w+a1.charAt(i);
}
System.out.println(c);
}}
