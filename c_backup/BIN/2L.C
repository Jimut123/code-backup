#include<stdio.h>
void main()
{
long int n,m,i,f=1,j,k,c=0;
clrscr();
printf("\n Enter the two limits lower and upper ::");
scanf("%lu",&m);
scanf("%lu",&n);
printf("\n%lu %lu\n",m,n);
for(i=m;i<=n;)
{
f=1;
c++;
for(j=1;j<=c;j++)
f=f*j;
if(f>=m)
i++;
if((f>=m)&&(f<=n))
printf("%d ",f);
else  if(f>n)
break;
}
getch();
}