package link;

import java.io.*;
class stack1
{
int a[]=new int[100];
int i,top,x,t;
stack1()
{
top=-1;
}

void push(int a1)
{
if(top<0)
{
a[++top]=a1;
}
else
if(top>=100)
{
System.out.println("Stack overflow");
}
else
a[++top]=a1;
}

void pop()
{
if(top<0)
{
System.out.println("Stack underflow");
}
else
{
System.out.println("Popped element: "+a[top]);
top--;
}
}

void disp()
{
for(i=top;i>=0;i--)
System.out.println(a[i]);
}

void implement()throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Press 1 for PUSH");
System.out.println("Press 2 for POP");
System.out.println("Press 3 for DISP");
System.out.println("Press 4 to EXIT");
System.out.println("Enter your choice");
t=Integer.parseInt(input.readLine());
switch(t)
{
case 1:System.out.println("Enter no.:");
       x=Integer.parseInt(input.readLine());
       push(x);
       break;
case 2:
       pop();
       break;
case 3:System.out.println("Your stack : ");
       disp();
       break;
case 4:System.exit(0);
default:System.out.println("Press 1/2/3/4 only");       
}
}while(true);
}
}
