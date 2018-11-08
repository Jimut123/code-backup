package STRING;


import java.io.*;
class wordbeginvowels
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="";
int i,l,count=0;
char ch;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch==' ' || ch=='.')
{
if(ch=m.length()>=2)
{
count=m.charAt(0);
if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
count++;
}
m="";
}
else
m=m+ch;
}
System.out.println("No of words begin with vowels:");
}
}