/*Write a program in “C” to Input co-ordinates of 4 corners of a rectangular bounded region ABCD.
Input co-ordinate of initial seed pixel ‘S’.
The program will fill the entire region with some new color.
Use seed fill algorithm.*/

        #include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int top;
	struct tag1
	{
	int x;
	int y;
	}stack[10000];
	int bgcolor;
	int xL,xR,yB,yT;
	void draw_xy();
	void draw_window();
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
		}
	  /* To draw yT -axis */
		for(i=xL;i<=xR;i++)
		{
		putpixel(320+i,240-yT,c1);
		}
	  /* To draw xR axis */
		for(i=yT;i>=yB;i--)
		{
		putpixel(320+xR,240-i,c1);
		}
	  /* To draw yB-axis */
		for(i=xR;i>=xL;i--)
		{
		putpixel(320+i,240-yB,c1);
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
			delay(0);
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
			putpixel(x1+320,240-y1,c1);
			}
		/* searching x+1,y+1 */
		 x1=xc+1;
		 y1=yc+1;
		 nc=getpixel(x1+320,240-y1);
		 delay(0);
			if(x1>=xL && x1<=xR && y1>=yB && y1<=yT && nc != c1)
			{
			top=top+1;
			stack[top].x=x1;
			stack[top].y=y1;
			putpixel(x1+320,240-y1,c1);
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
			putpixel(x1+320,240-y1,c1);
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
			putpixel(x1+320,240-y1,c1);
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
			putpixel(x1+320,240-y1,c1);
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
			putpixel(x1+320,240-y1,c1);
			delay(0);
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
			putpixel(x1+320,240-y1,c1);
			delay(0);
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
			putpixel(x1+320,240-y1,c1);
			delay(0);
			}
		}
	}
	  /* void draw_xy() : Function to draw x-axis and y-axis */

	  void draw_xy()
	  {
	  int gd=DETECT,gm;
	  int i,c1;
	  c1=15;
	  initgraph(&gd,&gm,"c://TurboC3//BGI");
	  setbkcolor(bgcolor); /* To set back ground color */

	  /* To draw x-axis */

		for(i=0;i<640;i++)
		{
		putpixel(i,240,c1);
		delay(0);
		}

	  /* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,c1);
		delay(0);
		}
	  outtextxy(10,245,"-X");
	  outtextxy(610,245,"+X");
	  outtextxy(325,20,"+Y");
	  outtextxy(325,460,"-Y");
	  outtextxy(325,245,"O(0,0)");
	  }