#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
int color_one = 1;
//int x_co[200];
//int y_co[200];
void draw_xy();

void dda(int x1,int y1, int x2, int y2, int col);
void enter_line_coord();
int round1(float x);
int main()
{
	//draw_xy();
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
	dda(x1,y1,x2,y2,l_col);
}

void dda(int x1,int y1, int x2, int y2, int col)
{
	int dx, dy,x_l,y_l,iter=0;
	float delx,dely,x=0,y=0,length;
	int gd=DETECT, gm;
	initgraph(&gd, &gm, "C://TurboC3//BGI");
	setbkcolor(3);
	dx = x2-x1;
	dy = y2-y1;
	printf("dx = %d",dx);
	printf("dy = %d",dy);
	if(abs(dx)>=abs(dy))
		length = abs(dx);
	else
		length = abs(dy);
	printf("length : %f\n",length);
	delx = (float)dx/length;
	dely = (float)dy/length;
	printf("delx : %f\n",delx);
	printf("dely : %f",dely);
	while(iter<=length)
	{
		x+=delx;
		y+=dely;
		x_l = round1(x);
		y_l = round1(y);
		//printf("%d %d",x_l,y_l);
		// to print the line
		putpixel(320+x1+x_l,240+y1-y_l,col);
		iter++;
	}
}
int round1(float x)
{
	float frac;
	int val;
	val =  (int)x;
	frac =abs(x) - abs(val);
	if(x<0)
	{
		if(frac>0.5)
		{
			return val;
		}
		else
			return (val-1);
	}
	else
		if(frac>0.5)
			return (val+1);
		else
			return val;
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

