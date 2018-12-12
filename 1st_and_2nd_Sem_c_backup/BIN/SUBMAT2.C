#include<stdio.h>
int count=0;
void rec(int ,int ,int ,int a[100][100],int);
void main()
{
int i,j,n,d,a[100][100];
clrscr();
printf("Enter the side of a matrix :\n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("Enter the element of %d row and %d column ::\n",i,j);
scanf("%d",&a[i][j]);
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(d=1;d<n;d++)
rec(i,j,d,a,n);
printf("\n");
}
}
getch();
}
void rec(int i,int j,int d,int a[100][100],int n)
{
int p,q;
if(i+d<n&&j+d<n)
{
++count;
printf("Submat no. %d =\n",count);
for(p=i;p<=i+d;p++)
{
for(q=j;q<=j+d;q++)
{
printf("%d\t",a[p][q]);
delay(475);
}
printf("\n");
}
}
else
{
return;
}
}