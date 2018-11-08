#include<stdio.h>
void showbits(int);
int main()
{
	int i=5225,j,k;
	
	printf("Decimal %d is same as binary",i);
	showbits(i);
	
	for(j=0;j<=5;j++)
	{
		k=i>>j;
		printf("%d right shift %d gives",i,j);
		showbits(k);
	}
	return 0;
}
