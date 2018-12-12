/*Write a program to implement sutherland cohen algorithm to implement clipping algorithm.*/

#include<stdio.h>
#include<graphics.h>
#include<conio.h>
    int c_bgcolor,c_line;
    int xL,xR,yB,yT;
    void draw_xy();
    int signx(int x);
    void line_draw(int x1,int y1,int x2,int y2,int c);
    int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
    void rectangle_draw(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4);
    void s_cohen(int x1,int y1,int x2,int y2);
    int bit_code(int x1,int y1);
    int bit_and(int x1,int y1,int x2,int y2);
int main()
{
    int x1,y1,x2,y2;
    clrscr();
    printf("\nEnter end points of your view port--->\n");
    printf("\nEnter xL=");
    scanf("%d",&xL);
    printf("Enter xR=");
    scanf("%d",&xR);
    printf("Enter yB=");
    scanf("%d",&yB);
    printf("Enter yT=");
    scanf("%d",&yT);
    printf("Enter x1 of Point P1=");
    scanf("%d",&x1);
    printf("Enter y1 of Point P1=");
    scanf("%d",&y1);
    printf("Enter x2 of Point P2=");
    scanf("%d",&x2);
    printf("Enter y2 of Point P2=");
    scanf("%d",&y2);
    printf("Enter Background color(2-14) = ");
    scanf("%d",&c_bgcolor);
    printf("Enter Line color(1 or 15) = ");
    scanf("%d",&c_line);
    draw_xy();
    rectangle_draw(xL,yB,xR,yB,xR,yT,xL,yT);/* To draw rectangle*/
    s_cohen(x1,y1,x2,y2);
    getch();
    closegraph();
    return 0;
}
/* Function to draw x and y axes on screen */
void draw_xy()
{
    int i;
    int gd=DETECT,gm;
    initgraph(&gd,&gm,"c://TurboC3//bgi");
    setbkcolor(c_bgcolor);
    /* To draw x-axis and y-axis */
    for(i=0;i<640;i++)
    {
	putpixel(i,240,c_line);
	delay(0);
    }
    for(i=0;i<480;i++)
    {
	putpixel(320,i,c_line);
	delay(0);
    }
/* To display +x, -x, +y, -y, O(0,0) */
    outtextxy(10,245,"-X");
    outtextxy(620,245,"+X");
    outtextxy(325,10,"+Y");
    outtextxy(325,470,"-Y");
    outtextxy(325,245,"O(0,0)");
}
void line_draw(int x1,int y1,int x2,int y2,int c)
{
    int x[700],y[700],i,n;
    n=bresenham(x1,y1,x2,y2,x,y);  /* Calling bresenham function to generate 'n' pixel co-ordinates */
    /* To plot all points */
    for(i=0;i<n;i++)
    {
	putpixel(320+x[i],240-y[i],c);
	delay(0);
    }
}
/* Function to generate pixel co-ordinates using Bresenham algorithm */
int bresenham(int x1,int y1,int x2,int y2,int x[],int y[])
{
  int xx,yy,delx,dely,e,s1,s2,interchange,temp;
  int i,dx,dy;
  xx=x1;
  yy=y1;
  dx=x2-x1;
  dy=y2-y1;
  if(dx<0)
    delx=-dx;
  else
    delx=dx;
  if(dy<0)
    dely=-dy;
  else
    dely=dy;
  s1=signx(dx);
  s2=signx(dy);
  if(dely>delx)
  {
    temp=dely;
    dely=delx;
    delx=temp;
    interchange=1;
  }
  else
    interchange=0;
  e=2*dely-delx;
  for(i=0;i<=delx;i++)
  {
    x[i]=xx;
    y[i]=yy;
    while(e>=0)
    {
      if(interchange==1)
	xx=xx+s1;
      else
	yy=yy+s2;
      e=e-2*delx;
    }
    if(interchange==1)
      yy=yy+s2;
    else
      xx=xx+s1;
    e=e+2*dely;
  }
  return delx;
}
int signx(int x)
{
  if(x<0)
    return -1;
  else if(x==0)
    return 0;
  else
    return 1;
}
void rectangle_draw(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
{
   char a[100];
   line_draw(x1,y1,x2,y2,c_line);
   line_draw(x2,y2,x3,y3,c_line);
   line_draw(x3,y3,x4,y4,c_line);
   line_draw(x4,y4,x1,y1,c_line);
   setcolor(2);
   sprintf(a,"A(%d, %d)",x1,y1);
   outtextxy(320+x1,240-y1,a);
   setcolor(1);
   sprintf(a,"B(%d, %d)",x2,y2);
   outtextxy(320+x2,240-y2,a);
   setcolor(3);
   sprintf(a,"C(%d, %d)",x3,y3);
   outtextxy(320+x3,240-y3,a);
   setcolor(4);
   sprintf(a,"D(%d, %d)",x4,y4);
   outtextxy(320+x4,240-y4,a);
}
/* Function to implement sutherland cohen algorithm to get clipping
    portion. */

	int bit_code(int x1,int y1)
	{
	int n;
	n=0;
		if(x1<xL || x1>xR || y1<yB || y1>yT)
		n=1;
	return n;
	}
	/* int bit_and(int x1,int y1,int x2,int y2 ) : Function to
	calculate bit and operation. */
	int bit_and(int x1,int y1,int x2,int y2 )
	{
	int flag,i;
	int bit_p1[5],bit_p2[5];
	/* To calculate bit code of x1,y1 */
		if(x1<xL)
		bit_p1[1]=1;
		else
		bit_p1[1]=0;
		if(x1>xR)
		bit_p1[2]=1;
		else
		bit_p1[2]=0;
		if(y1<yB)
		bit_p1[3]=1;
		else
		bit_p1[3]=0;
		if(y1>yT)
		bit_p1[4]=1;
		else
		bit_p1[4]=0;
		/* To calculate bit-code of (x2,y2)  */
		if(x2<xL)
		bit_p2[1]=1;
		else
		bit_p2[1]=0;
		if(x2>xR)
		bit_p2[2]=1;
		else
		bit_p2[2]=0;
		if(y2<yB)
		bit_p2[3]=1;
		else
		bit_p2[3]=0;
		if(y2>yT)
		bit_p2[4]=1;
		else
		bit_p2[4]=0;
		flag=0;
		for(i=1;i<5;i++)
		{
		flag=bit_p1[i] & bit_p2[i];
			if(flag !=0)
			break;
		}
	return flag;
	}
	void s_cohen(int x1,int y1,int x2,int y2)
	{
	char a[100];
	float m;
	int num1,den1,b1,b2,xp1,yp1,xq1,yq1,xx1,yy1,xx2,yy2;
	b1=bit_code(x1,y1);
	b2=bit_code(x2,y2);
	xx1=-9999;
	yy1=-9999;
	xx2=-9999;
	yy2=-9999;

		if(b1==0 || b2==0)
		{
		outtextxy(10,350,"**There is no Clipping portion.**");
		line_draw(x1,y1,x2,y2,c_line);
		return;
		}
		b1=bit_and(x1,y1,x2,y2);
		if(b1 !=0)
		{
		outtextxy(300,100,"Line invisible");
		line_draw(x1,y1,x2,y2,c_line);
		return;
		}
	m=(float)(y2-y1)/(x2-x1);
	/* case-1: To find intersection at x=xL axis */
	yp1=m*(xL-x1)+y1;
		if(yp1>=yB && yp1<=yT)
		{
		xx1=xL;
		yy1=yp1;
		}
	/* case-2: To find intersection at x=xR axis */
	yq1=m*(xR-x1)+y1;
		if(yq1>=yB && yq1<=yT)
		{
		xx2=xR;
		yy2=yq1;
		}
	/* case-3: To find intersection at y=yB axis */
	xp1=(1.0/m)*(yB-y1)+x1;
		if(xp1>=xL && xp1<=xR)
		{
			if(xx1 ==-9999)
			{
			xx1=xp1;
			yy1=yB;
			}
			else if(xx2==-9999)
			{
			xx2=xp1;
			yy2=yB;
			}
		}

	/* case-4: To find intersection at y=yT axis */
	xq1=(1.0/m)*(yT-y1)+x1;
		if(xq1>=xL && xq1<=xR)
		{
			if(xx1 ==-9999)
			{
			xx1=xq1;
			yy1=yT;
			}
			else if(xx2==-9999)
			{
			xx2=xq1;
			yy2=yT;
			}
		}
	line_draw(x1,y1,xx1,yy1,c_line+1); /* Drawing 1st line */
	setcolor(4);
	sprintf(a,"P1(%d,%d)",x1,y1);
	outtextxy(325+x1,245-y1,a);
	line_draw(xx1,yy1,xx2,yy2,c_line+2); /* Drawing 2nd line */
	setcolor(3);
	sprintf(a,"(%d,%d)",xx1,yy1);
	outtextxy(325+xx1,245-yy1,a);
	setcolor(1);
	sprintf(a,"(%d,%d)",xx2,yy2);
	outtextxy(325+xx2,245-yy2,a);
	line_draw(xx2,yy2,x2,y2,c_line+3); /* Drawing 3rd line */
	setcolor(2);
	sprintf(a,"P2(%d,%d)",x2,y2);
	outtextxy(325+x2,245-y2,a);
	}