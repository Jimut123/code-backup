#include<stdlib.h>
#include<math.h>
#include<conio.h>
#include<stdio.h>
#include<graphics.h>
int c=0;
int dda(int x1,int y1,int x2,int y2,int x[],int y[]);
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
void line_draw(int x1,int y1,int x2,int y2,int c)
{
	int x[700],y[700],i,n;
	n=dda(x1,y1,x2,y2,x,y);
	for(i=0;i<n;i++)
	{
		putpixel(320+x[i],240-y[i],c);
		delay(0);
	}
}
void draw_axes();
int draw_circle_bresenham(int r,int x[1000],int y[1000])
{

	int xk=0,yk=r,n=0;
	float d,pk;
	while(yk>=0)
	{
		x[n]=xk;
		y[n]=yk;
		n++;
		d=(xk+1)*(xk+1)+(yk-1)*(yk-1) -r*r;
		if(d<0)
		{
			pk=(xk+1)*(xk+1)+(yk-0.5)*(yk-0.5)-r*r;
			if(pk<=0)
			{
				xk=xk+1;
				yk=yk+0;
			}
			else{
			xk=xk+1;
			yk=yk-1;
			    }
		}
		else if(d>0)
		{
			pk=(xk+0.5)*(xk+0.5)+(yk-1)*(yk-1)-r*r;
			if(pk<=0)
			{
				xk=xk+1;
				yk=yk-1;
			}
			else{
			yk=yk-1;
			xk=xk*1;
			    }
		}
		else
		{
			xk=xk+1;
			yk=yk+1;
		}

	}
	return n;
}
void draw_axes()
{
	int i;
	/*int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	//setbkcolor(c_bgcolor);  */
	for(i=0;i<640;i++)
	{
		putpixel(i,240,15);
		delay(0);
	}
	for(i=0;i<480;i++)
	{
		putpixel(320,i,15);
		delay(0);
	}
	outtextxy(10,245,"-X");
	outtextxy(630,245,"+X");
	outtextxy(325,245,"O(0,0)");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"_Y");
}
void draw_circle(int r,int xc,int yc)
{
	int i,x[1000],y[1000],n;
	n=draw_circle_bresenham(r,x,y);
	for(i=0;i<n;i++)
	{
		putpixel((320+xc+x[i]),(240-yc-y[i]),2);
		//delay(2);
		putpixel((320+xc+x[i]),(240-yc+y[i]),1);
		//delay(2);
		putpixel((320+xc-x[i]),(240-yc+y[i]),10);
		//delay(2);
		putpixel((320+xc-x[i]),(240-yc-y[i]),12);
	       //	printf("\n X=%d, y=%d",x[i],y[i]);
		delay(1);
	}
}
void draw_car()
{
	int i,r=40;
	//draw body
	line_draw(-200,-100,-200,100,c);
	line_draw(-200,100,200,100,c);
	line_draw(200,100,200,-100,c);
	line_draw(-200,-100,-180,-100,c);
	for(i=0;i<=15;i++)
		draw_circle(r--,-140,-100);

	line_draw(-100,-100,100,-100,c);
	r=41;
	for(i=0;i<=15;i++)
		draw_circle(r--,140,-100);

	line_draw(180,-100,200,-100,c);


	//Door
	line_draw(-60,-80,-60,80,5);
	line_draw(-60,80,60,80,5);
	line_draw(60,80,60,-80,5);
	line_draw(60,-80,-60,-80,5);
	//window1
	line_draw(-150,20,-150,60,8);
	line_draw(-150,60,-110,60,8);
	line_draw(-110,60,-110,20,8);
	line_draw(-110,20,-150,20,8);
	//window2
	line_draw(150,20,150,60,6);
	line_draw(150,60,110,60,6);
	line_draw(110,60,110,20,6);
	line_draw(110,20,150,20,6);
	//roof
	line_draw(-200,100,0,150,8);
	line_draw(200,100,0,150,8);


}



int main()
{
	int r,x1,y1,i;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	clrscr();
	/*printf("\nEnter r:");
	scanf("%d",&r);
	printf("\nEnter xc:");
	scanf("%d",&x1);
	printf("\nEnter yc:");
	scanf("%d",&y1);
	getch();       */
	clrscr();
	//draw_axes();

	 //draw_circle(r,x1,y1);
	//draw_circle(r-10,x1,y1);
	//draw_circle(r-20,x1,y1);
	//draw_circle(3,x1,y1);
	draw_car();
	getch();
	closegraph();
	return 0;
}