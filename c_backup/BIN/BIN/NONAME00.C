char *a[];
char *a[5];
#include<stdio.h>
void main()
{
char *a[]={"ABC","BAC","CCC"};
int i;
for(i=0;i<3;i++)
{
printf("%f",a[i]);
}
}
#include<stdio.h>
void main()
{
char *c[5];
int i,r;
for(i=0;i<5;i++)
{
printf("Enter nos. of letters :");
scanf("%d",&r);
c[i]=(char *)malloc(r*sizeof(char));
gwts(c[i]);
}
}