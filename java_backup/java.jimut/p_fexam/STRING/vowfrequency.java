package STRING;


import java.io.*;
class vowfrequency
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
System.out.println("Enter any string:");
n=cd.readLine();
int i,l=0,p=0,q=0,r=0,s=0,t=0;
char ch;
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch=='A'||ch=='a')
p=p+1;
if(ch=='E'||ch=='e')
q=q+1;
if(ch=='I'||ch=='i')
r=r+1;
if(ch=='O'||ch=='o')
s=s+1;
if(ch=='U'||ch=='u')
t=t+1;
}
System.out.println("Frequency of A or a" + p);
System.out.println("Frequency of E or e" + q);
System.out.println("Frequency of I or i" + r);
System.out.println("Frequency of O or o" + s);
System.out.println("Frequency of U or u" + t);
}
}