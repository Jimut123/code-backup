/* applet1.html
   java applet1.java
   appletviewer applet1.html */

import java.awt.*;
import java.applet.*;
public class applet1 extends Applet
{
	public void paint(Graphics g)
	{
	//Color C1=new Color(0,0,255);
	setBackground(Color.black);
	Color C2=new Color(210,90,0);
	g.setColor(C2);
	//to draw an arc from 0 to 180 in clockwise direction
	//g.fillArc(10,10,100,100,0,-180);
	//to draw an arc from 90 to 180 in anticlockwise direction
	//g.fillArc(200,10,100,100,90,180);
	g.fillRect(480,300,400,70);
	g.setColor(Color.white);
	g.fillRect(480,370,400,70);
	g.setColor(Color.green);
	g.fillRect(480,420,400,70);
	g.setColor(Color.blue);
	g.drawOval(660,370,50,50);
	g.drawOval(665,375,40,40);
	g.drawOval(675,385,20,20);
	
}
}