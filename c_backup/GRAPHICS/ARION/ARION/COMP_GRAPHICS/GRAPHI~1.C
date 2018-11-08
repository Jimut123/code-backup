#include<stdio.h>
#include<graphics.h>
#include<conio.h>
int main()
{
	int i,c,j;
	int gd=DETECT,gm;
	clrscr();
	printf("\nEnter backgrnd color:");
	scanf("%d",&c);
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	setbkcolor(c);
	for(i=0;i<640;i++)
	{
		for( j=0;j<240;j++)
		{
			putpixel(i,j,11);
			delay(5);
		}
		putpixel(i,240,15);
		delay(5);
		for(int j=480;j>240;j--)
		{
			putpixel(i,j,11);
			delay(5);
		}
	}
	for(i=0;i<480;i++)
	{
		for(j=0;j<320;j++)
		{
			putpixel(j,i,11);
			delay(5);
		}
		putpixel(320,i,15);
		delay(5);
		for(int j=639;j>320;j--)
		{
			putpixel(i,j,11);
			delay(5);
		}
	}
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"_Y");
	getch();
	return 0;
}