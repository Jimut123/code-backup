import java.io.*;
class string_palindrome
{
public static void main(String args[])throws IOException
{
String s,s1;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
char ch;
int i;
System.out.println("Give string:");
s=br.readLine();
s1="";
for(i=s.length()-1;i>=0;i--)
{
ch=s.charAt(i);
s1=s1+ch;
}
if(s.compareTo(s1)==0)
System.out.println("PALINDROME");
else
System.out.println("NOTPALINDROME");
}
}