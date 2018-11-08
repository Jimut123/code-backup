#include<stdio.h>
void main()
{
char c[100],c2[100],c3[100];
int i,l,k=0,n=0;
clrscr();
printf("Enter the expression ::");
gets(c);
l=strlen(c);
for(i=0;i<l;i++)
{
if(c[i]=='^')
{
c2[k++]='1';
n++;
}
else if(c[i]=='*')
{
c2[k++]='2';
n++;
}
else if(c[i]=='/')
{
c2[k++]='3';
n++;
}
else if(c[i]=='+')
{
n++;
c2[k++]='4';
}
else if(c[i]=='-')
{
c2[k++]='5';
n++;
}
else
c2[k++]='N';                                        //^*/+-
}
//puts(c2);
//printf("n=%d",n);
for(i=0;i<n;i++)
c3[i]='(';
k=0;
//printf("\nc3 =");
//puts(c3);
for(i=n;i<n+l;i++)
{
//printf("%c-----",c2[k]);
c3[i]=c2[k++];
}
/*printf("\nc3 =");
puts(c3);*/
for(i=n+l;i<(2*n+l);i++)
c3[i]=')';
/*printf("\nc3 =");
puts(c3);
printf("\nc3 =");*/
puts(c3);
getch();
}