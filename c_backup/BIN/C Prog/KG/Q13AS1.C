	/*q13as1.c : Write a program to calculate
	s=(n)+(n-2)+(n-4)+....*/
	#include<stdio.h>
//	void main()
int main()
	{
	int s;
	int n,c;
	//clrscr();
	printf("\nEnter n :");
	scanf("%d",&n);
	s=0;
	for(c=n;c>=1;c=c-2)
	{
	s=s+c;
	}
	printf("\nSum of %d numbers=%d\n",n,s);
//	getch(s);
	}

