/* Find out the highest number from three given numbers. */

#include <stdio.h>
main()
{
	int a,b,c,h;
	clrscr();
	printf("\nENTER THREE NUMBERS:\n");
	scanf("%d %d %d",&a,&b,&c);
	h=a;
	if(b>h)
		h=b;
	if(c>h)
		h=c;
	printf("\nHIGHEST NUMBER IS %d",h);
	getch();
}