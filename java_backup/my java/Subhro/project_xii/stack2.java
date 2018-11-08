package project_xii;

import java.io.*;
class stack2
{
int a[]=new int[100];
int i,top=0,x,t;

stack2()
{
top=0;
}

void odd()
{
for(i=1;i<=100;i++)
{
if(i%2!=0)
{
push(i);
}
}
}

void push(int a1)
{
if(top<100)
{
a[top]=a1;
//System.out.println(top);
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
do
{
System.out.println("Press 1 for POP");
System.out.println("Press 2 for DISPLAY");
System.out.println("Press 3 to EXIT");
System.out.println("Enter your choice");
t=Integer.parseInt(input.readLine());
switch(t)
{
case 1:pop();
       break;
case 2:disp();
       break;
case 3:System.exit(0);
default:System.out.println("Press 1/2/3 only:");
}
}while(true);
}
}