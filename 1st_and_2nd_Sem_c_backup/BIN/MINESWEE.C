#include<stdio.h>
void rec(int,int,int a[100][100],int);
void main()
{
int a[100][100],v,u,i,j,t1,t2;
int n;
char c;

clrscr();
printf("Enter the value of 1 side of the matrix ::");
scanf("%d",&n);
while(c!='n')
{
printf("\nEnter the co-ordinates where you want to put 2 :");
scanf("%d %d",&u,&v);
a[u][v]=2;
printf("\nu =%d v= %d\n",u,v);
printf("\nDo you want to continue ?(y/n):");
scanf(" %c",&c);
}
printf("Enter the target coordinates :");
scanf("%d %d",&t1,&t2);
rec(t1,t2,a,n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d ",a[i][j]);
}
printf("\n");
}
getch();
}
void rec(int t1,int t2,int a[100][100],int n)
{
if(a[t1][t2]==2)
{
a[t1][t2]=1;
 rec(t1-1,t2-1,a,n);
 rec(t1-1,t2,a,n);
 rec(t1-1,t2+1,a,n);
 rec(t1,t2-1,a,n);
 rec(t1,t2+1,a,n);
 rec(t1+1,t2-1,a,n);
 rec(t1+1,t2,a,n);
 rec(t1+1,t2+1,a,n);
}
if(t1>=n||t2>=n||t1==-1||t2==-1)
return ;
if(a[t1][t2]==0)
return;
}