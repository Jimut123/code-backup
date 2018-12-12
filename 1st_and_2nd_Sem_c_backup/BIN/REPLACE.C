#include<stdio.h>
void main()
{
char s[100],g[100],h[100],s1[100],s2[100];
int ls,lg,lh,i,v=0,c=0,j=0,k=0,p=0;
clrscr();
printf("Enter a String ::");
gets(s);
printf("Enter the word or part of the string to be replaced ::");
gets(g);
printf("By the string ::");
gets(h);
fflush(stdin);
ls=strlen(s);
lg=strlen(g);
lh=strlen(h);
for(i=0;i<ls;i++)
{
c=0;
if(g[c]!=s[i])
{
s1[k++]=s[i];
}
if(g[c]==s[i])
{
for(j=0;j<lg;j++)
{
if(s[i+j]==g[j++])
v=0;
if(s[i+j]!=g[j++])
{
v=1;
break;
}
}
if(v==0)
{
for(j=0;j<lg;j++)
{
s1[k++]='*';
i++;
}
i=i--;
}
if(v==1)
s1[k++]=s[i];
}
}
fflush(stdin);
k=0;
p=0;
for(i=0;i<ls;i++)
{
if(s1[i]!='*')
{
s2[k++]=s1[i];
p=0;
}
if(s1[i]=='*'&&p==0)
{
p=1;
for(j=0;j<lh;j++)
{
s2[k++]=h[j];
}
}
}
fflush(stdin);
//puts(s1);
puts(s2);
printf("\n");
//for(i=0;i<(strlen(s2));i++)
//printf(" %c",s2[i]);
getch();
}