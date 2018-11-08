#include<stdio.h>
int cou=0;
void rec(int,int,int a[100][100],int);
void rec1(int,int,int a[100][100],int);
void display(int arr[100][100],int);
void main()
{
int arr[100][100],t1,t2,d=0;
char c;
int n,i,j;
clrscr();
printf("Enter the size of 1 side :");
scanf("%d",&n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=-1;
}
}
while(c!='n')
{
printf("\nEnter the co-ordinates:\n");
scanf("%d %d",&t1,&t2);
arr[t1][t2]=2;
printf("\nDo you want to continue ?(y/n):\n");
scanf(" %c",&c);
}
c='y';
printf("Enter the co-ordinates where you want to change the diagonal.");
while(c!='n')
{
d++;
printf("\nEnter the co-ordinates:\n");
scanf("%d %d",&t1,&t2);
if(d%2!=0)
rec(t1,t2,arr,n);
else
rec1(t1,t2,arr,n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(arr[i][j]==2)
{
if(d%2!=0)
rec(i,j,arr,n);
else
rec1(i,j,arr,n);
}
}
}
display(arr,n);
printf("\nDo you want to continue ?(y/n):\n");
scanf(" %c",&c);
}
getch();
}
void rec(int t1,int t2,int a[100][100],int n)
{
cou++;
if(t1==n-1||t2==n-1)
{
a[t1][t2]=2;
}
if(a[t1][t2]==2||a[t1][t2]==1)
{
a[t1][t2]=1;
if(t1+1<n&&t2+1<n)
rec(t1+1,t2+1,a,n);
//rec(t1-1,t2-1,a,n);
}
if(a[t1][t2]==-1)
{
if(t1+1<n&&t2+1<n&&cou<3)
rec(t1+1,t2+1,a,n);
//rec(t1-1,t2-1,a,n);
a[t1][t2]=1;
if(t1==n-1||t2==n-1)
{
a[t1][t2]=2;
}
}
if(t1==n-1||t2==n-1)
{
a[t1][t2]=2;
}
if(t1>=n||t2>=n||t1==-1||t2==-1)
return ;
if(a[t1][t2]==0)
return;
if(cou==2)
{
cou=0;
return;
}
}
void rec1(int t1,int t2,int arr[100][100],int n)
{
if(t1==n-1||t2==n-1&&arr[t1][t2]==2)
arr[t1][t2]=1;
if(t1==0||t2==0&&arr[t1][t2]==1)
{
arr[t1][t2]=2;
}
if(t1==-1||t2==-1)
return;
rec1(t1-1,t2-1,arr,n);
}
void display(int arr[100][100],int n)
{
int i,j;
printf("\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d\t",arr[i][j]);
}
printf("\n\n");
}
}