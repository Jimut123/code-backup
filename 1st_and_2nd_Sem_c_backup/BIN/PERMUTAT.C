#include<stdio.h>
void main()
{
long int i,l,j,k,c,s1[100],s2[100],f=1,g[100],q=0,v;
long int n1=0,n2=0,fact=1,m,n3,p=1,f1=0,d=0,m3;
char s[100];
clrscr();
printf("Enter a name ::");
gets(s);
l=strlen(s);
c=l-1;
for(i=0;i<l;i++)
{
s1[i]=i+1;
s2[c]=c+1;
f=1;
for(j=1;j<=s1[i];j++)
f=f*j;
fact= fact+f;
//printf("%d %d \n",s1[i],s2[c]);
n1=n1*10+s1[i];
n2=n2*10+s2[c];
//printf("%lu\n",n1);
c--;
}
fact--;
//printf("fact %lu\n---",fact);
//printf(" n1 %lu\n",n1);
//printf(" n2 %lu\n",n2);
//printf("===");
for(m=n1;m<=n2;m++)
{
n3=m;
//printf("%lu\n",n3);
q=0;
f1=0;
p=1;
while(n3!=0)
{
v=n3%10;
if(v!=0)
{
g[q++]=v;
for(i=1;i<=v;i++)
p=p*i;
f1=f1+p;
p=1;
}
n3=n3/10;
}
if(f1==fact)
{
m3=m;
//printf("%lu\n",m3);
d=0;

while(m3!=0)
{
v=m3%10;
d=d*10+v;
m3=m3/10;
}
//printf("**%lu\n",d);
while(d!=0)
{
v=d%10;
printf("%c",s[v-1]);
//small_delay();
d=d/10;
}
printf("\n");
//printf("%lu\n",n3);
}
}
getch();
}