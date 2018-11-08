import java.io.*;
class vowellength
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int t,i,j;
String s,w;
w="";
String s1[]=new String[100];
t=0;
System.out.print("GIVE TERM");
s=br.readLine();
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
s1[t]=w;
t++;
w="";
}
else
w=w+s.charAt(i);
}
s1[t]=w;
t++;
for(i=0;i<t;i++)
System.out.print(s1[i]+" ");
for(i=0;i<t-1;i++)
{
for(j=i+1;j<t;j++)
if(s1[i].length()>s1[j].length())
{
w=s1[i];
s1[i]=s1[j];
s1[j]=w;
}
}
for(i=0;i<t;i++)
System.out.print(s1[i]+" ");
}
}