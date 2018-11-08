import java.io.*;
class que2
{

int a[]=new int[100];
int i,n,k,front=0,rear=0,x;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
que2()
{
front=rear=-1;
}
void input()throws IOException
 {
 if(rear>=100)
 {
 System.out.println("Que flowover");
 return;
 }
 else
 if(front<0)
 {
 System.out.println("Give value:");
 x=Integer.parseInt(input.readLine());
 a[++front]=x;
 rear++;
 }
 else
 {
 System.out.println("Give value:");
 x=Integer.parseInt(input.readLine());
 a[++rear]=x;
 //Rear;
 }
 }

void insert_front()throws IOException
{
k=rear;
while(k>=front)
{
a[k+1]=a[k];
k--;
}
System.out.println("Enter element you want to insert:");
x=Integer.parseInt(input.readLine());
a[front]=x;
rear++;
}

void insert_rear()throws IOException
{
System.out.println("Enter element you want to insert:");
x=Integer.parseInt(input.readLine());
a[rear]=x;
rear++;
}

void delete_front()
{
System.out.println("Deleted element :"+a[front]);
front++;
}

void delete_rear()
{
System.out.println("Deleted element :"+a[rear]);
rear--;
}

void disp()
{
//System.out.print(a[front]);
for(i=front;i<=rear;i++)
System.out.print(","+a[i]);
}
}
