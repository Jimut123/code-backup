/* InpCalc.html
   java InpCalc.java
   appletviewer InpCalc.html */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class InpCalc extends Applet implements ActionListener{
    
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    public void init(){
        l1 = new Label("Input 1 : ");
        t1 = new TextField("");

        l2 = new Label("Input 2 : ");
        t2 = new TextField("");

        l3 = new Label("Ans");
        t3 = new TextField("");

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");

        setBackground(new Color(100,100,100));
        
        setLayout(null);
        
        b1.setBounds(100,100,40,40);
        b2.setBounds(150,100,40,40);
        b3.setBounds(200,100,40,40);
        b4.setBounds(250,100,40,40);
        
        l1.setBounds(20,15,50,15);
        l1.setForeground(new Color(255,255,255));
        l2.setBounds(20,60,50,15);
        l2.setForeground(new Color(255,255,255));
        t1.setBounds(70, 10, 100, 20);
        t2.setBounds(70, 50, 100, 20);
        l3.setBounds(130,150,30,30);
        t3.setBounds(180,150,100,20);

        
        add(l1);
        add(t1);
        add(l2);
        add(l3);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);



    }
    public void paint(Graphics g){
        g.setFont(new Font("Impact", Font.BOLD, 25));
        g.drawString("This is a simple calculator",110,350);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("+"))
            t3.setText(new String(Float.parseFloat(t1.getText()) +  Float.parseFloat(t2.getText())+""));
        if(e.getActionCommand().equals("-"))
            t3.setText(new String(Float.parseFloat(t1.getText()) -  Float.parseFloat(t2.getText())+""));
        if(e.getActionCommand().equals("*"))
            t3.setText(new String(Float.parseFloat(t1.getText()) *  Float.parseFloat(t2.getText())+""));
        if(e.getActionCommand().equals("/"))
            t3.setText(new String(Float.parseFloat(t1.getText()) /  Float.parseFloat(t2.getText())+""));
    }

}