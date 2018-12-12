/*	Alternative Method	*/
/*  Write a program to check a given number is prime or not.  */

#include <stdio.h>
main()
{
	int n,i,flag=0;
	clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{	flag=1;
			break;
		}
	}
	if(flag==0)
		printf("\n%d IS A PRIME NUMBER",n);
	else
		printf("\n%d IS NOT A PRIME NUMBER",n);
	getch();
}