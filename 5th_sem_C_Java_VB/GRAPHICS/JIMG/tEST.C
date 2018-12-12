#include <stdio.h>
#include <graphics.h>
#include <math.h>
int line_color, bg_color;

#define PI 3.14159265
float degrees[720];
float sinex[720];		// to calculate x-coordinates
float siney[720];		// to calculate y-coordinates

float cosx[720];
float cosy[720];

float tanx[720];
float tany[720];


void cal_cos();
void cal_sine();
void cal_tan();

void cal_tanh();
void cal_sineh();
void cal_cosh();

float sinehx[720];		// to calculate x-coordinates
float sinehy[720];		// to calculate y-coordinates

float coshx[720];
float coshy[720];

float tanhx[720];
float tanhy[720];

void draw_xy();

void cal_sine()
{
	int i,x;
	float val,dum=0;;
	for(i=0;i<720;i++)
	{
		x=i;
		val = PI / 180;
		degrees[i] = sin(x*val);
	}
	for(i=0;i<720;i++)
	{
		//325,245 :origin
		dum=dum+0.5;
		sinex[i]=dum;
		siney[i]=240+30*degrees[i];
		putpixel((int)sinex[i],(int)siney[i],line_color);
	}
}


void cal_cos()
{
	int i,x;
	float val,dum=0;;
	for(i=0;i<720;i++)
	{
		x=i;
		val = PI / 180;
		degrees[i] = cos(x*val);
	}
	for(i=0;i<720;i++)
	{
		//325,245 :origin
		dum=dum+0.5;
		cosx[i]=dum;
		cosy[i]=240+30*degrees[i];
		putpixel((int)cosx[i],(int)cosy[i],(line_color+1));
	}
}

void cal_tan()
{
	int i,x;
	float val,dum=0;;
	for(i=0;i<720;i++)
	{
		x=i;
		val = PI / 180;
		degrees[i] = tan(x*val);
	}
	for(i=0;i<720;i++)
	{
		//325,245 :origin
		dum=dum+0.5;
		tanx[i]=dum;
		tany[i]=240+30*degrees[i];
		putpixel((int)tanx[i],(int)tany[i],(line_color+2));
	}
}




void cal_sineh()
{
	int i,x;
	float val,dum=0;;
	for(i=0;i<720;i++)
	{
		x=i;
		val = PI / 180;
		degrees[i] = sinh(x*val);
	}
	for(i=0;i<720;i++)
	{
		//325,245 :origin
		dum=dum+0.5;
		sinehx[i]=325+dum;
		sinehy[i]=240+30*degrees[i];
		putpixel((int)sinehx[i],(int)sinehy[i],line_color-1);
	}
}


void cal_cosh()
{
	int i,x;
	float val,dum=0;;
	for(i=0;i<720;i++)
	{
		x=i;
		val = PI / 180;
		degrees[i] = cosh(x*val);
	}
	for(i=0;i<720;i++)
	{
		//325,245 :origin
		dum=dum+0.5;
		coshx[i]=325+dum;
		coshy[i]=240+30*degrees[i];
		putpixel((int)coshx[i],(int)coshy[i],(line_color-2));
	}
}

void cal_tanh()
{
	int i,x;
	float val,dum=0;;
	for(i=0;i<720;i++)
	{
		x=i;
		val = PI / 180;
		degrees[i] = tanh(x*val);
	}
	for(i=0;i<720;i++)
	{
		//325,245 :origin
		dum=dum+0.5;
		tanhx[i]=325+dum;
		tanhy[i]=240+30*degrees[i];
		putpixel((int)tanhx[i],(int)tanhy[i],(line_color-3));
	}
}


void draw_xy()
{
	int gd=DETECT,gm,i;
	initgraph(&gd,&gm,"C://TurboC3//BGI");

	for(i=0;i<640;i++)
	{
		putpixel(i,240,line_color);
		//delay(10);
	}

	for(i=0;i<480;i++)
	{
		putpixel(320,i,line_color);
		//delay(10);
	}
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(320,20,"+Y");
	outtextxy(320,460,"-Y");
	outtextxy(325,245,"O(0,0)");
}

void main()
{
	printf("\nEnter Background color (2-14) : ");
	scanf("%d",&bg_color);
	printf("\nEnter Line color code (2-15) : ");
	scanf("%d",&line_color);
	draw_xy();
	cal_sine();
	cal_cos();
	cal_tan();
	cal_sineh();
	cal_cosh();
	cal_tanh();
	getch();
}