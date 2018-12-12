	/*ancg_c1.c : Write a program to draw a cicle*/
	#include<float.h>
	#include<stdio.h>
	#include<graphics.h>
	void draw_xy();
	int n,c;
	void dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	void triangle(int x1,int y1,int x2,int y2,int x3,int y3);
	void plot_line(int x[],int y[], int m,int c);
	int round1(float x);
	void circle_draw(int xc,int yc,int r);
	void main()
	{
	int xc,yc,r;
	int x[700],y[700];
	float n1,n2,n3;
	int n11,n22,n33;
	clrscr();
	printf("\nEnter x-co-ordinates of center=");
	scanf("%d",&xc);
	printf("Enter y-co-ordinates of center=");
	scanf("%d",&yc);
	printf("Enter radius=");
	scanf("%d",&r);
	printf("\nEnter color code of your line=");
	scanf("%d",&c);
	draw_xy();
	circle_draw(xc,yc,r);
	/*dda(x1,y1,x2,y2,x,y);
	//draw_xy();
	//plot_line(x,y,n,c);
	//outtextxy(320+x[0],240-y[0],"P");
	//outtextxy(320+x[n],240-y[n],"Q"); */
	getch();
	closegraph();
	}
	void draw_xy()
	{
	int i,c,c1;
	int gd=DETECT, gm;
		c1=6;
	c=15;
	initgraph(&gd,&gm,"F://tc//BGI");
		for(i=0;i<=639;i++)
		putpixel(i,240,c);
		for(i=0;i<=479;i++)
		putpixel(320,i,c);
	outtextxy(10,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(325,245,"O(0,0)");
	setbkcolor(c1);
	}
	int round1(float x)
	{
	int x1;
	float x2,s,xx;
	x1=x;
	x2=x-x1;
		if(x<0)
		s=-1;
		else
		s=1;
		if(x2<0)
		xx=-x2;
		else
		xx=x2;
		if(xx>=.5)
		{
			if(s==1)
			x1=x1+1;
			else
			x1=x1-1;
		}
	return x1;
	}
	void dda(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int i;
	int dx,dy,length,dx1,dy1;
	float delx,dely;
	float xx,yy;
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
	x[0]=xx;
	y[0]=yy;
		for(i=1;i<=length;i++)
		{
		xx=xx+delx;
		yy=yy+dely;
		x[i]=round1(xx);
		y[i]=round1(yy);
		}
	n=length;
	}
	void plot_line(int x[],int y[],int m,int c)
	{
	int i;
		for(i=0;i<=m;i++)
		putpixel(320+x[i],240-y[i],c);
	}
	void triangle(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	int x[700],y[700];
	/* To draw line AB */
	dda(x1,y1,x2,y2,x,y);
	plot_line(x,y,n,c);
	/* To draw line BC */
	dda(x2,y2,x3,y3,x,y);
	plot_line(x,y,n,c);
	/* To draw line CA */
	dda(x3,y3,x1,y1,x,y);
	plot_line(x,y,n,c);
	}

      /* void circle_draw(int xc,int yc,int r) : Function to draw a circle */

	void circle_draw(int xc,int yc,int r)
	{
	float d,pk;
	int xk,yk;
	int n,n1,n2,i;
	int x[700], y[700];
	xk=0;
	yk=r;
	x[0]=xk;
	y[0]=yk;
	n=0;
		while(yk>=0)
		{
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
		n++;
		x[n]=xk;
		y[n]=yk;
		}
	/* To take reflection along x-axis  */
	n1=2*n;
	n2=n-1;
		for(i=n;i<=n1; i++)
		{
		x[i]=x[n2];
		y[i]=-y[n2];
		n2=n2-1;
		}


	/* To take reflection along y-axis. */
	n1=4*n-1;
	n2=2*n-1;
		for(i=2*n+1;i<n1;i++)
		{
		x[i]=-x[n2];
		y[i]=y[n2];
		n2=n2-1;
		}
	 n=4*n-1;
	 /* To plot points */
		for(i=0;i<n;i++)
		{
		putpixel(320+xc+x[i],240-yc+y[i],c);
		delay(10);
		}



	}






