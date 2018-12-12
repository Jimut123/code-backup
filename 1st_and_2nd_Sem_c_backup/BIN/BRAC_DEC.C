#include<stdio.h>
void main()
{
char s[100],s1[100],k=0;
int i,l;
clrscr();
printf("Enter an expression with brackets ::");
gets(s);
l=strlen(s);
for(i=0;i<l;i++)
{
if(s[i]!='('&&s[i]!=')')
s1[k++]=s[i];
}
puts(s1);
getch();
}