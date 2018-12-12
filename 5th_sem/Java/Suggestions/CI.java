import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CI extends Applet implements ActionListener{
    Label pl,rl,tl,al;
    TextField pt,rt,tt,at;
    Button calc;
    float p,r,t,a;
    public void init(){
        setLayout(null);
        setSize(500,500);

        pl = new Label("Principal Rs : ");
        rl = new Label("Rate %p.a : ");
        tl = new Label("Time years : ");
        al = new Label("Amount Rs  : ");

        pt = new TextField();
        rt = new TextField();
        tt = new TextField();
        at = new TextField();

        calc = new Button("Get Result");
        calc.addActionListener(this);

        pl.setBounds(10, 10, 100, 50);
        rl.setBounds(10, 60, 100, 50);
        tl.setBounds(10, 120, 100, 50);
        al.setBounds(10, 180, 100, 50);

        pt.setBounds(120,15,100,20);
        rt.setBounds(120,65,100,20);
        tt.setBounds(120,125,100,20);
        at.setBounds(120,185,100,20);

        calc.setBounds(150,150,100,20);

        add(pl);
        add(rl);
        add(tl);
        add(al);
        add(pt);
        add(rt);
        add(tt);
        add(at);
        add(calc);

    }
    public void actionPerformed(ActionEvent e){
        p = Float.parseFloat(pt.getText());
        r = Float.parseFloat(rt.getText())/100;
        t = Float.parseFloat(tt.getText());
        //p = Float.parseFloat(pt.getText());

        a = p*(float)Math.pow((1+r),t);

        at.setText(a+"");

    }
}