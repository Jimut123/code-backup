/*
Draw a triangle ABC.
Take refection along x-axis. Draw modified triangle.
*/

#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#define DELAY 10

void draw_rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4);
int dda(int x1, int y1, int x2, int y2, int x[], int y[]);
int round1(float x);

int main()
{
	int i, c_bg;
	int x1, y1, x2, y2, x3, y3, x4, y4;
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
	printf(" x4 = ");
	scanf("%d", &x4);
	printf(" y4 = ");
	scanf("%d", &y4);

	clrscr();
	initgraph(&gd, &gm, "C://TurboC3//BGI");

	/* To Draw X-Axis */
	for(i = 0; i < 640; i++)
	{
		putpixel(i, 240, 15);
		delay(DELAY);
	}

	/* To Draw Y-Axis */
	for(i = 0; i < 480; i++)
	{
		putpixel(329, i, 15);
		delay(DELAY);
	}

	/* To Display O(0,0), -X, +X, -Y, +Y */
	outtextxy(325, 245, "O(0,0)");
	outtextxy(20, 245, "-X");
	outtextxy(620, 245, "+X");
	outtextxy(325, 460, "-Y");
	outtextxy(325, 20, "+Y");

	draw_rectangle(x1, y1, x2, y2, x3, y3, x4, y4);

	getch();
	return 0;
}
