#include<stdio.h>
#include<conio.h>
int fun(int n);
int main()
{
	long int t,i,l;
	int a[100000];
	//	printf("Enter a number :");
	scanf("%d",&t);
	for(i=1;i<=t;i++)
	{
		scanf("%d",&a[i-1]);
	}
	for(i=1;i<=t;i++)
	{
		l=fun(a[i-1]);
		printf("%d\n",l);
	}
	return 0;
}
int fun(int n)
{
	int i=0,r=2,k,m,p,l=0;
	k=n;
	while(l==0)
	{ 
		loop:
			//printf("\t%d\t",n);
		if(pow(2,i)<=k)
		{
			m=k-pow(2,i);
			//printf("%d***\n",i);
			i++;
			goto loop;
		}
		p=k-pow(2,i);
		p=abs(p);
		if(p<=m)
		{
			return p;
		}
		else
			return m;
	}
	return -1;
}
