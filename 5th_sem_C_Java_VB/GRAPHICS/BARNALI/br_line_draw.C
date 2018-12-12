//brasenham line draw algo

#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int c_bgcolor,c_line;
void draw_xy();
int round1(float x);
void line_draw(int x1, int y1, int x2, int x3);
int brhl(int x1, int y1, int x2, int y2,int x[], int y[]);
int main()
{
	int x1,y1,x2,y2;
	char a[50];
	printf("\nEnter x coordinate of point %d ",1);
		scanf("%d",&x1);
		printf("\nEnter y coordinate of point %d ",1);
		scanf("%d",&y1);
		printf("\nEnter x coordinate of point %d ",2);
		scanf("%d",&x2);
		printf("\nEnter y coordinate of point %d ",2);
		scanf("%d",&y2);
	printf("\nEnter background color(2-14) ");
	scanf("%d",&c_bgcolor);
	printf("\nEnter line color(1 or 15) ");
	scanf("%d",&c_line);
	draw_xy();
	line_draw(x1,y1,x2,y2);
	sprintf(a,"(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,a);
	sprintf(a,"(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,a);
	getch();
	return 0;
}
void draw_xy()
{
	int i;
	int gd=DETECT, gm;
	initgraph(&gd,&gm,"c://turboc3//bgi");
	setbkcolor(c_bgcolor);
	//to draw the axes
		for(i=0;i<640;i++)
		{
			putpixel(i,240,c_line);
			delay(2);
		}
		for(i=0;i<480;i++)
		{
			putpixel(320,i,c_line);
			delay(2);
		}
	//to display -X,+X,-Y,+Y,O(0,0)
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
}
void line_draw(int x1, int y1, int x2, int y2)
{
	int x[700], y[700], i,n;
	n=brhl(x1,y1,x2,y2,x,y);//to generate n pixel coordinates
	//to plot all points
		for(i=0;i<n;i++)
		{
			putpixel(320+x[i],240-y[i],c_line);
			delay(2);
		}
}
int brhl(int x1, int y1, int x2, int y2,int xx[], int yy[])
{
	int dx, dy, s1, s2, interchange, t, e, x, y, i;
	dx=abs(x2-x1);
	dy=abs(y2-y1);
	if((x2-x1)<0)
		s1=-1;
	else if((x2-x1)>0)
		s1=1;
	else
		s1=0;
	if((y2-y1)<0)
		s2=-1;
	else if((y2-y1)>0)
		s2=1;
	else
		s2=0;
	if(dy>dx)
	{
		t=dy;
		dy=dx;
		dx=t;
		interchange=1;
	}
	else
		interchange=0;
	e=2*dy-dx;
	x=x1;
	y=y1;
	for(i=0;i<=dx;i++)
	{
		xx[i]=x;
		yy[i]=y;
		while(e>=0)
		{
			if(interchange==1)
				x=x+s1;
			else
				y=y+s2;
			e=e-2*dx;
		}
		if(interchange==1)
			y=y+s2;
		else
			x=x+s1;
		e=e+2*dy;
	}
	return i;
}