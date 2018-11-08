
import java.awt.*;
import javax.swing.*;
public class chin2 extends JApplet
{
    public void paint(Graphics g)
    {
        // simple text displayed on applet
        g.setColor(Color.black);
        g.fillRect(0, 0, 200, 100);
        g.setColor(Color.red);
        g.drawString("Sample Applet", 20, 20);
        g.setColor(Color.yellow);
        g.drawString("created by BlueJ", 20, 40);
    }
}
    