#include<stdio.h>
char s[100],s1[100];
int m=0,k=0,C=0,E=0,S=0;
void pushC();
void pushE();
void pushS();

int main()
{
int n;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
scanf("%s",&s1)
for(j=0;s1[j]!='\0';j++)
{
s[m++]=s1;
}
s[m++]='*';
}
for(i=0;i<m;i++)
{
if(s[i]=='C')
pushC();
if(s[i]=='E')
pushE();
if(s[i]=='S')
pushC(S);
if(s[i]=='*')
{
if(S!=0&&C==0&&E==0)
printf("no");
if(S!=0&&E!=0&&C==0)
printf("no");
if(S!=0&&C==0&&E==0)
printf("no");)
C=0;
E=0;
S=0;
}
}
return 0;
}
void pushC()
{
C++;
}
void pushE()
{
E++;
}
void pushS()
{
S++;
}
