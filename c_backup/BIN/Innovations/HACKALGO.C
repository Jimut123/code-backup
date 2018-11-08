#include<stdio.h>
void main()
{
char a[4]={'1','2','3','4'};
int i,j,k,l;
clrscr();
for(i=0;i<4;i++)
{
printf("%c\n",a[i]);
delay(10);
}
for(i=0;i<4;i++)
for(j=0;j<4;j++)
{
printf("%c%c\n",a[i],a[j]);
delay(10);
}
for(i=0;i<4;i++)
for(j=0;j<4;j++)
for(k=0;k<4;k++)
{
printf("%c%c%c\n",a[i],a[j],a[k]);
delay(10);
}
for(i=0;i<4;i++)
for(j=0;j<4;j++)
for(k=0;k<4;k++)
for(l=0;l<4;l++)
{
printf("%c%c%c%c\n",a[i],a[j],a[k],a[l]);
delay(10);
}
getch();
}