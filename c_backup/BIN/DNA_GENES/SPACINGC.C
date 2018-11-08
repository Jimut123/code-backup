#include<stdio.h>
void main()
{
int i,l,n=0;
char c[100],c2[100];
clrscr();
printf("Enter the string:");
gets(c);
l=strlen(c);
for(i=0;i<l;i++)
{
c2[n++]=c[i];
if((i+1)%3==0)
c2[n++]=' ';
}
puts(c3);
getch();
}
