package queue_prog;
import java.util.Scanner;
class queue
{
Scanner ob=new Scanner(System.in);
int front,rear,i,k;
int a[]=new int [100];
queue()
{
front=rear=-1;
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
System.out.print(a[i]+", ");
System.out.println("");
}
}
}
