#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void bres(int x1, int y1, int x2, int y2);
void enter_line_coord();
int color_one = 1;
int abs1(int);
void calc_coord(int x,int y, int r);
void draw_circle();
void print_coord();
int points[500][2];
int count=0;

int main()
{
	int x,y,r,col,gd = DETECT,gm;

	initgraph(&gd, &gm, "C://TurboC3//BGI");
	setbkcolor(3);
	bres(150,200,350,200);
	bres(150,200,150,350);
	bres(150,350,350,350);
	bres(350,200,350,350);

	// inner square
	bres(250,275,300,312);
	bres(250,275,250,275);
	bres(250,275,300,237);
	bres(300,312,300,237);

	// diagonal
	bres(150,200,250,275);
	bres(350,200,250,275);
	bres(350,350,250,275);
	bres(150,350,250,270);
	//print_coord();
	getch();
	return 0;
}



void bres(int x1, int y1, int x2, int y2)
{
	int dx,dy,s1,s2,temp,interchange,x,y;
	int e,iter=0;
	dx =abs(x2-x1);
	dy =abs(y2-y1);

	if((x2-x1)<0)
		s1=-1;
	else if((x2-x1)>0)
		s1=1;
	else s1=0;

	if((y2-y1)<0)
		s2=-1;
	else if((y2-y1)>0)
		s2=1;
	else s2=0;

	if(dy>dx)
	{
		temp = dy;
		dy = dx;
		dx = temp;
		interchange = 1;
	}
	else
		interchange = 0;
	e = 2*dy-dx;
	x=x1;
	y=y1;

	while(iter<=dx)
	{
		putpixel(x,y,color_one);
		delay(1);
		if(e>=0)
		{
			if(interchange==1)
				x+=s1;
			else
				y+=s2;
			e-=2*dx;
		}
		else
		{
			if(interchange == 1)
				y+=s2;
			else
				x+=s1;
			e+=2*dy;

		}
		iter++;
	}
}

