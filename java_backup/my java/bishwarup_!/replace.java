import java.io.*;
class replace
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,w;
System.out.println("Give String:");
s=br.readLine();
int i;
w="";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='A')
w=w+'B';
else
if(s.charAt(i)=='a')
w=w+'b';
else
w=w+s.charAt(i);
}
s=w;
System.out.println(s);
}
}

