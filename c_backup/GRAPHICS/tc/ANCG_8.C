	/*ancg_8.c: Write a program to take reflection
	along a general line*/
	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int n,c;
	int ta,tb;
	float cost,sint;
	void draw_xy();
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
	void dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	void line_draw(int x[],int y[],int n1,int c1);
	int round1(float x);
	void general(int x1,int y1,int x2,int y2,int x3,int y3,int x11,int y11,int x22,int y22);
	void main()
	{
	int x1,y1,x2,y2,x3,y3,x11,y11,x22,y22;
	char a[100];
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
	printf("Enter x-end point of general line x11=");
	scanf("%d",&x11);
	printf("Enter y-end point of general line y11=");
	scanf("%d",&y11);
	printf("Enter x-end point of general line x22=");
	scanf("%d",&x22);
	printf("Enter y-end point of general line y22=");
	scanf("%d",&y22);
	printf("Enter cos(theta) of slope of line=");
	scanf("%f",&cost);
	printf("Enter sin(theta) of slope of line=");
	scanf("%f",&sint);
	printf("Enter x-translation ta=");
	scanf("%d",&ta);
	printf("Enter y-translation tb=");
	scanf("%d",&tb);
	printf("Enter color code(1,2,3,4,5,15)=");
	scanf("%d",&c);
	draw_xy();
	general(x1,y1,x2,y2,x3,y3,x11,y11,x22,y22);
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
		delay(1500);
		}
		for(i=0;i<=479;i++)
		{
		putpixel(320,i,15);
		delay(1500);
		}
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(20,245,"-X");
	outtextxy(600,245,"+X");
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
		delay(1500);
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
void general(int x1,int y1,int x2,int y2,int x3,int y3,int x11,int y11,int x22,int y22)
	{
	int i,j,k;
	char a[100];
	int x1r, y1r, x2r, y2r, x3r, y3r;
	float rot[3][3],rotinv[3][3],tr[3][3],trinv[3][3], refx[3][3],p[3][3];

	rot[0][0]=cost;
	rot[0][1]=-sint;
	rot[1][0]=sint;
	rot[1][1]=cost;
	rot[0][2]=0;
	rot[1][2]=0;
	rot[2][2]=1;

	rotinv[0][0]=cost;
	rotinv[0][1]=sint;
	rotinv[1][0]=-sint;
	rotinv[1][1]=cost;
	rotinv[0][2]=0;
	rotinv[1][2]=0;
	rotinv[2][2]=1;



        tr[0][0]=1;
	tr[0][1]=0;
	tr[0][2]=ta;
	tr[1][0]=0;
	tr[1][1]=1;
	tr[1][2]=tb;
	tr[2][0]=0;
	tr[2][1]=0;
	tr[2][2]=1;

	trinv[0][0]=1;
	trinv[0][1]=0;
	trinv[0][2]=-ta;
	trinv[1][0]=0;
	trinv[1][1]=1;
	trinv[1][2]=-tb;
	trinv[2][0]=0;
	trinv[2][1]=0;
	trinv[2][2]=1;
	/* to take matrix product */
	/*	for(i=0;i<3;i++)
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
	*/
	x1s=round1(sx*x1);
	y1s=round1(sy*y1);
	x2s=round1(sx*x2);
	y2s=round1(sy*y2);
	x3s=round1(sx*x3);
	y3s=round1(sy*y3);

	triangle_draw(x1,y1,x2,y2,x3,y3);
	triangle_draw(x1s,y1s,x2s,y2s,x3s,y3s);
	sprintf(a,"A1(%d,%d)",x1s,y1s);
	outtextxy(320+x1s,240-y1s,a);
	sprintf(a,"B1(%d,%d)",x2s,y2s);
	outtextxy(320+x2s,240-y2s,a);
	sprintf(a,"C1(%d,%d)",x3s,y3s);
	outtextxy(320+x3s,240-y3s,a);
	}








