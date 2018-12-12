#include<stdio.h>
int main()
{
	int n,c,d,r;
	printf("\n Enter the no whose reverse is to be printed: ");
	scanf("%d",&n);
	c=n%10;
	d=n/10;
	r=10*c+d;
	printf("Reverse no of %d is %d \n",n,r);
}
