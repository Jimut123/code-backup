 import javax.swing.*;
//import java.sql.*;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
public class libr6  extends JApplet  implements ActionListener
{
static JFrame frame;
static JPanel panel;
JLabel fn;
JLabel ln;
JLabel au;
JLabel cp;
JLabel  tp;
JLabel dp;
JLabel cd;
JLabel fn1;
JLabel ln1;
JLabel tp1;
JLabel  mode;
JTextField t1;
JTextField t2;
JTextField t3;
JButton b1;
public static void main(String args[])
{
new libr6();
}
public libr6()
{
panel=new JPanel();
Font font=new Font("Arial",Font.BOLD,20);
frame=new JFrame("Member Report Mode");
frame.setVisible(true);
frame.setSize(300,150);
frame.getContentPane().add(panel);
b1=new JButton("END");

b1.addActionListener(this);
try
{
String filename="newmember";
String ss,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10;
boolean EOF=false;
int c;
FileInputStream fw=new FileInputStream(filename);
DataInputStream dw=new DataInputStream(fw);
while(!EOF)
{
ss=dw.readUTF();
ss1=dw.readUTF();
ss2=dw.readUTF();
ss3=dw.readUTF();
ss4=dw.readUTF();
ss5=dw.readUTF();
ss6=dw.readUTF();
ss7=dw.readUTF();
ss8=dw.readUTF();
ss9=dw.readUTF();
ss10=dw.readUTF();
ln=new JLabel("Member Code:"+ss);
fn=new JLabel("First Name:"+ss1);
au=new JLabel("Last Name:"+ss2);
tp=new JLabel("Occupation:"+ss3);
cp=new JLabel("Mode:"+ss4);
dp=new JLabel("Address:"+ss5);
cd=new JLabel("Contact No:"+ss6);
fn1=new JLabel("Contact No:"+ss7);
ln1=new JLabel("Date of Birth:"+ss8);
tp1=new JLabel("Date of Join:"+ss9);
mode=new JLabel("Fees:"+ss10);
ln.setFont(font);
fn.setFont(font);
au.setFont(font);
tp.setFont(font);
cp.setFont(font);
dp.setFont(font);
cd.setFont(font);
fn1.setFont(font);
ln1.setFont(font);
tp1.setFont(font);
mode.setFont(font);
panel.add(ln);
panel.add(fn);
panel.add(au);
panel.add(tp);
panel.add(cp);
panel.add(dp);
panel.add(cd);
panel.add(fn1);
panel.add(ln1);
panel.add(tp1);
panel.add(mode);
ss="";
ss1="";
ss2="";
ss3="";
ss4="";
ss5="";
ss6="";
ss7="";
ss8="";
ss9="";
ss10="";
}
dw.close();
}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
panel.add(b1);
}
public void actionPerformed(ActionEvent e)
{
Object source=e.getSource();
if(source==b1)
{
frame.setVisible(false);
//System.exit(0);
}
}
}






