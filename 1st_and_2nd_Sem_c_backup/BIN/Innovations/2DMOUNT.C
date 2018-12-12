#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<time.h>
void prin(int);
int main()
{
int i,j,k;
for(i=0;i<10;i++)
{
k=random(30);
prin(k);
/*for(j=0;j<k;j++)
printf("*"); */
//printf("\n");
}
return 0;
}
void prin(int n)
{
int i,j;
for(i=1;i<n;i++)
{
if(i%3==0)
{
for(j=1;j<i;j++)
printf("*");
printf("\n");
}
}
for(i=n;i>=1;i--)
{
if(i%3==0)
{
for(j=i;j>=1;j--)
printf("*");
printf("\n");
}
}
}