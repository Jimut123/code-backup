import java.io.*;
class circular_que1
{
int a[]=new int[100];
int i,n,f=0,f1=0,rear=0,front=0;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
front=n/2;
rear=n;
f=front;
for(i=0;i<n;i++)
{
if(f<rear)
{
System.out.println("Enter no.:");
a[f]=Integer.parseInt(input.readLine());
f++;
}
else
{
if(f1<front)
{
System.out.println("Enter no.:");
a[f1]=Integer.parseInt(input.readLine());
f1++;
}
}
}
display();
}

void display()
{
System.out.print("Front->");
for(i=front;i<n;i++)
System.out.print(a[i]+"->");
for(i=0;i<front;i++)
System.out.print(a[i]+"->");
System.out.print("<-Rear");
}
}