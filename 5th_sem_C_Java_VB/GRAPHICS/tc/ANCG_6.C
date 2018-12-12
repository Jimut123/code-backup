	/*ancg_6.c: Write a program to scale  a triangle */
	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int n,c;
	void draw_xy();
void scale(int x1,int y1,int x2,int y2,int x3,int y3,float sx,float sy);
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
	void dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x[],int y[],int n1,int c1);
	int round1(float x);
	void main()
	{
	int x1,y1,x2,y2,x3,y3;
	char a[100];
	float sx,sy;
	clrscr();
	printf("\nEnter x-point of point-A=");
	scanf("%d",&x1);
	printf("Enter y-point of point-A=");
	scanf("%d",&y1);
	printf("Enter x-point of point-B=");
	scanf("%d",&x2);
	printf("Enter y-point of point-B=");
	scanf("%d",&y2);
	printf("Enter x-point of point-C=");
	scanf("%d",&x3);
	printf("Enter y-point of point-C=");
	scanf("%d",&y3);
	printf("Enter scale factor along x-axis(sx)=");
	scanf("%f",&sx);
	printf("Enter scale factor along y-axis(sy)=");
	scanf("%f",&sy);
	printf("Enter color code(1,2,3,4,5,15)=");
	scanf("%d",&c);
	draw_xy();
	scale(x1,y1,x2,y2,x3,y3,sx,sy);
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,a);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,a);
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(320+x3,240-y3,a);
	getch();
	}
	void draw_xy()
	{
	int i;
	int gd=DETECT, gm;
	initgraph(&gd,&gm,"c://turboc3//bgi");
	setbkcolor(6);
		for(i=0;i<=639;i++)
		{
		putpixel(i,240,15);
		delay(5);
		}
		for(i=0;i<=479;i++)
		{
		putpixel(320,i,15);
		delay(5);
		}
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(10,245,"-X");
	outtextxy(620,245,"+X");
	}
	int round1(float x)
	{
	int ix,s;
	float x1,xx;
	ix=x;
		if(x<0)
		s=-1;
		else
		s=1;
	x1=x-ix;
		if(x1<0)
		xx=-x1;
		else
		xx=x1;
		if(xx>=.5)
		{
			if(s==1)
			ix=ix+1;
			else
			ix=ix-1;
		}
	return ix;
	}

	void dda(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int i,dx,dy,dx1,dy1,length;
	float delx,dely,xx,yy;
	dx=x2-x1;
	dy=y2-y1;
		if(dx<0)
		dx1=-dx;
		else
		dx1=dx;
		if(dy<0)
		dy1=dy;
		else
		dy1=dy;
		if(dx1>dy1)
		length=dx1;
		else
		length=dy1;
	delx=(float)dx/length;
	dely=(float)dy/length;
	xx=x1;
	yy=y1;
	x[0]=x1;
	y[0]=y1;
		for(i=1;i<=length;i++)
		{
		xx=xx+delx;
		yy=yy+dely;
		x[i]=round1(xx);
		y[i]=round1(yy);
		}
	n=length;
	}
	void line_draw(int x[], int y[],int n1,int c1)
	{
	int i;
		for(i=0;i<=n1;i++)
		{
		putpixel(320+x[i],240-y[i],c1);
		delay(5);
		}
	}
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	int x[700],y[700];
	dda(x1,y1,x2,y2,x,y); /* To draw line AB */
	line_draw(x,y,n,c);
	dda(x2,y2,x3,y3,x,y); /* To draw line BC */
	line_draw(x,y,n,c);
	dda(x3,y3,x1,y1,x,y); /* To draw line CA */
	line_draw(x,y,n,c);
	}
void scale(int x1,int y1,int x2,int y2,int x3,int y3,float sx,float sy)
	{
	int i,j,k;
	char a[100];
	int x1s, y1s, x2s, y2s,x3s, y3s;
	float rot[3][3],t[3][3],p[3][3];
	rot[0][0]=sx;
	rot[0][1]=0;
	rot[1][0]=0;
	rot[1][1]=sy;
	rot[0][2]=0;
	rot[1][2]=0;
	rot[2][2]=1;
	t[0][0]=x1;
	t[1][0]=y1;
	t[2][0]=1;
	t[0][1]=x2;
	t[1][1]=y2;
	t[2][1]=1;
	t[0][2]=x3;
	t[1][2]=y3;
	t[2][2]=1;
	/* To take matrix product */
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			p[i][j]=0;
				for(k=0;k<3;k++)
				p[i][j]=p[i][j]+rot[i][k]*t[k][j];
			}
	x1s=round1(p[0][0]);
	y1s=round1(p[1][0]);
	x2s=round1(p[0][1]);
	y2s=round1(p[1][1]);
	x3s=round1(p[0][2]);
	y3s=round1(p[1][2]);
	triangle_draw(x1,y1,x2,y2,x3,y3);
	triangle_draw(x1s,y1s,x2s,y2s,x3s,y3s);
	sprintf(a,"A1(%d,%d)",x1s,y1s);
	outtextxy(320+x1s,240-y1s,a);
	sprintf(a,"B1(%d,%d)",x2s,y2s);
	outtextxy(320+x2s,240-y2s,a);
	sprintf(a,"C1(%d,%d)",x3s,y3s);
	outtextxy(320+x3s,240-y3s,a);
	}








