#include<stdio.h>
#include<graphics.h>
#include<conio.h>
    int c_bgcolor,c_line;
    void draw_xy();
    void circle_draw(int xc,int yc,int r,int c);
int main()
{
    int r,i,j,k;
    printf("\nEnter radius of your circle(r) =  ");
    scanf("%d",&r);
    printf("Enter Background color(2-14) = ");
    scanf("%d",&c_bgcolor);
    printf("Enter Line color(1 or 15) = ");
    scanf("%d",&c_line);
    draw_xy();
    for(k=1;k<=2;k++)
    {
      for(i=50;i<=450;i++)
      {
	//To move from left to right
	for(j=r;j>=r-2;j--)
	  circle_draw(i,240,j,c_line);
	//To move from right to left
	for(j=r;j>=r-2;j--)
	  circle_draw(660-i,240,j,1);
	//To move from top to bottom
	for(j=r;j>=(r-2);j--)
	  circle_draw(320,i,j,c_line);
	//To move from bottom to top
	for(j=r;j>=(r-2);j--)
	  circle_draw(320,500-i,j,1);
	delay(5);
	clearviewport();
	delay(5);
      }
    }
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
	putpixel(i,240,c_bgcolor);
	delay(0);
    }
    for(i=0;i<480;i++)
    {
	putpixel(320,i,c_bgcolor);
	delay(0);
    }
}
/* Function to draw a circle */
void circle_draw(int xc,int yc,int r,int c)
{
  int xk,yk;
  float d,pk;
  int x[1000],y[1000];
  int n1,n2,n3,i;
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
    delay(0);
  }
}