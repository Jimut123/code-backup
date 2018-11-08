#include<stdio.h>
main()
{
	static int var=5;
	clrscr();
	printf("%d",var--);
	if(var)
		main();
	getch();
}