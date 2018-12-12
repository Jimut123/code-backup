#include<stdlib.h>
#include<math.h>
#include<conio.h>
#include<stdio.h>
#include<graphics.h>
int c=15;
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
void draw_circle(int r,int xc,int yc)
{

	int xk=0,yk=r,x0=xc,y0=yc;
	float d,pk;
	//int gd=DETECT,gm,i;
	//initgraph(&gd,&gm,"C://TurboC3//BGI");
	while(yk>=0)
	{
		//printf("%d,%d",xk,yk);
		//draw_axes();
		putpixel(xk+320+xc,240-yk+yc,c);
		putpixel(320+xk+xc,240+yk+yc,c);
		putpixel(320-xk+xc,240+yk+yc,c);
		putpixel(320-xk+xc,240-yk+yc,c);
		//line_draw(x0,y0,xk,yk,c);
		d=(xk+1)*(xk+1)+(yk-1)*(yk-1) -r*r;
		if(d<0)
		{
			pk=(xk+1)*(xk+1)+(yk-0.5)*(yk-0.5)-r*r;
			if(pk<=0)
			{
				xk=xk+1;
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
			    }
		}
		else
		{
			xk=xk+1;
			yk=yk+1;
		}
	}
}
void reflec_circle1(int r,int xc,int yc)
{
   int xk=0,yk=r,x0=xc,y0=yc;
	float d,pk;
	//int gd=DETECT,gm,i;
	//initgraph(&gd,&gm,"C://TurboC3//BGI");
	while(yk>=0)
	{
		//printf("%d,%d",xk,yk);
		//draw_axes();

		//line_draw(x0,y0,xk,-yk,c);
		putpixel(320+xk,240+yk+yc,15);
		putpixel(xk+320+xc,240-yc-yk,15);
		putpixel(320-xk,240+yk+yc,15);
		line_draw(x0,y0,-xk,-(-yk),c);
		d=(xk+1)*(xk+1)+(yk-1)*(yk-1) -r*r;
		if(d<0)
		{
			pk=(xk+1)*(xk+1)+(yk-0.5)*(yk-0.5)-r*r;
			if(pk<=0)
			{
				xk=xk+1;
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
			    }
		}
		else
		{
			xk=xk+1;
			yk=yk+1;
		}
	}
}
void reflec_circle2(int r,int xc,int yc)
{
   int xk=0,yk=r,x0=xc,y0=yc;
	float d,pk;
	//int gd=DETECT,gm,i;
	//initgraph(&gd,&gm,"C://TurboC3//BGI");
	while(yk>=0)
	{
		//printf("%d,%d",xk,yk);
		//draw_axes();
		//putpixel(320-xk,240+yk+yc,15);
		//line_draw(x0,y0,-xk,-yk,c);
		putpixel(320+xk,240+yk+yc,15);
		putpixel(xk+320+xc,240-yc-yk,15);
		putpixel(320-xk,240+yk+yc,15);
		line_draw(x0,y0,-xk,-(-yk),c);
		d=(xk+1)*(xk+1)+(yk-1)*(yk-1) -r*r;
		if(d<0)
		{
			pk=(xk+1)*(xk+1)+(yk-0.5)*(yk-0.5)-r*r;
			if(pk<=0)
			{
				xk=xk+1;
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
			    }
		}
		else
		{
			xk=xk+1;
			yk=yk+1;
		}
	}
}
void reflec_circle3(int r,int xc,int yc)
{
   int xk=0,yk=r,x0=xc,y0=yc;
	float d,pk;
	//int gd=DETECT,gm,i;
	//initgraph(&gd,&gm,"C://TurboC3//BGI");
	while(yk>=0)
	{
		//printf("%d,%d",xk,yk);
		//draw_axes();
		//putpixel(320-xk,240-yk-yc,15);
		//line_draw(x0,y0,-xk,-(-yk),c);
		putpixel(320+xk,240+yk+yc,15);
		putpixel(xk+320+xc,240-yc-yk,15);
		putpixel(320-xk,240+yk+yc,15);
		line_draw(x0,y0,-xk,-(-yk),c);
		d=(xk+1)*(xk+1)+(yk-1)*(yk-1) -r*r;
		if(d<0)
		{
			pk=(xk+1)*(xk+1)+(yk-0.5)*(yk-0.5)-r*r;
			if(pk<=0)
			{
				xk=xk+1;
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
			    }
		}
		else
		{
			xk=xk+1;
			yk=yk+1;
		}
	}
}
void draw_axes()
{
	int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	//setbkcolor(c_bgcolor);
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
int main()
{
	int r,x1,y1;
	clrscr();
	printf("\nEnter r:");
	scanf("%d",&r);
	printf("\nEnter xc:");
	scanf("%d",&x1);
	printf("\nEnter yc:");
	scanf("%d",&y1);
	getch();
	clrscr();
	draw_axes();
	draw_circle(r,x1,y1);
	reflec_circle1(70,0,0);
	reflec_circle2(50,0,0);
	reflec_circle3(20,0,0);
	getch();
	//closegraph();
	return 0;
}