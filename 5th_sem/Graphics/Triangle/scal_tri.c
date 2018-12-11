/*Write a program to draw a triangle A(x1,y1), B(x2,y2) and C(x3,y3).
Use scaling on x-axis and y-axis.*/

#include<stdio.h>
#include<graphics.h>
#include<conio.h>
    int c_bgcolor,c_line;
    void draw_xy();
    int round1(float x);
    int signx(int x);
    void line_draw(int x1,int y1,int x2,int y2,int c);
    int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
    void scaling(int x1,int y1,int x2,int y2,int x3,int y3,float sx,float sy);
    void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
int main()
{
    int x1,y1,x2,y2,x3,y3;
    float sx,sy;
    clrscr();
    printf("\nEnter x - coordinate of 1st point(x1) =  ");
    scanf("%d",&x1);
    printf("\nEnter y - coordinate of 1st point(y1) =  ");
    scanf("%d",&y1);
    printf("\nEnter x - coordinate of 2nd point(x2) =  ");
    scanf("%d",&x2);
    printf("\nEnter y - coordinate of 2nd point(y2) =  ");
    scanf("%d",&y2);
    printf("\nEnter x - coordinate of 3rd point(x3) =  ");
    scanf("%d",&x3);
    printf("\nEnter y - coordinate of 3rd point(y3) =  ");
    scanf("%d",&y3);
    printf("\nEnter scale factor along the x-axis(sx) = ");
    scanf("%f",&sx);
    printf("\nEnter scale factor along the y-axis(sy) = ");
    scanf("%f",&sy);
    printf("Enter Background color(2-14) = ");
    scanf("%d",&c_bgcolor);
    printf("Enter Line color(1 or 15) = ");
    scanf("%d",&c_line);
    draw_xy();
    scaling(x1,y1,x2,y2,x3,y3,sx,sy);
    getch();
    closegraph();
    return 0;
}
void scaling(int x1,int y1,int x2,int y2,int x3,int y3,float sx,float sy)
{
  int x11,y11,x22,y22,x33,y33;
  x11=round1(x1*sx);
  y11=round1(y1*sy);
  x22=round1(x2*sx);
  y22=round1(y2*sy);
  x33=round1(x3*sx);
  y33=round1(y3*sy);
  triangle_draw(x1,y1,x2,y2,x3,y3);
  triangle_draw(x11,y11,x22,y22,x33,y33);
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
/* Function to get rounded value of a number */
int round1(float x)
{
    int ix;
    float x1,x2;
    int s1;
    ix=(int)x;  /* To get whole number part from x */
    if(x<0)
      s1=-1;
    else
      s1=1;
    x1=x-(float)ix;   /* To get fractional part of x */     
    if(x1<0)
      x2=-x1;
    else
       x2=x1;
     if(x2>=.5)
     {
         if(s1==1)
           ix=ix+1;
         else
           ix=ix-1;
      }
    return ix;
}
void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3)
{
   char a[100];
   line_draw(x1,y1,x2,y2,c_line);
   line_draw(x2,y2,x3,y3,c_line);
   line_draw(x3,y3,x1,y1,c_line);
   setcolor(2);
   sprintf(a,"A(%d, %d)",x1,y1);
   outtextxy(320+x1,240-y1,a);
   setcolor(1);
   sprintf(a,"B(%d, %d)",x2,y2);
   outtextxy(320+x2,240-y2,a);
   setcolor(3);
   sprintf(a,"C(%d, %d)",x3,y3);
   outtextxy(320+x3,240-y3,a);
}