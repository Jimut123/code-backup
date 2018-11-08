import java.io.*;
class count_string
{
public static void main(String args[])throws IOException
{
String s;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
char ch;
int i,c;
System.out.println("GIVE STRING PLEASE");
s=br.readLine();
c=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{ 
c++;
}
}
c++;
System.out.println("TOTAL words:"+c);
}
}