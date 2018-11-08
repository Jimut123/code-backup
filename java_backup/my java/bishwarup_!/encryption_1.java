import java.io.*;
class encryption_1
{
public static void main(String args[])throws IOException
{
String s;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int ch;
System.out.println("Give String:");
s=br.readLine();
for(int i=0;i<s.length();i++)
{
ch=(int)s.charAt(i);
if(ch==90)
ch=67;
else
if(ch==84)
ch=66;
else
if(ch==122)
ch=99;
else
if(ch==121)
ch=98;
else
ch=ch+2;
System.out.print((char)ch);
}
}
}