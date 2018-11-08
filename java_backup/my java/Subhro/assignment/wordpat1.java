package assignment;

import java.io.*;
class wordpat
{
String s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,t,t1,l,l1;
wordpat()throws IOException
{
System.out.println("Give String:");
s=br.readLine();
dsg();
}
void dsg()throws IOException
{
t=10;
t1=10;
System.out.println("Give intersecting point:");
l=Integer.parseInt(br.readLine());
for(i=0;i<l;i++)
{
for(j=1;j<=t;j++)
System.out.print(" ");
System.out.print(s.charAt(i));
for(j=1;j<=t1;j++)
System.out.print(" ");
System.out.print(s.charAt(i));
t=t+2;
t1=t1-3;
//System.out.println(t1);
System.out.println("");
}
t=t-1;
for(j=1;j<=t;j++)
System.out.print(" ");
System.out.print(s.charAt(i));
System.out.println("");
t=t-2;
t1=t1+4;
for(i=i+1;i<s.length();i++)
{
for(j=1;j<=t;j++)
System.out.print(" ");
System.out.print(s.charAt(i));
for(j=1;j<=t1;j++)
System.out.print(" ");
System.out.print(s.charAt(i));
t=t-2;
t1=t1+4;
//System.out.println(t1);
System.out.println("");
}
}
}