import java.io.*;
class vowel
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j;
int t=0;
char ch;
String s1,w="";
String s[]=new String[100];
s1=br.readLine();
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
if(ch==' ')
{
if(w.charAt(0)=='A'||w.charAt(0)=='a'||w.charAt(0)=='E'||w.charAt(0)=='e'||w.charAt(0)=='I'||w.charAt(0)=='i'||w.charAt(0)=='O'||w.charAt(0)=='o'||w.charAt(0)=='U'||w.charAt(0)=='u')
{
s[t++]=w;
}
w="";
}
else
w=w+ch;
}
if(w.charAt(0)=='A'||w.charAt(0)=='a'||w.charAt(0)=='E'||w.charAt(0)=='e'||w.charAt(0)=='I'||w.charAt(0)=='i'||w.charAt(0)=='O'||w.charAt(0)=='o'||w.charAt(0)=='U'||w.charAt(0)=='u')
{s[t++]=w;
}
for(i=0;i<t-1;i++)
{for(j=0;j<t;j++)
{if(s[i].length()>s[j].length())
{w=s[i];
s[i]=s[j];
s[j]=w;
}
for(i=0;i<t;i++)
System.out.println(s[i] + " ");
}
}
}
}
