#define MAX 10
int top=-1;
main()
{
int a[MAX],i,n,x;
clrscr();
printf("th many elements :\n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter the element %d\n",i+1);
scanf("%d",&x);
push(a,x);
}
for(i=0;i<n;i++)
{
x=pop(a);
printf("%d\n",x);
}
getch();
return 0;
}
int push(int a[],int x)
{
++top;
if(top==MAX)
{
printf("\n Stack is full");
exit(1);
}
a[top]=x;
return 0;
}
int pop(int a[])
{
int x;
if(top==-1)
{
printf("\nStack Empty");
exit(1);
}
x=a[top];
top--;
return x;
}