import java.io.*;
class queue
{
int que[]=new int[100];
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int front,rear;
int i,j,k;
queue()
{
front=rear=-1;
i=j=k=0;
}
void insert()throws IOException
{
if(rear>100)
System.out.print("Give full");
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
System.out.println("Press 4 for Exit");
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
case 4: System.exit(0);
}
}
while(true);
}
}

