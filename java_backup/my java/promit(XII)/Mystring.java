import java.io.*;
public class Mystring 
{
String str[];
int len;
Mystring()
{
String str[];
len=0;
}
void readstring()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the length");
len=IntegerparseInt(in.readLine());
str=new String[len];
System.out.println("Enter the String");
for(int i=0;i<len;i++)
{
str[i]=in.readLine();
}
}
int code()
{
for(int i=0;i<len;i++)
{
char ch[i]=str[i].charAt(i);
if(index==len)
{
i=index;
char ch1[i]=(int)ch[i];
return ch1[i];
}
}
}
void word()
{
String wrd=" ";
len=str[i].length();
for(int i=0;i<len;i++)
{
char ch[i]=str[i].charAt(i);
if(ch[i]!=' ')
{
wrd=wrd+ch[i];
}
else
wrd=" ";
int k=0;
k=wrd.length();
if(k>p)
{
p=k;
System.out.println("Longest Word="+wrd);
}
}
}
}