	/*q41as1.c : Write a program to calculate sum of digits
	in any positive integer number 'n', where n>=1 and n<=999999999 */
	#include<stdio.h>
	int sum_digit(long int);
//	void main()
	int main()
	{
	long int n;
	int s;
	char ch;
	do
	{
//	clrscr();
		while(1)
		{
		printf("\nEnter n(1-999999999) :");
		scanf("%ld",&n);
			if(n<1 || n>999999999)
			printf("\nInvalida number.\n");
			else
			break;
		}
	s=sum_digit(n);
	printf("Sum of digits in %ld=%d\n",n,s);
	printf("\nDo you want to continue(Y/N?):");
//	ch=getch();
	}while(ch=='y' || ch=='Y');
	}
	int sum_digit(long int n)
	{
	int s,d;
	s=0;
	while(n!=0)
	{
	d=n%10;
	s=s+d;
	n=n/10;
	}
	return s;
	}
