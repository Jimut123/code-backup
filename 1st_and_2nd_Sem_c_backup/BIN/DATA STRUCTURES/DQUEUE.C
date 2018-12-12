#include<stdio.h>
int arr[100],i;
int rear=-1,front=-1;
void push_rear();
void pop_front();
void display();
void push_front();
void pop_rear();
void main()
{
int d;
clrscr();
do
{
printf("\nEnter 1 to push from rear:");
printf("\nEnter 2 to pop from front :");
printf("\nEnter 3 to pop from rear:");
printf("\nEnter 4 to push from front :");
printf("\nEnter 5 for show :");
printf("\nEnter 6 for exit :\n");
scanf("%d",&d);
switch(d)
{
case 1:
push_rear();
break;
case 2:
pop_front();
break;
case 3:
pop_rear();
break;
case 4:
push_front();
break;
case 5:
display();
break;
case 6:
exit(3);
break;
}
}while(1);
}
void push_rear()
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
void pop_front()
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
void push_front()
{
if(front>0)
{
printf("Enter the element :");
scanf("%d",&arr[--front]);
}
else
printf("Queue overflow, can't add from front.");
}
void pop_rear()
{
int temp;
if(rear<=100&&rear>=0)
{
temp= arr[--rear];
printf("popped element : %d",temp);
}
else
printf("Queue overflow.");
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