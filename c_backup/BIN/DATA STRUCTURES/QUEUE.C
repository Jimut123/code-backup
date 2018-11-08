#include<stdio.h>
int arr[100],i;
int rear=-1,front=-1;
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
if(front>=100||rear>=100||front>rear)
printf("Queue overflow");
else
{
if(front<0)
{
front++;rear++;
}
printf("Enter the %d element\n",rear+1);
scanf("%d",&arr[rear]);
rear++;
}
}
void pop()
{
int t;
if(front>rear||front==100||rear==-1)
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
for(i=front;i<rear;i++)
printf("%d\n",arr[i]);
}
}