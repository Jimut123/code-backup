#include<stdio.h>
void main()
{
char s1[50],ch1,ch2;
char s2[50];
char s3[60];
int i,k=0,j,max,min,l1,d=0,l2,c=0;
clrscr();
printf("Enter two numbers::");
gets(s1);
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
printf("ch1 = %c ch2 = %c\n",ch1,ch2);
k=(int)ch1-48+(int)ch2-48+d;
printf("s3[c++] = %c  c = %d d = %d",s3[c],c,d);
if(k>9)
{
if(k==10)
{
s3[c++]=(char)k-10+48+d;
printf("s3[c++] = %c  c = %d d = %d",s3[c],c,d);
printf("k =%d d = %d",k,d);
k=k-10;

}
else if(k>10)
{
s3[c++]=(char)k-10+48+d;
printf("s3[c++] = %c  c = %d d = %d",s3[c],c,d);
printf("k =%d d = %d",k,d);
k=k-10;
}

if(k==0)
d=k+1;
else
d=k;
}
else
{
s3[c++]=(char)k+48+d;
printf("s3[c++] = %c  c = %d d = %d",s3[c],c,d);
d=0;
}
}
printf("---d = %d",d);

for(i=max-min-1;i>=0;i--)
{
ch1=s1[i];

k=(int)ch1-48+d;
printf("s3[c++] = %c  c = %d d = %d",s3[c],c,d);
printf("k =%d \n",k);
if(k>9)
{
if(k==10)
{
s3[c++]=(char)k-10+48+d;
printf("s3[c++] = %c  c = %d d = %d",s3[c],c,d);
k=k-10;
}
else if(k>10)
{
s3[c++]=(char)k-10+48+d;
printf("s3[c++] = %c  c = %d d = %d",s3[c],c,d);
k=k-10;
}
printf("k =%d \n",k);
if(k==0)
d=k+1;
else
d=k;
}
else
{

s3[c++]=(char)k+48+d;

d=0;
}
}
printf("%c",d);
for(i=c-1;i>=0;i--)
printf(" %c",s3[i]);
getch();
}