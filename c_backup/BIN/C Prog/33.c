/* Program to print powers of 2 */
#include<stdio.h>
int main()
{
	int i=1, power=1;
	while(++i<=10)
		printf("%d",power*=2);
		printf("\n");
	return 0;
}
