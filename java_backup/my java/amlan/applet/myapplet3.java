package applet;


import java.awt.*;
import javax.swing.*;

/**
 * Class myapplet3 - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class myapplet3 extends JApplet
{
    // instance variables - replace the example below with your own
    Image picture;

   
    public void init()
    {
        URL imageURL=new URL(getDocumentBase(),"4.JPG");
        picture=getImage(imageURL);
    }

    
    public void paint(Graphics g)
    {
        // simple text displayed on applet
        g.drawImage(picture,30,30,this);
    }

    


    
}
