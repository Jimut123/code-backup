#include<stdio.h>
#include<stdlib.h>
void main()
{
int n=10000,i,j,a[10000],s,k;
clrscr();
/*printf("Enter the target sum :\n");
scanf("%d",&s);
printf("Enter the size of the array:\n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter the %d element :\n",i+1);
scanf("%d",&a[i]);
} */
for(k=0;k<1000;k++)
{
s=random(1000);
for(i=0;i<10000;i++)
{
a[i]=random(100);
printf("%d\t",a[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]+a[j]==s)
printf("%d\t%d : %d\n",a[i],a[j],s);
}
}
}
getch();
}