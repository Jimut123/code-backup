import java.io.*;
class alphabetical_orderString
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,j,l;
char c;
System.out.println("ENTER YOUR STRING");
s=br.readLine();
l=s.length();
for(i=65;i<=90;i++)
{
for(j=0;j<l;j++)
{
c=s.charAt(j);
if(c==(char)i||c==(char)(i+32))
System.out.print(c);
}
}
}
}
