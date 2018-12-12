	/* cg_11.c: Write a program to draw a a triangle. Draw
	a line from A(x1,y1)  to B(x2,y2) using Integer Generalised
	Bresenham  algorithm. Apply translation on ABC*/
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
 void translation(int x1,int y1,int x2,int y2,int x3,int y3,int tx,int ty);
	void main()
	{
	int x1,y1,x2,y2, x3,y3;
	int tx,ty;
	clrscr();
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
	printf("Enter translation along x-axis(tx)=");
	scanf("%d",&tx);
	printf("Enter translation along y-axis(ty)=");
	scanf("%d",&ty);

	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c);
	draw_xy();
	translation(x1,y1,x2,y2,x3,y3,tx,ty);
	getch();
	closegraph();
	}

/* void translation(int x1,int y1,int x2,int y2,int x3,int y3,int tx,int ty):
Function to implement translation along x,y axes. */

   void translation(int x1,int y1,int x2,int y2,int x3,int y3,int tx,int ty)
   {
   int x11,y11,x22,y22,x33,y33;
   char a[100];
   x11=x1+tx;
   y11=y1+ty;
   x22=x2+tx;
   y22=y2+ty;
   x33=x3+tx;
   y33=y3+ty;
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