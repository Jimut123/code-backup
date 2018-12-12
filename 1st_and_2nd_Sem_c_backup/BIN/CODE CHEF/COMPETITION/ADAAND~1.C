#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
char  c[3000]={'\0'};
int stack[50]={0};
int main()
{
int count=0;
int i=0,n=0,j=0,co=0,j1=0,j2=0,l=0;
scanf("%d",&n);                //n = no. of test cases
for(i=1;i<=n;i++)
{
co=0;
j1=0;
j2=0;
l=0;
scanf("%s",c);
for(j=0;c[j]!='\0';j++)
{
if(c[j+1]!=c[j])
{
co++;
}
}
l=j;
for(j=0;c[j]!='\0';j+=2)
{

if(c[j]!=c[j+2]&&j+2<l)
{
j1=1;
}
if(j+3<=l)
if(c[j+1]!=c[j+3]&&j+3<=l)
{
j2=1;
}
}
if(j2==0&&j1==0)
{
stack[count++]=(co/2);
}
else if(co==2)
stack[count++]=1;
else
{
stack[count++]=(co-2);
}
}
for(i=0;i<count;i++)
{
printf("%d\n",stack[i]);
}
return 0;
}
