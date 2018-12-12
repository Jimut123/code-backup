#include<stdio.h>
void main()
{
char s[50],s1[50],ch1,ch2;
int i,l,l1,v;
clrscr();
printf("Enter the two Strings ::");
gets(s);
gets(s1);
l=strlen(s);
l1=strlen(s1);
if(l1!=l)
printf("Two Strings are not equal!!! ");
else
{
for(i=0;i<l;i++)
{
ch1=s[i];
ch2=s1[i];
if(ch1==ch2)
v=0;
else
{
v=ch1-ch2;
break;
}
}
printf("The difference of the two strings are :: %d",v);
}
getch();
}