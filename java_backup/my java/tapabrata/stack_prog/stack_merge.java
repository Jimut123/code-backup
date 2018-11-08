package stack_prog;

import java.util.Scanner;
class stack_merge
{
Scanner ob=new Scanner(System.in);
int top,i,k,x,top1,top2;
int s[]=new int [100];
int a[]=new int [100];
int b[]=new int [100];
stack_merge()
{

top=-1;
top1=-1;
top2=-1;
i=0;
k=0;
}
void push1()
{
System.out.println("\ngive the element to be pushed :");
k=ob.nextInt();
if(k<0)
{
System.out.println("\nuser should give positive inputs ONLY !!!!!!!!!!!!!!!\n");
return;
}
System.out.println("");
if(top1>=100)
System.out.println("\n..................overflow...................\n");
else
a[++top1]=k;
}
void pop1()
{
if(top1==-1)
System.out.println("\n...................empty..................\n");
else
{
System.out.println("\npopped element = "+a[top1]+'\n');
top1--;
}
}
void push2()
{
System.out.println("\ngive the element to be pushed :");
k=ob.nextInt();
if(k<0)
{
System.out.println("\nuser should give positive inputs ONLY !!!!!!!!!!!!!!!\n");
return;
}
System.out.println("");
if(top2>=100)
System.out.println("\n..................overflow...................\n");
else
b[++top2]=k;
}
void pop2()
{
if(top2==-1)
System.out.println("\n...................empty..................\n");
else
{
System.out.println("\npopped element = "+b[top2]+'\n');
top2--;
}
}
void merge()
{
for(i=top1;i>=0;i--)
s[++top]=a[i];
top1=-1;
for(i=top2;i>=0;i--)
s[++top]=b[i];
top2=-1;
System.out.println("\n..........merged stack has been created..........\n");
}
void push_merge()
{
System.out.println("\ngive the element to be pushed :");
k=ob.nextInt();
System.out.println("");
if(top>=100)
System.out.println("\n..................overflow...................\n");
else
s[++top]=k;
}
void pop_merge()
{
if(top==-1)
System.out.println("\n...................empty..................\n");
else
{
System.out.println("\npopped element = "+s[top]+'\n');
top--;
}
}
void disp_merge()
{
if(top==-1)
System.out.println("\n...................empty..................\n");
else
{
System.out.println("\nyour merged stack :");
for(i=top;i>=0;i--)
System.out.println(s[i]+", ");
System.out.println("");
}
}
void disp_1()
{
if(top1==-1)
System.out.println("\n...................empty..................\n");
else
{
System.out.println("\nyour stack a :");
for(i=top1;i>=0;i--)
System.out.println(a[i]+", ");
System.out.println("");
}
}
void disp_2()
{
if(top2==-1)
System.out.println("\n...................empty..................\n");
else
{
System.out.println("\nyour stack b :");
for(i=top2;i>=0;i--)
System.out.println(b[i]+", ");
System.out.println("");
}
}
}
