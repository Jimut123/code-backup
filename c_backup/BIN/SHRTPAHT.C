#include<stdio.h>
void rec(int,int,int,int,int a[4][4],int);
void main()
{
int t1=0,t2=0,i,j,t3=3,t4=3,n=4;
int a[4][4]={{1,2,3,4},
	     {5,6,7,8},
	     {9,10,11,12},
	     {13,14,15,16}
	     };
clrscr();
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
printf("%d\t",a[i][j]);
}
printf("\n");
}
printf("\n");
rec(t1,t2,t3,t4,a,n);
getch();
}
void rec(int t1,int t2,int t3,int t4,int a[4][4],int n)
{
if(t1>t3||t2>=t4)
{
printf("\n");
return;
}
rec(t1+1,t2,t3,t4,a,n);
printf("%d ->",a[t1][t2]);
rec(t1,t2+1,t3,t4,a,n);
printf("%d -",a[t1][t2]);
}