#include <stdio.h>
#include <conio.h>
#include <dos.h>
#include <graphics.h>
#include <stdlib.h>
 
union REGS i, o;
int left = 265, top = 250;
 
void initialize_graphics_mode()
{
  int gd = DETECT, gm, error;
 
  initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
 
  error = graphresult();
 
  if (error != grOk)
  {
    perror("Error ");
    printf("Press any key to exit...\n");
    getch();
    exit(EXIT_FAILURE);
  }
}
 
void showmouseptr()
{
  i.x.ax = 1;
  int86(0x33,&i,&o);
}
 
void hidemouseptr()
{
  i.x.ax = 2;
  int86(0x33,&i,&o);
}
 
void getmousepos(int *x,int *y)
{
  i.x.ax = 3;
  int86(0x33,&i,&o);
 
  *x = o.x.cx;
  *y = o.x.dx;
}
 
void draw_bar()
{
  hidemouseptr();
  setfillstyle(SOLID_FILL,CYAN);
  bar(190,180,450,350);
  showmouseptr();
}
 
void draw_button(int x, int y)
{
  hidemouseptr();
  setfillstyle(SOLID_FILL,MAGENTA);
  bar(x,y,x+100,y+30);
  moveto(x+5,y);
  setcolor(YELLOW);
  outtext("Press me");
  showmouseptr();
}
 
void draw()
{
  settextstyle(SANS_SERIF_FONT,HORIZ_DIR,2);
  outtextxy(100,451,"Project by http://www.turboc.codeplex.com");
  setcolor(BLUE);
  rectangle(0,0,639,450);
  setcolor(RED);
  outtextxy(160,25,"Try to press the \"Press me\" button");
  outtextxy(210,50,"Press escape key to exit");
  setfillstyle(XHATCH_FILL,GREEN);
  setcolor(BLUE);
  bar(1,1,75,449);
  bar(565,1,638,449);
  showmouseptr();
  draw_bar();
  draw_button(left,top);
}
 
void initialize()
{
  initialize_graphics_mode();
 
  if( !initmouse() )
  {
    closegraph();
    printf("Unable to initialize the mouse");
    printf("Press any key to exit...\n");
    getch();
    exit(EXIT_SUCCESS);
  }
 
  draw();
}
 
int initmouse()
{
  i.x.ax = 0;
  int86(0x33,&i,&o);
  return ( o.x.ax );
}
 
void get_input()
{
  int x, y;
 
  while(1)
  {
    getmousepos(&x,&y);
 
    /* mouse pointer in left of button */
 
    if( x >= (left-3) && y >= (top-3) && y <= (top+30+3) && x < left )
    {
      draw_bar();
      left = left + 4;
 
      if (left > 350)
        left = 190;
 
      draw_button(left,top);
    }
 
    /* mouse pointer in right of button */
 
    else if (x<=(left+100+3)&&y>=(top-3)&&y<=(top+30+3)&&x>(left+100))
    {
      draw_bar();
      left = left - 4;
 
      if (left < 190)
        left = 350;
 
      draw_button(left,top);
    }
 
    /* mouse pointer above button */
 
    else if(x>(left-3) && y>=(top-3) && y<(top) && x<= (left+100+3))
    {
      draw_bar();
      top = top + 4;
 
      if (top > 320)
        top = 180;
 
      draw_button(left,top);
    }
 
    /* mouse pointer below button */
 
    else if (x>(left-3)&&y>(top+30)&&y<=(top+30+3)&&x<=(left+100+3))
    {
      draw_bar();
      top = top - 4;
 
      if (top < 180)
        top = 320;
 
      draw_button(left,top);
    }
 
    if (kbhit())
    {
      if (getkey() == 1)
        exit(EXIT_SUCCESS);
    }
  }
}
 
int getkey()
{
  i.h.ah = 0;
  int86(22,&i,&o);
 
  return( o.h.ah );
}
 
main()
{
  initialize();
 
  get_input();
  return 0;
}