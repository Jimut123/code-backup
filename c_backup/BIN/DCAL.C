#include<stdio.h>
void main()
{
int n,k,c=0,i;
clrscr();
scanf("%d",&n);
k=n;
while(k>1)
{
if(k%3==0)
{
c++;
k=k/3;
printf("%d\t",k);
}
else if(k%2==0)
{
c++;
k=k/2;
printf("%d\t",k);
}
else if(k>1)
{
k=k-1;
c++;
printf("%d\t",k);
}
}
printf("c = %d",c);
getch();
}
