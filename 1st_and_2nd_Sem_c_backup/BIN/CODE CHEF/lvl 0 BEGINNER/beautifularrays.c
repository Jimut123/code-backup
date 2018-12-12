#include<stdio.h>
int a[200],c=0;
char stack[100];
int main()
{
int i,T,n,t,v=0,j,m;
scanf("%d",&T);
for(i=0;i<T;i++)
{
	scanf("%d",&n);
	for(j=0;j<n;j++)
	{
		scanf("%d",&a[j]);
	}		
	
	for(j=0;j<n;j++)
	{
		if(j+1<n)
		t=a[j]*a[j+1];
		//printf("%d\n",a[j]*a[j+1]);
		for(m=0;m<n;m++)
		if(t==a[m])
		v=1;

	}
	if(v==1)
	{
	stack[c++]='1';
	}
	else
	stack[c++]='0';
	v=0;
}
for(i=0;i<c;i++)
{
if(stack[i]=='1')
printf("yes\n");
else
printf("no\n");
}
return 0;
}
