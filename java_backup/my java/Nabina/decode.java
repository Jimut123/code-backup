import java.io.*;
class decode
{
public static void main(String args[])throws IOException
{
int i,j,l,p=65,t;
String s,w=" ";
char ch,h;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();
w="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
System.out.print(" ");
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
l=(int)h;
p=65;
t=0;
while(p<=91)
{
if((l==p)||(l==(p+32)))
 {
  System.out.print(t);
 break;
 }
else
 {
  t++;
 }
if(t>9)
 {
  t=0;
 }
p++;
}
}
w="";
}
else
w=w+ch;
}
System.out.print(" ");
for(j=0;j<w.length();j++)
{
h=w.charAt(j);
l=(int)h;
p=65;
t=0;
while(p<=91)
{
if((l==p)||(l==(p+32)))
 {
  System.out.print(t);
 break;
 }
else
 {
  t++;
 }
if(t>9)
 {
  t=0;
 }
p++;
}
}
}
}
