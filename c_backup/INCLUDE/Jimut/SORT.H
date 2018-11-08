/*This library is based on the no. of sorting techniques present till date.
  The array size can be changed from 100.

  For including the package you need to include the following header file :
  #include"c:\turboc3\include\jimut\sort.h"

  In case of calling the functions give :

  Here a is the array,n is the total no. of elements.

  @selection_sort(a,n);
  @bubble_sort(a,n);
  @shell_sort(a,n);
  @heap_sort(a,n);
  @insertion_sort(a,n);
  @quick_sort(x,first,last);
  @merge_sort(a,left,right);
  @radix_sort(a,n);

   Copyright (c) 2017 by Jimut Bahan Pal
    All Rights Reserved.
*/
#include<stdio.h>
#define array_size 100
void selection_sort(int a[array_size],int n)
{
int i,t,j;
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
}
void bubble_sort(int a[array_size],int n)
{
int i,t,j;
for(i=0;i<n;i++)
{
t=a[i];
for(j=i-1;j>=0&&t<a[j];j--)
a[j+1]=a[j];
a[j+1]=t;
}
}
void shell_sort(int a[array_size],int n)
{
int i,j,k,t;
for(i=n/2;i>0;i=i/2)
{
for(j=i;j<n;j++)
{
for(k=j-i;k>=0;k=k-i)
{
if(a[k+i]>=a[k])
break;
else
{
t=a[k];
a[k]=a[k+i];
a[k+i]=t;
}
}
}
}
}
void heap_sort(int a[array_size],int n)
{
int i,c,root,t,j;
for(i=1;i<n;i++)
{
c=i;
do
{
root=(c-1)/2;
if(a[root]<a[c])
{
t=a[root];
a[root]=a[c];
a[c]=t;
}
c=root;
}
while(c!=0);
}
//printf("\n heap array");
//for(i=0;i<n;i++)
//printf("\t%d",a[i]);
for(j=n-1;j>=0;j--)
{
t=a[0];
a[0]=a[j];
a[j]=t;
root=0;
do
{
c=2*root+1;
if((a[c]<a[c+1])&&c<j-1)
c++;
if((a[root]<a[c])&&c<j)
{
t=a[root];
a[root]=a[c];
a[c]=t;
}
root=c;
}
while(c<j);
}
}
void insertion_sort(int a[array_size],int n)
{
//insert value into temporary variable for finding out the
//proper place of insertion
int t,i,j;
for(i=0;i<n;i++)
{
t=a[i];
for(j=i-1;j>=0;j--)
{
if(t<a[j])
{
a[j+1]=a[j];
//inserting value at proper position
a[j]=t;
}
}
}
}
void merge_sort(int *a,int left,int right)
{
int m=(left+right)/2;
if(left<right)
{
if(left<right)
{
merge_sort(a,left,m);
merge_sort(a,m+1,right);
merge(a,left,m,right);
}
}
}
int merge(int *a,int left,int m,int right)
{
int t[100];
int p=0,lf=left,rf=m+1,i;
while(lf<=m&&rf<=right)
{
if(a[lf]<a[rf])
{
t[p++]=a[lf++];
}
else
{
t[p++]=a[rf++];
}
}
while(lf<=m)
{
t[p++]=a[lf++];
}
while(rf<=right)
{
t[p++]=a[rf++];
}
for(i=0;i<p;i++)
{
a[i+left]=t[i];
}
return;
}
int quick_sort(int *x,int first,int last)
{
int pivot,i,j,temp;
if(first<last)
{
pivot=first;
i=first;
j=last;
while(i<j)
{
while(x[i]<=x[pivot]&&i<last)
i++;
while(x[j]>x[pivot])
j--;
if(i<j)
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
temp=x[pivot];
x[pivot]=x[j];
x[j]=temp;
quick_sort(x,first,j-1);
quick_sort(x,j+1,last);
}
return;
}
void radix_sort(int *a,int n)
{
int l=a[0],c[100],b[100][100],i,j,k,p,t,s,u,r,q,temp,dig,m,x;
/*find largest from array*/
for(i=0;i<n;i++)
if(a[i]>l)
l=a[i];
printf("\n The largest value is %d",l);
s=0;
p=l;
while(p!=0)
{
t=p%10;
s++;
p=p/10;
}
printf("\n The largest value is %d, Number of digits is %d",l,s);
u=0;
for(i=0;i<n;i++)
u++;
printf("\n The total number of element is %d",u);
/*initialise the value to b matrix */
for(i=0;i<u;i++)
for(j=0;j<10;j++)
{
b[i][j]=0;
b[j][i]=0;
}
for(i=0;i<n;i++)
c[i]=a[i];
x=1;
/* sorting starts */
for(r=1;r<=s;r++)
{
j=0;
for(i=0;i<n;i++)
{
temp=c[i];
k=1;
while(k<=r)
{
dig=temp%10;
temp=temp/10;
k++;
}
b[j][dig]=0;
b[j][dig]=c[i];
j++;
}
printf("\n\n");
for(m=0;m<u;m++)
{
for(t=0;t<10;t++)
printf(" %4d",b[m][t]);
printf("\n");
}
printf("\n Pass no %d on digit no. %d",x,dig);
x++;
getch();
q=0;
for(t=0;t<10;t++)
for(m=0;m<u;m++)
if(b[m][t]!=0)
{
c[q]=0;
c[q]=b[m][t];
q++;
}
for(q=0;q<u;q++)
for(t=0;t<10;t++)
{
b[q][t]=0;
b[t][q]=0;
}
}
for(i=0;i<n;i++)
printf("\n%d",c[i]);

}