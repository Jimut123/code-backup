/* Write a program to compute the average of three given numbers.*/

#include <stdio.h>
int main()
{
	int n1,n2,n3;
	float avg;
	printf("\n\t ENTER THREE NUMBERS: " );
	scanf("%d %d %d",&n1,&n2,&n3);
	avg=(n1+n2+n3)/3.0;
	printf("\n \t THE AVG IS AS FOLLOWS:");
	printf("\n\t AVERAGE: %0.2f",avg);
	return 0;
}
