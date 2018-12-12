#include<stdio.h>
void main()
{
int i,j,a[20][20],b[20][20],c[20][20],m,k;
clrscr();
printf("Enter the no. of rows of the matrix A :");
scanf("%d",&m);
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
printf("Enter the element of the %d now and %d column :",(i+1),(j+1));
scanf("%d",&a[i][j]);
}
}
printf("Enter the no. of rows of the matrix B :");
scanf("%d",&m);
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
printf("Enter the element of the %d now and %d column :",(i+1),(j+1));
scanf("%d",&b[i][j]);
}
}
for(i=0;i<m;i++)
{
for(k=0;k<m;k++)
{
c[i][j]=0;
for(j=0;j<m;j++)
{
c[i][j]=c[i][k]+a[i][j]*b[k][j];
}
printf("%d",c[i][j]);
}
}
printf("\n");
printf("\nThe resultant Matrix is ::\n");
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
printf("%d\t",c[i][j]);
}
printf("\n");
}
getch();
}
