#include<stdio.h>
void main()
{
int i,j,x,y,a[10][10];
char ch='Y';
clrscr();
while(ch!='n'&&ch!='N')
{
for(i=0;i<10;i++)
{
for(j=0;j<10;j++)
printf("%d\t",a[i][j]);
printf("\n");
}
printf("\nEnter x and y co-ordinates..");
scanf("%d %d",&x,&y);

for(i=x;i<10;i++)
{
for(j=y;j<10;j++)
a[i][j]=9;
}
for(i=0;i<10;i++)
{
for(j=0;j<10;j++)
printf("%d\t",a[i][j]);
printf("\n");
}
printf("\nEnter y/n to continue/discontinue.");
scanf("%c",&ch);
}
getch();
}