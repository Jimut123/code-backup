#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
int c=15;
int dda(int x1,int y1,int x2,int y2,int x[],int y[]);
void draw_rect(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
{
	int x1a[700],y1a[700],x2a[700],y2a[700],x3a[700],y3a[700],x4a[700],y4a[700],i1,i2,i3,n1,n2,n3,n4;
	char a[80];
	n1=dda(x1,y1,x2,y2,x1a,y1a);
	n2=dda(x2,y2,x3,y3,x2a,y2a);
	n3=dda(x3,y3,x4,y4,x3a,y3a);
	n4=dda(x4,y4,x1,y1,x4a,y4a);
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(320+x1a[0],240-y1a[0],a);
	for(i1=0;i1<n1;i1++)
	{
		putpixel(320+x1a[i1],240-y1a[i1],c);
		delay(5);
	}
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(320+x1a[n1-1],240-y1a[n1-1],a);
	for(i2=0;i2<n2;i2++)
	{
		putpixel(320+x2a[i2],240-y2a[i2],c);
		delay(5);
	}
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(320+x2a[n2-1],240-y2a[n2-1],a);
	for(i3=0;i3<n3;i3++)
	{
		putpixel(320+x3a[i3],240-y3a[i3],c);
		delay(5);
	}
	sprintf(a,"D(%d,%d)",x4,y4);
	outtextxy(320+x3a[n3-1],240-y3a[n3-1],a);
	for(i3=0;i3<n4;i3++)
	{
		putpixel(320+x4a[i3],240-y4a[i3],c);
		delay(5);
	}
	n1=dda(x1,y1,x3,y3,x1a,y1a);
	for(i3=0;i3<n3;i3++)
	{
		putpixel(320+x1a[i3],240-y1a[i3],c);
		delay(5);
	}
	n1=dda(x2,y2,x4,y4,x1a,y1a);
	for(i3=0;i3<n3;i3++)
	{
		putpixel(320+x1a[i3],240-y1a[i3],c);
		delay(5);
	}



}
int round1(float x)
{
	int x1=x,s=0;
	float t=x;
	if(x<0)
		s=1;
	t=t-x1;
	if(t<0.5)
		return x1;
	else if(t>=0.5&&s)
		  return x1-1;
	return x1+1;
}
int dda(int x1,int y1,int x2,int y2,int x[],int y[])
{
	float delx,dely,xx,yy;
	int dx,dy,dx1,dy1,length,i;
	dx=x2-x1;
	dy=y2-y1;
	if(dx<0)
		dx1=-dx;
	else dx1=dx;
	if(dy<0)
		dy1=-dy;
	else dy1=dy;
	 if(dx1>dy1)
		length=dx1;
	 else length=dy1;

	delx=(float)dx/length;
	dely=(float)dy/length;


	xx=x1;
	yy=y1;
		for(i=0;i<length;i++)
		{
			x[i]=ceil(xx);
			y[i]=ceil(yy);
			xx=xx+delx;
			yy=yy+dely;
		}
		return length;
}
void draw_axes()
{
	int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	//setbkcolor(c_bgcolor);
	for(i=0;i<640;i++)
	{
		putpixel(i,240,15);
		delay(5);
	}
	for(i=0;i<480;i++)
	{
		putpixel(320,i,15);
		delay(5);
	}
	outtextxy(10,245,"-X");
	outtextxy(630,245,"+X");
	outtextxy(323,245,"O(0,0)");
	outtextxy(323,10,"+Y");
	outtextxy(323,470,"-Y");
}

int main()
{
	int a1,a2,b1,b2,c1,c2,d1,d2,x1,y1,x2,y2;
	clrscr();
	printf("\nEnter clipping window details:");
	printf("\nEnter coord of A:");
	scanf("%d %d",&a1,&a2);
	printf("\nEnter coord of B:");
	scanf("%d %d",&b1,&b2);
	printf("\nEnter coord of C:");
	scanf("%d %d",c1,&c2);
	printf("\nEnter coord of D:");
	scanf("%d %d",&d1,&d2);
	/*printf("\nEnter coord of P:");
	scanf("%d %d",&x1,&y1);
	printf("\nEnter coord of Q:");
	scanf("%d %d",&x2,&y2);  */
	draw_axes();
	draw_rect(a1,a2,b1,b2,c1,c2,d1,d2);
	getch();
	return 0;
}
