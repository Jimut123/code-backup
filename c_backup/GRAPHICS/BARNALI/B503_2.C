#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int c_bgcolor,c_line;
void draw_xy();
int round1(float x);
void line_draw(int x1,int y1, int x2, int y2, int c);
int dda(int x1, int y1, int x2, int y2, int x[], int y[]);
int main()
{
	int x1,x2,y1,y2;
	clrscr();
	printf("\nEnter x coordinate of 1st point (x1)");
	scanf("%d",&x1);
	printf("\nEnter y coordinate of 1st point (y1)");
	scanf("%d",&y1);
	printf("\nEnter x coordinate of 2nd point (x2)");
	scanf("%d",&x2);
	printf("\nEnter y coordinate of 2nd point (y2)");
	scanf("%d",&y2);
	printf("\nEnter background color(2-14)");
	scanf("%d",&c_bgcolor);
	printf("\nEnter line color(1 or 15)");
	scanf("%d",&c_line);
	draw_xy();
	line_draw(x1,y1,x2,y2,c_line);
	getch();
	return 0;
}
//to draw x and y axes
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
			delay(10);
		}
		for(i=0;i<480;i++)
		{
			putpixel(320,i,c_line);
			delay(10);
		}
	//to display -X,+X,-Y,+Y,O(0,0)
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
}
//draw line
void line_draw(int  x1, int y1, int  x2, int  y2, int c)
{
	int x[700], y[700], i,n;
	n=dda(x1,y1,x2,y2,x,y);//to generate n pixel coordinates
	//to plot all points
		for(i=0;i<n;i++)
		{
			putpixel(320+x[i],240-y[i],c);
			delay(10);
		}
}
//dda algorithm
int dda(int x1, int y1, int x2, int y2, int x[], int y[])
{
	int dx,dy,dx1,i,dy1,n,length;
	float delx,dely;
	float xx,yy;
	dx=x2-x1;
	dy=y2-y1;
		if(dx<0)
		dx1=-dx;
		else
		dx1=dx;
		if(dy<0)
		dy1=-dy;
		else
		dy1=dy;
		if(dx1>dy1)
		length=dx1;
		else
		length=dy1;
	delx=(float)dx/length;
	dely=(float)dy/length;
	xx=x1;
	yy=y1;
		for(i=0;i<length;i++)
		{
			x[i]=round1(xx);
			y[i]=round1(yy);
			xx+=delx;
			yy+=dely;
		}
	return length;
}

int round1(float x)
{
	int x1,flag=0;
	float ix;
	if(x<0)
	{
		flag=1;
		x*=-1;
	}
	x1=(int)x;	//to get whole value
	ix=x-x1;
	if(ix>.5)
	x1++;
	if(flag==1)
	return -x1;
	else
	return x1;
}
		