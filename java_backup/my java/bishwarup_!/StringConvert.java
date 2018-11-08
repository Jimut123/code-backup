import java.io.*;
class StringConvert
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
char ch;
int i,m;
void readstring()throws IOException
{
System.out.println("ENTER YOUR STRING");
s=br.readLine();
}
void charcaseconvert()
{
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
m=(int)ch;
if(m>=65 && m<90)
m=m+32;
else
if(m>=97 && m<=122)
m=m-32;
else
m=m;
System.out.print((char)m);
}
}
}

