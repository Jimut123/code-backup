/*  *************************PROJECT( BY MANUJ ARORA)    ***************************
				     ON
				    LASER
    *******************************************************************/

//  HEADER FILES USED

  #include<stdio.h>
  #include<conio.h>
  #include<graphics.h>
  #include<dos.h>


//  FUNCTIONS USED

  void projectwork1();
  void projectwork2();
  void projectwork3();
  void closing();

  void main()
 {
   int gd=DETECT,gm,x,y;
   initgraph(&gd,&gm,"c:\\turboc3\\bgi");     //Initializing Graphics Mode

   projectwork1();
   projectwork2();
   projectwork3();
   closing();

   getch();
   closegraph();
   restorecrtmode();
  }

  void projectwork1()                  // AMPLIFICATION
  {
    setbkcolor(BLUE);
    setcolor(WHITE);
    circle(170,230,8);

    setfillstyle(1,YELLOW);
    floodfill(170,230,WHITE);
    setcolor(GREEN);
    settextstyle(11,0,2);
    outtextxy(150,250,"PHOTON");
    delay(2000);

    settextstyle(7,0,4);
    setcolor(WHITE);
    outtextxy(110,380,"Amplification of Photons");
    delay(1000);

    setcolor(WHITE);
    circle(250,180,8);     //SECOND_UP
    circle(250,280,8);
    floodfill(250,180,WHITE);
    floodfill(250,280,WHITE);
    delay(500);

    circle(330,120,8);     //THIRD_UP
    circle(330,195,8);

    circle(330,265,8);
    circle(330,340,8);     //THIRD_DOWN

    floodfill(330,120,WHITE);
    floodfill(330,195,WHITE);
    floodfill(330,265,WHITE);
    floodfill(330,340,WHITE);
    delay(500);

    circle(410,80,8);
    circle(410,125,8);
    circle(410,165,8);
    circle(410,210,8);

    circle(410,245,8);
    circle(410,285,8);
    circle(410,325,8);
    circle(410,370,8);

    floodfill(410,80,WHITE);
    floodfill(410,125,WHITE);
    floodfill(410,165,WHITE);
    floodfill(410,210,WHITE);
    floodfill(410,245,WHITE);
    floodfill(410,285,WHITE);
    floodfill(410,325,WHITE);
    floodfill(410,370,WHITE);


    delay(3000);
    cleardevice();
    }

  void projectwork2()
    {
     setbkcolor(BLUE);
     setcolor(WHITE);

     setfillstyle(1,RED);        // ATOM
     circle(310,230,30);
     floodfill(310,230,WHITE);
     setcolor(YELLOW);
     settextstyle(11,0,2);
     outtextxy(296,270,"ATOM");

     setcolor(WHITE);
     setfillstyle(1,GREEN);     // PHOTON
     circle(190,110,5);
     floodfill(190,110,WHITE);
     setcolor(GREEN);
     outtextxy(170,120,"PHOTON");
     delay(2000);
     setcolor(BLUE);
     outtextxy(170,120,"PHOTON");



     setfillstyle(1,BLACK);
     floodfill(190,110,WHITE);
     setcolor(BLACK);
     circle(190,110,5);

     setcolor(WHITE);

     circle(210,130,5);
     setfillstyle(1,GREEN);
     floodfill(210,130,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(210,130,WHITE);
     setcolor(BLACK);
     circle(210,130,5);

     setcolor(WHITE);

     circle(230,150,5);
     setfillstyle(1,GREEN);
     floodfill(230,150,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(230,150,WHITE);
     setcolor(BLACK);
     circle(230,150,5);

     setcolor(WHITE);

     circle(250,170,5);
     setfillstyle(1,GREEN);
     floodfill(250,170,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(250,170,WHITE);
     setcolor(BLACK);
     circle(250,170,5);

     setcolor(WHITE);

     circle(270,190,5);
     setfillstyle(1,GREEN);
     floodfill(270,190,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(270,190,WHITE);
     setcolor(BLACK);
     circle(270,190,5);

     setcolor(WHITE);

     circle(295,215,5);
     setfillstyle(1,GREEN);
     floodfill(295,215,WHITE);
     delay(300);
     setfillstyle(1,RED);
     floodfill(295,215,WHITE);
     setcolor(RED);
     circle(295,215,5);

     setcolor(WHITE);

     setfillstyle(1,YELLOW);        // ATOM
     circle(310,230,30);
     floodfill(310,230,WHITE);
     setcolor(YELLOW);
     settextstyle(7,0,3);
     outtextxy(115,50,"Stimulation of ATOM to Release Photons");
     setcolor(WHITE);
     delay(300);
     setfillstyle(1,RED);        // ATOM
     circle(310,230,30);
     floodfill(310,230,WHITE);

     setcolor(WHITE);

     circle(346,225,5);
     setfillstyle(1,GREEN);
     floodfill(346,225,WHITE);
     circle(346,235,5);
     floodfill(346,235,WHITE);
     delay(800);
     setfillstyle(1,BLACK);
     floodfill(346,225,WHITE);
     floodfill(346,235,WHITE);
     setcolor(BLACK);
     circle(346,225,5);
     circle(346,235,5);

     setcolor(WHITE);

     circle(365,205,5);
     setfillstyle(1,GREEN);
     floodfill(365,205,WHITE);
     circle(365,255,5);
     floodfill(365,255,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(365,205,WHITE);
     floodfill(365,255,WHITE);
     setcolor(BLACK);
     circle(365,205,5);
     circle(365,255,5);

     setcolor(WHITE);

     circle(385,185,5);
     setfillstyle(1,GREEN);
     floodfill(385,185,WHITE);
     circle(385,275,5);
     floodfill(385,275,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(385,185,WHITE);
     floodfill(385,275,WHITE);
     setcolor(BLACK);
     circle(385,185,5);
     circle(385,275,5);

     setcolor(WHITE);

     circle(405,165,5);
     setfillstyle(1,GREEN);
     floodfill(405,165,WHITE);
     circle(405,295,5);
     floodfill(405,295,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(405,165,WHITE);
     floodfill(405,295,WHITE);
     setcolor(BLACK);
     circle(405,165,5);
     circle(405,295,5);

     setcolor(WHITE);

     circle(425,145,5);
     setfillstyle(1,GREEN);
     floodfill(425,145,WHITE);
     circle(425,315,5);
     floodfill(425,315,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(425,145,WHITE);
     floodfill(425,315,WHITE);
     setcolor(BLACK);
     circle(425,145,5);
     circle(425,315,5);

     setcolor(WHITE);

     circle(445,125,5);
     setfillstyle(1,GREEN);
     floodfill(445,125,WHITE);
     circle(445,335,5);
     floodfill(445,335,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(445,125,WHITE);
     floodfill(445,335,WHITE);
     setcolor(BLACK);
     circle(445,125,5);
     circle(445,335,5);

     setcolor(WHITE);

     circle(465,105,5);
     setfillstyle(1,GREEN);
     floodfill(465,105,WHITE);
     circle(465,355,5);
     floodfill(465,355,WHITE);
     delay(300);
     setfillstyle(1,BLACK);
     floodfill(465,105,WHITE);
     floodfill(465,355,WHITE);
     setcolor(BLACK);
     circle(465,105,5);
     circle(465,355,5);

     setcolor(WHITE);

     circle(485,95,5);
     setfillstyle(1,GREEN);
     floodfill(485,95,WHITE);
     circle(485,375,5);
     floodfill(485,375,WHITE);
     circle(190,110,5);
     floodfill(190,110,WHITE);
     setcolor(YELLOW);
     settextstyle(11,0,2);
     outtextxy(170,120,"PHOTON");
     outtextxy(465,110,"PHOTON");
     outtextxy(465,390,"PHOTON");

     delay(5000);
     cleardevice();
    }

   void projectwork3()
   {

     setbkcolor(BLACK);
     setcolor(WHITE);

     rectangle(200,150,460,160);
     rectangle(200,300,460,310);
     setfillstyle(1,GREEN);
     floodfill(250,155,WHITE);
     floodfill(250,305,WHITE);
     ellipse(200,230,90,89,15,70);      //MIRROR
     setfillstyle(1,BLUE);
     floodfill(205,232,WHITE);
     ellipse(460,230,90,89,15,70);      // SEMI SILVERED MIRROR
     setfillstyle(1,CYAN);
     floodfill(465,232,WHITE);

     rectangle(300,365,360,380);       //  POWER SOURCE
     setfillstyle(1,RED);
     floodfill(305,370,WHITE);

     moveto(300,365);
     lineto(310,355);
     lineto(370,355);
     lineto(360,365);
     moveto(360,380);
     lineto(370,370);
     lineto(370,355);
     floodfill(305,362,WHITE);
     floodfill(366,370,WHITE);
     setcolor(YELLOW);
     settextstyle(11,0,2);
     outtextxy(288,390,"POWER SOURCE");
     outtextxy(300,120,"ELECTRODES");
     outtextxy(130,230,"MIRROR");
     outtextxy(480,175,"SEMI SILVERED");
     outtextxy(510,190,"MIRROR");
     setcolor(WHITE);
     moveto(370,363);
     lineto(411,363);
     lineto(411,265);
     moveto(370,366);
     lineto(413,366);
     lineto(413,265);

     rectangle(395,260,428,265);
     floodfill(396,261,WHITE);
     rectangle(395,200,428,205);
     floodfill(396,201,WHITE);
     rectangle(240,260,273,265);
     floodfill(241,261,WHITE);
     rectangle(240,200,273,205);
     floodfill(241,201,WHITE);


     moveto(255,265);
     lineto(255,376);
     lineto(300,376);
     moveto(257,265);
     lineto(257,373);
     lineto(300,373);

     setcolor(RED);

     moveto(280,205);
     lineto(280,260);
     lineto(273,260);
     moveto(273,205);
     lineto(280,205);

     moveto(435,205);
     lineto(435,260);
     lineto(428,260);
     moveto(428,205);
     lineto(435,205);

     setcolor(WHITE);
     circle(100,50,8);
     setfillstyle(1,RED);
     floodfill(100,50,WHITE);
     circle(100,85,3);
     setfillstyle(1,YELLOW);
     floodfill(100,85,WHITE);
     setcolor(YELLOW);
     outtextxy(128,47,"ATOM");
     outtextxy(128,82,"PHOTON");


//  ATOM AND PHOTON MOVEMENT

     setcolor(WHITE);
     setfillstyle(1,RED);    //ATOM
     circle(365,205,8);
     floodfill(365,205,WHITE);

     circle(325,285,8);
     floodfill(325,285,WHITE);
     delay(3000);

     circle(325,260,8);
     floodfill(325,260,WHITE);

     setfillstyle(1,BLACK);
     floodfill(325,285,WHITE);
     setcolor(BLACK);
     circle(325,285,8);

     setcolor(WHITE);

     setfillstyle(1,RED);
     circle(345,190,8);
     floodfill(345,190,WHITE);
     setfillstyle(1,BLACK);
     floodfill(365,205,WHITE);
     setcolor(BLACK);
     circle(365,205,8);
     delay(500);


     setfillstyle(1,RED);
     setcolor(WHITE);
     circle(325,170,8);
     floodfill(325,170,WHITE);
     setfillstyle(1,BLACK);
     floodfill(345,190,WHITE);
     setcolor(BLACK);
     circle(345,190,8);


     setcolor(WHITE);
     setfillstyle(1,YELLOW);
     circle(250,250,3);
     floodfill(250,250,WHITE);
     delay(100);
     circle(275,225,3);
     floodfill(275,225,WHITE);
     delay(100);
     circle(295,205,3);
     floodfill(295,205,WHITE);
     delay(100);
     circle(315,185,3);
     floodfill(315,185,WHITE);
     delay(100);
     circle(320,205,3);
     floodfill(320,205,WHITE);
     delay(100);
     circle(345,205,3);
     floodfill(345,205,WHITE);
     circle(365,205,3);
     floodfill(365,205,WHITE);
     delay(100);
     circle(385,210,3);
     floodfill(385,210,WHITE);

     circle(395,220,3);
     floodfill(395,220,WHITE);
     circle(305,225,3);
     floodfill(305,225,WHITE);

     circle(325,245,3);
     floodfill(325,245,WHITE);
     delay(100);
     circle(345,265,3);
     floodfill(345,265,WHITE);
     delay(100);
     circle(345,235,3);
     floodfill(345,235,WHITE);
     delay(100);
     circle(365,285,3);
     floodfill(365,285,WHITE);
     circle(365,230,3);
     floodfill(365,230,WHITE);
     delay(100);
     circle(395,245,3);
     floodfill(395,245,WHITE);
     delay(100);
     circle(415,225,3);
     floodfill(415,225,WHITE);
     delay(100);
     circle(425,245,3);
     floodfill(425,245,WHITE);
     delay(300);

     setlinestyle(SOLID_LINE,1,3);
     setcolor(YELLOW);
     moveto(460,230);
     lineto(600,230);      //LASER
     setcolor(YELLOW);
     outtextxy(510,240,"LASER");
     moveto(540,230);
     lineto(535,225);
     moveto(540,230);
     lineto(535,235);
     delay(3000);
     cleardevice();
}

 void closing()
  {
   setbkcolor(RED);
   setcolor(YELLOW);
   settextstyle(7,HORIZ_DIR,4);
   outtextxy(160,180,"!!  THANK YOU   !!");
   outtextxy(120,280," Press any key to EXIT");
  }