#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void draw_sfg();
void calc_coord(int x,int y, int r);
void dda(int x1,int y1, int x2, int y2, int col);
int round1(float x);
void draw_circle();
int spoke[100][2];
int points[100][2];
int spoke_counter = 0;
int count=0;
void main()
{       int i;
	draw_sfg();
	calc_coord(0,45,45);
	draw_circle();
	calc_coord(0,5,5);
	draw_circle();
    for(i=0;i<28;i++)
	dda(0,0,spoke[i][0],spoke[i][1],3);
	getch();
}

void draw_sfg()
{
	int i,j;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c:\\TurboC3\\BGI");
	setbkcolor(15);
	for(i=100;i<=540;i++)	//safron
		for(j=100;j<=190;j++)
			putpixel(i,j,6);
	for(i=100;i<=540;i++)	//white
		for(j=190;j<=280;j++)
			putpixel(i,j,15);
	for(i=100;i<=540;i++)	//green
		for(j=280;j<=370;j++)
			putpixel(i,j,2);
}

void dda(int x1,int y1, int x2, int y2, int col)
{
	int dx, dy,x_l,y_l,iter=0;
	float delx,dely,x=0,y=0,length;
	dx = x2-x1;
	dy = y2-y1;
	//printf("dx = %d",dx);
	//printf("dy = %d",dy);
	if(abs(dx)>=abs(dy))
		length = abs(dx);
	else
		length = abs(dy);
	//printf("length : %f\n",length);
	delx = (float)dx/length;
	dely = (float)dy/length;
	//printf("delx : %f\n",delx);
	//printf("dely : %f",dely);
	while(iter<=length)
	{
		x+=delx;
		y+=dely;
		x_l = round1(x);
		y_l = round1(y);
		//printf("%d %d",x_l,y_l);
		// to print the line
		putpixel(320+x1+x_l,240+y1-y_l,col);
		iter++;
	}
}
int round1(float x)
{
	float frac;
	int val;
	val =  (int)x;
	frac =abs(x) - abs(val);
	if(x<0)
	{
		if(frac>0.5)
		{
			return val;
		}
		else
			return (val-1);
	}
	else
		if(frac>0.5)
			return (val+1);
		else
			return val;
}


void draw_circle()
{
	int i;
	for(i=0;i<count;i++)
	{
		if(i%12==0)
		{
			spoke[spoke_counter][0]=points[i][0];
			spoke[spoke_counter][1]=-points[i][1]+10;
			spoke_counter++;
			spoke[spoke_counter][0]=points[i][0];
			spoke[spoke_counter][1]=points[i][1]+10;
			spoke_counter++;
			spoke[spoke_counter][0]=-points[i][0];
			spoke[spoke_counter][1]=points[i][1]+10;
			spoke_counter++;
			spoke[spoke_counter][0]=-points[i][0];
			spoke[spoke_counter][1]=-points[i][1]+10;
			spoke_counter++;
		}
		putpixel(320+points[i][0],235-points[i][1],3);
		putpixel(320+points[i][0],235+points[i][1],3);
		putpixel(320-points[i][0],235+points[i][1],3);
		putpixel(320-points[i][0],235-points[i][1],3);
	}
}
void calc_coord(int x,int y, int r)
{
	int x1=x,y1=y,del=0;
	float pk;
	points[count][0] = x1;
	points[count][1] = y1;
	count++;
	while(y1!=x)
	{
		del=(x1+1)*(x1+1)+(y1-1)*(y1-1)-r*r;
		if(del<0)
		{
			// then del is inside the circle
			pk = (x1+1)*(x1+1)+(y1-0.5)*(y1-0.5)-r*r;
			if(pk>0)
			{
				points[count][0] = x1+1;
				points[count][1] = y1-1;
			}
			else
			{
				points[count][0] = x1+1;
				points[count][1] = y1;
			}
		}
		else if(del>0)
		{
			// then del is outside the circle
			pk = (x1+0.5)*(x1+0.5)+(y1-1)*(y1-1)-r*r;
			if(pk>0)
			{
				points[count][0] = x1;
				points[count][1] = y1-1;
			}
			else
			{
				points[count][0] = x1+1;
				points[count][1] = y1-1;
			}
		}
		else
		{
			points[count][0] = x1+1;
			points[count][1] = y1-1;
		}
		x1 = points[count][0];
		y1 = points[count][1];
		count++;
	}
}
