#include<stdio.h>
void bubble(int *,int);
void selection(int *,int);
void insertion(int *,int);
void main()
{
int n,i,*arr,c;
clrscr();
printf("\nEnter the size of 1 D array:\n");
scanf("%d",&n);
arr=(int *)malloc(n*sizeof(int));
for(i=0;i<n;i++)
{
printf("\nEnter the %d element of the array :",i+1);
scanf("%d",&arr[i]);
}
printf("\nEnter 1 for bubble .\nEnter 2 for selection.\nEnter 3 for insertion sort :\n");
scanf("%d",&c);
switch(c)
{
case 1:
bubble(arr,n);
break;
case 2:
selection(arr,n);
break;
case 3:
{
//selection(arr,n);
insertion(arr,n);
break;
}
default:printf("Wrong choice..");
}
printf("\nThe resultant /sorted array :\n");
for(i=0;i<n;i++)
printf("%d\t",*(arr+i));
getch();
}
void bubble(int *arr,int n)
{
int i,f=1,t,j;

for(i=0;i<n-1&&f;i++)
{
f=0;
for(j=0;j<n-i-1;j++)
{
if(*(arr+j)>*(arr+j+1))
{
f=1;
t=*(arr+j);
*(arr+j)=*(arr+j+1);
*(arr+j+1)=t;
}
}
}
}
void selection(int *arr,int n)
{
int i,t,j;
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(*(arr+i)>*(arr+j))
{
//f=1;
t=*(arr+i);
*(arr+i)=*(arr+j);
*(arr+j)=t;
}
}
}
}
void insertion(int *arr,int n)
{
int i,t,j,h;
//printf("\nEnter the element to be inserted :\n");
//scanf("%d",&h);
for(i=1;i<n;i++)
{
t=*(arr+i);
for(j=i-1;j>=0&&t<*(arr+j);j--)
{
*(arr+j+1)=*(arr+j);
}
*(arr+j+1)=t;
}
}

