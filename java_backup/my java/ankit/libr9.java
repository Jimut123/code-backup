 import javax.swing.*;
//import java.sql.*;
//import java.awt.event;
import java.awt.event.*;
import java.io.*;
public class libr9  implements ActionListener
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
JTextField t1;
JTextField t2;
JTextField t3;
JTextField t4;
JTextField t5;
JTextField t6;
JTextField t7;
JTextField t8;
JTextField t9;
JButton b1;
JButton b2;
JButton b3;
JComboBox jc;
public static void main(String args[])
{
new libr9();
}
public libr9()
{
String ss1[]={"Company","Individuals"};
panel=new JPanel();
frame=new JFrame("New Vendor Entry");
frame.setVisible(true);
frame.setSize(300,200);
frame.getContentPane().add(panel);
fn=new JLabel("Vendor Code:");
ln=new JLabel("Vendor Name:");
au=new JLabel("Address:");
cp=new JLabel("Contact No:");
vname=new JLabel("Contact No:");
vl=new JLabel("E-Mail:");
tp=new JLabel("Type:");
dp=new JLabel("Date_Of_Join(dd/mm/yyyy):");
pr=new JLabel("Initial Deposit:");
dis=new JLabel("Reg No:");
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
panel.add(vname);
panel.add(t7);
panel.add(vl);
panel.add(t8);
panel.add(tp);
panel.add(jc);
panel.add(dp);
panel.add(t5);
panel.add(pr);
panel.add(t6);
panel.add(dis);
panel.add(t9);
panel.add(b1);
panel.add(b2);
panel.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
Object source=e.getSource();
double d,p,p1,p2,p3,p4;
if(source==b1)
{
try
{
String filename="vendor";
String ss;
int c;
FileOutputStream fw=new FileOutputStream(filename,true);
DataOutputStream dw=new DataOutputStream(fw);
ss=t1.getText();
dw.writeUTF(ss.trim());
ss=t2.getText();
dw.writeUTF(ss);
ss=t3.getText();
dw.writeUTF(ss);
ss=t4.getText();
dw.writeUTF(ss);
ss=t7.getText();
dw.writeUTF(ss);
ss=t8.getText();
dw.writeUTF(ss);
ss=(String) jc.getSelectedItem();
dw.writeUTF(ss);
ss=t5.getText();
dw.writeUTF(ss);
ss=t6.getText();
dw.writeUTF(ss);
ss=t9.getText();
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
frame.setVisible(false);
//System.exit(0);
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
t3.setText(" ");
t4.setText(" ");
t5.setText(" ");
t6.setText(" ");
t7.setText(" ");
t8.setText(" ");
t9.setText(" ");
}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
}
}
}





