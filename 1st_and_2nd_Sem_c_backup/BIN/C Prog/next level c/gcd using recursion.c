#include<stdio.h>
int gcd(int,int);
int main()
{
	int i,j;
	printf("\n Enter the numbers: ");
	scanf("%d %d",&i,&j);
	printf("\n The gcd of %d and %d is %d",i,j,gcd(i,j));
	return 0;
}

int gcd(int a,int b)
{
	int remainder;
	remainder=a%b;
	if(remainder==0)
		return b;
	else 
		return gcd(b,remainder);
	return
	 0;
}
