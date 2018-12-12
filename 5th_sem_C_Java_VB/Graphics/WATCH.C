/*Write a program to draw a watch.*/
#include<stdio.h>
#include<graphics.h>
#include<conio.h>
    int c_bgcolor,c_line,n1,n2,n3;
    int x[1000],y[1000];
    void draw_xy();
    void circle_draw(int xc,int yc,int r,int c);
    int signx(int x);
    void line_draw(int x1,int y1,int x2,int y2,int c);
    int bresenham(int x1,int y1,int x2,int y2,int xb[],int yb[]);
int main()
{
    int xc=320,yc=240,r=150,i;
    clrscr();
    printf("Enter Background color(2-14) = ");
    scanf("%d",&c_bgcolor);
    printf("Enter Line color(1 or 15) = ");
    scanf("%d",&c_line);
    draw_xy();
    for(i=r;i>=r-3;i--)
    circle_draw(xc,yc,i,c_line);
    outtextxy(xc+x[0],yc-10+y[0],"6");
    outtextxy(xc+x[69],yc-12+y[69],"5");
    outtextxy(xc-10+x[138],yc-6+y[138],"4");
    outtextxy(xc-10+x[207],yc-2+y[207],"3");
    outtextxy(xc-9+x[276],yc+y[276],"2");
    outtextxy(xc+x[345],yc+8+y[345],"1");
    outtextxy(xc-5+x[414],yc+5+y[414],"12");
    outtextxy(xc+x[483],yc+5+y[483],"11");
    outtextxy(xc+x[552],yc+5+y[552],"10");
    outtextxy(xc+5+x[621],yc+5+y[621],"9");
    outtextxy(xc+5+x[690],yc-1+y[690],"8");
    outtextxy(xc+x[759],yc-10+y[759],"7");
    outtextxy(xc-50,yc+50,"ROY BROS & CO.");
    line_draw(xc-2+x[414],yc+25+y[414],320,240,c_line);
    line_draw(xc-50+x[207],yc-1+y[207],320,240,c_line);
    for(i=10;i>=1;i--)
    circle_draw(xc,yc,i,c_line);
    for(i=r-25;i>=r-28;i--)
    circle_draw(xc,yc,i,c_line);
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
    /*for(i=0;i<640;i++)
    {
	putpixel(i,240,c_line);
	delay(0);
    }
    for(i=0;i<480;i++)
    {
	putpixel(320,i,c_line);
	delay(0);
    }*/
/* To display +x, -x, +y, -y, O(0,0) */
    /*outtextxy(10,245,"-X");
    outtextxy(620,245,"+X");
    outtextxy(325,10,"+Y");
    outtextxy(325,470,"-Y");
    outtextxy(325,245,"O(0,0)");*/
}
/* Function to draw a circle */
void circle_draw(int xc,int yc,int r,int c)
{
  int xk,yk;
  float d,pk;
  int i;
  xk=0;
  yk=r;
  n3=0;
  //To generate points in first quadrant
  while(yk>=0)
  {
    x[n3]=xk;
    y[n3]=yk;
    d=(xk+1)*(xk+1)+(yk-1)*(yk-1)-r*r;
    if(d<0)
    {
      pk=(xk+1)*(xk+1)+(yk-.5)*(yk-.5)-r*r;
      if(pk<=0)
	xk=xk+1;
      else
      {
	xk=xk+1;
	yk=yk-1;
      }
    }
    else
    if(d>0)
    {
      pk=(xk+.5)*(xk+.5)+(yk-1)*(yk-1)-r*r;
      if(pk<=0)
      {
	xk=xk+1;
	yk=yk-1;
      }
      else
	yk=yk-1;
    }
    else
    {
      xk=xk+1;
      yk=yk-1;
    }
    if(yk>=0)
      n3=n3+1;
  }
  //To take reflection along x-axis
  n1=2*n3;
  n2=n3-1;
  for(i=n3+1;i<=n1;i++)
  {
    x[i]=x[n2];
    y[i]=-y[n2];
    n2=n2-1;
  }
  //To take reflection along y-axis
  n1=4*n3-1;
  n2=2*n3-1;
  for(i=2*n3+1;i<=n1;i++)
  {
    x[i]=-x[n2];
    y[i]=y[n2];
    n2=n2-1;
  }
  for(i=0;i<=n1;i++)
  {
    putpixel(xc+x[i],yc+y[i],c);
  }
}
void line_draw(int x1,int y1,int x2,int y2,int c)
{
    int xb[700],yb[700],i,n;
    n=bresenham(x1,y1,x2,y2,xb,yb);  /* Calling bresenham function to generate 'n' pixel co-ordinates */
    /* To plot all points */
    for(i=0;i<n;i++)
    {
	putpixel(xb[i],yb[i],c);
        delay(0);
    }
}
/* Function to generate pixel co-ordinates using Bresenham algorithm */
int bresenham(int x1,int y1,int x2,int y2,int xb[],int yb[])
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
    xb[i]=xx;
    yb[i]=yy;
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
