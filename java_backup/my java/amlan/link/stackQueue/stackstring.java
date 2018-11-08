package link.stackQueue;

import java.io.*;
class stackstring
{
int i,top=0,x,t;
String s,s1="";
String a[]=new String[100];
char ch;

stackstring()
{
top=0;
}

void pick()
{
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
s1=s1+ch;
push(s1);
s1="";
}
}

void push(String h)
{
if(top<100)
{
a[top]=h;
top++;
}
else
System.out.println("Stack overflow");
}

void pop()
{
if(top<0)
{
System.out.println("Stack underflow");
}
else
{
System.out.println("Popped element:"+a[top-1]);
top--;
}
}

void disp()
{
for(i=top-1;i>=0;i--)
{
System.out.println(a[i]+" ");
}
}

void impt()throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any string:");
s=input.readLine();
pick();
do
{
System.out.println("Press 1 for POP");
System.out.println("Press 2 for PUSH INTO STACK");
System.out.println("Press 3 for DISPLAY");
System.out.println("Press 4 to EXIT");
System.out.println("Enter your choice");
t=Integer.parseInt(input.readLine());
switch(t)
{
case 1:pop();
       break;
case 2:pick();
       break;       
case 3:disp();
       break;
case 4:System.exit(0);
default:System.out.println("Press 1/2/3 only:");
}
}while(true);
}
}