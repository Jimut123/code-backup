#include <graphics.h>
#include <dos.h>
#include <conio.h>
 
int main()
{
   int gd = DETECT, gm, i;
   char a[5];

   initgraph( &gd, &gm, "C:\\TURBOC3\\BGI");

   settextjustify( CENTER_TEXT, CENTER_TEXT );
   settextstyle(DEFAULT_FONT,HORIZ_DIR,50);
   setcolor(RED);
   for (i = 30; i >=0; i--)
   {
      sprintf(a,"%d",i);
      outtextxy(getmaxx()/2, getmaxy()/2, a);
      delay(1000);

      if ( i == 0 )
	 break;
      cleardevice();
   }
   cleardevice();
   settextstyle(SANS_SERIF_FONT,HORIZ_DIR,2);
   outtextxy(300,300,"Project by http://www.turboc.codeplex.com");
   delay(5000);
   closegraph();
   return 0;
}