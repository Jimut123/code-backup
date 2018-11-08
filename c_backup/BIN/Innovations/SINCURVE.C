#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<math.h>
void main()
{
int i,d=0,d1=0,j,k;
clrscr();
for(i=0;i<900;i++)
{


d=(int)(30*sin(3.14*i/180));
	if(d>0)
	{
	if(i%9==0)
	for(k=0;k<35;k++)
	printf(" ");
	if(i%9==0)
	{
		for(j=0;j<=d;j++)
		printf(">");

		printf("*");
		printf("\n");
		d1=d;
	}
	}
	if(d<0)
	{
	d1=abs(d);
		if(i%9==0)
		for(j=35-d1;j>=0;j--)
		printf(" ");
		if(i%9==0)
		{
		for(j=d1;j>=0;j--)
		printf(">");

		printf("*");
		printf("\n");
		}

	}
	delay(10);

}
//printf("%lf",d);
getch();
}