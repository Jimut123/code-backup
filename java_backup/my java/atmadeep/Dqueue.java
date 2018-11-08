import java.io.*;
class Dqueue
{
int que[]=new int[100];
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int front,rear;
int i,j,k;
Dqueue()
{
front=rear=-1;
i=j=k=0;
}
void insert()throws IOException
{
if(rear>100)
System.out.print("Queue full");
else 
if(front<0)
{
System.out.println("Give value in Que:");
k=Integer.parseInt(input.readLine());
que[++front]=k;
rear++;
}
else
{
System.out.println("Give value in Que:");
k=Integer.parseInt(input.readLine());
que[++rear]=k;
}
}
void ins_front()throws IOException
{
if(rear>=100)
{
System.out.println("Queue full.....");
return;
}
else
{
k=rear;
while(k>=0)
{
que[k+1]=que[k];
k--;
}
System.out.println("Give element...");
j=Integer.parseInt(input.readLine());
que[0]=j;
rear++;
front=0;
}
}

void delete()
{
if(front>rear)
{
System.out.print("no ret");
return;
}
System.out.print(que[front]);
front++;
}
void del_end()
{
System.out.print(que[rear]);
rear--;
}

void display()
{
System.out.print("Front");
for(i=front;i<=rear;i++)
System.out.print(que[i]+"---->");
System.out.print("Rear");
}

void start()throws IOException
{
int x;
do
{
System.out.println("Press 1 for insert");
System.out.println("Press 2 for delete");
System.out.println("Press 3 for display");
System.out.println("Press 4 for insert front");
System.out.println("Press 5 for delete end");
System.out.println("Press 6 for Exit");
System.out.println("Give choice");
x=Integer.parseInt(input.readLine());
switch(x)
{
case 1: insert();
break;
case 2: delete();
break;
case 3: display();
break;
case 4: ins_front();
break;
case 5: del_end();
break;
case 6: System.exit(0);
}
}
while(true);
}
}

