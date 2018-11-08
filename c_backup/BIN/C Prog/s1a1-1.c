/* to calculate the area of a circle,given the radius as an input */
#include<stdio.h>
int main()
{
	int r;
	float area;
	printf("\n Enter the radius:");
	scanf("%d",&r);
	area=r*r*3.14;
	printf("\n Area of the circle: %d",area);
	return 0;
}
