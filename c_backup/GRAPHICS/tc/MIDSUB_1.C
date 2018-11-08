	/* midsub_1.c : Write a program to implement mid point
	subdivision clipping algorithm.*/

	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>

	int c,bgcolor;
	int xL,xR,yB,yT;
	void draw_xy();
	void draw_window();
	int bit_code(int x1,int y1);
	int bit_and(int x1,int y1,int x2,int y2);
	int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x1,int y1,int x2,int y2);
	void plot_line(int x[],int y[],int n);
 void mid_point(int x1,int y1,int x2,int y2);
	void main()
	{
	int x1,y1,x2,y2;
	clrscr();


	printf("\nEnter xL of viewing window :");
	scanf("%d",&xL);
	printf("Enter xR of viewing window :");
	scanf("%d",&xR);
	printf("Enter yB of viewing window :");
	scanf("%d",&yB);
	printf("Enter yT of viewing window :");
	scanf("%d",&yT);
	printf("Enter x co-ordinate of end point P1 :");
	scanf("%d",&x1);
	printf("Enter y co-ordinate of end point P1 :");
	scanf("%d",&y1);
	printf("Enter x co-ordinate of end point P2 :");
	scanf("%d",&x2);
	printf("Enter y co-ordinate of end point P2 :");
        scanf("%d",&y2);
	printf("Enter Background Color code(1-14)=");
	scanf("%d",&bgcolor);
	printf("Enter Color of line(1-14)=");
	scanf("%d",&c);
	draw_xy();
	draw_window();
	mid_point(x1,y1,x2,y2);
	getch();
	closegraph();
	}

	/* void draw_window() : Function
	to draw viewing window to implement clipping algorithm. */

	void draw_window()
	{
	  int i,c1;
	  char a[100];
	  c1=15;

	  /* To draw xL-axis */

		for(i=yB;i<=yT;i++)
		{
		putpixel(320+xL,240-i,c1);
		delay(2000);
		}
	  /* To draw yT -axis */
		for(i=xL;i<=xR;i++)
		{
		putpixel(320+i,240-yT,c1);
		delay(2000);
		}
	  /* To draw xR axis */
		for(i=yT;i>=yB;i--)
		{
		putpixel(320+xR,240-i,c1);
		delay(2000);
		}
	  /* To draw yB-axis */
		for(i=xR;i>=xL;i--)
		{
		putpixel(320+i,240-yB,c1);
		delay(2000);
		}
	  sprintf(a,"A(%d,%d)",xL,yB);
	  outtextxy(325+xL,245-yB,a);
	  sprintf(a,"B(%d,%d)",xR,yB);
	  outtextxy(325+xR,245-yB,a);
	  sprintf(a,"C(%d,%d)",xR,yT);
	  outtextxy(325+xR,245-yT,a);
	  sprintf(a,"D(%d,%d)",xL,yT);
	  outtextxy(325+xL,245-yT,a);
	  }

/* void mid_point(int x1,int y1,int x2,int y2):
	Function to implement mid point subdivision clipping algorithm */
      void mid_point(int x1,int y1,int x2,int y2)
	{
	char a[80];
	int b1,b2;
	int xm,ym;
	int px1,py1,px2,py2;
	int i;
	int xx1,yy1,xx2,yy2;
	/* To apply sutherland cohen algorithm at two(2) end poins */

	b1=bit_code(x1,y1);
	b2=bit_code(x2,y2);
		if(b1==0 || b2==0)
		{
		outtextxy( 300,100,"Clipping not possible");
		getch();
		return;
		}
	b1=bit_and(x1,y1,x2,y2);
		if(b1 !=0)
		{
		outtextxy(300,100,"Line invisible");
		getch();
		return;
		}
	xm=(x1+x2)/2;
	ym=(y1+y2)/2;
	b1=bit_code(xm,ym);
		if(b1 != 0)
		{
		outtextxy(300,100,"Clipping not possible");
		getch();
		return;
		}
	/* To find first clipping point. Consider p1,pm */
	px1=0;
	py1=0;
	xx1=x1;
	yy1=y1;
	xx2=xm;
	yy2=ym;
		while(1)
		{
		xm=ceil((xx1+xx2)/2);
		ym=ceil((yy1+yy2)/2);
		b1=bit_code(xm,ym);
			if(b1==0)
			{
			xx2=xm;
			yy2=ym;
			}
			else
			{
			xx1=xm;
			yy1=ym;
			}
			if(xm==xL || xm==xR)
			{
			px1=xm;
			py1=ym;
			break;
			}
			else if(ym==yB || ym==yT)
			{
			px1=xm;
			py1=ym;
			break;
			}
		}

	/* To find second clipping point. Consider pm, p2 */
	px2=0;
	py2=0;
	xx1=xm;
	yy1=ym;
	xx2=x2;
	yy2=y2;
		while(1)
		{
		xm=floor((xx1+xx2)/2);
		ym=floor((yy1+yy2)/2);
		b1=bit_code(xm,ym);
			if(b1==0)
			{
			xx1=xm;
			yy1=ym;
			}
			else
			{
			xx2=xm;
			yy2=ym;
			}
			if(xm==xL || xm==xR)
			{
			px2=xm;
			py2=ym;
			break;
			}
			else if(ym==yB || ym==yT)
			{
			px2=xm;
			py2=ym;
			break;
			}
		}
	/* To plot (x1,y1) to (px1,py1) */
	line_draw(x1,y1,px1,py1);

	/* To plot (px1,py1) to (px2,py2) */
	line_draw(px1,py1,px2,py2);

	/* To plot (px2,py2) to (x2,y2) */
	line_draw(px2,py2,x2,y2);

	sprintf(a,"(%d,%d)",px1,py1);
	outtextxy(322+px1,242-py1,a);
	sprintf(a,"(%d,%d)",px2,py2);
	outtextxy(322+px2,242-py2,a);
	sprintf(a,"P1(%d,%d)",x1,y1);
	outtextxy(325+x1,245-y1,a);
	sprintf(a,"P2(%d,%d)",x2,y2);
	outtextxy(325+x2,245-y2,a);
	}

	/* int bit_code(int x1,int y1) : function to test value
	of bit-code of point (x1,y1). */

	int bit_code(int x1,int y1)
	{
	int r;
	r=0;
		if(x1<xL)
		r=1;
		else if(x1>xR)
		r=1;
		else if(y1<yB)
		r=1;
		else if(y1>yT)
		r=1;
	return r;
	}

	/* int bit_and(int x1,int y1,int x2,int y2 ) : Function to
	calculate bit and operation. */

	int bit_and(int x1,int y1,int x2,int y2 )
	{
	int flag,i;
	int bit_p1[5],bit_p2[5];

	/* To calculate bit code of x1,y1 */

                if(x1<xL)
		bit_p1[1]=1;
		else
		bit_p1[1]=0;

		if(x1>xR)
		bit_p1[2]=1;
		else
		bit_p1[2]=0;

		if(y1<yB)
		bit_p1[3]=1;
		else
		bit_p1[3]=0;

		if(y1>yT)
		bit_p1[4]=1;
		else
		bit_p1[4]=0;
		/* To calculate bit-code of (x2,y2)  */

		if(x2<xL)
		bit_p2[1]=1;
		else
		bit_p2[1]=0;

		if(x2>xR)
		bit_p2[2]=1;
		else
		bit_p2[2]=0;

		if(y2<yB)
		bit_p2[3]=1;
		else
		bit_p2[3]=0;

		if(y2>yT)
		bit_p2[4]=1;
		else
		bit_p2[4]=0;
	flag=0;
		for(i=1;i<5;i++)
		{
		flag=bit_p1[i] & bit_p2[i];
			if(flag !=0)
			break;
		}
	return flag;
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
	c=c+2;
	for(i=0;i<=n;i++)
	{
	putpixel(320+x[i],240-y[i],c);
	delay(2000);
	}
	}



































