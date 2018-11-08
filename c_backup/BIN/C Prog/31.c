/* Finding Square Root of a number */
#include<stdio.h>
int main()
{
	int n=36,c=0,i=1;
	while(n)
		{
			n=n-i;
			c++;
			i+=2;
		}
	printf("Square Root: %d",c);
	return 0;
}
