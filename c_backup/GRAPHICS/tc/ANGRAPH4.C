	/*angraph4.c : Write a program to use imagesize() function. */
	#include<stdio.h>
	#include<graphics.h>
	void main()
	{
	int gd=DETECT,gm,byte;
	char a[100];
	initgraph(&gd,&gm,"");
	setbkcolor(6);
	circle(200,200,50);
	line(150,200,250,200);
	line(200,150,200,250);
	byte=imagesize(150,150,250,250);
	sprintf(a,"Number of Bytes required to store area=%d",byte);
	outtextxy(10,250,a);
	getch();
	closegraph();
	}

