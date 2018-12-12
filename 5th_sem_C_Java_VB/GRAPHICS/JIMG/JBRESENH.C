#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void bres(int x1, int y1, int x2, int y2);
void enter_line_coord();
void draw_xy();
int color_one = 1;
int main()
{
	enter_line_coord();
	draw_xy();
	getch();
	return 0;
}

void enter_line_coord()
{
	int x1,x2,y1,y2;
	int l_col;
	printf("\n Enter a color for the line : ");
	scanf("%d",&l_col);
	printf("\n Enter x1 : ");
	scanf("%d",&x1);
	printf("\n Enter y1 : ");
	scanf("%d",&y1);
	printf("\n Enter x2 : ");
	scanf("%d",&x2);
	printf("\n Enter y2 : ");
	scanf("%d",&y2);
	bres(x1,y1,x2,y2);
}

void bres(int x1, int y1, int x2, int y2)
{
	int dx,dy,s1,s2,temp,interchange,x,y;
	int e,iter=0;
	int gd=DETECT, gm;
	initgraph(&gd, &gm, "C://TurboC3//BGI");
	setbkcolor(3);
	//initgraph();
	dx =abs(x2-x1);
	dy =abs(y2-y1);

	if((x2-x1)<=0)
		s1=-1;
	else
		s1=1;

	if((y2-y1)<=0)
		s2=-1;
	else
		s2=1;

	if(dy>=dx)
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
		putpixel(x+320,240-y,color_one);
		if(e>0)
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

void draw_xy()
{
	int i;
	// to draw the y-axis
	for(i=0;i<480;i++)
		putpixel(320,i,color_one);

	// to draw the x-axis
	for(i=0;i<640;i++)
		putpixel(i,240,color_one);
	outtextxy(320,240,"O(0,0)");
	outtextxy(380,180,"I");
	outtextxy(380,300,"IV");
	outtextxy(260,180,"II");
	outtextxy(260,300,"III");
}

