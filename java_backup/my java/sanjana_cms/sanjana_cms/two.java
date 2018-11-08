import java.io.*;
class two
{
String s;
int i, f;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter string");
s=br.readLine();
Str(s);
}
void Str(String s)
{                    
System.out.println(s.charAt(0));
for (i=1; i<s.length();i++)
{      
if (s.charAt(i)==' ')
System.out.println(s.charAt(i+1));
}
}
public static void main (String args[])throws IOException
{
two d=new two();
d.input();
}
}
