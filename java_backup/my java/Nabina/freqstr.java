import java.io.*;
class freqstr
{
public static void main(String args[])throws IOException
{
int i,j,k=0,f=0;
String n[]=new String[100];
String s,w="",w1="";
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter string:");
s=input.readLine();
k=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
n[k]=w;
k++;
w="";
}
else
w=w+ch;
}
n[k]=w;
k++;
w="";
for(i=0;i<k;i++)
{
w=n[i];
f=0;
w1="";
for(j=0;j<k;j++)
{
w1=n[j];
if(w.compareTo(w1)==0)
{
f++;
n[j]="";
}
w1="";
}
if(w!="")
{
System.out.println("The word: '"+w+"'has appeared_"+f+"_time(s).");
}
f=0;
w="";
}
}
}