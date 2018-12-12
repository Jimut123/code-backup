#include<stdio.h>
void entering();
void show();
void leaving();
int stack[100];
int top=0;
void main()
{
int x;
clrscr();
do
{
//delay(700);
//clrscr();
printf("\nPress 1 for entering the car :");
printf("\nPress 2 for giving the car number :");
printf("\nPress 3 for exit :");
printf("\nPress 4 for display :\n");
scanf("%d",&x);
switch(x)
{
case 1:
entering();
break;
case 2:
leaving();
break;
case 3:
exit(1);
case 4:
show();
}
}while(1);
}
void entering()
{
if(top>=100)
printf("Stack overflow.");
else
{
printf("Enter the car number :");
scanf("%d",&stack[top]);
top++;
}
}
void show()
{
int i;
for(i=top-1;i>=0;i--)
{
printf("\n%d",stack[i]);
}
}
void leaving()
{
int i,j,n,f=0;
printf("Enter the car number ::");
scanf("%d",&n);
for(i=top-1;i>=0;i--)
{
if(n==stack[i])
{
top--;
printf("Match found, the car no. is %d and found at position %d from above",n,i+1);
for(j=i;j<top;j++)
{
stack[j]=stack[j+1];
}
f=0;
break;
}
else
f=1;
}
if(f==1)
{
printf("Car no. not found.");
}
}