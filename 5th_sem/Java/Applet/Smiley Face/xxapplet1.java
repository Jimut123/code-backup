/* xxapplet1.html
   java xxapplet1.java
   appletviewer xxapplet1.html */

import java.io.*;
import java.awt.*;
import java.applet.*;
public class xxapplet1 extends Applet
{
  public void paint(Graphics g)
  {
    setBackground(Color.black); //To set back ground color to green
    Font f1 = new Font("Monotype Corsiva", Font.PLAIN, 50);
    g.setFont(f1);
    g.setColor(Color.white);
    /*g.drawString("Welcome to Java Applet",10,50);
    g.drawLine(50,50,150,80); //To draw a dline
    g.drawLine(150,80,100,100); //To draw a line
    g.drawLine(100,100,50,50); //To draw a line
    g.fillRect(100,100,400,200);
    g.setColor(Color.yellow);
    g.fillRoundRect(500,500,100,100,20,20);*/
    /*g.drawOval(600,400,100,100); //To draw a circle
    g.drawOval(100,200,200,50); //To draw a ellipse
    g.drawOval(100,200,50,200); //To draw a reverse ellipse
    g.fillOval(500,200,100,100);*/ //To draw fill circle
    //draw smiley face
    g.drawOval(200,200,300,300); //boundary of face
    g.drawOval(240,280,75,40);  //left eye
    g.drawOval(380,280,75,40);  //right eye
    g.fillOval(260,290,30,20);  //left pupil
    g.fillOval(405,290,30,20);  //right pupil
    g.fillOval(330,350,40,40);  //nose
    g.fillArc(310,385,80,80,0,-180);  //mouth
    g.drawOval(170,300,30,70);   //left ear
    g.drawOval(500,300,30,70);   //right ear
  }
}