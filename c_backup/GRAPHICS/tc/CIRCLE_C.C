	/* circle_c.c : Write a program to implement Bresenham
	Circle Draw Algorithm. */
	#include<stdio.h>
	#include<graphics.h>
	int c,bgcolor;
	void circle_draw(int xc,int yc,int r);
	void draw_xy();
	void plot_xy(int x[],int y[],int xc, int yc, int n);
	void main()
	{
	int xc,yc,r;
	clrscr();
	printf("\nEnter x co-ordinate of centre :");
	scanf("%d",&xc);
	printf("Enter y co-ordinate of centre :");
	scanf("%d",&yc);
	printf("Enter Radius of the circle=");
	scanf("%d",&r);
	printf("Enter Background Color code(1-14)=");
	scanf("%d",&bgcolor);
	printf("Enter Colour of Circle(1-14)=");
	scanf("%d",&c);
	circle_draw(xc,yc,r);
	getch();
	closegraph();
	}
	/* void circle_draw(int xc,int yc,int r) : Function to draw a
	circle using Bresenham algorithm */

	void circle_draw(int xc,int yc,int r)
	{
	int xk,yk,n,d;
	float pk;
	int x[1200],y[1200];
	int i,j,n1,n2;
	xk=0;
	yk=r;
	n=0;
		while(yk>=0)
		{
		n++;
		x[n]=xk;
		y[n]=yk;
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
			yk=yk+1;
			}
		}
	/* To take reflection of all points along x-axis */
	n1=2*n-1;
	j=n-1;
		for(i=n+1;i<=n1;i++)
		{
		x[i]=x[j];
		y[i]=-y[j];
		j=j-1;
		}
	/* To take reflection along y-axis */
	n2=4*n-4;
	j=n1-1;
		for(i=n1+1;i<=n2;i++)
		{
		x[i]=-x[j];
		y[i]=y[j];
		j=j-1;
		}
	printf("\nn1=%d n2=%d\n",n1,n2);
	getch();
		/* To display all points in 1st+2nd+3rd & 4-th quadrant */
			for(i=1;i<=n2;i++)
			{
			printf("x[%d]=%d y[%d]=%d\n",i,x[i],i,y[i]);
				if((i%20)==0)
				{
				printf("\nPress any key to continue--->");
				getch();
				clrscr();
				}
			}
	  n=n2;
	  printf("\nPress enter key to draw circle--->");
	  getch();
	  draw_xy();
	  plot_xy(x,y,xc,yc,n);
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

	  /* void plot_xy(int x[],int y[],int xc, int yc, int n) :Function
	  to draw circle */

	  void plot_xy(int x[],int y[],int xc, int yc, int n)
	  {
	  int i;
	  char a[80];
		for(i=1;i<=n;i++)
		{
		putpixel(x[i]+320+xc,240-y[i]-yc,c);
		delay(2000);
		}
	  sprintf(a,"C(%d,%d)",xc,yc);
	  outtextxy(xc+320,240-yc,a);
	  }















