 #include <stdio.h>
 void main()
 {
	float A,r;
	clrscr();
	printf("\n Enter the radius of a circle: ");
	scanf("%f",&r);
	A=3.14*r*r;
	printf("\n Area = %0.3f ",A);
	getch();
 }