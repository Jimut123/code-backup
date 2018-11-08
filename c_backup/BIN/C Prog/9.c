#include<stdio.h>
int main()
{
	int a,b,c;
	printf("\n Enter the Two numbers");
	scanf("%d %d", &a, &b);
	c=a>b?a:b;
	printf("\n Larger number is: %d ", c);
	return 0;
}
