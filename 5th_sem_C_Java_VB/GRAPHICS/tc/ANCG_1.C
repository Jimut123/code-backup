	/*ancg_1.c : Write a program to draw x and y axes*/
	#include<float.h>
	#include<stdio.h>
	#include<graphics.h>
	void draw_xy();
	int n;
	void dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	void plot_line(int x[],int y[], int m,int c);
	int round1(float x);
	void main()
	{
	int x1,y1,x2,y2,c;
	int x[700],y[700];
	float n1,n2,n3;
	int n11,n22,n33;
	char a[80];
	clrscr();

	printf("\n\nEnter x-coordinate of Point P=");
	scanf("%d",&x1);
	printf("Enter y-coordinate of Point P=");
	scanf("%d",&y1);
	printf("Enter x-coordinate of point Q=");
	scanf("%d",&x2);
	printf("Enter y-coordinate of point Q=");
	scanf("%d",&y2);
	printf("\nEnter color code of your line=");
	scanf("%d",&c);
	dda(x1,y1,x2,y2,x,y);
	draw_xy();
	plot_line(x,y,n,c);
	sprintf(a,"P(%d,%d)",x[0],y[0]);
	outtextxy(320+x[0],240-y[0],a);
	/*
	outtextxy(320+x[0],240-y[0],"P");
	outtextxy(320+x[n],240-y[n],"Q");*/
	getch();
	closegraph();
	}
	void draw_xy()
	{
	int i,c,c1;
	int gd=DETECT, gm;
		c1=6;
	c=15;
	initgraph(&gd,&gm,"c://tc//BGI");
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
		for(i=0;i<=length;i++)
		printf("x[%d]=%d y[%d]=%d\n",i,x[i],i,y[i]);
	}
	void plot_line(int x[],int y[],int m,int c)
	{
	int i;
		for(i=0;i<=m;i++)
		putpixel(320+x[i],240-y[i],c);
	}







