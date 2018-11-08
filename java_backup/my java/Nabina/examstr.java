import java.io.*;
class examstr
{
public static void main(String args[])throws IOException
{
int i,j,j1,t,p=0,k,m;
String s,w="",temp="";
char ch;
String a[]=new String[100];
String b[]=new String[100];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter sentence:");
s=input.readLine();
t=0;
k=0;
s=s+"";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if((ch==' ')||(ch=='.'))
{
t++;
if((w.compareTo("")!=0)&&(t==1))
{
a[k]=w;
k++;
w="";
}
}
else
{
w=w+ch;
t=0;
}
}

for(i=0;i<k;i++)
{
m=(int)a[i].charAt(0);
if(m>=97&&m<=122)
m=m-32;
ch=(char)m;
w=w+ch;
for(int k1=1;k1<a[i].length();k1++)
w=w+a[i].charAt(k1);
a[i]=w;
w="";
}

p=0;
m=0;
for(j=65;j<=90;j++)
{
for(i=0;i<k;i++)
{
m=(int)a[i].charAt(0);

if((m==j)||((m+32)==j))
{

b[p]=a[i];
p++;
}
}
}
m=0;

for(i=0;i<p;i++)
{
temp="";
for(j=0;j<p-i-1;j++)
{
if(b[j].length()<b[j+1].length())
{
temp=b[j+1];
b[j+1]=b[j];
b[j]=temp;
}
}
}

for(i=0;i<p;i++)
{
System.out.print(b[i]+" ");
}
System.out.print(".");
}
}
