#include<stdio.h>
#include<stdlib.h>
void refresh(int a[100][100],int);
void display(int a[100][100],int);
void delayp1();
void insert(int a[100][100],int);
void main()
{
int i,a[100][100],n;
clrscr();
printf("Enter the size of one side :\n");
scanf("%d",&n);
for(i=0;;i++)
{
clrscr();
refresh(a,n);
insert(a,n);
display(a,n);
while (kbhit())
exit(1);
delayp1();
}
getch();
}
void delayp1()
{
int i,j;
//clrscr();
for(i=0;i<6600;i++)
{
for(j=0;j<6000;j++);
}
}
void insert(int a[100][100],int n)
{
int i,k,m;
for(i=0;i<=(int)n/2+1;i++)
{
k=(int)random(n);
m=(int)random(n);
a[k][m]=8;
}
}
void display(int a[100][100],int n)
{
int i,k,j,m;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]==8)
printf("%d\t",a[i][j]);
else
printf("\t");
}
printf("\n\n");
}
}
void refresh(int a[100][100],int n)
{
int i,j;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=0;
}
