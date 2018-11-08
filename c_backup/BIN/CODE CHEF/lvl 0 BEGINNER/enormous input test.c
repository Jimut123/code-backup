#include<stdio.h>
int main()
{
int n,k,i,f,c=0;
scanf("%d %d",&n,&k);
for(i=0;i<n;i++)
{
scanf("%d",&f);
if(f%k==0)
c++;
}
printf("%d",c);
return 0;
}
