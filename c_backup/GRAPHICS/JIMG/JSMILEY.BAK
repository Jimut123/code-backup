#include<stdio.h>
#include<graphics.h>
#include<conio.h>

void calc_coord(int x,int y, int r);
void draw_circle_face();
void draw_circle_eye1();
void draw_circle_eye2();
void draw_circle_smile();
int points[100][2];
int count=0,fcol,scol,ncol;
int round1(float x);
void line_draw(int x1,int y1, int x2, int y2, int c);
int dda(int x1, int y1, int x2, int y2, int x[], int y[]);

int main()
{
	int gd=DETECT, gm;
	int c_bgcolor;
	printf("\n Enter the background color : ");
	scanf("%d",&c_bgcolor);
	printf("\n Enter the color of the face  : ");
	scanf("%d",&fcol);
	printf("\n Enter the color of the smile  : ");
	scanf("%d",&scol);
	printf("\n Enter the color of the nose  : ");
	scanf("%d",&ncol);
	initgraph(&gd,&gm,"c://turboc3//bgi");
	setbkcolor(c_bgcolor);
	// To draw the face
	calc_coord(0,90,90);
	draw_circle_face();
	count=0;
	calc_coord(0,10,10);
	draw_circle_eye1();
	count=0;
	calc_coord(0,10,10);
	draw_circle_eye2();
	count=0;
	calc_coord(0,50,50);
	draw_circle_smile();
	line_draw(0, 0, 0, 20, 6);
	line_draw(-50,-10, 50,-10, 7);
	getch();
	return 0;
}

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
	x1=(int)x;//to get whole value
	ix=x-x1;
	if(ix>.5)
	x1++;
	if(flag==1)
	return -x1;
	else
	return x1;
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
void calc_coord(int x,int y, int r)
{
	int x1=x,y1=y,del=0;
	float pk;
	points[count][0] = x1;
	points[count][1] = y1;
	count++;
	while(y1!=x)
	{
		del=(x1+1)*(x1+1)+(y1-1)*(y1-1)-r*r;
		if(del<0)
		{
			// then del is inside the circle
			pk = (x1+1)*(x1+1)+(y1-0.5)*(y1-0.5)-r*r;
			if(pk>0)
			{
				points[count][0] = x1+1;
				points[count][1] = y1-1;
			}
			else
			{
				points[count][0] = x1+1;
				points[count][1] = y1;
			}
		}
		else if(del>0)
		{
			// then del is outside the circle
			pk = (x1+0.5)*(x1+0.5)+(y1-1)*(y1-1)-r*r;
			if(pk>0)
			{
				points[count][0] = x1;
				points[count][1] = y1-1;
			}
			else
			{
				points[count][0] = x1+1;
				points[count][1] = y1-1;
			}
		}
		else
		{
			points[count][0] = x1+1;
			points[count][1] = y1-1;
		}
		x1 = points[count][0];
		y1 = points[count][1];
		count++;
	}
}
void draw_circle_face()
{
	int i;

	for(i=0;i<count;i++)
	{
		putpixel(320+points[i][0],240-points[i][1],fcol);
		putpixel(320+points[i][0],240+points[i][1],fcol);
		putpixel(320-points[i][0],240+points[i][1],fcol);
		putpixel(320-points[i][0],240-points[i][1],fcol);

	}
}
void draw_circle_eye1()
{
	int i;

	for(i=0;i<count;i++)
	{
		putpixel(380+points[i][0],220-points[i][1],fcol);
		putpixel(380+points[i][0],220+points[i][1],fcol);
		putpixel(380-points[i][0],220+points[i][1],fcol);
		putpixel(380-points[i][0],220-points[i][1],fcol);

	}
}
void draw_circle_eye2()
{
	int i;

	for(i=0;i<count;i++)
	{
		putpixel(260+points[i][0],220-points[i][1],fcol);
		putpixel(260+points[i][0],220+points[i][1],fcol);
		putpixel(260-points[i][0],220+points[i][1],fcol);
		putpixel(260-points[i][0],220-points[i][1],fcol);

	}
}
void draw_circle_smile()
{
	int i;

	for(i=0;i<count;i++)
	{
		//putpixel(260+points[i][0],220-points[i][1],fcol);
		putpixel(320+points[i][0],250+points[i][1],scol);
		putpixel(320-points[i][0],250+points[i][1],scol);
		//putpixel(260-points[i][0],220-points[i][1],fcol);

	}
}