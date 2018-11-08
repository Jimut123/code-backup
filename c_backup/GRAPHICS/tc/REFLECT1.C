	/* reflect1.c : Write a program to reflect a triangle
	along some standard axis.*/
	#include<stdio.h>
	#include<graphics.h>
	int c,bgcolor;
	void circle_draw(int xc,int yc,int r);
	void draw_xy();
	void plot_xy(int x[],int y[],int xc, int yc, int n);
	int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x1,int y1,int x2,int y2);
	void line_draw1(int x1,int y1,int x2,int y2);
	void plot_line(int x[],int y[],int n);
	void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3,int id);
	void reflection(int x1,int y1,int x2,int y2,int x3,int y3,int ch);
	void main()
	{
	int x1,y1,x2,y2,x3,y3;
	int choice; /* choice=1 means x-axis, choice=2 means y-axis,
		       choice=3 means y=x axis and choice=4 means y=-x axis*/
	clrscr();
	printf("\nEnter x co-ordinate of vertex A :");
	scanf("%d",&x1);
	printf("Enter y co-ordinate of vertex A :");
	scanf("%d",&y1);
	printf("Enter x co-ordinate of vertex B :");
	scanf("%d",&x2);
	printf("Enter y co-ordinate of vertex B :");
	scanf("%d",&y2);
	printf("Enter x co-ordinate of vertex C :");
	scanf("%d",&x3);
	printf("Enter y co-ordinate of vertex C :");
	scanf("%d",&y3);
	printf("Enter (1,2,3,4) your choice for(x,y,y=x,y=-x axis) :");
	scanf("%d",&choice);
	printf("Enter Background Color code(1-14)=");
	scanf("%d",&bgcolor);
	printf("Enter Color of line(1-14)=");
	scanf("%d",&c);
	draw_xy();
	if(choice==3)
	line_draw1(639,0,0,479);
	else if(choice==4)
	line_draw1(0,0,639,479);
	reflection(x1,y1,x2,y2,x3,y3,choice);
	getch();
	closegraph();
	}

	/* void reflection(int x1,int y1,int x2,int y2,int x3,int y3,int ch)
	Function to reflect a triangle along some standard axis */

	void reflection(int x1,int y1,int x2,int y2,int x3,int y3,int ch)
	{
	int mx1,my1,mx2,my2,mx3,my3;
	int ref[3][3],mat[3][3],p[3][3];
	int i,j,k;
	/* To form Reflection transformation matrix */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			ref[i][j]=0;
		if(ch==1)
		{
		 ref[0][0]=1;
		 ref[1][1]=-1;
		 ref[2][2]=1;
		 }
		 else if(ch==2)
		 {
		 ref[0][0]=-1;
		 ref[1][1]=1;
		 ref[2][2]=1;
		 }
		 else if(ch==3)
		 {
		 ref[0][1]=1;
		 ref[1][0]=1;
		 ref[2][2]=1;
		 }
		 else if(ch==4)
                 {
		 ref[0][1]=-1;
		 ref[1][0]=-1;
		 ref[2][2]=1;
		 }
	/* To form Cordinate matrix of triangle ABC */
		for(i=0;i<3;i++)
		mat[2][i]=1;
	mat[0][0]=x1;
	mat[1][0]=y1;
	mat[0][1]=x2;
	mat[1][1]=y2;
	mat[0][2]=x3;
	mat[1][2]=y3;
	/* To calculate co-ordinates of transformed triangle A'B'C' */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			p[i][j]=0;
				for(k=0;k<3;k++)
				p[i][j]=p[i][j]+ref[i][k]*mat[k][j];
			}
	/* To store modified co-ordinates of triangle A'B'C' */
	mx1=p[0][0];
	my1=p[1][0];
	mx2=p[0][1];
	my2=p[1][1];
	mx3=p[0][2];
	my3=p[1][2];
	/* To draw triangle ABC */

	draw_triangle(x1,y1,x2,y2,x3,y3,1);
	outtextxy(320+x3+20,240-y3-20,"Before Reflection");
	/* To draw triangle A'B'C' */
	draw_triangle(mx1,my1,mx2,my2,mx3,my3,2);
	outtextxy(320+mx3+20,240-my3-20,"After Reflection");

	}

	/* void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3,int id):
	Function to draw a triangle */

	void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3,int id)
	{
	char a[80];
	line_draw(x1,y1,x2,y2);
	line_draw(x2,y2,x3,y3);
	line_draw(x3,y3,x1,y1);
		if(id==1)
		{
		sprintf(a,"A(%d,%d)",x1,y1);
		outtextxy(325+x1,245-y1,a);
		sprintf(a,"B(%d,%d)",x2,y2);
		outtextxy(325+x2,245-y2,a);
		sprintf(a,"C(%d,%d)",x3,y3);
		outtextxy(325+x3,245-y3,a);
		}
		else
		{
		sprintf(a,"A'(%d,%d)",x1,y1);
		outtextxy(325+x1,245-y1,a);
		sprintf(a,"B'(%d,%d)",x2,y2);
		outtextxy(325+x2,245-y2,a);
		sprintf(a,"C'(%d,%d)",x3,y3);
		outtextxy(325+x3,245-y3,a);
		}
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

	/* void line_draw1(int x1,int y1,int x2,int y2) : Function
	to draw a line from (x1,y1) to (x2,y2) */
	void line_draw1(int x1,int y1,int x2,int y2)
	{
	int x[700],y[700];
	int i,n;
	n=bresenham(x1,y1,x2,y2,x,y);
		for(i=0;i<=n;i++)
		{
		putpixel(x[i],y[i],15);
		delay(2000);
		}
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