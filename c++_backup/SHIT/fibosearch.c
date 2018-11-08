#include"stdio.h"
int fib(int m);
int fibsearch(int a[],int,int,int,int,int);
void main()
{
	int n,a[100],i,key,loc,p,q,r,m,fk;
	//clrscr();
	printf("\n Enter number of term:");
	scanf("%d",&n);
	printf("\n Enter elements:");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("\n Enter searching element:");
	scanf("%d",&key);
	fk=fib(n+1);
	p=fib(fk);
	q=fib(p);
	r=fib(q);
	m=(n+1)-(p+q);
	if(key>a[p])
		p=p+m;
	loc=fibsearch(a,n,p,q,r,key);
	if(loc==0)
		printf("\n element not found....");
	else
        printf("\n %d element  found.... at location %d",key,loc); 
	//getch();
}
int fib(int m)
{
	int a,b,c;
	a=0;
	b=1;
	c=a+b;
	while(c<m)
	{
		a=b;
		b=c;
		c=a+b;
	}
	return b;
}
int fibsearch(int a[],int n,int p,int q, int r, int key)
{
	int t;
	if(p<1 || p>n)
		return 0;
	else
		if(key==a[p])
			return p;
		else
			if(key<a[p])
			{
				if(r==0)
					return 0;
				else
				{
					p=p-r;
					t=q;
					q=r;
					r=t-r;
				    return fibsearch(a,n,p,q,r,key);

				}
			}
			else
			{
				if(q==1)
					return 0;
				else
				{
					p=p+r;
					q=q-r;
					r=r-q;
					return fibsearch(a,n,p,q,r,key);

				}
			}
}
