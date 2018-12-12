	/* transa.c : Write a program to implement translation transformation
	on a triangle.*/

	#include<stdio.h>
	#include<graphics.h>
	int c,bgcolor;
	void circle_draw(int xc,int yc,int r);
	void draw_xy();
	void plot_xy(int x[],int y[],int xc, int yc, int n);
	int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x1,int y1,int x2,int y2);
	void plot_line(int x[],int y[],int n);
	void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3);
      void translation(int x1,int y1,int x2,int y2,int x3,int y3,int a,int b);
	void main()
	{
	int x1,y1,x2,y2,x3,y3;
	int a,b;
	clrscr();
	printf("\nEnter x co-ordinate of Vertex A :");
	scanf("%d",&x1);
	printf("Enter y co-ordinate of Vertex A :");
	scanf("%d",&y1);
	printf("Enter x co-ordinate of Vertex B :");
	scanf("%d",&x2);
	printf("Enter y co-ordinate of Vertex B :");
	scanf("%d",&y2);
	printf("Enter x co-ordinate of Vertex C :");
	scanf("%d",&x3);
	printf("Enter y co-ordinate of Vertex C :");
	scanf("%d",&y3);
	printf("Enter x-translation factor along x-axis(a)=");
	scanf("%d",&a);
	printf("Enter y-translation factor along y-axis(b)=");
	scanf("%d",&b);
	printf("Enter Background Color code(1-14)=");
	scanf("%d",&bgcolor);
	printf("Enter Color of line(1-14)=");
	scanf("%d",&c);
	draw_xy();
	translation(x1,y1,x2,y2,x3,y3,a,b);
	getch();
	closegraph();
	}

	/* void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3) :
	Function to draw a triangle */

	void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	 line_draw(x1,y1,x2,y2);
	 line_draw(x2,y2,x3,y3);
	 line_draw(x3,y3,x1,y1);
	}

/* void translation(int x1,int y1,int x2,int y2,int x3,int y3,int a,int b) :
	Function to implement scaling. */

   void translation(int x1,int y1,int x2,int y2,int x3,int y3,int a,int b)
	{
	int obj[3][3],obj1[3][3];
	int tra[3][3];
	int xm1,ym1,xm2,ym2,xm3,ym3;
	int i,j,k;
	char a1[80];

	/* To construct scaling Matrix */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			tra[i][j]=0;
		tra[0][2]=a;
		tra[1][2]=b;
		tra[2][2]=1;

	/* To construct object matrix */
	obj[0][0]=x1;
	obj[0][1]=x2;
	obj[0][2]=x3;
	obj[1][0]=y1;
	obj[1][1]=y2;
	obj[1][2]=y3;
	obj[2][0]=1;
	obj[2][1]=1;
	obj[2][2]=1;
	/* To get co-ordinate of transformed triangle */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			obj1[i][j]=0;
				for(k=0;k<3;k++)
				obj1[i][j]=obj1[i][j]+tra[i][k]*obj[k][j];
			}
	xm1=obj1[0][0];
	xm2=obj1[0][1];
	xm3=obj1[0][2];
	ym1=obj1[1][0];
	ym2=obj1[1][1];
	ym3=obj1[1][2];

	/* To draw initial object */
	draw_triangle(x1,y1,x2,y2,x3,y3);
	sprintf(a1,"A(%d,%d)",x1,y1);
	outtextxy(325+x1,245-y1,a1);
	sprintf(a1,"B(%d,%d)",x2,y2);
	outtextxy(325+x2,245-y2,a1);
	sprintf(a1,"C(%d,%d)",x3,y3);
	outtextxy(325+x3,245-y3,a1);
	outtextxy(360+x3,260-y3,"Before Translation");
	/* To draw modified object */
	getch();
	draw_triangle(xm1,ym1,xm2,ym2,xm3,ym3);
	sprintf(a1,"A'(%d,%d)",xm1,ym1);
	outtextxy(325+xm1,245-ym1,a1);
	sprintf(a1,"B'(%d,%d)",xm2,ym2);
	outtextxy(325+xm2,245-ym2,a1);
	sprintf(a1,"C'(%d,%d)",xm3,ym3);
	outtextxy(325+xm3,245-ym3,a1);
	outtextxy(360+xm3,260-ym3,"After Translation");
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