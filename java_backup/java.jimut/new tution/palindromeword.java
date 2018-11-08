import java.io.*;
import java.lang.*;
class palindromeword
{
public static void main (String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader (ab);
string s;
int l,i,d;
char ch;
System.out.println("ENTER A WORD");
s =(cd.readLine());
l =s.length();
for(i=l-1;i>=0;i--)
{
ch = s.charAt(i);
r=r+ch;
}
if (s.equals(r))
{
System.out.println("PALLINDROME");
}
else
{
System.out.println("NOT PALLINDROME");
}
}
}
