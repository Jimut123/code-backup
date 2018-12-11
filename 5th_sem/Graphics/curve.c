/*Write a program in “C” to draw  sin(x), cos(x) and tan(x) curves.
Use 3 different colors to draw sin(x), cos(x) and tan(x) curves.*/

        #include<stdio.h>
	#include<graphics.h>
	int c;
	int n;
	void draw_xy();
	float cosine(float x);
	void cosine_draw(float theta1,float theta2);
	float sine(float x);
	void sine_draw(float theta1,float theta2);
	float tangent(float x);
	void tangent_draw(float theta1,float theta2);
	void main()
	{
	int xc,yc,r,i;
	float theta1,theta2;
	char a[100];
	clrscr();
	printf("\nEnter starting theta in degree(theta1)=");
	scanf("%f",&theta1);
	printf("Enter Ending  theta in degree(theta2)=");
	scanf("%f",&theta2);
	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c);
	draw_xy();
	sine_draw(theta1,theta2);
	cosine_draw(theta1,theta2);
	tangent_draw(theta1,theta2);
	/*sprintf(a,"C(%d,%d)",xc,yc);
	outtextxy(320+xc,240-yc,a); */
	getch();
	closegraph();
	}
	/* float sine(float x) : Function to generate value of sin(x) */
	float sine(float x)
	{
	float csin,psin,eps,fact,xrad,xp;
	int i,sf,n;
	xrad=3.141593*x/180;
	csin=xrad;
	psin=1;
	eps=csin-psin;
		if(eps<0)
		eps=-eps;
	n=3;
	sf=-1;
		while(eps>1e-06)
		{
		psin=csin;
		fact=1;
		xp=1;
			for(i=1;i<=n;i++)
			{
			fact=fact*i;
			xp=xp*xrad;
			}
		csin=csin+sf*xp/fact;
		eps=csin-psin;
			if(eps<0)
			eps=-eps;
		n=n+2;
		sf=-sf;
		}
	return csin;
	}
	/* float cosine(float x) : Function to generate value of cos(x) */
	float cosine(float x)
	{
	float csin,psin,eps,fact,xrad,xp;
	int i,sf,n;
	xrad=3.141593*x/180;
	csin=1;
	psin=0;
	eps=csin-psin;
		if(eps<0)
		eps=-eps;
	n=2;
	sf=-1;
		while(eps>1e-06)
		{
		psin=csin;
		fact=1;
		xp=1;
			for(i=1;i<=n;i++)
			{
			fact=fact*i;
			xp=xp*xrad;
			}
		csin=csin+sf*xp/fact;
		eps=csin-psin;
			if(eps<0)
			eps=-eps;
		n=n+2;
		sf=-sf;
		}
	return csin;
	}
	/* float tangent(float x) : Function to get tan(x) */
	float tangent(float x)
	{
	float y;
	y=sine(x)/cosine(x);
	return y;
	}
	/* void sine_draw(float theta1,float theta2) : Function to
	draw sine curve */
	void sine_draw(float theta1,float theta2)
	{
	float x,y;
	int x1,y1;
		for(x=theta1;x<=theta2;x++)
		{
		y=sine(x);
		y1=100*y;
		x1=x/2;
		putpixel(320+x1,240-y1,15);
		}
	}
	/* void cosine_draw(float theta1,float theta2) : Function to
	draw cosine curve */

	void cosine_draw(float theta1,float theta2)
	{
	float x,y;
	int x1,y1;
		for(x=theta1;x<=theta2;x++)
		{
		y=cosine(x);
		y1=100*y;
		x1=x/2;
		putpixel(320+x1,240-y1,c);
		}
	}
	/* void tangent_draw(float theta1,float theta2) : Function to
	draw tan curve */

	void tangent_draw(float theta1,float theta2)
	{
	float x,y;
	int x1,y1;
		for(x=theta1;x<=theta2;x++)
		{
		y=tangent(x);
		y1=10*y;
		x1=x/2;
		putpixel(320+x1,240-y1,c+2);
		}
	}
	void draw_xy()
	{
	int gd=DETECT, gm;
	int i;
	initgraph(&gd,&gm,"c://TurboC3//bgi");
	setbkcolor(6);
	setcolor(1);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,15);
		}
	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,15);
		}
	/* To display -X, +X, +Y , -Y and O(0,0) */
	outtextxy(10,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(325,245,"O(0,0)");
	}