	/* circle_d.c : Write a program to draw two circles and
	connect two centers by a line */
	#include<stdio.h>
	#include<graphics.h>
	int c,bgcolor;
	void circle_draw(int xc,int yc,int r);
	void draw_xy();
	void plot_xy(int x[],int y[],int xc, int yc, int n);
	int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x1,int y1,int x2,int y2);
	void plot_line(int x[],int y[],int n);
	void main()
	{
	int xc1,yc1,xc2,yc2,r1,r2;
	clrscr();
	printf("\nEnter x co-ordinate of centre of 1st circle:");
	scanf("%d",&xc1);
	printf("Enter y co-ordinate of centre 1st circle:");
	scanf("%d",&yc1);
	printf("Enter Radius of the 1st circle=");
	scanf("%d",&r1);
	printf("Enter x co-ordinate of centre of 2nd circle:");
	scanf("%d",&xc2);
	printf("Enter y co-ordinate of centre 2nd circle:");
	scanf("%d",&yc2);
	printf("Enter Radius of the 2nd circle=");
	scanf("%d",&r2);
	printf("Enter Background Color code(1-14)=");
	scanf("%d",&bgcolor);
	printf("Enter Colour of Circle(1-14)=");
	scanf("%d",&c);
	draw_xy();
	circle_draw(xc1,yc1,r1);
	circle_draw(xc2,yc2,r2);
	line(xc1+320,240-yc1,xc2+320,240-yc2);
	getch();
	closegraph();
	}
	/* void circle_draw(int xc,int yc,int r) : Function to draw a
	circle using Bresenham algorithm */

	void circle_draw(int xc,int yc,int r)
	{
	int xk,yk,n,d;
	float pk;
	int x[1200],y[1200];
	int i,j,n1,n2;
	xk=0;
	yk=r;
	n=0;
		while(yk>=0)
		{
		n++;
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
			yk=yk+1;
			}
		}
	/* To take reflection of all points along x-axis */
	n1=2*n-1;
	j=n-1;
		for(i=n+1;i<=n1;i++)
		{
		x[i]=x[j];
		y[i]=-y[j];
		j=j-1;
		}
	/* To take reflection along y-axis */
	n2=4*n-4;
	j=n1-1;
		for(i=n1+1;i<=n2;i++)
		{
		x[i]=-x[j];
		y[i]=y[j];
		j=j-1;
		}
	  n=n2;
	  plot_xy(x,y,xc,yc,n);
	  }

	  /* void draw_xy() : Function to draw x-axis and y-axis */

	  void draw_xy()
	  {
	  int gd=DETECT,gm;
	  int i,c1;
	  c1=15;
	  initgraph(&gd,&gm,"c://tc//BGI");
	  setbkcolor(bgcolor); /* To set back ground color */

	  /* To draw x-axis */

		for(i=0;i<640;i++)
		{
		putpixel(i,240,c1);
		delay(2000);
		}

	  /* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,c1);
		delay(2000);
		}
	  outtextxy(10,245,"-X");
	  outtextxy(610,245,"+X");
	  outtextxy(325,20,"+Y");
	  outtextxy(325,460,"-Y");
	  outtextxy(325,245,"O(0,0)");
	  }

	  /* void plot_xy(int x[],int y[],int xc, int yc, int n) :Function
	  to draw circle */

	  void plot_xy(int x[],int y[],int xc, int yc, int n)
	  {
	  int i;
	  char a[80];
		for(i=1;i<=n;i++)
		{
		putpixel(x[i]+320+xc,240-y[i]-yc,c);
		delay(2000);
		}
	  sprintf(a,"C(%d,%d)",xc,yc);
	  outtextxy(xc+320,240-yc,a);
	  }

	/* void line_draw(int x1,int y1,int x2,int y2) : Function
	to draw a line from (x1,y1) to (x2,y2) */
	void line_draw(int x1,int y1,int x2,int y2)
	{
	int x[700],y[700];
	int n;
	n=bresenham(x1,y1,x2,y2,x,y);
	plot_line(x,y,n);
	}

	/* int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]) :
	   Function to generate all points using Integer generalized
	   bresenham  algorithm */

	int bresenham(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int delx,dely,s1,s2;
	int interchange,temp;
	int xx,yy;
	int i,e;
	delx=abs(x2-x1);
	dely=abs(y2-y1);
	s1=sign(x2-x1);
	s2=sign(y2-y1);
	/* To calculate value of interchange */
		if(dely>delx)
		{
		temp=dely;
		dely=delx;
		delx=temp;
		interchange=1;
		}
		else
		interchange=0;
	xx=x1;
	yy=y1;
	e=2*dely-delx;
	/* To generate all points */
		for(i=0;i<=delx;i++)
		{
		x[i]=xx;
		y[i]=yy;
			while(e>=0)
			{
				if(interchange==1)
				xx=xx+s1;
				else
				yy=yy+s2;
			e=e-2*delx;
			}
			if(interchange==1)
			yy=yy+s2;
			else
			xx=xx+s1;
		e=e+2*dely;
		}
	return delx;
	}
	/* int sign(int x) : Function to return sign of x */
	int sign(int x)
	{
		if(x<0)
		return -1;
		else if(x==0)
		return 0;
		else
		return 1;
	}

	void plot_line(int x[],int y[],int n)
	{
	int i;
	for(i=0;i<=n;i++)
	{
	putpixel(320+x[i],240-y[i],c);
	delay(2000);
	}
	}



































