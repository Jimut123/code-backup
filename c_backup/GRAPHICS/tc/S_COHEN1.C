	/*s_cohen1.c: Write a program to find Clipped portion
	in a viewing window using sutherland cohen algorithm.*/
	#include<stdio.h>
	#include<graphics.h>
	int line_color, bg_color;
	int xL,xR,yB,yT;
	void line_draw(int x1,int y1,int x2,int y2, int c);
       int bresenham_line_draw(int x1,int y1,int x2,int y2, int x[],int y[]);
	void draw_xy();
	int signx(int x);
	void sutherland_cohen_algorithm(int x1,int y1,int x2,int y2);
	int bit_code(int x1,int y1);
	int bitwise_and(int x1,int y1,int x2,int y2);
	void draw_viewing_window();
	int main()
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
	printf("Enter x-cordinate of Point A=");
	scanf("%d",&x1);
	printf("Enter y-coordinate of Point A=");
	scanf("%d",&y1);
	printf("Enter x-cordinate of Point B=");
	scanf("%d",&x2);
	printf("Enter y-coordinate of Point B=");
	scanf("%d",&y2);
	printf("Enter Back Ground Color Code(2-14)=");
	scanf("%d",&bg_color);
	printf("Enter Line Color Code(2-15)=");
	scanf("%d",&line_color);
	draw_xy();
	draw_viewing_window();
	sutherland_cohen_algorithm(x1,y1,x2,y2);
	getch();
	return 0;
	}

	/* void draw_viewing_window() : Function to draw viewing window */
	void draw_viewing_window()
	{
	char a[80];
	line_draw(xL,yB,xR,yB,line_color); /* drawing line from (xL,yB) to (xR,yB) */
	line_draw(xR,yB,xR,yT,line_color); /* drawing line from (xR,yB) to (xR,yT) */
	line_draw(xR,yT,xL,yT,line_color); /* drawing line from (xR,yT) to (xL,yT) */
	line_draw(xL,yT,xL,yB,line_color); /* drawing line from (xL,yT) to (xL,yB) */
	sprintf(a,"A(%d,%d)",xL,yB);
	outtextxy(320+xL,240-yB,a);
	sprintf(a,"B(%d,%d)",xR,yB);
	outtextxy(320+xR,240-yB,a);
	sprintf(a,"C(%d,%d)",xR,yT);
	outtextxy(320+xR,240-yT,a);
	sprintf(a,"C(%d,%d)",xL,yT);
	outtextxy(320+xL,240-yT,a);
	}

	/* int bit_code(int x1,int y1) : Function to return bit code
	of any point. */

	int bit_code(int x1,int y1)
	{
	int flag;
	flag=1; /* flag=1 means the point is invisible */
		if(x1>=xL && x1<=xR && y1>=yB && y1<=yT)
		flag=0;
	return flag;
	}

	/* int bit_wise_and(int x1,int y1,int x2,int y2) : Function to
	perform bit wise and operation of 2 end points of a line */

	int bit_wise_and(int x1,int y1,int x2,int y2)
	{
	int bit1[5],bit2[5],flag,i;
	/* To generate bit code of (x1,y1) */
		if(x1>=xL)
		bit1[1]=0;
		else
		bit1[1]=1;
		if(x1<=xR)
		bit1[2]=0;
		else
		bit1[2]=1;
		if(y1>=yB)
		bit1[3]=0;
		else
		bit1[3]=1;
		if(y1<=yT)
		bit1[4]=0;
		else
		bit1[4]=1;

	/* To generate bit code of (x2,y2) */
		if(x2>=xL)
		bit2[1]=0;
		else
		bit2[1]=1;
		if(x2<=xR)
		bit2[2]=0;
		else
		bit2[2]=1;
		if(y2>=yB)
		bit2[3]=0;
		else
		bit2[3]=1;
		if(y2<=yT)
		bit2[4]=0;
		else
		bit2[4]=1;

	/* To perform bit wise and operation of two end points of a line */
	flag=0; /* flag=0 means the line is  partially visible */
		for(i=1;i<5;i++)
		{
		flag=bit1[i] & bit2[i];
			if(flag==1)
			break;
		}
	return flag;
	}

	/* void sutherland_cohen_algorithm(int x1,int y1,int x2,int y2) :
	Function to implement sutherland cohen algorithm. */

	void sutherland_cohen_algorithm(int x1,int y1,int x2,int y2)
	{
	int px1,py1,px2,py2,px3,py3,px4,py4;
	float m; /* m=slope */
	int b1,b2;
	int region[5];
	char a[80];
	b1=bit_code(x1,y1);
	b2=bit_code(x2,y2);
		if(b1==0 || b2==0)
		{
		outtextxy(50,300,"**Clipping not Possible. Invalid points**");
		return;
		}
	b1=bit_wise_and(x1,y1,x2,y2);
		if(b1==1)
		{
                outtextxy(50,300,"**Clipping not Possible. Invalid points**");
		return;
		}
	m=(float)(y2-y1)/(float)(x2-x1);
	/* To caculate point of intersection at x=xL : Region-1 */
	py1=m*(xL-x1)+y1;
	px1=xL;
		if(py1>=yB && py1<=yT)
		region[1]=1;
		else
		region[1]=0;

	/* To caculate point of intersection at x=xR : Region-2 */
	py2=m*(xR-x1)+y1;
	px2=xR;
		if(py2>=yB && py2<=yT)
		region[2]=1;
		else
		region[2]=0;

	/* To caculate point of intersection at y=yB : Region-3 */
	px3=x1+1.0/m*(yB-y1);
	py3=yB;
		if(px3>=xL && px3<=xR)
		region[3]=1;
		else
		region[3]=0;

	/* To caculate point of intersection at y=yT : Region-4 */
	px4=x1+1.0/m*(yT-y1);
	py4=yT;
		if(px4>=xL && px4<=xR)
		region[4]=1;
		else
		region[4]=0;
	    if(region[1]==0 && region[2]==0 && region[3]==0 && region[4]==0)
		{
		outtextxy(50,300,"**Sorry! No Clipped portion**");
		return;
		}

		if( region[1]==1 && region[2]==1)
		{
		line_draw(x1,y1,px1,py1,2);
		line_draw(px1,py1,px2,py2,3);
		line_draw(px2,py2,x2,y2,4);

		sprintf(a,"P(%d,%d)",x1,y1);
		outtextxy(320+x1,240-y1,a);
		sprintf(a,"P1(%d,%d)",px1,py1);
		outtextxy(320+px1,240-py1,a);
		sprintf(a,"Q1(%d,%d)",px2,py2);
		outtextxy(320+px2,240-py2,a);
		sprintf(a,"Q(%d,%d)",x2,y2);
		outtextxy(320+x2,240-y2,a);

		}
		else if(region[1]==1 && region[3]==1)
		{
		line_draw(x1,y1,px1,py1,2);
		line_draw(px1,py1,px3,py3,3);
		line_draw(px3,py3,x2,y2,4);

                sprintf(a,"P(%d,%d)",x1,y1);
		outtextxy(320+x1,240-y1,a);
		sprintf(a,"P1(%d,%d)",px1,py1);
		outtextxy(320+px1,240-py1,a);
		sprintf(a,"Q1(%d,%d)",px3,py3);
		outtextxy(320+px3,240-py3,a);
		sprintf(a,"Q(%d,%d)",x2,y2);
		outtextxy(320+x2,240-y2,a);
		}
		else if(region[1]==1 && region[4]==1)
		{
		line_draw(x1,y1,px1,py1,2);
		line_draw(px1,py1,px4,py4,3);
		line_draw(px4,py4,x2,y2,4);

                sprintf(a,"P(%d,%d)",x1,y1);
		outtextxy(320+x1,240-y1,a);
		sprintf(a,"P1(%d,%d)",px1,py1);
		outtextxy(320+px1,240-py1,a);
		sprintf(a,"Q1(%d,%d)",px4,py4);
		outtextxy(320+px4,240-py4,a);
		sprintf(a,"Q(%d,%d)",x2,y2);
		outtextxy(320+x2,240-y2,a);
		}

                else if(region[2]==1 && region[3]==1)
		{
		line_draw(x1,y1,px2,py2,2);
		line_draw(px2,py2,px3,py3,3);
		line_draw(px3,py3,x2,y2,4);

                sprintf(a,"P(%d,%d)",x1,y1);
		outtextxy(320+x1,240-y1,a);
		sprintf(a,"P1(%d,%d)",px2,py2);
		outtextxy(320+px2,240-py2,a);
		sprintf(a,"Q1(%d,%d)",px3,py3);
		outtextxy(320+px3,240-py3,a);
		sprintf(a,"Q(%d,%d)",x2,y2);
		outtextxy(320+x2,240-y2,a);
		}

		else if(region[2]==1 && region[4]==1)
		{
		line_draw(x1,y1,px2,py2,2);
		line_draw(px2,py2,px4,py4,3);
		line_draw(px4,py4,x2,y2,4);

                sprintf(a,"P(%d,%d)",x1,y1);
		outtextxy(320+x1,240-y1,a);
		sprintf(a,"P1(%d,%d)",px2,py2);
		outtextxy(320+px2,240-py2,a);
		sprintf(a,"Q1(%d,%d)",px4,py4);
		outtextxy(320+px4,240-py4,a);
		sprintf(a,"Q(%d,%d)",x2,y2);
		outtextxy(320+x2,240-y2,a);
		}

		else if(region[3]==1 && region[4]==1)
		{
		line_draw(x1,y1,px3,py3,2);
		line_draw(px3,py3,px4,py4,3);
		line_draw(px4,py4,x2,y2,4);

                sprintf(a,"P(%d,%d)",x1,y1);
		outtextxy(320+x1,240-y1,a);
		sprintf(a,"P1(%d,%d)",px3,py3);
		outtextxy(320+px3,240-py3,a);
		sprintf(a,"Q1(%d,%d)",px4,py4);
		outtextxy(320+px4,240-py4,a);
		sprintf(a,"Q(%d,%d)",x2,y2);
		outtextxy(320+x2,240-y2,a);
		}
	}


	/* void draw_xy() : Function to dusplay x-axis, y-axis. */

	void draw_xy()
	{
	int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"c://tc//bgi");
	setbkcolor(bg_color);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,line_color);
		delay(5000);
		}

	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,line_color);
		delay(5000);
		}
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(320,20,"+Y");
	outtextxy(320,460,"-Y");
	outtextxy(325,245,"O(0,0)");
	}

	/* void line_draw(int x1,int y1,int x2,int y2,int c) : Function to
	draw a straight line */
	void line_draw(int x1,int y1,int x2,int y2,int c)
	{
	int x[700],y[700],i,n;
	n=bresenham_line_draw(x1,y1,x2,y2,x,y); /* calling bresenham function */

		for(i=0;i<=n;i++)
		{
		putpixel(320+x[i], 240-y[i], c);
		delay(5000);
		}
	}

	/* int bresenham_line_draw(int x1,int y1,int x2,int y2,int x[],int y[]) : Function to
	generate all points of a line using bresenham method. */
	int bresenham_line_draw(int x1,int y1,int x2,int y2, int x[],int y[])
	{
	 int dx,dy,dx1,dy1,s1,s2,interchange,t,i,e;
	 int xx,yy;
	 dx1=x2-x1;
	 dy1=y2-y1;
		if(dx1<0)
		dx=-dx1;
		else
		dx=dx1;
		if(dy1<0)
		dy=-dy1;
		else
		dy=dy1;
		s1=signx(x2-x1);
		s2=signx(y2-y1);
	 /* Interchange opeartion */
		if(dy>dx)
		{
		t=dy;
		dy=dx;
		dx=t;
		interchange=1;
		}
		else
		interchange=0;
	 xx=x1;
	 yy=y1;
	 e=2*dy-dx; /* Initial error value */
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
	 return dx;
	 }

	 /* int signx(int x) : Function to get sign value of any integer */

	 int signx(int x)
	 {
		if(x<0)
		return -1;
		else if(x==0)
		return 0;
		else
		return 1;
	 }






