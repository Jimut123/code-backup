import java.io.*;
import java.awt.*;
import java.applet.*;

/*
drawLine(x1,y1,x2,y2)
drawRect(x,y,w,h)
drawRoundRect(x,y,w,h,n1,n2)
fillRect(x,y,w,h)
fillRoundRect(x,y,w,h,n1,n2)
*/
public class applet_2 extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.green); // To set bkgrnd color to green
		Font f1 = new Font("Impact",Font.BOLD,50);
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("Welcome to the JAVA APPLET",200,200);
		g.drawRect(100,100,850,200);
		g.setColor(Color.red);
		g.drawRoundRect(100,100,850,200,50,50);
		g.fillRoundRect(100,100,850,200,40,40);
	}
}