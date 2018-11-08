/*
Program to input coordinates of 3 points A, B, C.
Draw a triangle ABC. Give caption to triangle.
*/

#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#define DELAY 10


void draw_triangle(int x1, int y1, int x2, int y2, int x3, int y3);
int dda(int x1, int y1, int x2, int y2, int x[], int y[]);
int round1(float x);

int main()
{
	int i, c_bg;
	int x1, y1, x2, y2, x3, y3;
	int gd = DETECT, gm;
	clrscr();


	/* Accepting the coordinates of the triangle */
	printf("\nCREATION OF TRIANGLE:");
	printf("\n x1 = ");
	scanf("%d", &x1);
	printf(" y1 = ");
	scanf("%d", &y1);
	printf(" x2 = ");
	scanf("%d", &x2);
	printf(" y2 = ");
	scanf("%d", &y2);
	printf(" x3 = ");
	scanf("%d", &x3);
	printf(" y3 = ");
	scanf("%d", &y3);

	clrscr();
	initgraph(&gd, &gm, "C://TurboC3//BGI");

	/* To Draw X-Axis */
	for(i = 0; i < 640; i++)
	{
		putpixel(i, 240, 15);
		delay(10);
	}

	/* To Draw Y-Axis */
	for(i = 0; i < 480; i++)
	{
		putpixel(329, i, 15);
		delay(10);
	}

	/* To Display O(0,0), -X, +X, -Y, +Y */
	outtextxy(325, 245, "O(0,0)");
	outtextxy(20, 245, "-X");
	outtextxy(620, 245, "+X");
	outtextxy(325, 460, "-Y");
	outtextxy(325, 20, "+Y");

	draw_triangle(x1, y1, x2, y2, x3, y3);

	getch();
	return 0;
}

/* Function to Draw a triangle */
void draw_triangle(int x1, int y1, int x2, int y2, int x3, int y3)
{
	int x[700], y[700], i, n, c_line;

	printf("\nEnter the colour of lines of the triangle () = ");
	scanf("%d", &c_line);

	/* AB */
	n = dda(x1, y1, x2, y2, x, y); // To generate points of line AB
	/* To plot Line AB */
	for(i = 0; i < n; i++)
	{
		putpixel((320 + x[i]), (240 - y[i]), c_line);
		delay(DELAY);
	}
	outtextxy((320 + x[0]), (240 - y[0]), "A");
	outtextxy((320 + x[n - 1]), (240 - y[n - 1]), "B");

	/* BC */
	n = dda(x2, y2, x3, y3, x, y); // To generate points of line BC
	/* To plot Line BC */
	for(i = 0; i < n; i++)
	{
		putpixel((320 + x[i]), (240 - y[i]), c_line);
		delay(DELAY);
	}
	outtextxy((320 + x[n - 1]), (240 - y[n - 1]), "C");

	/* CA */
	n = dda(x3, y3, x1, y1, x, y); // To generate points of line CA
	/* To plot Line CA */
	for(i = 0; i < n; i++)
	{
		putpixel((320 + x[i]), (240 - y[i]), c_line);
		delay(DELAY);
	}
}

/* Function to draw a line using DDA algo */
int dda(int x1, int y1, int x2, int y2, int x[], int y[])
{
	int dx, dy, dx1, dy1, length, i;
	float delx, dely, xx, yy;
	dx = x2 - x1; dy = y2 - y1;
	if(dx < 0)
		dx1 = -dx;
	else
		dx1 = dx;
	if(dy < 0)
		dy1 = -dy;
	else
		dy1 = dy;


	if(dx1 > dy1)
		length = dx1;
	else
		length = dy1;

	delx = (float)dx / length;
	dely = (float)dy / length;

	xx = x1; yy = y1;
	for(i = 0; i < length; i++)
	{
		x[i] = round1(xx);
		y[i] = round1(yy);
		xx += delx; yy += dely;
	}
	return length;
}

int round1(float x)
{
	int s1, xi;
	float frac;
	if(x < 0)
	{
		s1 = -1;
		x = -x;
	}
	else
	{
		s1 = +1;
	}
	xi = (int)x;
	frac = x - xi;
	if(frac >= 0.5)
		xi++;
	return (xi + s1);
}