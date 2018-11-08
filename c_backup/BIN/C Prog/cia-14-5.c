#include<stdio.h>
main()
{
	int i=1,j;
	printf("\n %d %d %d %d %d",++i,i++,++i,++i,i++);
	j=i;
	printf("\n %d %d",++j,j++);
	getch();
}   
