#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int c_bgcolor,c_line;
void draw_xy();
int round1(float x)
{
	int x1=x,s=0;
	float t=x;
	if(x<0)
		s=1;
	t=t-x1;
	if(t<0.5)
		return x1;
	else if(t>=0.5&&s)
		  return x1-1;
	return x1+1;
}
void line_draw(int x1,int y1,int x2,int y2,int c);
int dda(int x1,int y1,int x2,int y2,int x[],int y[]);
int main()
{
	int x1,y1,x2,y2,x,y,dx,dy;
	float delx,dely;
	printf("\nEnter x coord of 1st pt:");
	scanf("%d",&x1);
	printf("\nEnter y coord of 1st pt:");
	scanf("%d",&y1);
	printf("\nEnter x coord of 2nd pt:");
	scanf("%d",&x2);
	printf("\nEnter x coord of 2nd pt:");
	scanf("%d",&y2);
	printf("\nEnter bkgrnd color--:>");
	scanf("%d",&c_bgcolor);
	printf("\nEnter Line color:");
	scanf("%d",&c_line);
	draw_xy();
	line_draw(x1,y1,x2,y2,c_line);
	getch();
	return 0;
}
void draw_xy()
{
	int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	//setbkcolor(c_bgcolor);
	for(i=0;i<640;i++)
	{
		putpixel(i,240,15);
		delay(5);
	}
	for(i=0;i<480;i++)
	{
		putpixel(320,i,15);
		delay(5);
	}
	outtextxy(10,245,"-X");
	outtextxy(630,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"_Y");
}
void line_draw(int x1,int y1,int x2,int y2,int c)
{
	int x[700],y[700],i,n;
	n=dda(x1,y1,x2,y2,x,y);
	for(i=0;i<n;i++)
	{
		putpixel(320+x[i],240-y[i],c);
		delay(5);
	}
}
int dda(int x1,int y1,int x2,int y2,int x[],int y[])
{
	float delx,dely;
	int dx,dy,dx1,dy1,length,xx,yy,i;
	dx=x2-x2;
	dy=y2-y1;
	if(dx<0)
		dx1=-dx;
	else dx1=dx;
	if(dy<0)
		dy1=-dy;
	else dy1=dy;
	 if(dx1>dy1)
		length=dx1;
	 else length=dy1;

	delx=(float)dx/length;
	dely=(float)dy/length;


	xx=x1;
	yy=y1;
		for(i=0;i<length;i++)
		{
			x[i]=round1(xx);
			y[i]=round1(yy);
			xx=xx+delx;
			yy=yy+dely;
		}
		return length;
}