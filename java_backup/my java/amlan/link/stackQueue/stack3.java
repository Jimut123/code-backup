package link.stackQueue;

import java.io.*;
class stack3
{
public static void main(String args[])throws IOException
{
int i,k,n;
String a[]=new String[100];
String s,s1="";
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any string:");
s=input.readLine();

for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
s1=s1+ch;
a[i]=s1;
s1="";
}
k=0;
do
{
System.out.println("Press 1 for Push");
System.out.println("Press 2 for Pop");
System.out.println("Press 3 for Display");
System.out.println("Press 4 to Exit");
n=Integer.parseInt(input.readLine());
switch(n)
{
case 1:k++;
       break;
case 2:k--;
       break;       
case 3:for(i=k-1;i>=0;i--)
       {
       System.out.println(a[i]);
       }
       break;       
case 4:System.exit(0);
default:System.out.println("Press 1/2/3/4 only:");
}
}while(true);
}
}       