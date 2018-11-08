	/* angraph1.c : Write a program to display characters
	in different fonts. */
	#include<stdio.h>
	#include<graphics.h>
	void main()
	{
	char a[80];
	int gd=DETECT,gm;
	int i,font;
	initgraph(&gd,&gm,"c://tc//bgi");
	i=20;
		for(font=0;font<=6;font++){
		settextstyle(font,VERT_DIR,8);
		sprintf(a,"font=%d Hello",font);
		outtextxy(i,10,a);
		i=i+60;
		}
	getch();
	closegraph();
	}