	/* Problem-1: xxcg1.c: Write a program in ‘C’ to set background
	color to some user defined color and draw x-axis and y-axis.*/
	#include<stdio.h>
	#include<graphics.h>
	#include<conio.h>
	int main()
	{
	int i,c;
	int gd=DETECT, gm;
	clrscr();
	printf("\nEnter Background color=");
	scanf("%d",&c);
	initgraph(&gd,&gm,"c://tc//bgi");
	setbkcolor(c); /* Changing default background color to c*/
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,15);
		delay(5000);
		}
	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,15);
		delay(5000);
		}
	/* To display +x, -x, O(0,0) */
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,245,"O(0,0)");
	/* To display +y,-y */
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(420,140,"Quadrant-1");
	outtextxy(100,140,"Quadrant-2");
	outtextxy(100,320,"Quadrant-3");
	outtextxy(420,320,"Quadrant-4");
	getch();
	return 0;
	}










