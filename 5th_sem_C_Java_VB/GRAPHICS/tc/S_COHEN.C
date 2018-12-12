	/* s_cohen.c : Write a program to implement sutherland cohen algorithm
	to implement clipping algorithm */

	#include<stdio.h>
	#include<graphics.h>
	int sign(int x);
	void line_draw(int x1,int y1,int x2,int y2);
	int n,c,c1;
	int xL,xR,yB,yT;
	void bresenham_algorithm(int x1,int y1,int x2,int y2,int x[],int y[]);
	void plot(int x[],int y[],int n);
	void draw_xy();
void rectangle_draw(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4);
      void s_cohen(int x1, int y1,int x2,int y2);
	int bit_code(int x1, int y1);
	void main()
	{
	int x1,y1,x2,y2,n,i;
		clrscr();
		printf("\nEnter end points of your view port--->\n");
		printf("\nEnter xL=");
		scanf("%d",&xL);
		printf("Enter xR=");
		scanf("%d",&xR);
		printf("Enter yB=");
		scanf("%d",&yB);
		printf("Enter yT=");
		scanf("%d",&yT);
		printf("Enter x1 of Point P1=");
		scanf("%d",&x1);
		printf("Enter y1 of Point P1=");
		scanf("%d",&y1);
		printf("Enter x2 of Point P2=");
		scanf("%d",&x2);
		printf("Enter y2 of Point P2=");
		scanf("%d",&y2);
		printf("Enter background color(6-8)=");
		scanf("%d",&c1);
		printf("Enter color of line(1-3)=");
		scanf("%d",&c);

		draw_xy();
		rectangle_draw(xL,yB,xR,yB,xR,yT,xL,yT);/* To draw rectangle*/
		s_cohen(x1,y1,x2,y2);
		getch();
		closegraph();
	}

	int sign(int x)
	{
		if(x<0)
		return -1;
		else if(x==0)
		return 0;
		else
		return 1;
	}

	void bresenham_algorithm(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int delx,dely,i,s1,s2;
	int e,temp,interchange;
	int xx,yy;
	int xc,yc;
	delx=x2-x1;
	dely=y2-y1;
	s1=sign(x2-x1);
	s2=sign(y2-y1);
		if(delx<0)
		delx=-delx;
		if(dely<0)
		dely=-dely;
	x[0]=x1;
	y[0]=y1;
	xx=x1;
	yy=y1;
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
	e=2*dely-delx;
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
		x[i]=xx;
		y[i]=yy;
		e=e+2*dely;
		}
	xc=320;
	yc=240;


	for(i=0;i<=delx;i++)
	{
	x[i]=x[i]+xc;
	y[i]=-y[i]+yc;
	}
	n=delx;
	}
	void plot(int x[],int y[],int n)
	{
	int i;
	c=c+2;
		for(i=0;i<=n;i++)
		{
		putpixel(x[i],y[i],c);
		delay(2500);
		}
	}

	void line_draw(int x1,int y1,int x2,int y2)
	{
	int x[700],y[700];
	bresenham_algorithm(x1,y1,x2,y2,x,y);
	plot(x,y,n);
	}

	void draw_xy()
	{
	int i;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c://tc//BGI");
	setbkcolor(c1);
	/* To plot x-axis */
		for(i=10;i<630;i++)
		{
		putpixel(i,240,15);
		delay(2500);
		}
	/* To plot y-axis */
		for(i=10;i<470;i++)
		{
		putpixel(320,i,15);
		delay(2500);
		}
	outtextxy(10,230,"-X"); /* To display -x */
	outtextxy(620,230,"+X"); /* To display +x */
	outtextxy(310,10,"+Y"); /* To display +y */
	outtextxy(310,470,"-Y"); /* To display -y */
	outtextxy(325,245,"O(0,0)"); /* To display O(0,0) */
	}
void rectangle_draw(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
	char a[80];
	line_draw(x1,y1,x2,y2); /* to draw line AB */
	line_draw(x2,y2,x3,y3); /* to draw line BC */
	line_draw(x3,y3,x4,y4); /* to draw line CD */
	line_draw(x4,y4,x1,y1); /* to draw line DA */
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(x1+325,245-y1,a);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(x2+325,245-y2,a);
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(x3+325,245-y3,a);
	sprintf(a,"D(%d,%d)",x4,y4);
	outtextxy(x4+325,245-y4,a);
	}
    /* Function to implement sutherland cohen algorithm to get clipping
    portion. */

	int bit_code(int x1,int y1)
	{
	int n;
	n=0;
		if(x1<xL || x1>xR || y1<yB || y1>yT)
		n=1;
	return n;
	}
	void s_cohen(int x1,int y1,int x2,int y2)
	{
	char a[100];
	float m;
	int num1,den1,b1,b2,xp1,yp1,xq1,yq1,xx1,yy1,xx2,yy2;
	b1=bit_code(x1,y1);
	b2=bit_code(x2,y2);
	xx1=-9999;
	yy1=-9999;
	xx2=-9999;
	yy2=-9999;

		if(b1==0 || b2==0)
		{
		outtextxy(10,350,"**There is no Clipping portion.**");
		line_draw(x1,y1,x2,y2);
		return;
		}
	m=(float)(y2-y1)/(x2-x1);
	/* case-1: To find intersection at x=xL axis */
	yp1=m*(xL-x1)+y1;
		if(yp1>=yB && yp1<=yT)
		{
		xx1=xL;
		yy1=yp1;
		}
	/* case-2: To find intersection at x=xR axis */
	yq1=m*(xR-x1)+y1;
		if(yq1>=yB && yq1<=yT)
		{
		xx2=xR;
		yy2=yq1;
		}
	/* case-3: To find intersection at y=yB axis */
	xp1=1.0/m*(y1-yB)+x1;
		if(xp1>=xL && xp1<=xR)
		{
			if(xx1 ==-9999)
			{
			xx1=xp1;
			yy1=yB;
			}
			else if(xx2==-9999)
			{
			xx2=xp1;
			yy1=yB;
			}
		}

	/* case-4: To find intersection at y=yT axis */
	xp1=1.0/m*(y1-yT)+x1;
		if(xp1>=xL && xp1<=xR)
		{
			if(xx1 ==-9999)
			{
			xx1=xp1;
			yy1=yB;
			}
			else if(xx2==-9999)
			{
			xx2=xp1;
			yy1=yB;
			}
		}
	line_draw(x1,y1,xx1,yy1); /* Drawing 1st line */
	sprintf(a,"P1(%d,%d)",x1,y1);
	outtextxy(325+x1,245-y1,a);
	line_draw(xx1,yy1,xx2,yy2); /* Drawing 2nd line */
	sprintf(a,"(%d,%d)",xx1,yy1);
	outtextxy(325+xx1,245-yy1,a);
	sprintf(a,"(%d,%d)",xx2,yy2);
	outtextxy(325+xx2,245-yy2,a);
	line_draw(xx2,yy2,x2,y2); /* Drawing 3rd line */
	sprintf(a,"P2(%d,%d)",x2,y2);
	outtextxy(325+x2,245-y2,a);
	}










