 import javax.swing.*;
//import java.sql.*;
//import java.awt.event;
import java.awt.event.*;
import java.io.*;
public class libr1  implements ActionListener
{
static JFrame frame;
static JPanel panel;
JLabel fn;
JLabel ln;
JLabel au;
JLabel cp;
JLabel  tp;
JLabel dp;
JLabel vname;
JLabel pr;
JLabel vl;
JLabel  dis;
JLabel  nt;
JTextField t1;
JTextField t2;
JTextField t3;
JTextField t4;
JTextField t5;
JTextField t6;
JTextField t7;
JTextField t8;
JTextField t9;
JTextField t10;
JButton b1;
JButton b2;
JButton b3;
JButton b4;
JComboBox jc;
public static void main(String args[])
{
new libr1();
}
public libr1()
{
String ss1[]={"Science","Arts","Commerce","Story-Book","Others....."};
panel=new JPanel();
frame=new JFrame("Storing data");
frame.setVisible(true);
frame.setSize(300,200);
frame.getContentPane().add(panel);
fn=new JLabel("Book Name:");
ln=new JLabel("Book Code:");
au=new JLabel("Author:");
cp=new JLabel("Copy:");
tp=new JLabel("Type:");
dp=new JLabel("Date_Of_Purchase(dd/mm/yyyy):");
vname=new JLabel("Vendor Name:");
pr=new JLabel("Price:");
vl=new JLabel("Gross Cost:");
dis=new JLabel("Discount in %:");
nt=new JLabel("Total Cost:");
b4=new JButton("Calculate");
b1=new JButton("Save");
b2=new JButton("Exit");
b3=new JButton("Cancel");
t1=new JTextField(25);
t2=new JTextField(10);
t3=new JTextField(25);
t4=new JTextField(10);
t5=new JTextField(13);
t6=new JTextField(10);
t7=new JTextField(10);
t8=new JTextField(2);
t9=new JTextField(10);
t10=new JTextField(10);
jc=new JComboBox(ss1);


panel.add(fn);
panel.add(t1);

//panel.setLayout(new BoxLayout(panel,BoxLayout.vertical));
//panel.add("  ");
panel.add(ln);
panel.add(t2);
//panel.add(new JTextArea());
panel.add(au);
panel.add(t3);
panel.add(cp);
panel.add(t4);
panel.add(tp);
panel.add(jc);
panel.add(dp);
panel.add(t5);
panel.add(pr);
panel.add(t6);
panel.add(vname);
panel.add(t7);
panel.add(vl);
panel.add(t8);
panel.add(dis);
panel.add(t9);
panel.add(nt);
panel.add(t10);
panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
Object source=e.getSource();
double d,p,p1,p2,p3,p4;
if(source==b1)
{
try
{
String filename="newbook1";
String ss;
int c;
FileOutputStream fw=new FileOutputStream(filename,true);
DataOutputStream dw=new DataOutputStream(fw);
ss=t1.getText();
dw.writeUTF(ss);
ss=t2.getText();
dw.writeUTF(ss);
ss=t3.getText();
dw.writeUTF(ss);
ss=(String) jc.getSelectedItem();
dw.writeUTF(ss);
ss=t4.getText();
dw.writeUTF(ss);
ss=t5.getText();
dw.writeUTF(ss);
ss=t6.getText();
dw.writeUTF(ss);
ss=t7.getText();
dw.writeUTF(ss);
ss=t8.getText();
dw.writeUTF(ss);
ss=t9.getText();
dw.writeUTF(ss);
ss=t10.getText();
dw.writeUTF(ss);
dw.close();
}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
}
else
if(source==b2)
{
try
{
System.exit(0);
}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
}
else
if(source==b3)
{
try
{
t1.setText(" ");
t2.setText(" ");

}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
}

else
if(source==b4)
{
try
{
String ss;
d=Double.parseDouble(t6.getText());
p=Double.parseDouble(t4.getText());
p1=d*p;
ss=Double.toString(p1);
t8.setText(ss);
p2=Double.parseDouble(t9.getText());
p3=(p1*p2)/100;
p4=p1-p3;
ss=Double.toString(p4);
t10.setText(ss);

}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
}
}
}





