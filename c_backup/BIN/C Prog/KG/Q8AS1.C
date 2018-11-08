	/*q8as1.c : Write a program to calculate exp(x) for
	x=.1,.2,.3,.....2.0 */
	#include<stdio.h>
	long double expx(float x);
	void main()
	{
	long double y;
	float x;

	int i;
	clrscr();
	for(i=1;i<=20;i++)
	{
	x=.1*i;
	y=expx(x);
	printf("exp(%5.1f)=%19.17Lf\n",x,y);
	}
	getch();
	}
	long double expx(float x)
	{
	long double ce,pe,eps,fact,xp;
	int n;
	ce=1;
	pe=0;
	eps=ce-pe;
	n=1;
	fact=1;
	xp=1;
	while(eps > 1e-16)
	{
	pe=ce;
	fact=fact*n;
	xp=xp*x;
	ce=ce+xp/fact;
	eps=ce-pe;
	n=n+1;
	}
	return ce;
	}


