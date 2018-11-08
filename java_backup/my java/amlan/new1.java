import java.awt.*;

import java.awt.event.*;
import java.applet.*;
class new1 extends Applet implements ActionListener
{
TextField name,name1;
public void init()
{
name=new TextField(50);
name1=new TextField(50);
add(name);
add(name1);
name.addActionListener(this);
name1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint();
}
public void print(Graphics g)
{
g.drawString("Name:"+name.getText(),6,60);
g.drawString("Name1:"+name1.getText(),6,100);
//name1.setText(name);
}
}