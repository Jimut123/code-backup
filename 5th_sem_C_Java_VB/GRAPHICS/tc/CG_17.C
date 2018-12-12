	/* cg_17.c: Write a program to draw a circle using
	Bresenham circle draw algorithm. Draw two orthogonal dimeters*/

	#include<stdio.h>
	#include<graphics.h>
	int c;
	int n;
	void draw_xy();
	void dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	int round1(float x);
	void line_draw(int x[],int y[],int m,int c1);
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	int signx(int x);
	void circle_draw(int xc, int yc, int r);
	void main()
	{
	int xc,yc,r;
	char a[100];
	clrscr();
	printf("\nEnter x-coordinate of Centre(xc)=");
	scanf("%d",&xc);
	printf("Enter y-coordinate of Centre(yc)=");
	scanf("%d",&yc);
	printf("Enter Radius of your 1st circle(r)=");
	scanf("%d",&r);
	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c);
	draw_xy();
	circle_draw(xc,yc,r);
	/*
	sprintf(a,"C(%d,%d)",xc,yc);
	outtextxy(320+xc,240-yc,a);
	*/
	getch();
	closegraph();
	}

	/* void circle_draw(int xc,int yc,int r) : Function to draw a
	circle */

	void circle_draw(int xc,int yc,int r)
	{
	int xk,yk;
	float d,pk;
	int x[1000],y[1000];
	int xx[700],yy[700];
	int n1,n2,n3,i;
	xk=0;
	yk=r;
	n3=0;
	/* To generate points in 1st quadrant */

		while(yk>=0)
		{
		x[n3]=xk;
		y[n3]=yk;
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
			n3=n3+1;
		}
	/* To take reflection along x-axis */
	n1=2*n3; /*n1=2*n3-1; */
	n2=n3-1;
		for(i=n3+1;i<=n1;i++)
		{
		x[i]=x[n2];
		y[i]=-y[n2];
		n2=n2-1;
		}
	/* To  take reflection along y-axis */
	/*n1=4*n3-3;*/
	n1=4*n3-1;
	n2=2*n3-1;
		/*for(i=2*n3;i<=n1;i++)*/
		for(i=2*n3+1;i<=n1;i++)
		{
		x[i]=-x[n2];
		y[i]=y[n2];
		n2=n2-1;
		}
	 /* To display all points

		for(i=0;i<=n1;i++)
		printf("x[%d]=%d  y[%d]=%d\n",i,x[i],i,y[i]);
	*/
	/* To draw circle */

		for(i=0;i<=n1;i++)
		{
		putpixel(320+xc+x[i],240-yc+y[i],c);
		delay(2500);
		}
	/* To draw 2 orthogonal diameters */

	/* To generate points from (0,0) to (2*n3,2*n3) */

	bresenham(x[0],y[0],x[2*n3],y[2*n3],xx,yy);
	for(i=0;i<=n;i++)
	putpixel(320+xc+xx[i], 240-yc+yy[i],c);

	/* To generate points from (n3,n3) to (3*n3,3*n3) */
	bresenham(x[n3],y[n3],x[3*n3],y[3*n3],xx,yy);
	for(i=0;i<=n;i++)
	putpixel(320+xc+xx[i],240-yc+yy[i],c);


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

	/* void dda(int x1,int y1,int x2,int y2,int x[],int y[]) :
	Function to implement DDA algorithm. */

	void dda(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int dx,dy,dx1,dy1;
	float delx,dely,xx,yy;
	int i,length;
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
	x[0]=x1;
	y[0]=y1;
		for(i=1;i<=length;i++)
		{
		xx=xx+delx;
		yy=yy+dely;
		x[i]=round1(xx);
		y[i]=round1(yy);
		}
	n=length;
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
	char a[100];
	bresenham(x1,y1,x2,y2,x,y);/* To generate points from (x1,y1) to (x2,y2) */
	line_draw(x,y,n,c);
	bresenham(x2,y2,x3,y3,x,y);/* To generate points from (x2,y2) to (x3,y3) */
	line_draw(x,y,n,c);
	bresenham(x3,y3,x1,y1,x,y);/* To generate points from (x3,y3) to (x1,y1) */
	line_draw(x,y,n,c);
        setcolor(2);
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,a);
	setcolor(1);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,a);
	setcolor(3);
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(320+x3,240-y3,a);
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