#include<stdio.h>
int main()
{
	float s,a,b,c,area;
	printf("Enter  a,b,c: ");
	scanf("%f %f %f",&a,&b,&c);
	
	s=(a+b+c)/2;
	area=s*(s-a)*(s-b)*(s-c);
	area=area*area;
	
	printf("Square of area of Triangle: %0.2f ",area);
	return 0;
}
