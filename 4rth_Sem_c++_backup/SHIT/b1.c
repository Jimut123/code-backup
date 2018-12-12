#include"stdio.h"
void main()
{
char a[100],b[100];
int t=0,i,j;
for(i=0;a[i];i++)
{
if(a[i]==' ')
{
printf("%c",b[0]);
printf(',');
t=0;
}
else
{
b[t++]=a[i];
b[t]=' ';
}
printf("%s",b);
}
}
