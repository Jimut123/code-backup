/*#include <stdio.h>
int main()
{
	int digit;
	unsigned long num,sum=0;
	printf("\nENTER A NUMBER: ");
	scanf("%lu",&num);
	do
	{
		digit=num%10;
		num=num/10;
		sum=sum+digit;
	}
	while(num!=0);
	printf("\nSUM OF THE DIGITS IS %lu",sum);
	getch();
}*/
#include <stdio.h>
main()
{
	unsigned long num,rev;
	printf("\nENTER A NUMBER: ");
	scanf("%lu",&num);
	printf("\nTHE REVERSE OF THE NUMBER %lu IS ",num);
	do
	{
		rev=num%10;
		num=num/10;
		printf("%lu",rev);
	}
	while(num!=0);
}

