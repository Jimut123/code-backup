	/* cg_37.c: Write a program to draw a a triangle. Take reflection
	along a general straight line. Use  Integer Generalised
	Bresenham  algorithm to draw a line. */

	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int c;
	int n;
	int xo1,yo1,xo2,yo2,xo3,yo3;
	float c1; /* y=mx + c1 , c1=translation along  y-axis*/
	float theta,th1;
	float slope;
	void draw_xy();
	int round1(float x);
	void line_draw(int x[],int y[],int m,int c1);
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	void general_reflection(int x1,int y1,int x2,int y2,int x3,int y3);
	void translation(int x1,int y1,int x2,int y2,int x3,int y3,int xa,int yb);
	void rotation(int x1,int y1,int x2,int y2,int x3,int y3);
	void reflection_x(int x1,int y1,int x2,int y2,int x3,int y3);
	int signx(int x);
	void main()
	{
	int x1,y1,x2,y2, x3,y3;
	int i,j;
	char a[80];
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
	printf("Enter value of slope of general line(m)=");
	scanf("%f",&slope);
	printf("Enter translation along y-axis(c1)=");
	scanf("%f",&c1);

	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c);
	draw_xy();
	triangle_draw(x1,y1,x2,y2,x3,y3);
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,a);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,a);
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(320+x3,240-y3,a);

	/* To draw general line */
		for(i=-320;i<=320;i=i+1)
		{
		j=slope*i+c1;
		putpixel(320+i,240-j,c);
		delay(2000);
		}

	general_reflection(x1,y1,x2,y2,x3,y3);
	triangle_draw(xo1,yo1,xo2,yo2,xo3,yo3);/* To draw modified triangle */

	sprintf(a,"A1(%d,%d)",xo1,yo1);
	outtextxy(320+xo1,240-yo1,a);
	sprintf(a,"B1(%d,%d)",xo2,yo2);
	outtextxy(320+xo2,240-yo2,a);
	sprintf(a,"C1(%d,%d)",xo3,yo3);
	outtextxy(320+xo3,240-yo3,a);

	getch();
	closegraph();
	}

	/* void general_reflection(int x1,int y1,int x2,int y2,int x3,int y3)
	Function to take reflection of a triangle along a general line. */

	void general_reflection(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	int xa,yb;
	/* To take inverse translation */
	xa=0;
	yb=-c1;
	translation(x1,y1,x2,y2,x3,y3,xa,yb);

	/* To take inverse rotation on transformed points */
	th1=-atan(slope); /* th1=clock-wise rotation */
	rotation(xo1,yo1,xo2,yo2,xo3,yo3); /* Apply inverse rotation */

	/* To take reflection along x-axis */
	reflection_x(xo1,yo1,xo2,yo2,xo3,yo3);

	/* To take rotation in anti-clock wise direction */
	th1=atan(slope);
        rotation(xo1,yo1,xo2,yo2,xo3,yo3); /* Apply inverse rotation */

	/* To take translation */
	xa=0;
	yb=c1;
	translation(xo1,yo1,xo2,yo2,xo3,yo3,xa,yb);

	/* All transformations are over */
	}

	/* void translation(int x1,int y1,int x2,int y2,int x3,int y3,int xa,int yb)
	Function to take translation along x and y-axes */
  void translation(int x1,int y1,int x2,int y2,int x3,int y3,int xa,int yb)
	{
	xo1=x1+xa;
	yo1=y1+yb;
	xo2=x2+xa;
	yo2=y2+yb;
	xo3=x3+xa;
	yo3=y3+yb;
	}
  /*  : Function void reflection_x(int x1,int y1,int x2,int y2,int x3,int y3)
  to take reflection along x-axis */

     void reflection_x(int x1,int y1,int x2,int y2,int x3,int y3)
     {
     xo1=x1;
     yo1=-y1;
     xo2=x2;
     yo2=-y2;
     xo3=x3;
     yo3=-y3;
     }
  /* void rotation(int x1,int y1,int x2,int y2,int x3,int y3) : Function
  to take rotation around origin. */
	void rotation(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	float rot[3][3],obj[3][3],obj1[3][3];
	int i,j,k;
	float s;
	rot[0][0]=cos(th1);
	rot[0][1]=-sin(th1);
	rot[0][2]=0;
	rot[1][0]=sin(th1);
	rot[1][1]=cos(th1);
	rot[1][2]=0;
	rot[2][0]=0;
	rot[2][1]=0;
	rot[2][2]=1;

	obj[0][0]=x1;
	obj[0][1]=x2;
	obj[0][2]=x3;
	obj[1][0]=y1;
	obj[1][1]=y2;
	obj[1][2]=y3;
	obj[2][0]=1;
	obj[2][1]=1;
	obj[2][2]=1;
	/* To calculate transformed points we apply matrix product */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			s=0;
				for(k=0;k<3;k++)
				s=s+rot[i][k]*obj[k][j];
			obj1[i][j]=s;
			}
	xo1=obj1[0][0];
	yo1=obj1[1][0];
	xo2=obj1[0][1];
	yo2=obj1[1][1];
	xo3=obj1[0][2];
	yo3=obj1[1][2];
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
	char a[100];
	bresenham(x1,y1,x2,y2,x,y);/* To generate points from (x1,y1) to (x2,y2) */
	line_draw(x,y,n,c);
	bresenham(x2,y2,x3,y3,x,y);/* To generate points from (x2,y2) to (x3,y3) */
	line_draw(x,y,n,c);
	bresenham(x3,y3,x1,y1,x,y);/* To generate points from (x3,y3) to (x1,y1) */
	line_draw(x,y,n,c);

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