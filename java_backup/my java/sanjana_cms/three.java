import java.io.*;
class three
{
public static void main (String args[]) throws IOException
{
String S;
char ch;
int i;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter String");
S=br.readLine();
int v=0;
System.out.println("Enter Character:");
ch=(char)System.in.read();
for (i=0;i<S.length();i++)
if (S.charAt (i)==ch)
v++;
System.out.println("Total Count:"+v);
}
}
