import java.io.*;
class queue1
{
int que[]=new int[100];
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int front,rear;
int i,j,k;
queue1()
{
front=rear=-1;
}
void insert()throws IOException
{
if(rear>100)
System.out.print("Give full");
else 
if(front<0)
{
k=Integer.parseInt(input.readLine());
que[++front]=k;
rear++;
}
else
{
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
for(i=front;i<=rear;i++)
System.out.print(que[i]);
}
void start()
{
int x;
do
{
System.out.println("Press 1 for insert");
System.out.println("Press 2 for delete");
System.out.println("Press 1 for display");
System.out.println("Exit");
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
}
}
while(true);
}
}

