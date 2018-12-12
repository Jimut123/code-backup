#include<stdio.h>
#include<graphics.h>
#include<conio.h>
int main()
{
	int i,c;
	int gd=DETECT, gm;
	clrscr();
	printf("\nEnter Background Color");
	scanf("%d",&c);
	initgraph(&gd,&gm,"c://turboc3//bgi");
	setbkcolor(c);//changing background color
	//to draw x axis
		for(i=0;i<640;i++)
		{
			putpixel(i,240,15);
			delay(10);
		}
	//to draw y axis
		for(i=0;i<480;i++)
		{
			putpixel(320,i,15);
			delay(10);
		}
	//to display +x,-x,O(0,0)
	outtextxy(20,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,245,"O(0,0)");
	//to display +y,-y
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(440,120,"I");
	outtextxy(110,120,"II");
	outtextxy(110,340,"III");
	outtextxy(440,340,"IV");
	getch();
	return 0;
}