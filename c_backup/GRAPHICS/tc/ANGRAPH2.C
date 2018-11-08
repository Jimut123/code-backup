	/* angraph2.c : Write a program to display characters
	in different fonts. */
	#include<stdio.h>
	#include<graphics.h>
	void main()
	{
	char a[80];
	int gd=DETECT,gm;
	int i,j,font;
	initgraph(&gd,&gm,"c://tc//bgi");
	i=20;
	j=3;
		for(font=0;font<=5;font++){
		settextstyle(font,HORIZ_DIR,j);
		sprintf(a,"font=%d Size=%d Hello",font,j);
		outtextxy(10,i,a);
		i=i+60;
		}
	getch();
	closegraph();
	}