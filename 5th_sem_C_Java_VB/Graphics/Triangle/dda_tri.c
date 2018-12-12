/*Write a program to draw three points A(x1,y1), B(x2,y2), and C(x3,y3) of a triangle using DDA algorithm.*/

#include<stdio.h>
#include<graphics.h>
#include<conio.h>
    int c_bgcolor,c_line;
    void draw_xy();
    int round1(float x);
    void line_draw(int x1,int y1,int x2,int y2,int c);
    int dda(int x1,int y1,int x2,int y2,int x[],int y[]);
    void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
int main()
{
    int x1,y1,x2,y2,x3,y3;
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
    printf("Enter Background color(2-14) = ");
    scanf("%d",&c_bgcolor);
    printf("Enter Line color(1 or 15) = ");
    scanf("%d",&c_line);
    draw_xy();
    triangle_draw(x1,y1,x2,y2,x3,y3);
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
    n=dda(x1,y1,x2,y2,x,y);  /* Calling dda function to generate 'n' pixel co-ordinates */
    /* To plot all points */
    for(i=0;i<n;i++)
    {
        putpixel(320+x[i],240-y[i],c);
        delay(0);
    }
}
/* Function to generate pixel co-ordinates using DDA algorithm */
int dda(int x1,int y1,int x2,int y2,int x[],int y[])
{
    int i,length,dx,dy,dx1,dy1,n;
    float delx,dely;
    float xx,yy;
    dx=x2-x1;
    dy=y2-y1;
    if(dx<0)
      dx1=-dx;
    else
      dx1=dx;
    if(dy<0)
      dy1=-dy;
    else
      dy1=dy;
    if(dx1>dy1)
      length=dx1;
    else
       length=dy1;
    delx=(float)dx/length;
    dely=(float)dy/length;
    xx=x1;
    yy=y1;
    for(i=0;i<length;i++)
    {
        x[i]=round1(xx);
        y[i]=round1(yy);
        xx=xx+delx;
        yy=yy+dely;
    }
   return length;
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