import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class menu implements ActionListener
{
JMenuBar mb;
JMenu nb;
JMenu nm;
JMenu nir;
//JMenu nr;
JMenuItem nb1;
JMenuItem nb2;
JMenuItem nb3;
JMenuItem nb4;
JMenuItem nb5;
JMenuItem nb6;
JMenuItem nb7;
JMenuItem nb8;
JMenuItem nb9;
JMenuItem nb10;
JMenuItem nb11;
public JPanel createContentPane()
{
JPanel pn=new JPanel();
pn.setBackground(Color.white);
pn.setMinimumSize(new Dimension(300,200));
pn.setPreferredSize(new Dimension(300,200));
pn.setMaximumSize(new Dimension(300,200));
pn.setOpaque(true);
return pn;
}
public JMenuBar createMenuBar()
{
 mb=new JMenuBar();
 nb=new JMenu("New Book/Member/Vendor");
 nm=new JMenu("Issue/Return");
 nir=new JMenu("Report");
//nr=new JMenu("Vender");
 //nr=new JMenu("");
mb.add(nb);
mb.add(nm);
mb.add(nir);
//mb.add(nr);
 nb1=new JMenuItem("New Book Entry");
nb2=new JMenuItem("New Member Entry");
nb3=new JMenuItem("Exit");
nb4=new JMenuItem("Book Issue");
nb5=new JMenuItem("Book Return");
nb6=new JMenuItem("Book Report");
nb7=new JMenuItem("Member Report");
nb8=new JMenuItem("Book Issue Report");
nb9=new JMenuItem("Book Return Report");
nb10=new JMenuItem("New Vendor Entry");
nb11=new JMenuItem("Vendor Report");
nb.add(nb1);
nb.add(nb2);
nb.add(nb10);
nb.add(nb3);
nm.add(nb4);
nm.add(nb5);
nir.add(nb6);
nir.add(nb7);
nir.add(nb8);
nir.add(nb9);
nir.add(nb11);
nb1.addActionListener(this);
nb2.addActionListener(this);
nb3.addActionListener(this);
nb4.addActionListener(this);
nb5.addActionListener(this);
nb6.addActionListener(this);
nb7.addActionListener(this);
nb8.addActionListener(this);
nb9.addActionListener(this);
nb10.addActionListener(this);
nb11.addActionListener(this);
return mb;
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==nb1)
new libr1();
else
if(e.getSource()==nb2)
new libr2();
else
if(e.getSource()==nb3)
System.exit(0);
else
if(e.getSource()==nb4)
new libr3();
else
if(e.getSource()==nb5)
new libr4();
else
if(e.getSource()==nb6)
new libr5();
else
if(e.getSource()==nb7)
new libr6();
else
if(e.getSource()==nb8)
new libr7();
else
if(e.getSource()==nb9)
new libr8();
else
if(e.getSource()==nb10)
new libr9();
else
if(e.getSource()==nb11)
new libr10();
}
private  static void showmenu()
{
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame frame=new JFrame("LIBRARY MANAGEMENT SYSTEM");
menu m=new menu();
frame.setContentPane(m.createContentPane());
frame.setJMenuBar(m.createMenuBar());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
public  static void  main(String args[])
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
showmenu();
}
});
}
}










	