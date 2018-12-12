#include<stdio.h>
void main()
{
	float x1,x2,y1,y2,c,m;
	
	printf("\nEnter x1,x2:");
	scanf("%f %f",&x1,&x2);
	printf("\nEnter y1,y2:");
	scanf("%f %f",&y1,&y2);
	m=(y2-y1)/(x2-x1);
	c=y1-m*x1;

	printf("\n Required Equation Of the Straight Line is y=%0.2fx+%0.2f ",m,c);
	getch();
	
}
