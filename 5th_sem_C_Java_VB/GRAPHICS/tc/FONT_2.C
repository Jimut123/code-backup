	/*font_2.c : Write a program to test different fonts in Vertical
	direction */
	#include<stdio.h>
	#include<graphics.h>
	void main()
	{
	char a[80];
	int font,size,y;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c://tc//BGI");
	size=2;
	y=10;

		for(font=0;font<=9;font++)
		{
		settextstyle(font,VERT_DIR,size);
		sprintf(a,"font=%d size=%d HELLO",font,size);
		outtextxy(y,20,a);
		y=y+20;
		}
	getch();
	closegraph();
	}
