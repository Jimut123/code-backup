	/* cg_p2.c: Write a program to draw line using DDA algorithm */
	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	int round1(float x);
	void plot_line(int x[],int y[],int n,int c);
	void draw_xy();
	void main()
	{
	int x1,y1,x2,y2;
	int x[700],y[700];
	int i,n,c;
	clrscr();
	printf("\nEnter x1=");
	scanf("%d",&x1);
	printf("Enter y1=");
	scanf("%d",&y1);
	printf("Enter x2=");
	scanf("%d",&x2);
	printf("Enter y2=");
	scanf("%d",&y2);
	printf("Enter color code of line(1-14)=");
	scanf("%d",&c);
	n=dda(x1,y1,x2,y2,x,y);
	draw_xy();
	plot_line(x,y,n,c);
	closegraph();
	}
	/* int dda(int x1,int y1,int x2,int y2,int x[],int y[]) : Function
	to generate all intermediate points between x1,y1 and x2,y2 */
	int dda(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int dx,dy;
	float delx,dely;
	int i,length;
	float xx,yy;
	dx=x2-x1;
	dy=y2-y1;
		if(abs(dx)>=abs(dy))
		length=abs(dx);
		else
		length=abs(dy);
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
	/*
	printf("\nPress any key to display all points--->\n");
	getch();
		for(i=0;i<=length;i++)
		{
		printf("x[%d]=%d  y[%d]=%d\n",i,x[i],i,y[i]);
			if((i+1)%20 == 0)
			{
			printf("\nPress any key to continue--->");
			getch();
			clrscr();
			}
		} */
	return length;
	}

	/* int round1(float x) : Function to get round value
	of any floating point number */

	int round1(float x)
	{
	float x1;
	int ix,s;
	ix=(int)x;
	x1=x-(float)ix;
		if(x<0)
		s=-1;
		else if(x==0)
		s=0;
		else
		s=1;
		if(x1<0)
		x1=-x1;
		if(x1 >= .5)
		{
			if(s==1)
			ix=ix+1;
			else if(s==-1)
			ix=ix-1;
		 }
	return ix;
	}

	/* void draw_xy() : Function to draw x-axis and y-axis */

	void draw_xy()
	{
	int i,c;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c://tc//BGI");
	c=15;
	setbkcolor(6);

	/* To draw x-axis */
		for(i=0;i<=639;i++)
		putpixel(i,240,c);

	/* To draw y-axis */
		for(i=0;i<=479;i++)
		putpixel(320,i,c);
	setcolor(15);
	/* To display +X,-X,+Y,-Y, O  */
	outtextxy(20,245,"-x");
	outtextxy(600,245,"+x");
	outtextxy(325,10,"+y");
	outtextxy(325,460,"-y");
	outtextxy(325,245,"o");
	setcolor(1);
	outtextxy(30,400,"This is done by Dr. Asoke Nath");
	}
	void plot_line(int x[],int y[],int n,int c)
	{
	int i;
		for(i=0;i<=n;i++)
		{
		putpixel(320+x[i],240-y[i],c);
		delay(8000);
		}
	setcolor(2);
	outtextxy(x[0]+325, 240-y[0]-5,"A");
	outtextxy(x[n-1]+320, 240-y[n-1]-5,"B");
	getch();
	}





