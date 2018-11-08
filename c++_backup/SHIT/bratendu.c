#include"stdio.h"
#include"string.h"
void main()
{ char a[100],b[100];
printf("\n","Enter a sentence");
gets(a);
int t=0,i,j;
for(i=0;a[i];i++)
{ if(a[i]==' ')
{
for(j=strlen(b)-1;j>=0;j--)
printf("%c",b[j]);
t=0;
}
else
{b[t++]=a[i];
b[t]='\0';
}
}
for(j=strlen(b)-1;j>=0;j--)
printf("%c",b[j]);

}
