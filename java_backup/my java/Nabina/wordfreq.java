import java.io.*;
class wordfreq
{
public static void main(String args[])throws IOException
{
int i,k=0,j,f=0;
String a[]=new String[100];
String s,w="",w1="";
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter sentence:");
s=input.readLine();
k=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
a[k]=w;
k++;
w="";
}
else
w=w+ch;
}
a[k]=w;
k++;
w="";
for(i=0;i<k;i++)
{
w=a[i];
for(j=0;j<k;j++)
{
w1=a[j];
if(w.compareTo(w1)==0)
{
f++;
a[j]=" ";
}
w1="";
}
if(w!=" ")
{
System.out.println("The word : "+w+" has appeared_"+f+"_ times(s).");
}
f=0;
w="";
}
}
}