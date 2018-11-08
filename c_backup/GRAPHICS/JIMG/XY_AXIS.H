#include<stdio.h>
#include<graphics.h>
#include<conio.h>

void xyaxis()
{
	int i,c;
	int gd=DETECT, gm;
	clrscr();
	printf("\n Enter background colour:");
	scanf("%d",&c);
	initgraph(&gd,&gm,"c://turboc3//bgi");
	setbkcolor(c); //changing the background colour
	// Drawing x axis
	for(i=0;i<640;i++)
	{
		putpixel(i,240,12);
	}
	// Drawing y-axis
	for(i=0;i<480;i++)
	{
		putpixel(320,i,12);
	}
	outtextxy(0,230,"-X");
	outtextxy(620,235,"+X");
	outtextxy(325,5,"+Y");
	outtextxy(310,470,"-Y");
	outtextxy(325,245,"O(0,0)");
	//getch();
	//return 0;
}
/*
int main()
{
	xyaxis();
	getch();
	return 0;
} */