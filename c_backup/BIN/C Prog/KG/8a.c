		/* Alternative Method */
#include <stdio.h>
main()
{
	int a,b,c;
	clrscr();
	printf("\nENTER THREE NUMBERS:\n");
	scanf("%d %d %d",&a,&b,&c);
	if(a>b && a>c)
		printf("\nHIGHEST NUMBER IS %d",a);
	if(b>c && b>a)
		printf("\nHIGHEST NUMBER IS %d",b);
	if(c>a && c>b)
		printf("\nHIGHEST NUMBER IS %d",c);
	getch();
}