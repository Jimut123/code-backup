#include<stdio.h>
int main()
{
int i,j;
int a[1000];
for(i=0;;)
{
scanf("%d",&a[i]);
if(a[i]==42)
{
break;
goto OL;
}
else
i++;
}
OL:
for(j=0;j<i;j++)
{
printf("%d\n",a[j]);
}
return 0;
}
