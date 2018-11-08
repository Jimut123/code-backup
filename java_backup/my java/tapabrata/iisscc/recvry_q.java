package iisscc;

import java.util.Scanner;
class recvry_q
{
Scanner ob=new Scanner(System.in);
int front,rear,i,k,t,c,max;
int q[]=new int [100];
int a[]=new int [100];
recvry_q()
{
front=rear=-1;
t=c=0;
}
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
q[++front]=k;
rear++;
}
else
q[++rear]=k;
}
void manipulate()
{
if(c==3)
{
max=a[0];
for(i=0;i<t;i++)
if(a[i]>max)
{
max=a[i];
k=i;
}
a[k]=0;
q[++rear]=max;
c--;
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
System.out.println("\ndeleted element = "+q[front]+'\n');
a[t++]=q[front];
c++;
front++;
manipulate();
}
}
void disp()
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
System.out.print(q[i]+", ");
System.out.println("");
}
System.out.println("your queue : ");
for(i=0;i<t;i++)
System.out.print(a[i]+", ");
System.out.println("");
}
}
