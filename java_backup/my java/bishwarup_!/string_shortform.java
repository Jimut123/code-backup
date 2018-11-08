import java.io.*;
class string_shortform
{
public static void main(String args[])throws IOException
{
String s;
int i;
char ch;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter String:");
s=br.readLine();
//s="ATAL BIHARI BAJPAYEE";
String w="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
System.out.print(w.charAt(0));
System.out.print(".");
w="";
}
else
w=w+ch;
}
System.out.print(w);
}
}