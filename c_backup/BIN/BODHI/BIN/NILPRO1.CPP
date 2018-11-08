#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int circle_draw_algorithm(int xc,int yc,int r,int x[],int y[]);
int circle_draw_algorithm(int xc1,int yc1,int r1,int x1[],int y1[]);
void plot(int x[],int y[],int n);

void main()
{       int xc,yc,xc1,yc1,r,r1;
	int x[2000],y[2000],x1[2000],y1[2000],n,n1;
	int gd=DETECT,gm;
	clrscr();
	printf("\nEnter xc : ");
	scanf("%d",&xc);
	printf("\nEnter yc : ");
	scanf("%d",&yc);
	printf("\nEnter radius : ");
	scanf("%d",&r);
	printf("\nEnter xc1 : ");
	scanf("%d",&xc1);
	printf("\nEnter yc1 : ");
	scanf("%d",&yc1);
	printf("\nEnter radius1 : ");
	scanf("%d",&r1);
	n=circle_draw_algorithm(xc,yc,r,x,y);
	n1=circle_draw_algorithm(xc1,yc1,r1,x1,y1);
	initgraph(&gd,&gm,"c://turboc3//BGI");
	plot(x,y,n);
	plot(x1,y1,n1);
	getch();
	closegraph();
}

int circle_draw_algorithm(int xc,int yc,int r,int x[],int y[])
{	int i,n,n1,n2,n3;
	int xk,yk,d;
	float pk;
	xk=0;
	yk=r;
	x[0]=xk;
	y[0]=yk;
	n=0;
	while(yk>=0)
	{	d=(xk+1)*(xk+1)+(yk-1)*(yk-1)-(r*r);
		if(d<0)
		{	pk=(xk+1)*(xk+1)+(yk-0.5)*(yk-0.5)-(r*r);
			if(pk<=0)
				xk=xk+1;
			else
			{	xk++;
				yk--;
			}
		}
		else if(d>0)
		{	pk=(xk+0.5)*(xk+0.5)+(yk-1)*(yk-1)-(r*r);
			if(pk<=0)
			{	xk=xk+1;
				yk--;
			}
			else
				yk--;
		}
		else
		{	xk++;
			yk--;
		}
		n++;
		x[n]=xk;
		y[n]=yk;
	}
	n1=2*n;
	n2=n-1;
	for(i=n;i<n1;i++)
	{	x[i]=x[n2];
		y[i]=-y[n2];
		n2=n2-1;
	}
	n3=2*n1;
	n2=n1-1;
	for(i=n1;i<n3;i++)
	{	x[i]=-x[n2];
		y[i]=y[n2];
		n2=n2-1;
	}

	printf("\nPress any key to display all points --->");
	getch();
	for(i=0;i<n3;i++)
		printf("x[%d]=%d y[%d]=%d\n",x[i],y[i]);
	for(i=0;i<n3;i++)
	{	x[i]=x[i]+xc;
		y[i]=y[i]+yc;
	}
	return n3;
}

void plot(int x[],int y[],int n)
{	int i;
	for(i=0;i<n;i++)
		putpixel(x[i],y[i],2);
}
