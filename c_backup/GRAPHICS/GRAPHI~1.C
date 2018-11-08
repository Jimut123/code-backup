#include<stdio.h>
#include<graphics.h>
int main()
{
	int i,c;
	int gd=DETECT,gm;
	//clrscr();
	printf("\nEnter backgrnd color:");
	scanf("%d",&c);
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	setbkcolor(c);
	for(i=0;i<640;i++)
	{
		putpixel(i,240,15);
		delay(5);
	}
	for(i=0;i<480;i++)
	{
		putpixel(320,i,15);
		delay(5);
	}
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"_Y");
	//getch();
	return 0;
}
