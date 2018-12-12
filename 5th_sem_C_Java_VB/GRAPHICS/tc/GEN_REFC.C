	/* gen_ref.c : Write a program to implement reflection
	along a general line : y=mx+c.*/

	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int c,bgcolor;
	int a,b,num,den;
	int n;
	int xm1,ym1,xm2,ym2,xm3,ym3;
	void draw_xy();
	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x1,int y1,int x2,int y2);
	void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3);
   void translation(int x1,int y1,int x2,int y2,int x3,int y3,int xa,int ya);
     void rotation(int x1,int y1,int x2,int y2,int x3,int y3,float theta);
     void reflection(int x1,int y1,int x2,int y2,int x3,int y3,int ch);
     void general_reflection(int x1,int y1,int x2,int y2,int x3,int y3);
     void plot_line(int x[],int y[],int n);
	void main()
	{
	int x1,y1,x2,y2,x3,y3;
	float m;
	clrscr();
	printf("\nEnter x co-ordinate of Vertex A :");
	scanf("%d",&x1);
	printf("Enter y co-ordinate of Vertex A :");
	scanf("%d",&y1);
	printf("Enter x co-ordinate of Vertex B :");
	scanf("%d",&x2);
	printf("Enter y co-ordinate of Vertex B :");
	scanf("%d",&y2);
	printf("Enter x co-ordinate of Vertex C :");
	scanf("%d",&x3);
	printf("Enter y co-ordinate of Vertex C :");
	scanf("%d",&y3);
	printf("Enter x-translation factor along x-axis(a)=");
	scanf("%d",&a);
	printf("Enter y-translation factor along y-axis(b)=");
	scanf("%d",&b);
	printf("Enter numerator of slope(m) :");
	scanf("%d",&num);
	printf("Enter denominator of slope(m) :");
	scanf("%d",&den);
	printf("Enter Background Color code(1-14)=");
	scanf("%d",&bgcolor);
	printf("Enter Color of line(1-14)=");
	scanf("%d",&c);
	draw_xy();
	general_reflection(x1,y1,x2,y2,x3,y3);
	getch();
	closegraph();
	}

	/* void general_reflection(int x1,int y1,int x2,int y2,int x3.int y3):
	Function to apply reflection along a general straight line.*/

	void general_reflection(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	int xa,yb;
	float th1,theta;
	int x[700],y[700];
	/* To draw Initial triangle */
	draw_triangle(x1,y1,x2,y2,x3,y3);

	/* General reflection comprises of 5 transformations.
	(i) Inverse translation
	(ii)Inverse Rotation
	(iii) Reflection along x-axis
	(iv)Rotation
	(v)Translation
	*/

	/* Inverse translation starts */
	xa=-a;
	yb=b;
	translation(x1,y1,x2,y2,x3,y3,xa,yb);

	/*Inverse Rotation Starts */
	theta=atan(num/(float)den);
	th1=-theta;

	/* Copying transformed x,y co-ordinates */

	x1=xm1;
	y1=ym1;
	x2=xm2;
	y2=ym2;
	x3=xm3;
	y3=xm3;
	rotation(x1,y1,x2,y2,x3,y3,th1);


	/* Reflection along x-axis starts */

	/* Copying transformed x,y co-ordinates */

	x1=xm1;
	y1=ym1;
	x2=xm2;
	y2=ym2;
	x3=xm3;
	y3=ym3;

	reflection(x1,y1,x2,y2,x3,y3,1); /* Taking reflection along x-axis */


	/* Rotation transformation starts */

	th1=theta;
	/* Copying transformed x,y co-ordinates */

	x1=xm1;
	y1=ym1;
	x2=xm2;
	y2=ym2;
	x3=xm3;
	y3=ym3;

	rotation(x1,y1,x2,y2,x3,y3,th1);

	/* Translation transformation starts */

	xa=a;
	yb=b;
        x1=xm1;
	y1=ym1;
	x2=xm2;
	y2=ym2;
	x3=xm3;
	y3=ym3;

	translation(x1,y1,x2,y2,x3,y3,xa,yb);

	/* Reflection along general axis is over */
	draw_triangle(xm1,ym1,xm2,ym2,xm3,ym3);


	}


	/* void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3) :
	Function to draw a triangle */

	void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	 line_draw(x1,y1,x2,y2);
	 line_draw(x2,y2,x3,y3);
	 line_draw(x3,y3,x1,y1);
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
	bresenham(x1,y1,x2,y2,x,y);
	plot_line(x,y,n);
	}

	/* int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]) :
	   Function to generate all points using Integer generalized
	   bresenham  algorithm */

	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[])
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
	n=delx;
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

        /* void rotation(int x1,int y1,int x2,int y2,int x3,int y3,float theta) :
	Function to implement rotation. */

   void rotation(int x1,int y1,int x2,int y2,int x3,int y3,float theta)
	{
	int obj[3][3];
	float obj1[3][3];
	float rot[3][3];
	int i,j,k;
	char a1[80];

	/* To initialize Rotation Matrix */

		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			rot[i][j]=0;
		/*
		rot[0][0]=1.0/sqrt(1+theta*theta);
		rot[0][1]=-theta*rot[0][0];
		rot[1][0]=-rot[0][1];
		rot[1][1]=rot[0][0]; */

		rot[0][0]=cos(theta*3.141593/180);
		rot[0][1]=-sin(theta*3.141593/180);
		rot[1][0]=sin(theta*3.141593/180);;
		rot[1][1]=cos(theta*3.141593/180);
		rot[2][2]=1;

	/* To construct object matrix */
	obj[0][0]=x1;
	obj[0][1]=x2;
	obj[0][2]=x3;
	obj[1][0]=y1;
	obj[1][1]=y2;
	obj[1][2]=y3;
	obj[2][0]=1;
	obj[2][1]=1;
	obj[2][2]=1;
	/* To get co-ordinate of transformed triangle */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			obj1[i][j]=0;
				for(k=0;k<3;k++)
				obj1[i][j]=obj1[i][j]+rot[i][k]*obj[k][j];
			}
	xm1=obj1[0][0];
	xm2=obj1[0][1];
	xm3=obj1[0][2];
	ym1=obj1[1][0];
	ym2=obj1[1][1];
	ym3=obj1[1][2];
/*	printf("x1=%d y1=%d x2=%d y2=%d x3=%d y3=%d\n",x1,y1,x2,y2,x3,y3);
printf("xr1=%d yr1=%d xr2=%d yr2=%d xr3=%d yr3=%d\n",xm1,ym1,xm2,ym2,xm3,ym3);
	getch(); */

	/* To draw initial object */
	/*
	draw_triangle(x1,y1,x2,y2,x3,y3);
	sprintf(a1,"A(%d,%d)",x1,y1);
	outtextxy(325+x1,245-y1,a1);
	sprintf(a1,"B(%d,%d)",x2,y2);
	outtextxy(325+x2,245-y2,a1);
	sprintf(a1,"C(%d,%d)",x3,y3);
	outtextxy(325+x3,245-y3,a1);
	outtextxy(360+x3,260-y3,"Before Rotation");
	*/
	/* To draw modified object */
	/*
	draw_triangle(xm1,ym1,xm2,ym2,xm3,ym3);
	sprintf(a1,"A'(%d,%d)",xm1,ym1);
	outtextxy(325+xm1,245-ym1,a1);
	sprintf(a1,"B'(%d,%d)",xm2,ym2);
	outtextxy(325+xm2,245-ym2,a1);
	sprintf(a1,"C'(%d,%d)",xm3,ym3);
	outtextxy(325+xm3,245-ym3,a1);
	sprintf(a1,"After Rotation by %6.1f degree\n",theta);
	outtextxy(360+xm3,260-ym3,a1); */
	}

	/* void reflection(int x1,int y1,int x2,int y2,int x3,int y3,int ch) :
	Function to take reflection about any standard axis. */

	void reflection(int x1,int y1,int x2,int y2,int x3,int y3,int ch)
	{
	int ref[3][3],obj[3][3],obj1[3][3];
	int i,j,k;
	char a[80];
	/* To construct Reflection Matrix */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			ref[i][j]=0;
		if(ch==1)
		{
		ref[0][0]=1;
		ref[1][1]=-1;
		ref[2][2]=1;
		}
		else if(ch==2)
		{
		ref[0][0]=-1;
		ref[1][1]=1;
		ref[2][2]=1;
		}
		else if(ch==3)
		{
		ref[0][1]=1;
		ref[1][0]=1;
		ref[2][2]=1;
		}
		else if(ch==4)
		{
		ref[0][1]=-1;
		ref[1][0]=-1;
		ref[2][2]=1;
		}
	/* To construct object matrix */
	obj[0][0]=x1;
	obj[0][1]=x2;
	obj[0][2]=x3;
	obj[1][0]=y1;
	obj[1][1]=y2;
	obj[1][2]=y3;
	obj[2][0]=1;
	obj[2][1]=1;
	obj[2][2]=1;
	/* To get co-ordinate of transformed triangle */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			obj1[i][j]=0;
				for(k=0;k<3;k++)
				obj1[i][j]=obj1[i][j]+ref[i][k]*obj[k][j];
			}
	xm1=obj1[0][0];
	xm2=obj1[0][1];
	xm3=obj1[0][2];
	ym1=obj1[1][0];
	ym2=obj1[1][1];
	ym3=obj1[1][2];

	/* To draw initial object */
	/*
	draw_triangle(x1,y1,x2,y2,x3,y3);
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(325+x1,245-y1,a);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(325+x2,245-y2,a);
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(325+x3,245-y3,a);
	outtextxy(360+x3,260-y3,"Before Refelection");
	*/
	/* To draw modified object */
	/*
	draw_triangle(xm1,ym1,xm2,ym2,xm3,ym3);
	sprintf(a,"A'(%d,%d)",xm1,ym1);
	outtextxy(325+xm1,245-ym1,a);
	sprintf(a,"B'(%d,%d)",xm2,ym2);
	outtextxy(325+xm2,245-ym2,a);
	sprintf(a,"C'(%d,%d)",xm3,ym3);
	outtextxy(325+xm3,245-ym3,a);
	outtextxy(360+xm3,260-ym3,"After Refelection");
	*/
	}

/* void translation(int x1,int y1,int x2,int y2,int x3,int y3,int a,int b) :
	Function to implement scaling. */

   void translation(int x1,int y1,int x2,int y2,int x3,int y3,int a,int b)
	{
	int obj[3][3],obj1[3][3];
	int tra[3][3];
	int i,j,k;
	char a1[90];

	/* To construct scaling Matrix */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			tra[i][j]=0;
		tra[0][2]=a;
		tra[1][2]=b;
		tra[2][2]=1;

	/*  3 lines added below this */

		tra[0][0]=1;
		tra[1][1]=1;
		tra[2][2]=1;

	/* To construct object matrix */
	obj[0][0]=x1;
	obj[0][1]=x2;
	obj[0][2]=x3;
	obj[1][0]=y1;
	obj[1][1]=y2;
	obj[1][2]=y3;
	obj[2][0]=1;
	obj[2][1]=1;
	obj[2][2]=1;
	/* To get co-ordinate of transformed triangle */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			obj1[i][j]=0;
				for(k=0;k<3;k++)
				obj1[i][j]=obj1[i][j]+tra[i][k]*obj[k][j];
			}
	xm1=obj1[0][0];
	xm2=obj1[0][1];
	xm3=obj1[0][2];
	ym1=obj1[1][0];
	ym2=obj1[1][1];
	ym3=obj1[1][2];

	/* To draw initial object */
	draw_triangle(x1,y1,x2,y2,x3,y3);
	/*
	sprintf(a1,"A(%d,%d)",x1,y1);
	outtextxy(325+x1,245-y1,a1);
	sprintf(a1,"B(%d,%d)",x2,y2);
	outtextxy(325+x2,245-y2,a1);
	sprintf(a1,"C(%d,%d)",x3,y3);
	outtextxy(325+x3,245-y3,a1);
	outtextxy(360+x3,260-y3,"Before Translation");
	*/
	/* To draw modified object */
	/*getch();*/

	draw_triangle(xm1,ym1,xm2,ym2,xm3,ym3);
	/*
	sprintf(a1,"A'(%d,%d)",xm1,ym1);
	outtextxy(325+xm1,245-ym1,a1);
	sprintf(a1,"B'(%d,%d)",xm2,ym2);
	outtextxy(325+xm2,245-ym2,a1);
	sprintf(a1,"C'(%d,%d)",xm3,ym3);
	outtextxy(325+xm3,245-ym3,a1);
	outtextxy(360+xm3,260-ym3,"After Translation");
	*/
	}





































