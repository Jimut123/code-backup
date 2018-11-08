import java.io.*;
class oddeven_str
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,j,k=0,c=0,l1;
String s,w1="",w2="";
System.out.println("Enter the string");
s=input.readLine();
int l=s.length();
for(i=0;i<l;i++)
{
char ch=s.charAt(i);
if(ch==' ')
{
c++;
System.out.println(c);
if(c%2!=0)
{
l1=i-1;

while(k<=l1)
{
w1=w1+s.charAt(k);
k++;
}
w1=w1+" ";
k=i+1;
}
else
{
l1=i-1;
System.out.println(l);
while(k<=l1)
{
w2=w2+s.charAt(k);
k++;
}
w2=w2+" ";
k=i+1;
}
}
}
c++;
System.out.println(c);
if(c%2!=0)
{
l1=i-1;

while(k<=l1)
{
w1=w1+s.charAt(k);
k++;
}
w1=w1+" ";
k=i+1;
}
else
{
l1=i-1;
System.out.println(l);
while(k<=l1)
{
w2=w2+s.charAt(k);
k++;
}
w2=w2+" ";
k=i+1;
}
System.out.println(w1);
System.out.println(w2);
}
}
