#include<stdio.h>
#include<stdlib.h>
void rec(int,int,int a[100][100],int);
void main()
{
int a[100][100],k[100],p=0,v,u,i,j,t1,t2,h;
int n;
char c;

clrscr();
printf("Enter the value of 1 side of the matrix ::");
scanf("%d",&n);
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=-1;
while(c!='n')
{
printf("\nEnter the co-ordinates where you want to put any no. :");
scanf("%d %d",&u,&v);
if(a[u][v]==-1)
{
printf("\nEnter the number ::");
scanf("%d",&h);
k[p++]=u;
k[p++]=v;
a[u][v]=h;
t1=u;t2=v;
if(u-1>=0)
{
a[u-1][v]=random(h);
}
if(u+1<=n)
{
a[u+1][v]=random(h);
}
if(v-1>=0)
{
a[u][v-1]=random(h);
}
if(v+1<=n)
{
a[u][v+1]=random(h);
}
printf("\nu =%d v= %d\n",u,v);
}
else
printf("Enter different co-ordinates.");
printf("\nDo you want to continue ?(y/n):");
scanf(" %c",&c);
}
for(i=0;i<p;)
{
printf("%d\t%d\t",k[i++],k[i++]);
}
//rec(t1,t2,a,n);
printf("\n\n\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]==-1)
printf("\t");
else
printf("%d\t",a[i][j]);
}
printf("\n");
}
getch();
}
void rec(int t1,int t2,int a[100][100],int n)
{
if(a[t1][t2]!=-1)
{
printf("%d\t",a[t1][t2]);
 //rec(t1-1,t2-1,a,n);
 rec(t1-1,t2,a,n);
 //rec(t1-1,t2+1,a,n);
 rec(t1,t2-1,a,n);
 rec(t1,t2+1,a,n);
 //rec(t1+1,t2-1,a,n);
 rec(t1+1,t2,a,n);
 //rec(t1+1,t2+1,a,n);
}
if(t1>=n||t2>=n||t1==-1||t2==-1)
return ;
}