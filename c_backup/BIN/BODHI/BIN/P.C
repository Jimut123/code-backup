#include<stdio.h>
void bubble(int a[100],int);
void selection(int a[100],int);
void insertion(int a[100],int);
void main()
{
int a[100];int i,n,p;
clrscr();
printf("\n Enter the size of the array=");
scanf("%d",&n);
printf("\n Enter the number in the array=");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
printf("Enter 1 for bubble sort,2 for selection sort,3 for insertion sort \n");
printf("Enter your choice=");
scanf("%d",&p);
switch(p)
{
case 1:
bubble(a,n);
break;
case 2:
selection(a,n);
break;
case 3:
insertion(a,n);
break;
default:
printf("Wrong Choice");
}
getch();
}
void bubble(int a[100],int n)
{
int f=1;
int i,j,k,t;
for(i=0;i<n-1&&f;i++)
{
f=0;
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
f=1;
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
printf("\n the sorted array=");
for(k=0;k<n;k++)
{
printf("\t %d",a[k]);
}
}
void selection(int a[100],int n)
{
int i,j,k,t;
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
printf("\n The new array:");
for(k=0;k<n;k++)
{
printf(" \t %d",a[k]);
}
}
void insertion(int a[100],int n)
{
int i,j,k,t;
for(i=1;i<n;i++)
{
 t=a[i];
 for(j=i-1;j>=0&&t<a[j];j--)
    a[j+1]=a[j];
     a[j+1]=t;

}
printf("The new array is:\n");
for(k=0;k<n;k++)
{
printf(" \t %d",a[k]);
}
}