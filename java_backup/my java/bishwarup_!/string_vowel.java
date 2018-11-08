import java.io.*;
class string_vowel
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
if(ch=='A'|| ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'||ch=='n')
c++;
}
System.out.println("TOTAL VOWEL ARE:"+c);
}
}