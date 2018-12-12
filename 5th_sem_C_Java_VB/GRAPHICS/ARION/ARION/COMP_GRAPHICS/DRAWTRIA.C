#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<math.h>
int c=15;
int dda(int x1,int y1,int x2,int y2,int x[],int y[]);
void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3)
{
	int x1a[700],y1a[700],x2a[700],y2a[700],x3a[700],y3a[700],i1,i2,i3,n1,n2,n3;
	n1=dda(x1,y1,x2,y2,x1a,y1a);
	n2=dda(x2,y2,x3,y3,x2a,y2a);
	n3=dda(x1,y1,x3,y3,x3a,y3a);
	for(i1=0;i1<n1;i1++)
	{
		putpixel(320+x1a[i1],240-y1a[i1],c);
		delay(5);
	}
	for(i2=0;i2<n2;i2++)
	{
		putpixel(320+x2a[i2],240-y2a[i2],c);
		delay(5);
	}
	for(i3=0;i3<n3;i3++)
	{
		putpixel(320+x3a[i3],240-y3a[i3],c);
		delay(5);
	}

}
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
int dda(int x1,int y1,int x2,int y2,int x[],int y[])
{
	float delx,dely,xx,yy;
	int dx,dy,dx1,dy1,length,i;
	dx=x2-x1;
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
			x[i]=ceil(xx);
			y[i]=ceil(yy);
			xx=xx+delx;
			yy=yy+dely;
		}
		return length;
}

void draw_axes()
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
int main()
{
	int x1,y1,x2,y2,x3,y3;
	clrscr();
	printf("\nEnter x1:");
	scanf("%d",&x1);
	printf("\nEnter y1:");
	scanf("%d",&y1);
	printf("\nEnter x2:");
	scanf("%d",&x2);
	printf("\nEnter y2:");
	scanf("%d",&y2);
	printf("\nEnter x3:");
	scanf("%d",&x3);
	printf("\nEnter y3:");
	scanf("%d",&y3);
	getch();
	clrscr();
	draw_axes();
	draw_triangle(x1,y1,x2,y2,x3,y3);
	getch();
	return 0;
}