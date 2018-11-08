	/*ancg1.cpp : Write a program mto draw a circle using Bresenham
	circlew draw algorithm */
	#include<stdio.h>
	#include<graphics.h>
	int line_color,bg_color;
	void draw_xy();
	void circle_draw(int xc,int yc,int r,int c);
	int bresenham_circle_draw(int x[],int y[],int r);
	int main()
	{
	int xc,yc,r;
	clrscr();
	printf("\nEnter x-coordinate of centre of the circle=");
	scanf("%d",&xc);
	printf("Enter y-coordinate of centre of the circle=");
	scanf("%d",&yc);
	printf("Enter radius of the circle=");
	scanf("%d",&r);
	printf("Enter color code of Back Ground(2-14)=");
	scanf("%d",&bg_color);
	printf("Enter color code of Line color different from bg_color(2-15)=");
	scanf("%d",&line_color);
	draw_xy(); /* To draw x and y-axes */
	circle_draw(xc,yc,r,line_color);
	getch();
	return 0;
	}

	/* void draw_xy() : Function to draw x-axis and y-axis */
	void draw_xy()
	{
	int i;
	int gd=DETECT, gm;
	initgraph(&gd,&gm,"c://tc//bgi");
	setbkcolor(bg_color);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,line_color);
		delay(10);
		}
	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,line_color);
		delay(10);
		}
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,10,"+Y");
	outtextxy(325,465,"-Y");
	outtextxy(325,245,"O(0,0)");
	}

	/* void circle_draw(int xc,int yc, int r,int c) : Function to draw
	circle having radius=r */
	void circle_draw(int xc,int yc,int r,int c)
	{
	int i;
	int x[1280],y[1280];
	int n;
	char a[80];
	n=bresenham_circle_draw(x,y,r); /* To generate all points */
		/*for(i=1;i<=n;i++)
		printf("(%d,%d)\n",x[i],y[i]);
		getch();*/
		for(i=1;i<=n;i++)
		{
		putpixel(xc+320+x[i],-yc+240-y[i],c);
		delay(10);
		}
	sprintf(a,"C(%d,%d)",xc,yc);
	outtextxy(320+xc,240-yc,a);
	}

	/* int bresenham_circle_draw(int x[],int y[],int r) : Function
	to generate all points of a circle using bresenham circle draw
	algorithm. */

	int bresenham_circle_draw(int x[],int y[],int r)
	{
	int xk,yk,d,i,n,n1,n2,n3;
	float pk;
	xk=0;
	yk=r;
	n=0;
		while(yk>=0)
		{
		n=n+1;
		x[n]=xk;
		y[n]=yk;
		d=(xk+1)*(xk+1)+(yk-1)*(yk-1)-r*r;
			if(d<0)
			{
			pk=(xk+1)*(xk+1)+(yk-.5)*(yk-.5)-r*r;
				if(pk<=0)
				xk=xk+1;
				else
				{
				xk=xk+1;
				yk=yk-1;
				}
			}
			else if(d>0)
			{
			pk=(xk+.5)*(xk+.5)+(yk-1)*(yk-1)-r*r;
				if(pk<=0)
				{
				xk=xk+1;
				yk=yk-1;
				}
				else
				yk=yk-1;
			}
			else
			{
			xk=xk+1;
			yk=yk-1;
			}
		}

	/* Taking reflection along x-axis */

	n1=n+1;
	n2=n-1;
	n3=2*n-1;
		for(i=n1;i<=n3;i++)
		{
		x[i]=x[n2];
		y[i]=-y[n2];
		n2=n2-1;
		}
	/* Taking reflection along y-axis. */
	n1=n3+1;
	n2=n3-1;
	n3=4*n-4;
		for(i=n1;i<=n3;i++)
		{
		x[i]=-x[n2];
		y[i]=y[n2];
		n2=n2-1;
		}
		/*
		for(i=1;i<=n3;i++)
		printf("(%d, %d)\n",x[i],y[i]);
	getch();  */
	return n3;
	}

