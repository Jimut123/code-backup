#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int c_bgcolor,c_line;
void draw_xy();
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
void line_draw(int x1,int y1,int x2,int y2,int c);
int dda(int x1,int y1,int x2,int y2,int x[],int y[]);
int main()
{
	int x1,y1,x2,y2,x,y,dx,dy;
	float delx,dely;
	int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	printf("\nEnter x coord of 1st pt:");
	scanf("%d",&x1);
	printf("\nEnter y coord of 1st pt:");
	scanf("%d",&y1);
	printf("\nEnter x coord of 2nd pt:");
	scanf("%d",&x2);
	printf("\nEnter x coord of 2nd pt:");
	scanf("%d",&y2);
	printf("\nEnter bkgrnd color--:>");
	scanf("%d",&c_bgcolor);
	printf("\nEnter Line color:");
	scanf("%d",&c_line);
	draw_xy();
	line_draw(x1,y1,x2,y2,c_line);
	getch();
	return 0;
}
void draw_xy()
{         int i;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	clrscr();
	setbkcolor(c_bgcolor);
	for(i=0;i<640;i++)
	{
		putpixel(i,240,c_line);
		delay(5);
	}
	for(i=0;i<480;i++)
	{
		putpixel(320,i,c_line);
		delay(5);
	}
	outtextxy(10,245,"-X");
	outtextxy(630,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(323,10,"+Y");
	outtextxy(325,468,"-Y");
}
void line_draw(int x1,int y1,int x2,int y2,int c)
{
	int x[700],y[700],i,n;
	char b[80];
	n=dda(x1,y1,x2,y2,x,y);
	sprintf(b,"A(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,b);
	for(i=0;i<n;i++)
	{
		putpixel(320+x[i],240-y[i],c);
		delay(2);
	}
	sprintf(b,"B(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,b);
}
int dda(int x1,int y1,int x2,int y2,int x[],int y[])
{
	float e;
	int s1,s2,dx,dy,t,interchange,length,xx,yy,i=0;
	dx=abs(x2-x1);
	dy=abs(y2-y1);
	s1=(x2-x1)/dx;
	s2=(y2-y1)/dy;
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
	xx=x1;
	yy=y1;
		while(i<=dx)
		{
		    x[length]=xx;
		    y[length]=yy;
		    length++;
		    if(e>=0)
		    {
			if(interchange==1)
				xx=xx+s1;
			else
				yy=yy+s2;
			e=e-2*dx;
		    }
		    else{
			   if(interchange==1)
				yy=yy+s2;
			   else
				xx=xx+s1;

			e=e+2*dy;
			i++;

		    }

		}
		return length;
}