#include<stdio.h>
void main()
{
char *c[5];
int i,r;
for(i=0;i<2;i++)
{
printf("Enter nos. of letters :");
scanf("%d",&r);
c[i]=(char *)malloc(r*sizeof(char));
fflush(stdin);
gets(c[i]);
}
}