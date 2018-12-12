	/* circle_b.c: Write a program to draw circle using
	bresenham circle draw algorithm */
	#include<stdio.h>
	#include<graphics.h>
	int bgcolor,c;
	void circle_draw(int xc,int yc,int r);
	void draw_xy();
	void plot_xy(int x[],int y[],int xc,int yc,int r,int n);
	void main()
	{
	int xc, yc,r;
	/*int gd=DETECT,gm;*/
	clrscr();
	printf("\nEnter x-cordinate of Centre(xc) :");
	scanf("%d",&xc);
	printf("Enter y-cordinate of Centre(yc) :");
	scanf("%d",&yc);
	printf("Enter radius=");
	scanf("%d",&r);
	printf("Enter color code(1-14) of Circle :");
	scanf("%d",&c);
	printf("Enter Back ground color code(1-14):");
	scanf("%d",&bgcolor);
	circle_draw(xc,yc,r);
	getch();
	closegraph();
	}

	/* void draw_xy() : Function draw x-axis and y-axis */

	void draw_xy()
	{
	int i;
	setbkcolor(bgcolor);
	/* To draw x-axis */
		for(i=0; i<640;i++)
		{
		putpixel(i,240,15);
		delay(2000);
		}

	/* To draw y-axis */
		for(i=0; i<480;i++)
		{
		putpixel(320,i,15);
		delay(2000);
		}
	/* To print +x,-x,+y,-y */
	 outtextxy(20,250,"-X");
	 outtextxy(600,250,"+X");
	 outtextxy(300,20,"+Y");
	 outtextxy(300,450,"-Y");
	 outtextxy(300,250,"O(0,0)");
	 }
	 /* void circle_draw(int xc,int yc,int r) : Function to
	 draw circle */
	 void circle_draw(int xc,int yc,int r)
	 {
	 int x[1200],y[1200];
	 int n,i,j,n1,n2;
	 int d;
	 float pk;
	 int xk,yk;
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
			yk=yk-1;
			}
		}

	 /* To take reflection along x-axis  and to generate points in 4-th
	 quadrant. */
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
		for(i=1;i<=n2;i++)
		{
		printf("x[%d]=%d  y[%d]=%d\n",i,x[i],i,y[i]);
			if(i%20==0)
			{
			printf("\nPress enter key to continue--->");
			getch();
			clrscr();
			}
		}
	 n=n2;
	 plot_xy(x,y,xc,yc,r,n);
	 }

	 /* void plot_xy(int x[],int y[],int xc,int yc,int r,int n) : Function to
	 plot x[], y[] points */
	 void plot_xy(int x[],int y[],int xc,int yc,int r,int n)
	 {
	 int i;
	 char a[100];
	 int gd=DETECT,gm;
	 initgraph(&gd,&gm,"c://tc//BGI");
	 draw_xy(); /* To draw x,y axes */
		for(i=1;i<=n;i++)
		{
		putpixel(320+x[i]+xc,240-yc-y[i],c);
		delay(2000);
		}
	 sprintf(a,"C(%d,%d), R=%d",xc,yc,r);
	 outtextxy(320+xc,240-yc,a);
	 }






