#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<math.h>
int x1,y1,x2,y2,x3,y3,x4,y4,p1,p2,q1,q2,ipx1,ipy1,ipx2,ipy2,ipx3,ipy3,ipx4,ipy4;
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
	//sprintf(a,"A(%d,%d)",x1,y1);
	//outtextxy(320+x1a[0],240-y1a[0],a);
	for(i1=0;i1<n1;i1++)
	{
		putpixel(320+x1a[i1],240-y1a[i1],c);
		delay(5);
	}
	//sprintf(a,"B(%d,%d)",x2,y2);
	//outtextxy(320+x1a[n1-1],240-y1a[n1-1],a);
	for(i2=0;i2<n2;i2++)
	{
		putpixel(320+x2a[i2],240-y2a[i2],c);
		delay(5);
	}
	//sprintf(a,"C(%d,%d)",x3,y3);
	//outtextxy(320+x2a[n2-1],240-y2a[n2-1],a);
	for(i3=0;i3<n3;i3++)
	{
		putpixel(320+x3a[i3],240-y3a[i3],c);
		delay(5);
	}
	//sprintf(a,"D(%d,%d)",x4,y4);
	//outtextxy(320+x3a[n3-1],240-y3a[n3-1],a);
	for(i3=0;i3<n4;i3++)
	{
		putpixel(320+x4a[i3],240-y4a[i3],c);
		delay(5);
	}
       /*	n1=dda(x1,y1,x3,y3,x1a,y1a);
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
	}*/



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
	//int gd=DETECT,gm;
	int i;
	//initgraph(&gd,&gm,"C://TurboC3//BGI");
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
	outtextxy(621,245,"+X");
	outtextxy(323,245,"O(0,0)");
	outtextxy(323,10,"+Y");
	outtextxy(325,468,"-Y");
}
void line_draw(int x1,int y1,int x2,int y2,int c)
{
	int x[700],y[700],i,n;
	n=dda(x1,y1,x2,y2,x,y);
	for(i=0;i<n;i++)
	{
		putpixel(320+x[i],240-y[i],c);
		delay(5);
	}
}
void suth_cohen()
{
	int l=x1,r=x2,b=y1,t=y3,flag=1;
	int bp[4],bq[4],i=0,n;
	float m,x,y;
		if(q1<t)
			bp[i++]=0;
		else
			bp[i++]=1;
		if(q1>b)
			bp[i++]=0;
		else
			bp[i++]=1;
		if(p1<r)
			bp[i++]=0;
		else
			bp[i++]=1;
		if(p1>l)
			bp[i++]=0;
		else
			bp[i++]=1;
		i=0;
		if(q2<t)
			bq[i++]=0;
		else
			bq[i++]=1;
		if(q2>b)
			bq[i++]=0;
		else
			bq[i++]=1;
		if(p2<r)
			bq[i++]=0;
		else
			bq[i++]=1;
		if(p2>l)
			bq[i++]=0;
		else
			bq[i++]=1;
		for(i=0;i<4;i++)
		{
			bp[i]=bp[i]&bq[i];
			if(bp[i]!=0)
				flag=0;
		}
		if(flag==0)
		{
			printf("\nLine not visible!");
			return ;
		}
		m=(q2-q1)/(float)(p2-p1);
		y=m*(l-p1)+q1;
		if(y>=b&&y<=t)
		{
			ipx1=l;
			ipy1=floor(y);
		}
		else
		{
			ipx1=-999;
			ipy1=-999;
		}
		y=m*(r-p1)+q1;

		if(y>=b&&y<=t)
		{
			ipx2=r;
			ipy2=floor(y);
		}
		else
		{
			ipx2=-999;
			ipy2=-999;
		}
		x=(1/m)*(b-q1)+p1;

		if(x>=l&&x<=r)
		{
			ipx3=floor(x);
			ipy3=b;
		}
		else
		{
			ipx3=-999;
			ipy3=-999;
		}
		x=(1/m)*(t-q1)+p1;
		if(x>=l&&x<=r)
		{
			ipx4=floor(x);
			ipy4=t;
		}
		else
		{
			ipx4=-999;
			ipy4=-999;
		}
		if(!((ipx1>=0&&ipy1>=0)||(ipx2>=0&&ipy2>=0)||(ipx3>=0&&ipy3>=0)||(ipx4>=0&&ipy4>=0)))
		{
			printf("\nNo intersecting point");
			return;

		}
		//printf("m=%f p1=%d p2=%d q1=%d q2=%d ipx1=%d ipy1=%d ipx2=%d ipy2=%d ipx3=%d ipy3=%d ipx4=%d ipy4=%d",m,p1,q1,p2,q2,ipx1,ipy1,ipx2,ipy2,ipx3,ipy3,ipx4,ipy4);

		if((ipx1>=0&&ipy1>=0)&&(ipx2>=0&&ipy2>=0))
		{
			line_draw(p1,q1,ipx1,ipy1,c-2);
			line_draw(ipx1,ipy1,ipx2,ipy2,c);
			line_draw(ipx2,ipy2,p2,q2,c-2);
		}
		else if((ipx1>=0&&ipy1>=0)&&(ipx3>=0&&ipy3>=0))
		{
			line_draw(p1,q1,ipx1,ipy1,c-2);
			line_draw(ipx1,ipy1,ipx3,ipy3,c);
			line_draw(ipx3,ipy3,p2,q2,c-2);
		}
		else if((ipx1>=0&&ipy1>=0)&&(ipx4>=0&&ipy4>=0))
		{
			line_draw(p1,q1,ipx1,ipy1,c-2);
			line_draw(ipx1,ipy1,ipx4,ipy4,c);
			line_draw(ipx4,ipy4,p2,q2,c-2);
		}
		else if((ipx2>=0&&ipy2>=0)&&(ipx3>=0&&ipy3>=0))
		{
			line_draw(p1,q1,ipx2,ipy2,c-2);
			line_draw(ipx2,ipy2,ipx3,ipy3,c);
			line_draw(ipx3,ipy3,p2,q2,c-2);
		}
		else if((ipx2>=0&&ipy2>=0)&&(ipx4>=0&&ipy4>=0))
		{
			line_draw(p1,q1,ipx2,ipy2,c-2);
			line_draw(ipx2,ipy2,ipx4,ipy4,c);
			line_draw(ipx4,ipy4,p2,q2,c-2);
		}
		if((ipx3>=0&&ipy3>=0)&&(ipx4>=0&&ipy4>=0))
		{
			line_draw(p1,q1,ipx3,ipy3,c-2);
			line_draw(ipx3,ipy3,ipx4,ipy4,c);
			line_draw(ipx4,ipy4,p2,q2,c-2);
		}
}
void midsub()
{
	int l=x1,r=x2,b=y1,t=y3,flag=1,pm1,pm2,pm3,pm4;
	int bp[4],bq[4],i=0,n,a1,a2,b1,b2;
	float m,x,y;
		if(q1<t)
			bp[i++]=0;
		else
			bp[i++]=1;
		if(q1>b)
			bp[i++]=0;
		else
			bp[i++]=1;
		if(p1<r)
			bp[i++]=0;
		else
			bp[i++]=1;
		if(p1>l)
			bp[i++]=0;
		else
			bp[i++]=1;
		i=0;
		if(q2<t)
			bq[i++]=0;
		else
			bq[i++]=1;
		if(q2>b)
			bq[i++]=0;
		else
			bq[i++]=1;
		if(p2<r)
			bq[i++]=0;
		else
			bq[i++]=1;
		if(p2>l)
			bq[i++]=0;
		else
			bq[i++]=1;
		for(i=0;i<4;i++)
		{
			bp[i]=bp[i]&bq[i];
			if(bp[i]!=0)
				flag=0;
		}
		if(flag==0)
		{
			printf("\nLine not visible!");
			return ;
		}
		a1=p1;
		a2=q1;
		b1=p2;
		b2=q2;
		pm1=(int)floor((a1+b1)/2);
		pm2=(int)floor((a2+b2)/2);
		pm3=(int)floor((a1+b1)/2);
		pm4=(int)floor((a2+b2)/2);
		//taking pmq
			    a1=pm1;
			    a2=pm2;
			    b1=p2;
			    b2=q2;
			    i=0;
		while(1)
		{

			    pm1=(int)floor((a1+b1)/2);
			    pm2=(int)floor((a2+b2)/2);
			    //printf("\na1=%d a2=%d b1=%d b2=%d pm1=%d pm2=%d",a1,a2,b1,b2,pm1,pm2);
			    //getch();
			    if(pm1<=r&&pm1>=l&&pm2<=t&&pm2>=b)
			    {
				a1=pm1;
				a2=pm2;
			    }
			    else
			    {
				b1=pm1;
				b2=pm2;
			    }
			    i++;
			    if((pm1==r||pm1==l)||(pm2==b||pm2==t))
				break;
			    else if(i==10000)
			    {
				printf("\nNo intersecting pt!");
				return;
			    }
		}
			//taking ppm
			    a1=p1;
			    a2=q1;
			    b1=pm3;
			    b2=pm4;
			    i=0;
			    //printf("\nstart ppm");
		while(1)
		{

			    pm3=floor((a1+b1)/2);
			    pm4=floor((a2+b2)/2);
			    //printf(" \na1=%d a2=%d b1=%d b2=%d pm3=%d pm4=%d",a1,a2,b1,b2,pm3,pm4);
			    //getch();
			    if(pm3<=r&&pm3>=l&&pm4<=t&&pm4>=b)
			    {
				b1=pm3;
				b2=pm4;
			    }
			    else
			    {
				a1=pm3;
				a2=pm4;
			    }
			    i++;
			    if((pm3==r||pm3==l)||(pm4==b||pm4==t))
				break;
			    else if(i==10000)
			    {
				printf("\nNo intersecting pt!");
				return;
			    }
		}
		if(pm1<pm3)
		{
		line_draw(p1,q1,pm1,pm2,c-2);
		line_draw(pm1,pm2,pm3,pm4,c);
		line_draw(pm3,pm4,p2,q2,c-2);
		}
		else
		{
		line_draw(p1,q1,pm3,pm4,c-2);
		line_draw(pm3,pm4,pm1,pm2,c);
		line_draw(pm1,pm2,p2,q2,c-2);
		}
}
int main()
{
	int ch,gd=DETECT,gm;
	clrscr();


	printf("\nEnter clipping window details: ");
	printf("\nEnter x1:");
	scanf("%d",&x1);
	printf("\nEnter y1:");
	scanf("%d",&y1);
	printf("\nEnter x2:");
	scanf("%d",&x2);
	printf("\nEnter y2:");
	scanf("%d",&y2);
	printf("\nEnter x3:");
	scanf("%d",&x3);
	printf("\nEnter y3:");
	scanf("%d",&y3);
	printf("\nEnter x4:");
	scanf("%d",&x4);
	printf("\nEnter y4:");
	scanf("%d",&y4);
	printf("\nEnter p1:");
	scanf("%d",&p1);
	printf("\nEnter q1:");
	scanf("%d",&q1);
	printf("\nEnter p2:");
	scanf("%d",&p2);
	printf("\nEnter q2:");
	scanf("%d",&q2);
	if(p1>320)
		p1=320;
	if(q1>240)
		q1=240;
	if(p2>320)
		p2=320;
	if(q2>240)
		q2=240;
	getch();
	clrscr();
	printf("\nEnter 1 for sutherland-cohen, 2 for subdivision midpt 3 for exit:");
	scanf("%d",&ch);
	clrscr();
	initgraph(&gd,&gm,"C://TurboC3//BGI");
	setbkcolor(6);
	draw_axes();
	draw_rect(x1,y1,x2,y2,x3,y3,x4,y4);
	if(ch==1)
		suth_cohen();
	else if(ch==2)
		midsub();
	else return 0;
	getch();
	return 0;
}