#include<stdio.h>
int arr[5],i;
int rear=-1,front=-1,up=0,f=0;
void push();
void pop();
void display();
void main()
{
int d;
clrscr();
do
{
printf("\nEnter 1 for push :");
printf("\nEnter 2 for pop :");
printf("\nEnter 3 for show :");
printf("\nEnter 4 for exit :\n");
scanf("%d",&d);
switch(d)
{
case 1:
push();
break;
case 2:
pop();
break;
case 3:
display();
break;
case 4:
exit(3);
break;
}
}while(1);
}
void push()
{
if(front<0&&rear<0)
{
front++;rear++;
}
if(rear>=4&&front>0)
{
rear=0;
if(f<front)
f++;
}
if(rear>4&&front==0)
printf("Queue overflow");
if((rear<5)&&(front<rear-1))
{
printf("Enter the %d element\n",rear+1);
scanf("%d",&arr[rear]);
if(up<5)
up++;
rear++;
}

else if(front>rear-1&&rear<f-1)
{
printf("Enter the %d element\n",rear+1);
scanf("%d",&arr[rear]);
if(up<5)
up++;
rear++;
}
else if(rear<5&&rear>front)
{
printf("Enter the element :");
scanf("%d",&arr[rear]);
rear++;
if(up<5)
up++;
}
else if(rear<=4)
{
printf("Enter the element :");
scanf("%d",&arr[rear]);
rear++;
if(up<5)
up++;
}
}

void pop()
{
int t;
if(front>rear||front==4||rear==-1)
printf("Queue underflow.");
else
{
t=arr[front];
printf("%d",t);
front++;
}
}
void display()
{
if(front>rear||front==-1||rear==-1)
{
printf("Queue underflow, no elements present.");
}
else
{
for(i=0;i<up;i++)
printf("%d\n",arr[i]);
}
}