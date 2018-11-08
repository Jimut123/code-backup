import java.io.*;
class String_reversepattern
{
public static void main(String args[])throws IOException
{
String s;
int i,j;
char ch;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter String:");
s=br.readLine();
String w="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
for(j=w.length()-1;j>=0;j--)
System.out.print(w.charAt(j));
System.out.print(" ");
w="";
}
else
w=w+ch;
}
for(j=w.length()-1;j>=0;j--)
System.out.print(w.charAt(j));
}
}


