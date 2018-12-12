	/*q12as1.c : Write a program to calculate
	s=1*1+2*2+3*3+....+n*n */
	#include<stdio.h>
	void main()
	{
	int s;
	int n,c;
	clrscr();
	printf("\nEnter n :");
	scanf("%d",&n);
	s=0;
	for(c=1;c<=n;c=c+1)
	{
	s=s+c*c;
	}
	printf("\nSum of %d numbers=%d\n",n,s);
	getch();
	}

