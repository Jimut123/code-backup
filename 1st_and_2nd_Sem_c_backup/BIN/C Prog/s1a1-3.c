/* Generating Fibonacci series upto Nnumbers */
#include<stdio.h>
void main()
{
	int c,a,b,n,i;
	a=0;
	b=1;
	printf("\n Enter the number range:");
	scanf("%d",&n);
	printf("\n The series is:");
	scanf("%d\t%d",a,b);
	for(i=0;i<n;i++)
	{
		c=a+b;
		a=b;
		b=c;
		printf("\t\n",c);
	}
	getch();
}
