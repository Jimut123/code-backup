#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void draw_board1(int k,int m,int l)
{   int i,j,p,k1; for(i=k;i<=m;i++){	if(l==0)p=170; else p=120; for(k1=0;k1<=3;k1++){   for(j=p;j<=p+50;j++) putpixel(j,i,8); p+=100;}}}
void main()
{	int i,j,gd=DETECT,gm,z=40,cnt=0;
	initgraph(&gd,&gm,"c:\\TurboC3\\BGI"); setbkcolor(15);
	for(i=40;i<=440;i++) { putpixel(520,i,8); putpixel(522,i,8); putpixel(120,i,8); putpixel(118,i,8); }
	for(i=120;i<=520;i++){putpixel(i,40,8); putpixel(i,38,8); putpixel(i,440,8); putpixel(i,442,8);}
	for(z=40;z<440;z+=50,cnt++)
	draw_board1(z,z+50,cnt%2);
	setcolor(1); outtextxy(220,445,"CHESS BOARD DESIGNED BY JIMUT"); getch();}
