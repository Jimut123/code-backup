	/*q15as1.c : Write a program to calculate
	s=1-2+3-4....n */
	#include<stdio.h>
	void main()
	{
	int s,sf;
	int n,c;
	clrscr();
	printf("\nEnter n :");
	scanf("%d",&n);
	s=0;
	sf=1;
	for(c=1;c<=n;c=c+1)
	{
	s=s+sf*c;
	sf=-sf;
	}
	printf("\nSum of %d numbers=%d\n",n,s);
	getch();
	}



