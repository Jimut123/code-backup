#include<stdio.h>
#define max 20
int top=-1;
void  main()
{
 int a[max],i,n,x;
 printf("\n how many numbers:");
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
   printf("\n enter the elements %d",i+1);
   scanf("%d",&x);
   push(a,x);
 }
 for(i=0;i<n;i++)
 {
  x=pop(a);
  printf("\n %d",x);
 }
}
int push(int a[],int n);
{
  ++top;
  if(top==max)
  {
   printf("\n stack is full");
   exit(1);
  }
  a[top]=x;
  return 0;
}
int pop(int a[]);
{
  if(top==-1)
  printf("\n stack empty");
  exit(1);

  x=a[top];
  top--;
  return x;

}