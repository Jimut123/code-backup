#include<stdio.h>
#include<graphics.h>
#include<conio.h>
int signx(int x);
void flag_draw();
void line_draw(int x1,int y1,int x2,int y2,int c);
int bresenham(int x1,int y1,int x2,int y2,int xa[],int ya[]);
void circle_draw(int xc,int yc,int r,int c);
int main()
{
    flag_draw();
    getch();
    closegraph();
    return 0;
}
void line_draw(int x1,int y1,int x2,int y2,int c)
{
    int xa[700],ya[700],i,n;
    n=bresenham(x1,y1,x2,y2,xa,ya);  /* Calling bresenham function to generate 'n' pixel co-ordinates */
    /* To plot all points */
    for(i=0;i<n;i++)
    {
	putpixel(320+xa[i],240-ya[i],c);
	delay(0);
    }
}
/* Function to generate pixel co-ordinates using Bresenham algorithm */
int bresenham(int x1,int y1,int x2,int y2,int xa[],int ya[])
{
   int xx,yy,delx,dely,e,s1,s2,interchange,temp;
   int i,dx,dy;
   xx=x1;
   yy=y1;
   dx=x2-x1;
   dy=y2-y1;
   if(dx<0)
     delx=-dx;
   else
     delx=dx;
   if(dy<0)
     dely=-dy;
   else
     dely=dy;
   s1=signx(dx);
   s2=signx(dy);
   if(dely>delx)
   {
     temp=dely;
     dely=delx;
     delx=temp;
     interchange=1;
   }
   else
     interchange=0;
   e=2*dely-delx;
   for(i=0;i<=delx;i++)
   {
     xa[i]=xx;
     ya[i]=yy;
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
   return delx;
 }
 int signx(int x)
 {
   if(x<0)
     return -1;
   else if(x==0)
     return 0;
   else
     return 1;
 }
 /* Function to draw a circle */
void circle_draw(int xc,int yc,int r,int c)
	{
	int xk,yk;
	int x[1000],y[1000];
	float d,pk;
	int n1,n2,n3,i;
	xk=0;
	yk=r;
	n3=0;
	/* To generate points in 1st quadrant */
		while(yk>=0)
		{
		x[n3]=xk;
		y[n3]=yk;
		d=(xk+1)*(xk+1)+(yk-1)*(yk-1)-r*r;
			if(d<0)
			{
			pk=(xk+1)*(xk+1)+(yk-.5)*(yk-.5)-r*r;
				if(pk<=0)
				xk=xk+1;
				else
				{
				xk=xk+1;
				yk=yk-1;
				}
			}
			else if(d>0)
			{
			pk=(xk+.5)*(xk+.5)+(yk-1)*(yk-1)-r*r;
				if(pk<=0)
				{
				xk=xk+1;
				yk=yk-1;
				}
				else
				yk=yk-1;
			}
			else
			{
			xk=xk+1;
			yk=yk-1;
			}
			if(yk>=0)
			n3=n3+1;
		}
	/* To take reflection along x-axis */
	n1=2*n3; /*n1=2*n3-1; */
	n2=n3-1;
		for(i=n3+1;i<=n1;i++)
		{
		x[i]=x[n2];
		y[i]=-y[n2];
		n2=n2-1;
		}
	/* To  take reflection along y-axis */
	n1=4*n3-1;
	n2=2*n3-1;
		/*for(i=2*n3;i<=n1;i++)*/
		for(i=2*n3+1;i<=n1;i++)
		{
		x[i]=-x[n2];
		y[i]=y[n2];
		n2=n2-1;
		}
	  /*To display all points
		for(i=0;i<=n1;i++)
		printf("x[%d]=%d  y[%d]=%d\n",i,x[i],i,y[i]);
	  */
	/* To draw circle */
		for(i=0;i<=n1;i++)
		{
		putpixel(320+xc+x[i],240-yc+y[i],c);
		delay(0);
		}
		n2=n1/24;
		for(i=0;i<=n1;i+=n2)
		line_draw(xc,yc,xc+x[i],yc+y[i],1);
	}
void flag_draw()
{
    int i,j,k,an;
    int gd=DETECT,gm;
    initgraph(&gd,&gm,"c://TurboC3//bgi");
    setbkcolor(14);
    /* To plot all points */
     for(i=0;i<440;i++)
     {
       putpixel(100+i,100,1);
       delay(0);
       putpixel(100+i,370,1);
       delay(0);
     }
     for(i=0;i<270;i++)
     {
       putpixel(100,100+i,1);
       delay(0);
       putpixel(540,100+i,1);
       delay(0);
     }
     for(i=0;i<440;i++)
     {
       putpixel(100+i,190,1);
       delay(0);
       putpixel(100+i,280,1);
       delay(0);
     }
     for(i=101;i<190;i+=90)
     {
       for(j=i;j<i+90;j++)
	 for(k=1;k<440;k++)
	   putpixel(100+k,j,12);
     }
     for(i=190;i<280;i+=90)
     {
       for(j=i;j<i+90;j++)
	 for(k=1;k<440;k++)
	   putpixel(100+k,j,15);
     }
     for(i=280;i<370;i+=90)
     {
       for(j=i;j<i+90;j++)
	 for(k=1;k<440;k++)
	   putpixel(100+k,j,10);
     }
     circle_draw(0,5,45,1);
}