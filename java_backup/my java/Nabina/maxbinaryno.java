import java.io.*;
class maxbinaryno
{
public static void main(String args[])throws IOException
{
int i;
double q=0,r=0,p=0;
String s1,s2,w;
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter one binary no.:");
s1=input.readLine();
System.out.println("Enter another binary no.:");
s2=input.readLine();
while(p<2)
{
if(p==0)
w=s1;
else
w=s2;
for(i=w.length()-1;i>=0;i--)
{
ch=w.charAt(i);
if(ch==1)
{
p=Math.pow(2,i);
if(p==0)
q=q+p;
if(p==1)
r=r+p;
}
}
w="";
p++;
}
if(q>r)
System.out.println("Greatest no.:"+s1);
else
System.out.println("Greatest no.:"+s2);
}
}