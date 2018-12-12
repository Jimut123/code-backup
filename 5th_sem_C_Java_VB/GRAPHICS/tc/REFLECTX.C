	/* reflectx.c: Write a program to draw a triangle ABC
	where the points A(x1,y1), B(x2,y2), C(x3,y3) are given.
	Use DDA algorithm to draw a line. Take reflection along x-axis*/
	#include<stdio.h>
	#include<graphics.h>
	int c;
	int n;
	void draw_xy();
	void dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	int round1(float x);
	void line_draw(int x[],int y[],int m,int c1);
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
	void reflectionx(int x1,int y1,int x2,int y2,int x3,int y3);
	void main()
	{
	int x1,y1,x2,y2,x3,y3,x[700],y[700];
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
	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c);
	/*dda(x1,y1,x2,y2,x,y); */
	draw_xy();
	/*line_draw(x,y,n,c);*/
	/*triangle_draw(x1,y1,x2,y2,x3,y3);*/
	reflectionx(x1,y1,x2,y2,x3,y3);
	getch();
	closegraph();
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
	/*  */
	}
	/* void triangle_draw(int x1,int y1,int x2,int x3,int y3) :
	Function to draw a triangle ABC */

	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	char a[100];
	int x[700], y[700];
	dda(x1,y1,x2,y2,x,y); /* To generate points of line AB */
	line_draw(x,y,n,2);
	dda(x2,y2,x3,y3,x,y); /* To generate points of line BC */
	line_draw(x,y,n,3);
	dda(x3,y3,x1,y1,x,y); /* To generate points of line CA */
	line_draw(x,y,n,4);
	/* */
	}
	/* void reflectionx(int x1,int y1,int x2,int y2,int x3,int y3) :
	Function to to take reflection along x-axis */

	void reflectionx(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	char a[100];
	int i,j,k;
	int x11,y11,x22,y22,x33,y33;
	int reflect[3][3]={1,0,0,0,-1,0,0,0,1};
	int t[3][3],td[3][3];
	t[0][0]=x1;
	t[1][0]=y1;
	t[2][0]=1;
	t[0][1]=x2;
	t[1][1]=y2;
	t[2][1]=1;
	t[0][2]=x3;
	t[1][2]=y3;
	t[2][2]=1;
	/* To get co-ordinate of reflected triangle */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			td[i][j]=0;
				for(k=0;k<3;k++)
				td[i][j]=td[i][j]+reflect[i][k]*t[k][j];
			}
	triangle_draw(td[0][0],td[1][0],td[0][1],td[1][1],td[0][2],td[1][2]);
	setcolor(1);
	sprintf(a,"A1(%d,%d)",td[0][0],td[1][0]);
	outtextxy(320+td[0][0],240-td[1][0],a);
	sprintf(a,"B1(%d,%d)",td[0][1],td[1][1]);
	outtextxy(320+td[0][1],240-td[1][1],a);
	sprintf(a,"C1(%d,%d)",td[0][2],td[1][2]);
	outtextxy(320+td[0][2],240-td[1][2],a);
	triangle_draw(x1,y1,x2,y2,x3,y3);
	setcolor(2);
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,a);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,a);
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(320+x3,240-y3,a);
	}































