 import javax.swing.*;
//import java.sql.*;
//import java.awt.event;
import java.awt.event.*;
import java.io.*;
public class libr2  implements ActionListener
{
static JFrame frame;
static JPanel panel;
JLabel fn;
JLabel ln;
JLabel cd;
JLabel ad;
JLabel con1;
JLabel con2;
JLabel  tp;
JLabel dob;
JLabel doj;
JLabel mode;
JLabel i_fee;
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
JComboBox jc1;
public static void main(String args[])
{
new libr2();
}
public libr2()
{
String ss1[]={"Service","Business","Students","House_Wife","Misc...."};
String ss2[]={"Monthly","Quaterly","Half_Yearly","Yearly","Life Member"};
panel=new JPanel();
frame=new JFrame("New Member Entry                                              ");
frame.setVisible(true);
frame.setSize(300,300);
frame.getContentPane().add(panel);
cd=new JLabel("Code:");
fn=new JLabel("First Name:");
ln=new JLabel("Last  Name:");
ad=new JLabel("Address:");
con1=new JLabel("Contact No:");
con2=new JLabel("Contact No:");
tp=new JLabel("Occupation:");
dob=new JLabel("Date_Of_Birth(dd/mm/yyyy):");
doj=new JLabel("Date_Of_Join(dd/mm/yyyy):");
mode=new JLabel("Membership Mode:");
i_fee=new JLabel("Initial Fees:");
//b4=new JButton("Calculate");
b1=new JButton("Save");
b2=new JButton("Exit");
b3=new JButton("Cancel");
t1=new JTextField(25);
t2=new JTextField(15);
t3=new JTextField(10);
t4=new JTextField(25);
t5=new JTextField(10);
t6=new JTextField(10);
t7=new JTextField(10);
t8=new JTextField(10);
t9=new JTextField(8);
jc=new JComboBox(ss1);
jc1=new JComboBox(ss2);
panel.add(cd);
panel.add(t3);
panel.add(fn);
panel.add(t1);

//panel.setLayout(new BoxLayout(panel,BoxLayout.vertical));
//panel.add("  ");
panel.add(ln);
panel.add(t2);
//panel.add(new JTextArea());
panel.add(ad);
panel.add(t4);
panel.add(con1);
panel.add(t5);
panel.add(con2);
panel.add(t6);
panel.add(tp);
panel.add(jc);
panel.add(dob);
panel.add(t7);
panel.add(doj);
panel.add(t8);
panel.add(mode);
panel.add(jc1);
panel.add(i_fee);
panel.add(t9);
panel.add(b1);
panel.add(b2);
panel.add(b3);
//panel.add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
//b4.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
Object source=e.getSource();
double d,p,p1,p2,p3,p4;
if(source==b1)
{
try
{
String filename="newmember";
String ss;
int c;
FileOutputStream fw=new FileOutputStream(filename,true);
DataOutputStream dw=new DataOutputStream(fw);
ss=t3.getText();
dw.writeUTF(ss.trim());
ss=t1.getText();
dw.writeUTF(ss);
ss=t2.getText();
dw.writeUTF(ss);

ss=(String) jc.getSelectedItem();
dw.writeUTF(ss);
ss=(String) jc1.getSelectedItem();
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

//else
//if(source==b4)
//{
//try
//{
//String ss;
//d=Double.parseDouble(t6.getText());
//p=Double.parseDouble(t4.getText());
//p1=d*p;
//ss=Double.toString(p1);
//t8.setText(ss);
//p2=Double.parseDouble(t9.getText());
//p3=(p1*p2)/100;
//p4=p1-p3;
//ss=Double.toString(p4);
//t10.setText(ss);

//}
//catch(Exception ex)
//{
//System.out.println("Error"+ex);
//}
//}
}
}





