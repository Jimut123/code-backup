#include<stdio.h>
int main()
{
	int a,b,c,s,area;
	printf("\n Enter length of three sides of Triangle: ");
	scanf("%d %d %d",&a,&b,&c);
	
	s=(a+b+c)/2;
	area=s*(s-a)*(s-b)*(s-c);
	
	printf("\n Square of area of a Trangle: %d ",area);
	return 0;
}
