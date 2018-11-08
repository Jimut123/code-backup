	/*bres1.c: Write a program to draw a line using Bresenham
	line  draw algorithm.*/
	#include<stdio.h>
	#include<graphics.h>
	int line_color, bg_color;
	void line_draw(int x1,int y1,int x2,int y2, int c);
       int bresenham_line_draw(int x1,int y1,int x2,int y2, int x[],int y[]);
	void draw_xy();
	int signx(int x);
	int main()
	{
	int x1,y1,x2,y2;
	clrscr();
	printf("\nEnter x-cordinate of Point A=");
	scanf("%d",&x1);
	printf("Enter y-coordinate of Point A=");
	scanf("%d",&y1);
	printf("Enter x-cordinate of Point B=");
	scanf("%d",&x2);
	printf("Enter y-coordinate of Point B=");
	scanf("%d",&y2);
	printf("Enter Back Ground Color Code(2-14)=");
	scanf("%d",&bg_color);
	printf("Enter Line Color Code(2-15)=");
	scanf("%d",&line_color);
	draw_xy();
	line_draw(x1,y1,x2,y2,line_color);
	getch();
	return 0;
	}

	/* void draw_xy() : Function to dusplay x-axis, y-axis. */

	void draw_xy()
	{
	int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"c://tc//bgi");
	setbkcolor(bg_color);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,line_color);
		delay(5000);
		}

	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,line_color);
		delay(5000);
		}
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(320,20,"+Y");
	outtextxy(320,460,"-Y");
	outtextxy(325,245,"O(0,0)");
	}

	/* void line_draw(int x1,int y1,int x2,int y2,int c) : Function to
	draw a straight line */
	void line_draw(int x1,int y1,int x2,int y2,int c)
	{
	int x[700],y[700],i,n;
	char a[80];
	n=bresenham_line_draw(x1,y1,x2,y2,x,y); /* calling bresenham function */
	 /*
		for(i=0;i<=n;i++)
		printf("(%d,%d)\n",x[i],y[i]);
		getch();
	 */
		for(i=0;i<=n;i++)
		{
		putpixel(320+x[i], 240-y[i], c);
		delay(5000);
		}
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,a);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,a);
	}

	/* int bresenham_line_draw(int x1,int y1,int x2,int y2,int x[],int y[]) : Function to
	generate all points of a line using bresenham method. */
	int bresenham_line_draw(int x1,int y1,int x2,int y2, int x[],int y[])
	{
	 int dx,dy,dx1,dy1,s1,s2,interchange,t,i,e;
	 int xx,yy;
	 dx1=x2-x1;
	 dy1=y2-y1;
		if(dx1<0)
		dx=-dx1;
		else
		dx=dx1;
		if(dy1<0)
		dy=-dy1;
		else
		dy=dy1;
		s1=signx(x2-x1);
		s2=signx(y2-y1);
	 /* Interchange opeartion */
		if(dy>dx)
		{
		t=dy;
		dy=dx;
		dx=t;
		interchange=1;
		}
		else
		interchange=0;
	 xx=x1;
	 yy=y1;
	 e=2*dy-dx; /* Initial error value */
		for(i=0;i<=dx;i++)
		{
		x[i]=xx;
		y[i]=yy;
			while(e>=0)
			{
				if(interchange==1)
				xx=xx+s1;
				else
				yy=yy+s2;
			e=e-2*dx;
			}
			if(interchange==1)
			yy=yy+s2;
			else
			xx=xx+s1;
		e=e+2*dy;
		}
	 return dx;
	 }

	 /* int signx(int x) : Function to get sign value of any integer */

	 int signx(int x)
	 {
		if(x<0)
		return -1;
		else if(x==0)
		return 0;
		else
		return 1;
	 }






