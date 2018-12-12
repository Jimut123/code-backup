	/*font_3.c : Write a program to draw 2 axes using  fonts in Vertical
	direction */
	#include<stdio.h>
	#include<graphics.h>
	void draw_xy();
	void main()
	{
	char a[80];
	int font,size,y;
	draw_xy();
	getch();
	closegraph();
	}

	void draw_xy()
	{
	int gd=DETECT,gm;
	int i;
	initgraph(&gd,&gm,"c://tc//BGI");
	setbkcolor(6);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,15);
		delay(2500);
		}
	/* To darw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,15);
		delay(2500);
		}
	setcolor(1);
	settextstyle(1,0,3);
	outtextxy(10,245,"-X");
	outtextxy(610,245,"+X");
	outtextxy(325,245,"O(0,0)");
	settextstyle(1,1,3);
	outtextxy(325,10,"+Y");
	outtextxy(325,450,"-Y");

	}
