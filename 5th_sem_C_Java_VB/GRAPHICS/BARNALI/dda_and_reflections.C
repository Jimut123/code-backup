//dda algo
#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int c_bgcolor,c_line;
void draw_xy();
int round1(float x);
void line_draw(int x1,int y1, int x2, int y2);
int dda(int x1, int y1, int x2, int y2, int x[], int y[]);
void shape_draw(int x[], int y[], int n);
void reflection_x(int x[], int y[], int n);
void reflection_y(int x[], int y[], int n);
void reflection_yx(int x[], int y[], int n);
void reflection_ynegx(int x[], int y[], int n);
int main()
{
	int x[10],y[10],i,n;
	char a[80];
	clrscr();
	printf("\nEnter the number of points ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("\nEnter x coordinate of point %d ",i+1);
		scanf("%d",&x[i]);
		printf("\nEnter y coordinate of point %d ",i+1);
		scanf("%d",&y[i]);
	}
	printf("\nEnter background color(2-14) ");
	scanf("%d",&c_bgcolor);
	printf("\nEnter line color(1 or 15) ");
	scanf("%d",&c_line);
	draw_xy();
	line_draw(-300,-300,300,300);
	line_draw(-300,300,300,-300);
	shape_draw(x,y,n);
	reflection_x(x,y,n);
	reflection_y(x,y,n);
	reflection_yx(x,y,n);
	reflection_ynegx(x,y,n);
	for(i=0;i<n;i++)
	{
	sprintf(a,"%d(%d,%d)",i+1,x[i],y[i]);
	outtextxy(320+x[i],240-y[i],a);
	}
	getch();
	return 0;
}
void shape_draw(int x[], int y[], int n)
{
	int i;
	for(i=0;i<n-1;i++)
	{
		line_draw(x[i],y[i],x[i+1],y[i+1]);
	}
	line_draw(x[i],y[i],x[0],y[0]);
}
void reflection_x(int x[], int y[], int n)
{
	int i;
	for(i=0;i<n-1;i++)
	{
		line_draw(x[i],-y[i],x[i+1],-y[i+1]);
	}
	line_draw(x[i],-y[i],x[0],-y[0]);
}
void reflection_y(int x[], int y[], int n)
{
	int i;
	for(i=0;i<n-1;i++)
	{
		line_draw(-x[i],y[i],-x[i+1],y[i+1]);
	}
	line_draw(-x[i],y[i],-x[0],y[0]);
}
void reflection_yx(int x[], int y[], int n)
{
	int i;
	for(i=0;i<n-1;i++)
	{
		line_draw(y[i],x[i],y[i+1],x[i+1]);
	}
	line_draw(y[i],x[i],y[0],x[0]);
}
void reflection_ynegx(int x[], int y[], int n)
{
	int i;
	for(i=0;i<n-1;i++)
	{
		line_draw(-y[i],-x[i],-y[i+1],-x[i+1]);
	}
	line_draw(-y[i],-x[i],-y[0],-x[0]);
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
//draw line
void line_draw(int  x1, int y1, int  x2, int  y2)
{
	int x[700], y[700], i,n;
	n=dda(x1,y1,x2,y2,x,y);//to generate n pixel coordinates
	//to plot all points
		for(i=0;i<n;i++)
		{
			putpixel(320+x[i],240-y[i],c_line);
			delay(2);
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
	x1=(int)x;//to get whole value
	ix=x-x1;
	if(ix>.5)
	x1++;
	if(flag==1)
	return -x1;
	else
	return x1;
}
