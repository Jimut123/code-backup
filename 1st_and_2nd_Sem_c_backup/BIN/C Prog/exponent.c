#include<stdio.h>
int main()

{
	int x,n,c=1;
 	
	printf("Enter The Given no: ");
	scanf("%d",&x);
    printf("Enter The value of Exponent: ");
	scanf("%d",&n);
	while(n!=0)
	{
		c*=x;
		--n;
	}
	
	printf("The result of x^n is %d",c);
	
	return 0;
	
}
