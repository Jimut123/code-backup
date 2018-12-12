#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void bres(int x1, int y1, int x2, int y2);
void enter_line_coord();
int color_one = 1;

void calc_coord(int x,int y, int r);
void draw_circle();
void print_coord();
int points[100][2];
int count=0;

int main()
{
	int x,y,r;
	printf("\n Enter the x co-ordinate : ");
	scanf("%d",&x);
	printf("\n Enter the y co-ordinate : ");
	scanf("%d",&y);
	printf("\n Enter the radius : ");
	scanf("%d",&r);
	calc_coord(x,y,r);
	draw_circle();
	bres(320,150,320,330);
	//print_coord();
	getch();
	return 0;
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
void print_coord()
{
	int i,j;
	for(i=0;i<count;i++)
	{
		printf("%d %d \t",points[i][0],points[i][1]);
	}
}
void draw_circle()
{
	int gd=DETECT, gm,col,i;
	printf("\n Enter the color of the circle (give : 9) : ");
	scanf("%d",&col);
	initgraph(&gd, &gm, "C://TurboC3//BGI");
	setbkcolor(3);
	for(i=0;i<count;i++)
	{
		putpixel(320+points[i][0],240-points[i][1],col);
		putpixel(320+points[i][0],240+points[i][1],col);
		//putpixel(320-points[i][0],240+points[i][1],col);
		//putpixel(320-points[i][0],240-points[i][1],col);

	}
}

void bres(int x1, int y1, int x2, int y2)
{
	int dx,dy,s1,s2,temp,interchange,x,y;
	int e,iter=0;
	dx =abs(x2-x1);
	dy =abs(y2-y1);

	if((x2-x1)<=0)
		s1=-1;
	else
		s1=1;

	if((y2-y1)<=0)
		s2=-1;
	else
		s2=1;

	if(dy>=dx)
	{
		temp = dy;
		dy = dx;
		dx = temp;
		interchange = 1;
	}
	else
		interchange = 0;
	e = 2*dy-dx;
	x=x1;
	y=y1;

	while(iter<=dx)
	{
		putpixel(x,y,color_one);
		if(e>0)
		{
			if(interchange==1)
				x+=s1;
			else
				y+=s2;
			e-=2*dx;
		}
		else
		{
			if(interchange == 1)
				y+=s2;
			else
				x+=s1;
			e+=2*dy;

		}
		iter++;
	}
}

