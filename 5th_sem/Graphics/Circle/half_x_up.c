/*Write a program to draw a half circle x-axis wise and then draw its diameter.*/

#include<stdio.h>
#include<graphics.h>
#include<conio.h>
    int c_bgcolor,c_line;
    void draw_xy();
    int signx(int x);
    int bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
    void halfcircle_draw(int xc,int yc,int r,int c);
int main()
{
    int xc,yc,r;
    clrscr();
    printf("\nEnter x - coordinate of centre(xc) =  ");
    scanf("%d",&xc);
    printf("\nEnter y - coordinate of center(yc) =  ");
    scanf("%d",&yc);
    printf("\nEnter radius of your circle(r) =  ");
    scanf("%d",&r);
    printf("Enter Background color(2-14) = ");
    scanf("%d",&c_bgcolor);
    printf("Enter Line color(1 or 15) = ");
    scanf("%d",&c_line);
    draw_xy();
    halfcircle_draw(xc,yc,r,c_line);
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
/* Function to draw a half circle */
void halfcircle_draw(int xc,int yc,int r,int c)
{
  int xk,yk,n;
  float d,pk;
  int x[1000],y[1000],xx[700],yy[700];
  int n1,n2,n3,i;
  char a[100];
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
  for(i=0;i<=n3;i++)
  {
    putpixel(320+xc+x[i],240-yc-y[i],c);
  }
  for(i=3*n3;i<4*n3;i++)
  {
    putpixel(320+xc+x[i],240-yc-y[i],c);
  }
  setcolor(2);
  sprintf(a,"C(%d, %d)",xc,yc);
  outtextxy(320+xc,240-yc,a);
  setcolor(2);
  sprintf(a,"D1(%d, %d)",xc+x[n3],yc+y[n3]);
  outtextxy(320+xc+x[n3],240-yc+y[n3],a);
  setcolor(2);
  sprintf(a,"D2(%d, %d)",xc+x[3*n3],yc+y[3*n3]);
  outtextxy(320+xc+x[3*n3],240-yc+y[3*n3],a);
  n=bresenham(x[n3],y[n3],x[3*n3],y[3*n3],xx,yy);
  for(i=0;i<=n;i++)
  {
    putpixel(320+xc+xx[i],240-yc+yy[i],c);
  }
}