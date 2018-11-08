	/*angraph3.c: Write a program to test different line styles*/
	#include<stdio.h>
	#include<graphics.h>
	void main()
	{
	int gd=DETECT,gm;
	int l_s,pat,thick;
	int i;
	clrscr();
	initgraph(&gd,&gm,"c://tc//BGI");
	setbkcolor(6);
	setlinestyle(3,0,2`);
		for(i=0;i<640;i++){
		putpixel(i,240,15);
		delay(2500);
		}
	getch();
	}

