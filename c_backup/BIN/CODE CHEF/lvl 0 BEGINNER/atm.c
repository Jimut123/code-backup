#include<stdio.h>
int main()
{
int t;
double v;
scanf("%d%lf",&t,&v);

//printf("%f",v);
if(t>v||t%5!=0)
printf("%0.2lf",v);
else
{
v=v-t-0.5;
printf("%0.2lf",v);
}
return 0;
}
