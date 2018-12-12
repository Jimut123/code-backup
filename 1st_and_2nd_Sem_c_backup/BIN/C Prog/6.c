#include<stdio.h>
#include<conio.h>
int main()
{  
	int n1, n2, total;
	float avg;	
	
	printf("\n\t ENTER TWO NUMBER");
	scanf("%d %d", &n1, &n2);
	avg=(n1+n2)/(float)2;
	total=n1+n2;
	
	printf("\n\t AVARAGE: %f", avg);
	printf("\n\t TOTAL: %d", total);
	getch();
}
