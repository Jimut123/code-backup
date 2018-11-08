#include<stdio.h>
void main()
{
	unsigned int p, t;
	float si, ci, r, i;
    clrscr();  
	printf("\n Enter Principal:");
	scanf("%d", &p);
	printf("\n Enter Time Period:");
	scanf("%d", &t);
	printf("\n Enter Rate Of Interest:");
	scanf("%d", &r);
	si=(p*t*r)/100;
	i=r/100;
	ci=p*pow((1+i),t);
	printf("\n SIMPLE INTEREST: %5.2f")
}
