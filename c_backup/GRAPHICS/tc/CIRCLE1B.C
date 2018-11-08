	/*circle1c.c: Write a program to draw a half circle(reverse) using
	Bresenham circle draw algorithm.*/
	#include<stdio.h>
	#include<graphics.h>
	int line_color, bg_color;
	void circle_draw_half(int xc, int yc, int r, int c);
	int bresenham_circle_draw(int r, int x[],int y[]);
	void draw_xy();
	int main()
	{
	int xc,yc,r,i;
	clrscr();
	printf("\nEnter x-cordinate of centre=");
	scanf("%d",&xc);
	printf("Enter y-coordinate of centre=");
	scanf("%d",&yc);
	printf("Enter radius=");
	scanf("%d",&r);
	printf("Enter Back Ground Color Code(2-14)=");
	scanf("%d",&bg_color);
	printf("Enter Line Color Code(2-15)=");
	scanf("%d",&line_color);
	draw_xy();
	circle_draw_half(xc,yc,r,line_color);
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

	/* void circle_draw_half(int xc,int yc,int r,int c) : Function to
	a circle */
	void circle_draw_half(int xc,int yc,int r,int c)
	{
	int x[1000],y[1000],i,n,n1;
	char a[80];
	n=bresenham_circle_draw(r,x,y); /* calling bresenham function */
		/*
		for(i=1;i<=n;i++)
		printf("(%d,%d)\n",x[i],y[i]);
		getch();
		*/
		n1=n/2+1;
		for(i=n1;i<=n;i++)
		{
		putpixel(320+xc+x[i], 240-yc-y[i], c);
		delay(5000);
		}
	/*sprintf(a,"C(%d,%d)",xc,yc);
	outtextxy(320+xc,240-yc,a); */
		/* to draw diameter along y-axis */
		for(i=0;i<=n1;i++)
		{
		putpixel(320+xc,240-yc+y[i],3);
		delay(5000);
		}
	}

	/* int bresenham_circle_draw(int r,int x[],int y[]) : Function to
	generate all points of a circle using bresenham method. */
	int bresenham_circle_draw(int r, int x[],int y[])
	{
	 int xk,yk,d,n,i,n1,n2,n3;
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
	 /* To take reflection along x-axis */
	 n1=n+1;
	 n2=2*n-1;
	 n3=n-1;
		for(i=n1;i<=n2;i++)
		{
		x[i]=x[n3];
		y[i]=-y[n3];
		n3=n3-1;
		}
	 /* To take refelction along y-axis */
	 n1=2*n;
	 n2=4*n-4;
	 n3=n1-2;
		for(i=n1;i<=n2;i++)
		{
		x[i]=-x[n3];
		y[i]=y[n3];
		n3=n3-1;
		}
	 return n2;
	 }





