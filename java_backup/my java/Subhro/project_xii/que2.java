package project_xii;

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
a[++rear]=x;
//rear++;
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
void implement()throws IOException
{
int t;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Press 1 for INSERT");
System.out.println("Press 2 for INSERT FRONT");
System.out.println("Press 3 for INSERT REAR");
System.out.println("Press 4 for DELETE FRONT");
System.out.println("Press 5 for DELETE REAR");
System.out.println("Press 6 for DISP");
System.out.println("Press 7 to EXIT");
System.out.println("Enter your choice");
t=Integer.parseInt(input.readLine());
switch(t)
{
case 1:
       input();
       break;
      case 2:insert_front();
      break;
case 3:
       insert_rear();
       break;
       case 4:delete_front();
       break;
       case 5: delete_rear();
       
    break;
case 6:System.out.println("Your Queue : ");
       disp();
       break;
case 7:System.exit(0);
default:System.out.println("Press 1/2/3/4 only");       
}
}while(true);
 }
}

