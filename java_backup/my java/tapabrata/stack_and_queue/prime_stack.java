package stack_and_queue;
import java.io.*;
class prime_stack
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int [100];
int top,i,p,x,f,n;
int s[]=new int [100];
int front=-1,rear=-1,j,k;
void no()throws IOException
{System.out.println(" Enter the no ");
n=Integer.parseInt(br.readLine());
prime(n);
} 
prime_stack()
{
top=-1;
i=0;
p=1;
front=rear=-1;
}
void prime(int p)
{
f=0;
for(i=2;i<p;i++)
if(p%i==0)
{
f=1;
break;
}
if(f==0)
push(p);
else
insert(p);
}
void push(int x)
{
if(top>=100)
System.out.println("Stack overflow");
else
{
s[++top]=x;
}
}
void pop()
{
System.out.println("popped out element = " +s[top]);
top--;
}
void disp()
{
System.out.println("your stack :");
for(i=top;i>=0;i--)
System.out.print(s[i]+", ");
System.out.println("");
}
void insert(int k)
{

if(rear>=100)
System.out.println("overflow.................");
else
if(front<0)
{
a[++front]=k;
System.out.print(a[front]+", ");
rear++;
}
else
{
a[++rear]=k;
System.out.print(a[rear]+", ");
}
}

void del()
{
if(front==-1)
System.out.println("underflow................");
else
if(front>rear)
{
System.out.println("empty................");
front=rear=-1;
}
else
{
System.out.println("\ndeleted element = "+a[front]+'\n');
front++;
}
}
void display()
{
if(front==-1)
System.out.println("underflow................");
else
if(front>rear)
{
System.out.println("empty................");
front=rear=-1;
}
else
{
System.out.println("your queue : ");
for(i=front;i<=rear;i++)
System.out.print(a[i]+", ");
System.out.println("");
}
}
void start()throws IOException
{
int w;
do
{
System.out.println("Press 1 for input no :");
System.out.println("Press 2 for pop no from stack :");
System.out.println("Press 3 for delete no from queue :");
System.out.println("Press 4 for dispaly stack :");
System.out.println("Press 5 for display queue :");
System.out.println("Press 6 for exit:");
System.out.println("Enter choice:");
w=Integer.parseInt(br.readLine());
switch(w)
{
case 1:no();
break;
case 2:pop();
break;
case 3:del();
break;
case 4:disp();
break;
case 5:display();
break;
case 6:System.exit(0);
default:System.out.println("Wrong choice!!!!!!!!!!!!!! Input from among the menu ");
}
}while(true);
}
}