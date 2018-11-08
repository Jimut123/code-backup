package queue_prog;
import java.util.Scanner;
class merge_q
{
Scanner ob=new Scanner(System.in);
int i,k,front,front1,front2,rear,rear1,rear2;
int q[]=new int [100];
int a[]=new int [100];
int b[]=new int [100];
merge_q()
{
front=front1=front2=rear=rear1=rear2=-1;
i=0;
k=0;
}
void insert1()
{
System.out.println("\ngive the element to be inserted :");
k=ob.nextInt();
if(k<0)
{
System.out.println("\nuser should give positive inputs ONLY !!!!!!!!!!!!!!!\n");
return;
}
System.out.println("");
if(rear1>=100)
System.out.println("\n.................overflow.................\n");
else
if(front1<0)
{
a[++front1]=k;
rear1++;
}
else
a[++rear1]=k;
}
void delete1()
{
if(front1==-1)
System.out.println("\n................underflow................\n");
else
if(front1>rear1)
{
System.out.println("\n...................empty..................\n");
front1=rear1=-1;
}
else
{
System.out.println("\ndeleted element = "+a[front1]+'\n');
front1++;
}
}
void insert2()
{
System.out.println("\ngive the element to be pushed :");
k=ob.nextInt();
if(k<0)
{
System.out.println("\nuser should give positive inputs ONLY !!!!!!!!!!!!!!!\n");
return;
}
System.out.println("");
if(rear2>=100)
System.out.println("\n.................overflow.................\n");
else
if(front2<0)
{
b[++front2]=k;
rear2++;
}
else
b[++rear2]=k;
}
void delete2()
{
if(front2==-1)
System.out.println("\n................underflow................\n");
else
if(front2>rear2)
{
System.out.println("\n...................empty..................\n");
front2=rear2=-1;
}
else
{
System.out.println("\ndeleted element = "+a[front2]+'\n');
front2++;
}
}
void merge()
{
for(i=front1;i<=rear1;i++)
{
if(front<0)
{
q[++front]=a[i];
rear++;
}
else
q[++rear]=a[i];
}
front1=rear1=-1;
for(i=front2;i<=rear2;i++)
{
if(front<0)
{
q[++front]=b[i];
rear++;
}
else
q[++rear]=b[i];
}
front2=rear2=-1;
System.out.println("\n..........merged queue has been created..........\n");
}
void insert_merge()
{
System.out.println("\ngive the element to be inserted : ");
k=ob.nextInt();
if(k<0)
{
System.out.println("\nuser should give positive inputs ONLY !!!!!!!!!!!!!!!\n");
return;
}
System.out.println("");
if(rear>=100)
System.out.println("\n.................overflow.................\n");
else
if(front<0)
{
a[++front]=k;
rear++;
}
else
a[++rear]=k;
}
void delete_merge()
{
if(front==-1)
System.out.println("\n.................overflow.................\n");
else
if(front>rear)
{
System.out.println("\n...................empty..................\n");
front=rear=-1;
}
else
{
System.out.println("\ndeleted element = "+a[front]+'\n');
front++;
}
}
void disp_merge()
{
if(front==-1)
System.out.println("\n................underflow................\n");
else
if(front>rear)
{
System.out.println("\n...................empty..................\n");
front=rear=-1;
}
else
{
System.out.println("your merged queue : ");
for(i=front;i<=rear;i++)
System.out.print(q[i]+", ");
System.out.println("");
}
}
void disp_1()
{
if(front1==-1)
System.out.println("\n................underflow................\n");
else
if(front1>rear1)
{
System.out.println("\n...................empty..................\n");
front1=rear1=-1;
}
else
{
System.out.println("your 1st queue : ");
for(i=front1;i<=rear1;i++)
System.out.print(a[i]+", ");
System.out.println("");
}
}
void disp_2()
{
if(front2==-1)
System.out.println("\n................underflow................\n");
else
if(front2>rear2)
{
System.out.println("\n...................empty..................\n");
front2=rear2=-1;
}
else
{
System.out.println("your 2nd queue : ");
for(i=front2;i<=rear2;i++)
System.out.print(b[i]+", ");
System.out.println("");
}
}
}
