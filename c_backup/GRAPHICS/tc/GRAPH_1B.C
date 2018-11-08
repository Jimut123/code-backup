	/* graph_1a.c : Write a program to draw a line using
	DDA algorithm. */
	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int dda(int x1,int y1,int x2,int y2, int x[],int y[]);
	void plot(int x[],int y[],int n);
	int round1(float x);
	void main()
	{
	/*int gd=DETECT, gm;*/
	int x1,y1,x2,y2;
	int x[1000],y[1000],n,i;
	clrscr();
	printf("\nEnter x-cordinate of A=");
	scanf("%d",&x1);
	printf("Enter y-cordinate of A=");
	scanf("%d",&y1);
	printf("Enter x-cordinate of B=");
	scanf("%d",&x2);
	printf("Enter y-cordinate of B=");
	scanf("%d",&y2);

	/*initgraph(&gd,&gm,"c://turboc3//BGI");*/
	n=dda(x1,y1,x2,y2,x,y);
	printf("\nPress any key to display all points--->\n");
	getch();
	for(i=0;i<=n;i++)
	{
	printf("x(%d)=%d  y(%d)=%d\n",i,x[i],i,y[i]);
		if((i+1)%20==0)
		{
		printf("\nPress any key to continue--->");
		getch();
		clrscr();
		}
	}
	printf("\nPress any key to draw a line--->");
	getch();
	plot(x,y,n);
	getch();
	closegraph();
	}

	int dda(int x1,int y1,int x2,int y2, int x[],int y[])
	{
	int i,n;
	float dx,dy,delx,dely,length,xx,yy;
	dx=x2-x1;
	dy=y2-y1;
		if(abs(dx)>=abs(dy))
		length=abs(dx);
		else
		length=abs(dy);
	n=0;
	x[n]=round1(x1);
	y[n]=round1(y1);
	n=1;
	delx=dx/length;
	dely=dy/length;
	xx=x1;
	yy=y1;
		while(n<=length)
		{
		xx=xx+delx;
		yy=yy+dely;
		x[n]=round1(xx);
		y[n]=round1(yy);
		n=n+1;
		}
	return length;
	}
	void plot(int x[],int y[],int n)
	{
	int i;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c://turboc3//BGI");
		for(i=0;i<=n;i++)
		putpixel(x[i],y[i],3);
	}

	int round1(float x)
	{
	float x1,x2;
	int x3;
	x3=(int)x;
	x1=x-x3;
		if(x1<0)
		x1=-x1;
		if(x1>=.5)
		{
			if(x3<0)
			x3=x3-1;
			else
			x3=x3+1;
		}
	return x3;
	}

