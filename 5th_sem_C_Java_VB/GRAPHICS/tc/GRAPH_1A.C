	/* graph_1a.c : Write a program to use simple graphics commands
	in C language. */
	#include<stdio.h>
	#include<graphics.h>
	void main()
	{
	int gd=DETECT, gm;
	int x1,y1,x2,y2,x3,y3,x4,y4;
	clrscr();
	printf("\nEnter x-cordinate of A=");
	scanf("%d",&x1);
	printf("Enter y-cordinate of A=");
	scanf("%d",&y1);
	printf("Enter x-cordinate of B=");
	scanf("%d",&x2);
	printf("Enter y-cordinate of B=");
	scanf("%d",&y2);
	printf("Enter x-cordinate of C=");
	scanf("%d",&x3);
	printf("Enter y-cordinate of C=");
	scanf("%d",&y3);
	printf("Enter x-cordinate of D=");
	scanf("%d",&x4);
	printf("Enter y-cordinate of D=");
	scanf("%d",&y4);
	initgraph(&gd,&gm,"c://turboc3//BGI");
	line(x1,y1,x2,y2);
	line(x2,y2,x3,y3);
	line(x3,y3,x4,y4);
	line(x4,y4,x1,y1);
	outtextxy(50,300,"Press any key to finish--->");
	getch();
	closegraph();
	}
