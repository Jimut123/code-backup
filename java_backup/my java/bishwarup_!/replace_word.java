import java.io.*;
class replace_word
{
public static void main(String args[])throws IOException
{
String s,w,s1;
s="15th August Is Our Independence Day";
char ch;
int i;
w="";
s1="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
if(w.compareTo("15th")==0)
//{
//System.out.println(i);
s1=s1+"26th";
//}
else
if(w.compareTo("August")==0)
s1=s1+"January";
if(w.compareTo("Independence")==0)
s1=s1+"Republic";
else
s1=s1+w;
System.out.println(s1);
w="";
s1=s1+" ";
}
else
w=w+ch;
}
s1=s1+w;

s=s1;
System.out.println(s1);
}

}