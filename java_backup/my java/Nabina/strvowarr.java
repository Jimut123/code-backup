import java.io.*;
class strvowarr
{
public static void main(String args[])throws IOException
{

int i,j,k=0,c1=0,c2=0;
String a[]=new String[100];
String s,w="",temp;
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();

for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if((ch=='.')||(ch=='?')||(ch=='!'))
{
a[k]=w+ch;
k++;
w="";
}
else
w=w+ch;
}

for(i=0;i<k;i++)
{
for(j=0;j<k-i-1;j++)
{
c1=0;
for(i=0;i<a[j+1].length();i++)
{
ch=a[j+1].charAt(i);
if((ch=='A')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u'))
c1++;
}
c2=0;
for(i=0;i<a[j].length();i++)
{
ch=a[j].charAt(i);
if((ch=='A')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u'))
c2++;
}

if(c1>c2)
{
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}

for(i=0;i<k;i++)
{
System.out.println(a[i]);
}
}
}