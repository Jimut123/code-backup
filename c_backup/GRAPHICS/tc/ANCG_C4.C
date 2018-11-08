	/* ancg_c4.c: Write a program to draw 4 circles in 4 quadrants  using
	Bresenham  algorithm. Join the centres by straight line */
	#include<stdio.h>
	#include<graphics.h>
	int c;
	int n;
	void draw_xy();
	int round1(float x);
	void line_draw(int x[],int y[],int m,int c1);
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	int signx(int x);
 void scaling(int x1,int y1,int x2,int y2,int x3,int y3,float sx, float sy);
	void circle_draw(int xc,int yc,int r);
	void main()
	{
	int x1,y1,x2,y2, x3,y3;
	char a[100];
	int x[700],y[700];
	/*float sx,sy;*/
	int xc1,yc1,xc2,yc2,xc3,yc3,xc4,yc4,r1,r2,r3,r4;
	clrscr();
	/*
	printf("\nEnter x-coordinate of point A=");
	scanf("%d",&x1);
	printf("Enter y-coordinate of point A=");
	scanf("%d",&y1);
	printf("Enter x-coordinate of point B=");
	scanf("%d",&x2);
	printf("Enter y-coordinate of point B=");
	scanf("%d",&y2);
	printf("Enter x-coordinate of point C=");
	scanf("%d",&x3);
	printf("Enter y-coordinate of point C=");
	scanf("%d",&y3);
	printf("Enter scale factor along x-axis(sx)=");
	scanf("%f",&sx);
	printf("Enter scale factor along y-axis(sy)=");
	scanf("%f",&sy); */
	printf("\nEnter x-cordinate of centre(xc1) of 1st circle=");
	scanf("%d",&xc1);
	printf("Enter y-cordinate of centre(yc) of 1st circle=");
	scanf("%d",&yc1);
	printf("Enter radius of the 1st circle(r1)=");
	scanf("%d",&r1);

	printf("Enter x-cordinate of centre(xc2) of 2nd circle=");
	scanf("%d",&xc2);
	printf("Enter y-cordinate of centre(yc) of 2nd circle=");
	scanf("%d",&yc2);
	printf("Enter radius of the 2nd circle(r1)=");
	scanf("%d",&r2);

	printf("Enter x-cordinate of centre(xc3) of 3rd circle=");
	scanf("%d",&xc3);
	printf("Enter y-cordinate of centre(yc3) of 3rd circle=");
	scanf("%d",&yc3);
	printf("Enter radius of the 3rd circle(r3)=");
	scanf("%d",&r3);

	printf("Enter x-cordinate of centre(xc4) of 4th circle=");
	scanf("%d",&xc4);
	printf("Enter y-cordinate of centre(yc4) of 4th circle=");
	scanf("%d",&yc4);
	printf("Enter radius of the 4th circle(r3)=");
	scanf("%d",&r4);

	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c);
	draw_xy();
	circle_draw(xc1,yc1,r1);
	circle_draw(xc2,yc2,r2);
	circle_draw(xc3,yc3,r3);
	circle_draw(xc4,yc4,r4);
	/* To join centres by straight lines. */

	bresenham(xc1,yc1,xc2,yc2,x,y);
	line_draw(x,y,n,c);
	bresenham(xc2,yc2,xc3,yc3,x,y);
	line_draw(x,y,n,c);
	bresenham(xc3,yc3,xc4,yc4,x,y);
	line_draw(x,y,n,c);
	bresenham(xc4,yc4,xc1,yc1,x,y);
	line_draw(x,y,n,c);
	bresenham(xc4,yc4,xc2,yc2,x,y);
	line_draw(x,y,n,c);
	bresenham(xc1,yc1,xc3,yc3,x,y);
	line_draw(x,y,n,c);
	sprintf(a,"C1(%d,%d)",xc1,yc1);
	outtextxy(320+xc1,240-yc1,a);
	sprintf(a,"C2(%d,%d)",xc2,yc2);
	outtextxy(320+xc2,240-yc2,a);
	sprintf(a,"C3(%d,%d)",xc3,yc3);
	outtextxy(320+xc3,240-yc3,a);
	sprintf(a,"C4(%d,%d)",xc4,yc4);
	outtextxy(320+xc4,240-yc4,a);

	/*scaling(x1,y1,x2,y2,x3,y3,sx,sy);*/
	getch();
	closegraph();
	}

	/* void circle_draw(int xc,int yc,int r) : Function to draw
	a circle using bresenham circle draw algorithm. */

	void circle_draw(int xc,int yc,int r)
	{
	int xk,yk,x[1200],y[1200];
	int i,n,n1,n2;
	float d,pk;
	char a[100];
	xk=0;
	yk=r;
	n=0;
		while(yk>=0)
		{
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
			if(yk>=0)
			n=n+1;
		}
	/* To take reflection along x-axis */
	n1=2*n-1;
	n2=n-1;
		for(i=n+1;i<=n1;i++)
		{
		x[i]=x[n2];
		y[i]=-y[n2];
		n2=n2-1;
		}
	/* To take reflection along y-axis */
	n1=4*n-3;
	n2=2*n-1;
		for(i=2*n;i<=n1;i++)
		{
		x[i]=-x[n2];
		y[i]=y[n2];
		n2=n2-1;
		}
	n=n1;
	/* To display all points
		for(i=0;i<=n;i++)
		printf("x[%d]=%d  y[%d]=%d\n",i,x[i],i,y[i]);
	getch();
	*/
	/* To plot all points */
		for(i=0;i<=n;i++)
		{
		putpixel(320+xc+x[i],240-yc+y[i],c);
		delay(2500);
		}
	/*sprintf(a,"C(%d,%d), r=%d",xc,yc,r);
	outtextxy(xc+320,240-yc,a);*/
	}

/* void scaling(int x1,int y1,int x2,int y2,int x3,int y3,float sx,float sy):
Function to implement scaling transformation. */

   void scaling(int x1,int y1,int x2,int y2,int x3,int y3,float sx,float sy)
   {
   int x11,y11,x22,y22,x33,y33;
   char a[100];
   x11=round1(x1*sx);
   y11=round1(y1*sy);
   x22=round1(x2*sx);
   y22=round1(y2*sy);
   x33=round1(x3*sx);
   y33=round1(y3*sy);
   triangle_draw(x1,y1,x2,y2,x3,y3);
   triangle_draw(x11,y11,x22,y22,x33,y33);
   sprintf(a,"A(%d,%d)",x1,y1);
   outtextxy(320+x1,240-y1,a);
   setcolor(1);
   sprintf(a,"B(%d,%d)",x2,y2);
   outtextxy(320+x2,240-y2,a);
   setcolor(3);
   sprintf(a,"C(%d,%d)",x3,y3);
   outtextxy(320+x3,240-y3,a);

   sprintf(a,"A1(%d,%d)",x11,y11);
   outtextxy(320+x11,240-y11,a);
   setcolor(1);
   sprintf(a,"B1(%d,%d)",x22,y22);
   outtextxy(320+x22,240-y22,a);
   setcolor(3);
   sprintf(a,"C1(%d,%d)",x33,y33);
   outtextxy(320+x33,240-y33,a);
   }

	void draw_xy()
	{
	int gd=DETECT, gm;
	int i;
	initgraph(&gd,&gm,"c://tc//bgi");
	setbkcolor(6);
	setcolor(1);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,15);
		delay(2500);
		}
	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,15);
		delay(2500);
		}
	/* To display -X, +X, +Y , -Y and O(0,0) */
	outtextxy(10,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(325,245,"O(0,0)");
	}
	/* int round1(float x) : Function to get rounded value of x */
	int round1(float x)
	{
	int ix,s;
	float x1,xx;
	ix=x;
		if(x<0)
		s=-1;
		else
		s=1;
	x1=x-ix;
		if(x1<0)
		xx=-x1;
		else
		xx=x1;
		if(xx>=.5)
		{
			if(s==1)
			ix=ix+1;
			else
			ix=ix-1;
		}
	return ix;
	}


	/* void line_draw(int x[],int y[],int n1,int c1) : Function to
	draw a line */

	void line_draw(int x[],int y[],int n1,int c1)
	{
	int i;
	/*char a[100];*/
		for(i=0;i<=n1;i++)
		{
		putpixel(320+x[i],240-y[i],c1);
		delay(2500);
		}
	 /* setcolor(2);
	sprintf(a,"A(%d,%d)",x[0],y[0]);
	outtextxy(320+x[0],240-y[0],a);
	sprintf(a,"B(%d,%d)",x[n],y[n]);
	outtextxy(320+x[n],240-y[n],a); */
	}

	/* void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3) ;
	Function to draw a triangle */

	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	int x[700],y[700];
	bresenham(x1,y1,x2,y2,x,y);/* To generate points from (x1,y1) to (x2,y2) */
	line_draw(x,y,n,c);
	bresenham(x2,y2,x3,y3,x,y);/* To generate points from (x2,y2) to (x3,y3) */
	line_draw(x,y,n,c);
	bresenham(x3,y3,x1,y1,x,y);/* To generate points from (x3,y3) to (x1,y1) */
	line_draw(x,y,n,c);
        setcolor(2);
	
	}

	/* void bresenham(int x1,int y1,int x2,int y2,int x[],int y[]) :
	Function to generate points from (x1,y1) to (x2,y2) using
	generalised integer bresenham algorithm. */

	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int delx,dely,s1,s2,temp,interchange,e;
	int dx,dy,xx,yy;
	int i;
	xx=x1;
	yy=y1;
	dx=x2-x1;
	dy=y2-y1;
		if(dx<0)
		delx=-dx;
		else
		delx=dx;
		if(dy<0)
		dely=-dy;
		else
		dely=dy;
	s1=signx(dx);
	s2=signx(dy);
		if(dely>delx)
		{
		temp=dely;
		dely=delx;
		delx=temp;
		interchange=1;
		}
		else
		interchange=0;
	e=2*dely-delx;
	x[0]=xx;
	y[0]=yy;
		for(i=1;i<=delx;i++)
		{
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
		x[i]=xx;
		y[i]=yy;
		}
	n=delx;
	}

	/* int signx(int x) : Function to return -1,0,1 depending on
	value of x */

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