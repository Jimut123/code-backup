#include<stdio.h>
void push();
void pop();
void show();
int top=-1;
char stack[100];
void main()
{
int x;
clrscr();
do
{
printf("\n put 1 for push :");
printf("\n put 2 for pop :");
printf("\n put 3 to show :");
printf("\n put 4 for exit :");
printf("\n Enter choice :");
scanf("%d",&x);
switch(x)
{
case 1:
push();
break;
case 2:
pop();
break;
case 3:
show();
break;
case 4:
exit(0);
}
}while(1);
}
void push()
{
char k;
if(top>=100)
{
printf("\n overflow ::");
return ;
}
else
{
scanf(" %c",&k);
stack[++top]=k;
}
}
void pop()
{
if(top<0)
{
printf("\n overflow ");
return;
}
else
{
printf("\n %c",stack[top]);
top--;
}
}
void show()
{
int i;
for(i=top;i>=0;i--)
printf("\n %c",stack[i]);
}