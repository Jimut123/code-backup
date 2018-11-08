	/*q14as1.c : Write a program to calculate
	p=1*2*3*....n */
	#include<stdio.h>
	//void main()
int main()
	{
//	long double p;
	int n,c,p;
	//clrscr();
	printf("\nEnter n :");
	scanf("%d",&n);
	p=1;
	for(c=1;c<=n;c=c+1)
	{
	p=p*c;
	}
	printf("\nRequired p:%d",p);	
	//printf("\nProduct of %d numbers=%19.0Lf\n",n,p);
	//getch();
	return 0;
	}
