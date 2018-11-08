#include<stdio.h>
void main()
{
char s[50],ch,s1[50];
int l,i,c=0,d=0;
clrscr();
printf("Enter a String ::");
gets(s);
l=strlen(s);
for(i=0;i<l;i++)
{
ch=s[i];
if(ch!=' ')
{
if(d>=1)
{
s1[c++]=' ';
}
d=0;
s1[c++]=ch;
}
if(ch==' ')
{
d++;
}
}
d=0;
for(i=0;i<c;i++)
{
if(s1[i]== ' ')
d++;
}
printf("No. of words = %d",(d+1));
getch();
}