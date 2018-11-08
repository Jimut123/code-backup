#include<stdio.h>
void display();
void pop();
int top=-1;
int a[100];
void main()
{
int n,d,k;
clrscr();
printf("\nEnter the number :\n");
scanf("%d",&n);
k=n;
while(k!=0)
{
d=k%2;
a[++top]=d;
k=k/2;
}
while(1)
{
printf("\nEnter 1 for display :");
printf("\nEnter 2 for pop :");
printf("\nEnter 3 for exit :\n");
scanf("%d",&n);
switch(n)
{
case 1:
display();
break;
case 2:
pop();
break;
case 3:
exit(4);
break;
}
}
getch();
}
void display()
{
int i;
if(top>=0)
{
for(i=top;i>=0;i--)
printf("%d\t",a[i]);
printf("\n");
}
if(top<0)
printf("Stack underflow.");
}
void pop()
{
int t;
if(top>=0)
{
t=a[top--];
printf("%d",t);
}
if(top<0)
{
printf("Stack Underflow.");
}
}
