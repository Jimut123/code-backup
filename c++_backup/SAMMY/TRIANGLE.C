#include <stdio.h> <math.h>
void main()
{
	float x1,x2,x3,y1,y2,y3,d1,d2,d3;
	clrscr();
	printf("\n Enter x and y co-ordinate of point 1 of a triangle: ");
	scanf("%f %f",&x1,&y1);
	printf("\n Enter x and y co-ordinate of point 2 of a triangle: ");
	scanf("%f %f",&x2,&y2);
	printf("\n Enter x and y co-ordinate of point 3 of a triangle: ");
	scanf("%f %f",&x3,&x3);
	d1=sqrt(pow((x1-x2),2.0)+pow((y1-y2),2.0));
	d2=sqrt(pow((x3-x2),2.0)+pow((y3-y2),2.0));
	d3=sqrt(pow((x1-x3),2.0)+pow((y1-y3),2.0));
	if(d1==d2 && d2==d3)
	printf("\n Equilateral triangle");
	else if(d1!=d2 && d2!=d3 && d3!=d1)
	printf("\n Scalene triangle");
	else
	printf("\n Isosceles triangle");
	getch();
}