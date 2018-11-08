#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<graphics.h>
#include<C:\TURBOC3\BIN\PROJECT\C_Backup\GRAPHICS\JIMG\XY_axis.h>
// xyaxis() for calling the x-y axis drawing functions

//void enter_coordinates();
void draw_line(int x1, int y1, int x2, int y2, int c);
int round1(float x);
int dda(int x1, int y1, int x2, int y2, int x[], int y[]);
void draw_line(int x1, int y1, int x2, int y2, int c)
{
	int x[700], y[700], i,n;
	n = dda(x1,y1,x2,y2,x,y);
	for(i=0;i<n;i++)
	{
		putpixel(320+x[i],240-y[i],c);
		delay(10);
	}
}

int dda(int x1, int y1, int x2, int y2, int x[], int y[])
{
	int i,dx,dy,length;
	float delx,dely,x11,y11;
	dx = x2 - x1;
	dy = y2 - y1;
	dx = abs(dx);
	dy = abs(dy);
	length = dx>dy?dx:dy;
	delx = (float)dx/length;
	dely = (float )dy/length;
	x11 = x1;
	y11 = y1;
	for(i=0;i<length;i++)
	{
		x[i] = round1(x11);
		y[i] = round1(y11);
		x11+=delx;
		y11+=dely;
	}
	return length;
}

int round1(float x)
{
	float x_frac, x_pos;
	int x_int;
	if(x<0)
	{
		x_pos =  x*(-1);
		x_int = (int)x_pos;
		x_frac = x_pos - x_int;
		if(x_frac>0.5)
			return -(++x_pos);
		else
			return -x_pos;
	}
	else
	{
		x_pos = x;
		x_int = (int)x_pos;
		x_frac = x - x_int;
		if(x_frac>0.5)
		{
			return ++x_pos;
		}
		else
		{
			return x_pos;
		}
	}
}
/*
int main()
{
	int x1,x2,y1,y2,line_c;
	clrscr();
	xyaxis();

	printf("Enter x1 : ");
	scanf("%d",&x1);
	printf("Enter y1 : ");
	scanf("%d",&y1);
	printf("Enter x2 : ");
	scanf("%d",&x2);
	printf("Enter y2 : ");
	scanf("%d",&y2);
	printf("Enter the line colour : ");
	scanf("%d",&line_c);
	draw_line(x1,y1,x2,y2,line_c);
	getch();
	return 0;
}
*/