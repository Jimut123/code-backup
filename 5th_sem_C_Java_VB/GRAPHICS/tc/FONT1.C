	/*font_1.c : Write a program to test different fonts */
	#include<stdio.h>
	#include<graphics.h>
	void main()
	{
	char a[80];
	int font,size,y;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c://tc//BGI");
	size=4;
	y=10;

		for(font=0;font<=4;font++)
		{
		settextstyle(font,HORIZ_DIR,size);
		sprintf(a,"font=%d size=%d HELLO",font,size);
		outtextxy(20,y,a);
		y=y+10;
		}
	getch();
	closegraph();
	}
