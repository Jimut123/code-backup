#include<stdio.h>
int arr[5],i;
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
if(front<0)
{
printf("Enter the element :");
scanf("%d",&arr[++front]);
rear++;
}
else if(front>=0&&rear<5)
{
printf("Enter the element :");
scanf("%d",&arr[++rear]);
}
else if(front>0&&rear>=4)
{
rear=front-1;
printf("Enter the element :");
scanf("%d",&arr[++rear]);
}
else
if(front==0 && rear>=5)
return;

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
if(rear<5)
{
for(i=front;i<rear;i++)
printf("%d\n",arr[i]);
}
else if(rear<front)
{
for(i=front;i<=4;i++)
printf("%d\n",arr[i]);
for(i=0;i<=rear;i++)
printf("%d\n",arr[i]);
}
}