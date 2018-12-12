#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void draw_canvas();
void draw_board1(int,int);
void draw_board2(int,int);
void main()
{
	draw_canvas();
	draw_board1(40,90);  draw_board2(90,140); draw_board1(140,190);
	draw_board2(190,240); draw_board1(240,290); draw_board2(290,340); draw_board1(340,390);
	draw_board2(390,440);
	setcolor(1);
	outtextxy(220,445,"CHESS BOARD DESIGNED BY JIMUT");
	getch();
}
void draw_canvas()
{
	int i,j;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c:\\TurboC3\\BGI");
	setbkcolor(15);
	for(i=40;i<=440;i++) { putpixel(520,i,8); putpixel(120,i,8); }
	for(i=120;i<=520;i++){putpixel(i,40,8);putpixel(i,440,8);}
}
void draw_board1(int k,int m)
{
	int i,j;
	for(i=k;i<=m;i++)
	{
		for(j=170;j<=220;j++) putpixel(j,i,8);
		for(j=270;j<=320;j++) putpixel(j,i,8);
		for(j=370;j<=420;j++) putpixel(j,i,8);
		for(j=470;j<=520;j++) putpixel(j,i,8);
	}
}
void draw_board2(int k,int m)
{
	int i,j;
	for(i=k;i<=m;i++)
	{
		for(j=120;j<=170;j++) putpixel(j,i,8);
		for(j=220;j<=270;j++) putpixel(j,i,8);
		for(j=320;j<=370;j++) putpixel(j,i,8);
		for(j=420;j<=470;j++) putpixel(j,i,8);
	}
}