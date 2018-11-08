#include<stdio.h>
void main()
{
int c=0,n,i,j,a[100][100];
clrscr();
printf("Enter the side of matrix :\n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("Enter the element of the %d row and %d column :\n",i,j);
scanf("%d",&a[i][j]);
if(a[i][j]==0)
c++;
}
}
if(c>(n*n)/2)
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d\t",a[i][j]);
}
printf("\n");
}
printf("Sparce matrix..\n");
printf("\nRow\tColumn ::\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]==0)
printf("%d\t%d\n",i,j);
}
}
getch();
}
else
printf("Not a Sparce matrix..");

getch();
}