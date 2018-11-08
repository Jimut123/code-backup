
//brasenham circle draw algo
#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int c_bgcolor,c_line;
void draw_xy();
int round1(float x);
void circle_draw(int x, int y, int r);
int brh(int r, int x[], int y[]);
int main()
{
	int r,x,y;
	char a[50];
	printf("\nEnter the value of centre \nx:\n");
	scanf("%d",&x);
	printf("y:\n") ;
	scanf("%d",&y);
	printf("r:\n");
	scanf("%d",&r);
	printf("\nEnter background color(2-14) ");
	scanf("%d",&c_bgcolor);
	printf("\nEnter line color(1 or 15) ");
	scanf("%d",&c_line);
	draw_xy();
	circle_draw(x,y,r);
	sprintf(a,"(%d,%d)",x,y);
	putpixel(320+x,240-y,c_line);
	outtextxy(320+x,240-y,a);
	getch();
	return 0;
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
void circle_draw(int x, int y, int r)
{
	int x1[700],y1[700],i=0,n,x2,y2,x3,y3;
	char a[50];
	n=brh(r,x1,y1);
	for(i=1;i<n-1;i++)
	{
		x1[i]=x1[i];
		y1[i]=-y1[i];
	}

	for(i=1;i<n-1;i++)
	{
		x1[i]=-x1[i];
		y1[i]=y1[i];
		putpixel(320+x1[i]+x,240-y1[i]-y,c_line);
		delay(2);
	}
	for(i=1;i<n-2;i++)
	{
		x1[i]=x1[i];
		y1[i]=-y1[i];
		putpixel(320+x1[i]+x,240-y1[i]-y,c_line);
		delay(2);
	}
			for(i=0;i<=n;i++)
		{
			putpixel(320+x,240-y-y1[i],c_line);
			delay(2);
		}
		for(i=0;i<=n;i++)
		{
			putpixel(320+x,240-y+y1[i],c_line);
			delay(2);
		}
/*		for(i=0;i<=n;i++)
		{
			putpixel(320+x[i]+x,240-y,c_line);
			delay(2);
		}
		for(i=0;i<=n;i++)
		{
			putpixel(320-x[i]+x,240-y,c_line);
			delay(2);
		}*/
}
int brh(int r, int x[], int y[])
{
	int n=1,i=0;
	float d,p;
	x[i]=0;
	y[i]=round1(r);
	while(y[i]>=0)
	{
		n++;
		d=(x[i]+1)*(x[i]+1)+(y[i]-1)*(y[i]-1)-r*r;
		if(d<0)
		{
			p=(x[i]+1)*(x[i]+1)+(y[i]-.5)*(y[i]-.5)-r*r;
			if(p>0)
			{
				i++;
				x[i]=round1(x[i-1]+1);
				y[i]=round1(y[i-1]-1);
			}
			else
			{
				i++;
				x[i]=round1(x[i-1]+1);
				y[i]=round1(y[i-1]);
			}
		}
		else if(d>0)
		{
			p=(x[i]+.5)*(x[i]+.5)+(y[i]-1)*(y[i]-1)-r*r;
			if(p>0)
			{
				i++;
				x[i]=round1(x[i-1]);
				y[i]=round1(y[i-1]-1);
			}
			else
			{
				i++;
				x[i]=round1(x[i-1]+1);
				y[i]=round1(y[i-1]-1);
			}
		}
		else
		{
			i++;
			x[i]=round1(x[i-1]+1);
			y[i]=round1(y[i-1]-1);
		}
	}
	return n;
}
int round1(float x)
{
	int x1,flag=0;
	float ix;
	if(x<0)
	{
		flag=1;
		x*=-1;
	}
	x1=(int)x;//to get whole value
	ix=x-x1;
	if(ix>.5)
	x1++;
	if(flag==1)
	return -x1;
	else
	return x1;
}
