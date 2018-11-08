#include<stdio.h>
void main()
{
char s1[50],ch1,ch2;
char s2[50];
char s3[60];
int i,k=0,j,max,min,l1,d=0,l2,c=0;
clrscr();
printf("Enter two numbers::\n ");
gets(s1);
printf(" ");
gets(s2);
l1=strlen(s1);
l2=strlen(s2);
if(l1>=l2)
{
max=l1;
min=l2;
}
else
{
max=l2;
min=l1;
}
for(i=l1-1,j=l2-1;i>=0,j>=0;i--,j--)
{
//printf("%c ",s2[j]);
ch1=s1[i];
ch2=s2[j];
k=(int)ch1-48+(int)ch2-48+d;
if(k>9)
{
if(k==10)
{
s3[c++]=(char)k-10+48;
k=k/10;
}
else if(k>10)
{
s3[c++]=(char)k-10+48;
k=k/10;
}
if(k==0)
d=0;
else if(k==1)
d=k;
}
else if(k<=9)
{
s3[c++]=(char)k+48;
d=0;
}
}
for(i=max-min-1;i>=0;i--)
{
ch1=s1[i];
k=(int)ch1-48+d;
if(k>9)
{
if(k==10)
{
s3[c++]=(char)k-10+48;
k=k/10;
}
else if(k>10)
{
s3[c++]=(char)k-10+48;
k=k/10;
}
if(k==0)
d=0;
else if(k==1)
d=k;
}
else if(k<=9)
{
s3[c++]=(char)k+48;
d=0;
}
}
printf("\n----------------------------------------------------------\n");
if(d==1)
printf("1");
for(i=c-1;i>=0;i--)
{
if(s3[i]==':')
printf("9");
else
printf("%c",s3[i]);
}
getch();
}