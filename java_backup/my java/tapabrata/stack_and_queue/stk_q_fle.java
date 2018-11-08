package stack_and_queue;
import java.io.*;
import java.util.Scanner;
class stk_q_fle
{
Scanner ob=new Scanner(System.in);
int top,i,k,x;
int s[]=new int [100];
stk_q_fle()
{
top=-1;
i=0;
k=0;
}
void push()
{
System.out.println("give the element to be pushed :");
k=ob.nextInt();
System.out.println("");
if(top>=100)
System.out.println("overflow");
else
s[++top]=k;
}
void pop()
{
if(top<0)
{
System.out.println("Empty Stack");
return;
}

System.out.println("popped element = "+s[top]+'\n');
top--;
}
void disp()
{
System.out.println("your stack :");
for(i=top;i>=0;i--)
System.out.println(s[i]+", ");
System.out.println("");
}
int front=-1,rear=-1;
int a[]=new int [100];
void insert()
{
System.out.println("give the element to be inserted : ");
k=ob.nextInt();
System.out.println("");
if(rear>=100)
System.out.println("overflow.................");
else
if(front<0)
{
a[++front]=k;
rear++;
}
else
a[++rear]=k;
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
void check()throws IOException
{
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("collection.txt")));
for(i=top;i>=0;i--)
{
int a=s[i],s1=0;
//if(s1==s[i])
pw.println(a);
}
System.out.println(" all stack elements are stored in the file ");
for(i=front;i<=rear;i++)
{int b=s[i],s2=0;
//if(s2==s[i])
pw.println(b);
}
System.out.println(" all queue elements are storede in the file ");
pw.close();
}
void fle_disp()throws IOException
{
BufferedReader ob=new BufferedReader(new FileReader("collection.txt"));
String s="";
if((s=ob.readLine())==null)
{
System.out.println("File still empty ");
ob.close();
}
else
{
ob=new BufferedReader(new FileReader("collection.txt"));
s="";
System.out.println("Output of File  :");
while((s=ob.readLine())!=null)
System.out.println(s);
System.out.println("");
ob.close();
}
}
}