	/* circle_a.c: Write a program to draw a circle using
	Bresenham algorithm */
	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int xc,yc,r;
	int circle_draw(int xc,int yc,int r,int x[],int y[]);
	void plot_line(int x[],int y[],int n,int c);
	void draw_xy();
	void main()
	{
	int gd=DETECT,gm;
	int x[1400],y[1400];
	int n,c;
	clrscr();
	printf("\nEnter x co-ordinate of centre=");
	scanf("%d",&xc);
	printf("Enter y co-ordinate of centre=");
	scanf("%d",&yc);
	printf("Enter radius=");
	scanf("%d",&r);
	printf("Enter color code of circle(1-14)=");
	scanf("%d",&c);
	n=circle_draw(xc,yc,r,x,y);
	initgraph(&gd,&gm,"c://tc//BGI");
	draw_xy();
	plot_line(x,y,n,c);
	closegraph();
	}
	/*  : Function
	to generate all of the intermediate points of a circle using
	bresenham algorithm */
        int circle_draw(int xc,int yc,int r, int x[],int y[])
	{
	float d,pk;
	int xk,yk;
	int i,j,n,n1,n2;
	xk=0;
	yk=r;
	n=0;
	x[0]=xk;
	y[0]=yk;
		while(yk>0)
		{
		n++;
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
		x[n]=xk;
		y[n]=yk;
		}
	/* To take reflection along x-axis */
	n1=2*n;
	j=n-1;
		for(i=n+1;i<=n1;i++)
		{
		x[i]=x[j];
		y[i]=-y[j];
		j=j-1;
		}
	/* To take reflection along y-axis */
	n2=4*n;
	j=n1-1;
		for(i=n1+1;i<=(n2-1);i++)
		{
		x[i]=-x[j];
		y[i]=y[j];
		j=j-1;
		}
	/*
	printf("\nPress any key to display all points--->\n");
	getch();
		for(i=0;i<=(n2-1);i++)
		{
		printf("x[%d]=%d  y[%d]=%d\n",i,x[i],i,y[i]);
			if((i+1)%20 == 0)
			{
			printf("\nPress any key to continue--->");
			getch();
			clrscr();
			}
		}
	getch();
	*/
	/* To scale all points w.r.t. origin(xc,yc) */
		for(i=0;i<n2;i++)
		{
		x[i]=x[i]+xc;
		y[i]=yc-y[i];
		}
	return n2-1;
	}

	/* void draw_xy() : Function to draw x-axis and y-axis */

	void draw_xy()
	{
	int i,c;
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
	char a[30];
		for(i=0;i<=n;i++)
		{
		putpixel(320+x[i],240-y[i],c);
		delay(8000);
		}
	setcolor(2);
	sprintf(a,"C(%d,%d),r=%d",xc,yc,r);
	outtextxy(xc+320, 240-yc,a);
	getch();
	}





