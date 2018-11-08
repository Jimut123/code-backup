	/* seedfill.c : Write a program to implement seedfill
	algorithm.*/

	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int top;
	struct tag1
	{
	int x;
	int y;
	}stack[10000];
	int c,bgcolor;
	int xL,xR,yB,yT;
	void draw_xy();
	void draw_window();
	int bit_code(int x1,int y1);
	int bit_and(int x1,int y1,int x2,int y2);
	int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x1,int y1,int x2,int y2);
	void plot_line(int x[],int y[],int n);
 void seedfill(int x1,int y1);
	void main()
	{
	int x_seed,y_seed;
	char a[80];
	clrscr();
	printf("Enter xL of viewing window :");
	scanf("%d",&xL);
	printf("Enter xR of viewing window :");
	scanf("%d",&xR);
	printf("Enter yB of viewing window :");
	scanf("%d",&yB);
	printf("Enter yT of viewing window :");
	scanf("%d",&yT);
		while(1)
		{
		printf("Enter x co-ordinate of seed pixel :");
		scanf("%d",&x_seed);
		printf("Enter y co-ordinate of seed pixel :");
		scanf("%d",&y_seed);
		     if(x_seed < xL || x_seed >xR || y_seed<yB || y_seed>yT)
		     printf("\n***Invalid data.***\n");
		     else
		     break;
		}
	printf("Enter Background Color code(1-14)=");
	scanf("%d",&bgcolor);
	printf("Enter Color of line(1-14)=");
	scanf("%d",&c);
	draw_xy();
	draw_window();
	seedfill(x_seed,y_seed);
	sprintf(a,"Value of top in pixel stack=%d",top);
	outtextxy(20,20,a);
	getch();
	closegraph();
	}

	/* void draw_window() : Function
	to draw viewing window to implement clipping algorithm. */

	void draw_window()
	{
	  int i,c1;
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
	  outtextxy(310+xL,245-yB,"A");
	  outtextxy(325+xR,245-yB,"B");
	  outtextxy(325+xR,245-yT,"C");
	  outtextxy(310+xL,245-yT,"D");
	  }

/* void seedfill(int x_seed,int y_seed):
	Function to implement mid point seedfill algorithm */
      void seedfill(int x_seed,int y_seed)
	{
	char a[80];
	int b1,b2;
	int xc,yc;
	int nc;
	int c1;
	int top;
	int x1,y1;
	top=-1;
	c1=4;
	top=top+1;
	stack[top].x=x_seed;
	stack[top].y=y_seed;
	xc=x_seed;
	yc=y_seed;
	putpixel(xc+320,240-yc,c1);
		while(top!=-1)
		{
		xc=stack[top].x;
		yc=stack[top].y;
		top=top-1;
		nc=getpixel(xc+320,240-yc);
			if(nc !=c1)
			{
			putpixel(xc+320,240-yc,c1);
			delay(200);
			}

		/* To test 8 neighbours of corrently colored pixel */

		/* searching x+1,y */
		 x1=xc+1;
		 y1=yc;
		 nc=getpixel(x1+320,240-y1);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200);*/
			}
		/* searching x+1,y+1 */
		 x1=xc+1;
		 y1=yc+1;
		 nc=getpixel(x1+320,240-y1);
		 delay(200);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200);  */
			}

		 /* searching x,y+1 */
		 x1=xc;
		 y1=yc+1;
		 nc=getpixel(x1+320,240-y1);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200);*/
			}

		  /* searching x-1,y+1 */
		 x1=xc-1;
		 y1=yc+1;
		 nc=getpixel(x1+320,240-y1);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200); */
			}

		  /* searching x-1,y */
		 x1=xc-1;
		 y1=yc;
		 nc=getpixel(x1+320,240-y1);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200);*/
			}

		  /* searching x-1,y-1 */
		 x1=xc-1;
		 y1=yc-1;
		 nc=getpixel(x1+320,240-y1);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200); */
			}

		 /* searching x,y-1 */
		 x1=xc;
		 y1=yc-1;
		 nc=getpixel(x1+320,240-y1);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200); */
			}

		 /* searching x+1,y-1 */
		 x1=xc+1;
		 y1=yc-1;
		 nc=getpixel(x1+320,240-y1);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			/*putpixel(x1+320,240-y1,c1);
			delay(200);*/
			}
		}
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
	  initgraph(&gd,&gm,"f://tc//BGI");
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
	for(i=0;i<=n;i++)
	{
	putpixel(320+x[i],240-y[i],c);
	delay(2000);
	}
	}



































