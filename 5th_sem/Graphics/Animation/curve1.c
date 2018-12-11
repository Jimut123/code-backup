        #include<stdio.h>
	#include<graphics.h>
	int c_line;
	void draw_xy();
	float sine(float x);
        float cosine(float x);
        float tangent(float x);
	void sine_draw(float theta1,float theta2);
        void circle_draw(int xc,int yc,int r,int c);
	void main()
	{
	int xc,yc,r,i;
	float theta1,theta2;
	char a[100];
	clrscr();
	printf("\nEnter starting theta in degree(theta1)=");
	scanf("%f",&theta1);
	printf("Enter Ending  theta in degree(theta2)=");
	scanf("%f",&theta2);
	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c_line);
	draw_xy();
	sine_draw(theta1,theta2);
	getch();
	closegraph();
	}
	/* Function to generate value of sin(x) */
	float sine(float x)
	{
	float csin,psin,eps,fact,xrad,xp;
	int i,sf,n;
	xrad=3.141593*x/180;
	csin=xrad;
	psin=1;
	eps=csin-psin;
		if(eps<0)
		eps=-eps;
	n=3;
	sf=-1;
		while(eps>1e-06)
		{
         	psin=csin;
		fact=1;
		xp=1;
			for(i=1;i<=n;i++)
			{
			fact=fact*i;
			xp=xp*xrad;
			}
		csin=csin+sf*xp/fact;
		eps=csin-psin;
			if(eps<0)
			eps=-eps;
		n=n+2;
		sf=-sf;
		}
	return csin;
	}
        /* float cosine(float x) : Function to generate value of cos(x) */
	float cosine(float x)
	{
	float csin,psin,eps,fact,xrad,xp;
	int i,sf,n;
	xrad=3.141593*x/180;
	csin=1;
	psin=0;
	eps=csin-psin;
		if(eps<0)
		eps=-eps;
	n=2;
	sf=-1;
		while(eps>1e-06)
		{
		psin=csin;
		fact=1;
		xp=1;
			for(i=1;i<=n;i++)
			{
			fact=fact*i;
			xp=xp*xrad;
			}
		csin=csin+sf*xp/fact;
		eps=csin-psin;
			if(eps<0)
			eps=-eps;
		n=n+2;
		sf=-sf;
		}
	return csin;
	}
	/* float tangent(float x) : Function to get tan(x) */
	float tangent(float x)
	{
	float y;
	y=sine(x)/cosine(x);
	return y;
	}
	/* Function to draw sine curve */
	void sine_draw(float theta1,float theta2)
	{
	float x,ys,yc,yt,i,j,ya;
	int x1,y1,y2,y3,x11,y11;
		for(x=theta1;x<=theta2;x++)
		{
		ys=sine(x);
		y1=100*ys;
		x1=x/2;
                yc=cosine(x);
                y2=100*yc;
                yt=tangent(x);
                y3=100*yt;
		for(j=theta1;j<=theta2;j++)
		{
		ya=sine(j);
		y11=100*ya;
		x11=j/2;
		putpixel(320+x11,240-y11,4);
		}
                for(j=theta1;j<=theta2;j++)
		{
		ya=cosine(j);
		y11=100*ya;
		x11=j/2;
		putpixel(320+x11,240-y11,4);
		}
                for(j=theta1;j<=theta2;j++)
		{
		ya=tangent(j);
		y11=100*ya;
		x11=j/2;
		putpixel(320+x11,240-y11,4);
		}
		for(i=20;i>=18;i--){
		circle_draw(x1,y1,i,c_line);
		circle_draw(x1,y2,i,c_line);
		circle_draw(x1,y3,i,c_line);
                }
		delay(5);
		clearviewport();
		delay(5);
		}
	}
	void draw_xy()
	{
	int gd=DETECT, gm;
	int i;
	initgraph(&gd,&gm,"c://TurboC3//bgi");
	setbkcolor(6);
        setcolor(2);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,15);
		}
	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,15);
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
    putpixel(320+xc+x[i],240-yc+y[i],c);
    delay(0);
  }
}