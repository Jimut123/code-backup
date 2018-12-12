/* xxapplet2.html
   java xxapplet2.java
   appletviewer xxapplet2.html */

import java.awt.*;
import java.applet.*;
public class applet2 extends Applet
{
  public void paint(Graphics g)
  {
    Color C1 = new Color(0,0,255);
    setBackground(C1);
    Color C2 = new Color(255,255,255);
    g.setColor(C2);
    //To draw an arc from 0 to 180 in clockwise direction
    g.drawArc(10,10,100,100,0,-180);
    //To draw an arc from 90 to 270 in anticlockwise direction
    g.drawArc(100,10,100,100,90,270);
    int n=3;
    int x[] = {10,200,300};
    int y[] = {200,50,200};
    g.fillPolygon(x,y,n);
   }
}