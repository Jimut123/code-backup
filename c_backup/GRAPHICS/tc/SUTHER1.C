	/* suther1.c: Write a program to implement Clipping algorithm using
	Sutherland Cohen algorithm. */
	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int xL,xR,yB,yT;
	int bg_color,line_color;
	int signx(int x);
	void line_draw(int x1,int y1,int x2,int y2,int c);
	int bresenham_line_draw(int x1,int y1,int x2,int y2,int x[],int y[]);
	void sutherland_cohen_algorithm(int x1,int y1,int x2,int y2);
	void draw_xy();
	void draw_viewing_window();
	void main()
	{
	int x1,y1,x2,y2;
	clrscr();
	printf("\nEnter xL=");
	scanf("%d",&xL);
	printf("Enter xR=");
	scanf("%d",&xR);
	printf("Enter yB=");
	scanf("%d",&yB);
	printf("Enter yT=");
	scanf("%d",&yT);
	printf("Enter x-coordinate  of point P=");
	scanf("%d",&x1);
	printf("Enter y-coordinate of point P=");
	scanf("%d",&y1);
	printf("Enter x-coordinate of point Q=");
	scanf("%d",&x2);
	printf("Enter y-coordinate of point Q=");
	scanf("%d",&y2);
	printf("Enter Back ground color code(2-14)=");
	scanf("%d",&bg_color);
	printf("Enter color code of Line(2-15)=");
	scanf("%d",&line_color);
	draw_xy();
	draw_viewing_window();
	sutherland_cohen_algorithm(x1,y1,x2,y2);
	getch();
	closegraph();
	}

	/* void draw_xy() : Function to draw x-axis, y-axis */
	void draw_xy()
	{
	int i;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c://turboc3//bgi");
	setbkcolor(bg_color);
	/* To draw x-axis. */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,line_color);
		delay(5000);
		}
	/* To draw y-xis. */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,line_color);
		delay(5000);
		}
	outtextxy(15,245,"-X"); /* To display caption -X */
	outtextxy(620,245,"+X"); /* To display caption +X */
	outtextxy(325,20,"+Y"); /* To display caption +Y */
	outtextxy(325,470,"-Y"); /* To display caption -Y */
	outtextxy(325,245,"O(0,0)"); /* To display O(0,0) */
	}

	/* void draw_viewing_window() : Function to draw viewing window */
	void draw_viewing_window()
	{
	int i;
	char a[80];
		/* drawing line from (xL,yB) to (xR,yB) */
		for(i=xL;i<=xR;i++)
		{
		putpixel(320+i,240-yB,line_color);
		delay(5000);
		}
		/* drawing line from (xR,yB) to (xR,yT) */
		for(i=yB;i<=yT;i++)
		{
		putpixel(320+xR,240-i,line_color);
		delay(5000);
		}
		/* drawing line from(xR,yT) to (xL,yT) */
		for(i=xR;i>=xL;i--)
		{
		putpixel(320+i,240-yT,line_color);
		delay(5000);
		}
		/* drawing line from (xL,yT) to (xL,yB) */
		for(i=yT;i>=yB;i--)
		{
		putpixel(320+xL,240-i,line_color);
		delay(5000);
		}
	sprintf(a,"A(%d,%d)",xL,yB);
	outtextxy(320+xL,240-yB,a);
	sprintf(a,"B(%d,%d)",xR,yB);
	outtextxy(320+xR,240-yB,a);
	sprintf(a,"C(%d,%d)",xR,yT);
	outtextxy(320+xR,240-yT,a);
	sprintf(a,"D(%d,%d)",xL,yT);
	outtextxy(320+xL,240-yT,a);
	}

	/* void sutherland_cohen_algorithm(int x1,int y1,int x2,int y2) ;
	Function to implement sutherland cohen algorithm. */
	void sutherland_cohen_algorithm(int x1,int y1,int x2,int y2)
	{
	int xxB,xxT,yyL,yyR;
	int px1,py1,px2,py2,px3,py3,px4,py4;
	float m;
	int n,i;
	int x[700],y[700];
	int flag[5]={0,0,0,0,0};
	char a[80];
	m=(float)(y2-y1)/(float)(x2-x1); /* m=slope of the line */
	/*printf("x1=%d y1=%d x2=%d y2=%d m=%5.2f\n",x1,y1,x2,y2,m);*/
	/* case-1 : Pont of intersection  at x=xL */
	yyL=m*(xL-x1)+y1;
		if(yyL>=yB && yyL<=yT)
		flag[1]=1;
	/* case-2 : Point of intersection at x=xR */
	yyR=m*(xR-x1)+y1;
		if(yyR>=yB && yyR<=yT)
		flag[2]=1;
	/* case-3 : Point of intersection at y=yB */
	xxB=1/m*(yB-y1)+x1;
		if(xxB>=xL && xxB<=xR)
		flag[3]=1;
	/* case-4 : Point of intersection at y=yT */
	xxT=1/m*(yT-y1)+x1;
		if(xxT>=xL && xxT<=xR)
		flag[4]=1;
		if(flag[1]==0 && flag[2]==0 && flag[3]==0 && flag[4]==0)
		{
		outtextxy(50,400,"**Sorry No Clipping possible.**");
		}
		else
		{
		px1=x1;
		py1=y1;
		px4=x2;
		py4=y2;
			if(flag[1]==1 && flag[2]==1)
			{
			px2=xL;
			py2=yyL;
			px3=xR;
			py3=yyR;
			}
			else if(flag[1]==1 && flag[3]==1)
			{
			px2=xL;
			py2=yyL;
			px3=xxB;
			py3=yB;
			}
			else if(flag[1]==1 && flag[4]==1)
			{
			px2=xL;
			py2=yyL;
			px3=xxT;
			py3=yT;
			}
			else if(flag[2]==1 && flag[3]==1)
			{
			px2=xR;
			py2=yyR;
			px3=xxB;
			py3=yB;
			}
			else if(flag[2]==1 && flag[4]==1)
			{
			px2=xR;
			py2=yyR;
			px3=xxT;
			py3=yT;
			}
			else if(flag[3]==1 && flag[4]==1)
			{
			px2=xxB;
			py2=yB;
			px3=xxT;
			py3=yT;
			}
		n=bresenham_line_draw(px1,py1,px2,py2,x,y);
				for(i=0;i<=n;i++)
				{
				putpixel(320+x[i],240-y[i],3);
				delay(5000);
				}
		n=bresenham_line_draw(px2,py2,px3,py3,x,y);
				for(i=0;i<=n;i++)
				{
				putpixel(320+x[i],240-y[i],4);
				delay(5000);
				}
		n=bresenham_line_draw(px3,py3,px4,py4,x,y);
				for(i=0;i<=n;i++)
				{
				putpixel(320+x[i],240-y[i],2);
				delay(5000);
				}
		/* To display Caption */
		sprintf(a,"P(%d,%d)",px1,py1);
		outtextxy(320+px1,240-py1,a);
		sprintf(a,"P1(%d,%d)",px2,py2);
		outtextxy(320+px2, 240-py2,a);
		sprintf(a,"Q1(%d,%d)",px3,py3);
		outtextxy(320+px3, 240-py3,a);
		sprintf(a,"Q(%d,%d)",px4,py4);
		outtextxy(320+px4, 240-py4,a);
		}
	}

	int signx(int x)
	{
		if(x<0)
		return -1;
		else if(x==0)
		return 0;
		else
		return 1;
	}

	int bresenham_line_draw(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int dx1,dy1,dx,dy,temp;
	int xx,yy,e,s1,s2,interchange;
	int i;
	dx1=x2-x1;
	dy1=y2-y1;
	s1=signx(x2-x1);
	s2=signx(y2-y1);
		if(dx1<0)
		dx=-dx1;
		else
		dx=dx1;

		if(dy1<0)
		dy=-dy1;
		else
		dy=dy1;
	/*printf("dx=%d dx1=%d dy=%d dy1=%d\n",dx,dx1,dy,dy1);*/
		if(dy>dx)
		{
		temp=dy;
		dy=dx;
		dx=temp;
		interchange=1;
		}
		else
		interchange=0;
	e=2*dy-dx;
	xx=x1;
	yy=y1;
	x[0]=xx;
	y[0]=yy;
		for(i=0;i<=dx;i++)
		{
		x[i]=xx;
		y[i]=yy;
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
		e=e+2*dy;
		}
		/*
	printf("\n<===(x,y) points===>\n");
		for(i=0;i<dx;i++)
		printf("(%d,%d)\n",x[i],y[i]);
		getch();
	*/
	return dx;
	}

	/* void linedraw(int x1,int y1,int x2,int y2,int x[],int y[],int c):
	Function to darw a line using Brsesenham line darw algorithm. */
	void linedraw(int x1,int y1,int x2,int y2,int c)
	{
	int n,i;
	int x[700],y[700];
	n=bresenham_line_draw(x1,y1,x2,y2,x,y);
		for(i=0;i<=n;i++)
		{
		putpixel(x[i],y[i],c);
		delay(5000);
		}
	}


