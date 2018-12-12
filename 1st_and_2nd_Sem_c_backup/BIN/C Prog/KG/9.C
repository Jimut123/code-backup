/* Find out the lowest number from three given numbers.*/

#include <stdio.h>
main()
{
	int a,b,c,l;
	clrscr();
	printf("\nENTER THREE NUMBERS:\n");
	scanf("%d %d %d",&a,&b,&c);
	l=a;
	if(b<l)
		l=b;
	if(c<l)
		l=c;
	printf("\nLOWEST NUMBER IS %d",l);
	getch();
}

				/* Alternative Method */
/* #include <stdio.h>
main()
{
int a,b,c;
clrscr();
printf("\nENTER THREE NUMBERS:\n");
scanf("%d %d %d",&a,&b,&c);
if(a<b && a<c)
printf("\nLOWEST NUMBER IS %d",a);
if(b<c && b<a)
printf("\nLOWEST NUMBER IS %d",b);
if(c<a && c<b)
printf("\nLOWEST NUMBER IS %d",c);
getch();
}*/