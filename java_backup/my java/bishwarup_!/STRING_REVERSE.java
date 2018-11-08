import java.io.*;
class STRING_REVERSE
{
public static void main(String args[])throws IOException
{
String s,s1;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
char ch;
int i,x,y;
System.out.println("Give string:");
s=br.readLine();
s1="";
for(i=s.length()-1;i>=0;i--)
{
ch=s.charAt(i);
s1=s1+ch;
}
System.out.println("reverse"+s1);
}
}