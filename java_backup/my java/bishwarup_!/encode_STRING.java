import java.io.*;
class encode_STRING
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int i,a,c=0;
String str;
char ch,chr;
System.out.println("ENTER UR STRING TO BE STRING");
str=br.readLine();
//a=br.readLine();
System.out.println("ENCODE:2");
System.out.println("ENCODE STRING");
a=0;
chr=' ';
for(i=0;i<str.length();i++)
{
ch=str.charAt(i);
//System.out.print(ch);
if((ch>='a'&& ch<='x')||(ch>='A' && ch<='X'))
{
c=(int)(ch+2);
chr=(char)(c);
//System.out.println(chr);
}
else
if(ch>='y' || ch<='Z'|| ch>='y' || ch<='z')
{
c=(int)(ch-2);
chr=(char)(c);
//System.out.println("cc12"+chr);
}
System.out.print(chr);
}
}
}

