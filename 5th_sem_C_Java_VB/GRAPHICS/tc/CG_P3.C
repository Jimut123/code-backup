	/* cg_p3.c: Write a program to draw line using Integer
	generalized bresenham algorithm */

	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int generalized_bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	int sign(int x);
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
	n=generalized_bresenham(x1,y1,x2,y2,x,y);
	draw_xy();
	plot_line(x,y,n,c);
	closegraph();
	}
	/* int generalized_bresenham(int x1,int y1,int x2,int y2,int x[],int y[]) : Function
	to generate all intermediate points between x1,y1 and x2,y2 */
	int generalized_bresenham(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int dx,dy;
	int e;
	int temp,s1,s2;
	int i,interchange;
	int xx,yy;
	xx=x1;
	yy=y1;
	dx=abs(x2-x1);
	dy=abs(y2-y1);
	s1=sign(x2-x1);
	s2=sign(y2-y1);
	/* To interchange dx and dy depending on the slope of the line. */
		if(dy>dx)
		{
		temp=dx;
		dx=dy;
		dy=temp;
		interchange=1;
		}
		else
		interchange=0;
	x[0]=xx;
	y[0]=yy;
	e=2*dy-dx;
		for(i=1;i<=dx;i++)
		{
			while(e>=0)
			{
				if(interchange==1)
				xx=xx+s1;
				else
				yy=yy+s2;
			e=e-2*dx;
			}
			if(interchange==1)
			yy=yy+s2;
			else
			xx=xx+s1;
		x[i]=xx;
		y[i]=yy;
		e=e+2*dy;
		}
	printf("\nPress any key to display all points--->\n");
	getch();
		for(i=0;i<=dx;i++)
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
	return dx;
	}

	/* int sign(int x) : Function to get sign value
	of 'x'  integer */

	int sign(int x)
	{
		if(x>0)
		return 1;
		else if(x==0)
		return 0;
		else if(x<0)
		return -1;
	}


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