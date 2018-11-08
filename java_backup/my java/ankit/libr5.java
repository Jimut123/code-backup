 import javax.swing.*;
//import java.sql.*;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
public class libr5  extends JApplet  implements ActionListener
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
new libr5();
}
public libr5()
{
panel=new JPanel();
Font font=new Font("Arial",Font.BOLD,20);
frame=new JFrame("Book Report Mode");
frame.setVisible(true);
frame.setSize(300,150);
frame.getContentPane().add(panel);
b1=new JButton("END");

b1.addActionListener(this);
try
{
String filename="newbook1";
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
ln=new JLabel("Book Code:"+ss);
fn=new JLabel("Book Name:"+ss1);
au=new JLabel("Author:"+ss2);
tp=new JLabel("Type:"+ss3);
cp=new JLabel("Copy:"+ss4);
dp=new JLabel("Date_Of_Purchase(dd/mm/yyyy):"+ss5);
cd=new JLabel("Price:"+ss6);
fn1=new JLabel("Vendor:"+ss7);
ln1=new JLabel("Gross:"+ss8);
tp1=new JLabel("Discount:"+ss9+"%");
mode=new JLabel("Net:"+ss10);
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






