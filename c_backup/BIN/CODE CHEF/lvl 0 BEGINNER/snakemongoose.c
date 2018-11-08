#include<stdio.h>
int count=0;
char stack[100];
int main()
{
int n,j,i,k=0,v=0,m=0,s=0,p;
char s1[100];
scanf("%d",&n);
for(i=1;i<=n;i++)
{
m=0;s=0;
scanf("%s",&s1);
for(j=0;s1[j]!='\0';j++)
{
if(s1[j]=='m'&&s1[j-1]=='s'&&k==0&&v==1)
{
s1[j-1]='*';
k=1;
v=0;
}
if(s1[j]=='m'&&s1[j+1]=='s'&&k==0&&v==1)
{
s1[j+1]='*';
v=0;
}

if(v==1)
v=0;
v++;
k=0;
}
m=0;s=0;
//printf("%s\n",s1);
for(j=0;s1[j]!='\0';j++)
{
if(s1[j]=='m')
m++;
if(s1[j]=='s')
s++;
}
//printf(" m = %d s = %d",m,s);
if(m>s)
stack[count++]='0';
if(s>m)
stack[count++]='1';
if(s==m)
stack[count++]='2';
m=0;s=0;
}
for(p=0;p<count;p++)
{
//printf("%c",stack[p]);
}
for(p=0;p<count;p++)
{
if(stack[p]=='0')
printf("mongooses\n");
if(stack[p]=='1')
printf("snakes\n");
if(stack[p]=='2')
printf("tie\n");
}
return 0;
}

