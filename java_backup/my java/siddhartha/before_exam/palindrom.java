package before_exam;

import java.io.*;
class palindrom
{
String t="",a="";
public void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER WORD: ");
String s=br.readLine();
int v=0;
for(int i=0;i<s.length();i++)
{
  t=t+s.charAt(i);
    }
for(int j=s.length()-1;j>=0;j--)
{
  a=a+s.charAt(j);
}
if(t.compareTo(a)==0)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}