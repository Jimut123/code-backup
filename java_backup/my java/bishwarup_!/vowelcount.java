import java.io.*;
class vowelcount
{
public static void main(String args[])throws IOException
{
String s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char ch;
int i,j,c,v;
System.out.println("GIVE SENTENCE");
s=br.readLine();
c=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
c++;
}
System.out.println("Vowels:"+c);
for(i=65;i<=90;i++)
{
v=0;
if((char)i=='a'||(char)i=='A'||(char)i=='e'||(char)i=='E'||(char)i=='i'||(char)i=='I'||(char)i=='o'||(char)i=='O'||(char)i=='u'||(char)i=='U')
{
for(j=0;j<s.length();j++)
{
if((char)i==s.charAt(j))
v++;
else
if((char)(i+32)==s.charAt(j))
v++;
}
System.out.println((char)i+" "+v);
}
}
}
}
