
import java.awt.*;
import javax.swing.*;
public class appl extends JApplet
{
    public void paint(Graphics g)
    {
        // simple text displayed on applet
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 2000, 1000);
        g.setColor(Color.black);
        g.drawString("Sample Applet", 400, 470);
        g.setColor(Color.blue);
        g.drawString("created by BlueJ", 20, 40);
    }
}
