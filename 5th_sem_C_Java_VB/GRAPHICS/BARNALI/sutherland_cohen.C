//sutherland and cohen
#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int xl=320,xr=0,yt=0,yb=240;
int c_bgcolor,c_line;
void draw_xy();
void line_draw(int x1, int y1, int x2, int x3, int line_c);
int brhl(int x1, int y1, int x2, int y2,int x[], int y[]);
void bitcode(int x[], int p[]);
void sut_coh(int p[], int q[]);
int main()
{
	int cw[4][2],p[2],q[2];
	int i,bp[4],bq[4],flag=0;
	char a[50];
	clrscr();

	printf("\nEnter the values of clipping window: ");
	for(i=0;i<4;i++)
	{
		printf("\nx co-ordinate of point %d: ",i+1);
		scanf("%d",&cw[i][0]);
		if(cw[i][0]>xr)
			xr=cw[i][0];
		else if(cw[i][0]<xl)
			xl=cw[i][0];

		printf("\ny co-ordinate of point %d: ",i+1);
		scanf("%d",&cw[i][1]);
		if(cw[i][1]>yt)
			yt=cw[i][1];
		else if(cw[i][1]<yb)
			yb=cw[i][1];
	}
//	printf("\n xl=%d xr=%d yt=%d yb=%d ",xl,xr,yt,yb);
	printf("\nEnter the 2 points ");
	
	printf("\nx%d: ",1);
	scanf("%d",&p[0]);
	printf("\ny%d: ",1);
	scanf("%d",&p[1]);
	printf("\nx%d: ",2);
	scanf("%d",&q[0]);
	printf("\ny%d: ",2);
	scanf("%d",&q[1]);
	bitcode(bp,p);
	bitcode(bq,q);
	printf("\nEnter background color(2-14) ");
	scanf("%d",&c_bgcolor);
	printf("\nEnter line color(1 or 15) ");
	scanf("%d",&c_line);
	draw_xy();
	for(i=0;i<3;i++)
	{
		line_draw(cw[i][0],cw[i][1],cw[i+1][0],cw[i+1][1],c_line);
	}
	line_draw(cw[i][0],cw[i][1],cw[0][0],cw[0][1],c_line);
	for(i=0;i<4;i++)
	{	
		if(bp[i]==1 && bq[i]==1)
			flag=1;
	}
	if(flag==1)
	{
		outtextxy(20,400,"Line not visible");
	}
		else
		sut_coh(p,q);
	getch();
	return 0;
}
void bitcode(int x[],int p[])
{
	int i;
	for(i=0;i<4;i++)
		x[i]=0;
	if(p[1]>yt)
		x[0]=1;
	if(p[1]<yb)
		x[1]=1;
	if(p[0]>xr)
		x[2]=1;
	if(p[0]<xl)
		x[3]=1;
}
void sut_coh(int p[], int q[])
{
	float m,x,y;
	int x1[2],y1[2],i=0;
	char a[50];
	m=(float)(q[1]-p[1])/(q[0]-p[0]);
	y=(float)m*(xl-p[0])+p[1];
	if(y<=yt && y>=yb)
	{
		x1[i]=xl;
		y1[i]=(int)y;
		i++;
	}
	y=(float)m*(xr-p[0])+p[1];
	if(y<=yt && y>=yb)
	{
		x1[i]=xr;
		y1[i]=(int)y;
		i++;
	}
	x=(float)p[0]+(yb-p[1])/m;
	if(x<=xr && x>=xl)
	{
		x1[i]=(int)x;
		y1[i]=yb;
		i++;
	}
	x=(float)p[0]+(yt-p[1])/m;
	if(x<=xr && x>=xl)
	{
		x1[i]=(int)x;
		y1[i]=yt;
		i++;
	}
	line_draw(p[0],p[1],x1[0],y1[0],c_line);
	line_draw(x1[0],y1[0],x1[1],y1[1],15);
	line_draw(x1[1],y1[1],q[0],q[1],c_line);
	sprintf(a,"(%d,%d)",p[0],p[1]);
	outtextxy(320+p[0],240-p[1],a);
	sprintf(a,"(%d,%d)",q[0],q[1]);
	outtextxy(320+q[0],240-q[1],a);
	sprintf(a,"(%d,%d)",x1[0],y1[0]);
	outtextxy(320+x1[0],240-y1[0],a);
	sprintf(a,"(%d,%d)",x1[1],y1[1]);
	outtextxy(320+x1[1],240-y1[1],a);
}
void draw_xy()
{
	int i;
	int gd=DETECT, gm;
	initgraph(&gd,&gm,"c://turboc3//bgi");
	setbkcolor(c_bgcolor);
	//to draw the axes
		for(i=0;i<640;i++)
		{
			putpixel(i,240,c_line);
			delay(2);
		}
		for(i=0;i<480;i++)
		{
			putpixel(320,i,c_line);
			delay(2);
		}
	//to display -X,+X,-Y,+Y,O(0,0)
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
}
void line_draw(int x1, int y1, int x2, int y2, int line_c)
{
	int x[700], y[700], i,n;
	n=brhl(x1,y1,x2,y2,x,y);//to generate n pixel coordinates
	//to plot all points
		for(i=0;i<n;i++)
		{
			putpixel(320+x[i],240-y[i],line_c);
			delay(10);
		}
}
int brhl(int x1, int y1, int x2, int y2,int xx[], int yy[])
{
	int dx, dy, s1, s2, interchange, t, e, x, y, i;
	dx=abs(x2-x1);
	dy=abs(y2-y1);
	if((x2-x1)<0)
		s1=-1;
	else if((x2-x1)>0)
		s1=1;
	else
		s1=0;
	if((y2-y1)<0)
		s2=-1;
	else if((y2-y1)>0)
		s2=1;
	else
		s2=0;
	if(dy>dx)
	{
		t=dy;
		dy=dx;
		dx=t;
		interchange=1;
	}
	else
		interchange=0;
	e=2*dy-dx;
	x=x1;
	y=y1;
	for(i=0;i<=dx;i++)
	{
		xx[i]=x;
		yy[i]=y;
		while(e>=0)
		{
			if(interchange==1)
				x=x+s1;
			else
				y=y+s2;
			e=e-2*dx;
		}
		if(interchange==1)
			y=y+s2;
		else
			x=x+s1;
		e=e+2*dy;
	}
	return i;
}