#include<stdio.h>
int main()
{
	int i,j,sum=0,sub,mul=1;
	float div;
	printf("\nEnter Two Numbers:");
	scanf("%d %d",&i,&j);
	sum=i+j;
	sub=i-j;
	mul=i*j;
	div=i/(float)j;
	printf("\nSum=%d",sum);
	printf("\nSub=%d",sub);
	printf("\nMul=%d",mul);
	printf("\nDiv=%f",div);
	return 0;
}
