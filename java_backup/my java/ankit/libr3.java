 import javax.swing.*;
//import java.sql.*;
//import java.awt.event;
import java.awt.event.*;
import java.io.*;
public class libr3  implements ActionListener
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
JLabel ad;
JLabel con1;
JLabel con2;
JLabel trc;
JLabel bkc;
JLabel memc;
JLabel bnm;
JLabel auth;
JLabel firn;
JLabel lastn;
JLabel isdt;
JLabel rtdt;
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
JTextField t11;
JTextField t12;
JTextField t13;
JTextField t14;
JTextField t15;
JTextField t16;
JTextField t17;
JTextField t18;
JTextField t19;
JTextField t20;
JTextField t21;
JTextField t22;
JTextField t23;
JButton b1;
JButton b2;
JButton b3;
JButton b4;
JButton b5;
public static void main(String args[])
{
new libr3();
}
public libr3()
{
//String ss1[]={"Science","Arts","Commerce","Story-Book","Others....."};
panel=new JPanel();
frame=new JFrame("Book Issue Mode");
frame.setVisible(true);
frame.setSize(300,200);
frame.getContentPane().add(panel);
ln=new JLabel("Book Code:");
fn=new JLabel("Book Name:");
au=new JLabel("Author:");
tp=new JLabel("Copy:");
cp=new JLabel("Type:");
dp=new JLabel("Date_Of_Purchase(dd/mm/yyyy):");
b1=new JButton("Search the Book");
t1=new JTextField(15);
t2=new JTextField(25);
t3=new JTextField(25);
t4=new JTextField(6);
t5=new JTextField(25);
t6=new JTextField(35);

cd=new JLabel("Member Code:");
 fn1=new JLabel("First Name:");
ln1=new JLabel(" Last Name:");
 tp1=new JLabel("Type");
 mode=new JLabel("Mode");
 ad=new JLabel("Address");
con1=new JLabel("Contact No:");
 con2=new JLabel("Contact No:");
 t7=new JTextField(10);
 t8=new JTextField(25);
 t9=new JTextField(25);
t10=new JTextField(25);
 t11=new JTextField(25);
t12=new JTextField(25);
 t13=new JTextField(25);
t14=new JTextField(25);
b2=new JButton("Search the Member");

trc=new JLabel("Transaction Code:");
bkc=new JLabel("Book No:");
memc=new JLabel("Member Code:");
bnm=new JLabel("Book name:");
auth=new JLabel("Author:");
firn=new JLabel("First Name:");
lastn=new JLabel("Last Name:");
isdt=new JLabel("Issue Date :");
rtdt=new JLabel("Return Date:");
t15=new JTextField(25);
t16=new JTextField(25);
t17=new JTextField(25);
t18=new JTextField(25);
t19=new JTextField(25);
t20=new JTextField(25);
t21=new JTextField(25);
t22=new JTextField(25);
t23=new JTextField(25);
b4=new JButton("Transaction");
b3=new JButton("Save");
b5=new JButton("Exit");
panel.add(ln);
panel.add(t1);

//panel.setLayout(new BoxLayout(panel,BoxLayout.vertical));
//panel.add("  ");
panel.add(fn);
panel.add(t2);
//panel.add(new JTextArea());
panel.add(au);
panel.add(t3);
panel.add(tp);
panel.add(t5);
panel.add(cp);
panel.add(t4);
panel.add(dp);
panel.add(t6);
panel.add(b1);

panel.add(cd);
panel.add(t7);
panel.add(fn1);
panel.add(t8);
panel.add(ln1);
panel.add(t9);
panel.add(tp1);
panel.add(t10);
panel.add(mode);
panel.add(t11);
panel.add(ad);
panel.add(t12);
panel.add(con1);
panel.add(t13);
panel.add(con2);
panel.add(t14);
panel.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

panel.add(trc);
panel.add(t15);
panel.add(isdt);
panel.add(t22);
panel.add(rtdt);
panel.add(t23);
panel.add(b4);
panel.add(bkc);
panel.add(t16);
panel.add(memc);
panel.add(t17);
panel.add(bnm);
panel.add(t18);
panel.add(auth);
panel.add(t19);
panel.add(firn);
panel.add(t20);
panel.add(lastn);
panel.add(t21);
panel.add(b3);
panel.add(b5);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

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
String ss,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10,ss11;
boolean EOF=false;
int c;
FileInputStream fw=new FileInputStream(filename);
DataInputStream dw=new DataInputStream(fw);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ss2=t1.getText();
while(!EOF)
{
ss=dw.readUTF();
ss1=dw.readUTF();
//ss2=dw.readUTF();
ss3=dw.readUTF();
ss4=dw.readUTF();
ss5=dw.readUTF();
ss6=dw.readUTF();
ss7=dw.readUTF();
ss8=dw.readUTF();
ss9=dw.readUTF();
ss10=dw.readUTF();
ss11=dw.readUTF();
if(ss2.equalsIgnoreCase(ss)==true)
{
    t1.setText(ss);
 t2.setText(ss1);
    t3.setText(ss3);
    t4.setText(ss4);
    t5.setText(ss5);
    t6.setText(ss6);
}
}
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
String filename="newmember";
String ss,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10,ss11;
boolean EOF=false;
int c;
FileInputStream fw=new FileInputStream(filename);
DataInputStream dw=new DataInputStream(fw);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ss2=t7.getText();
while(!EOF)
{
ss=dw.readUTF();
ss1=dw.readUTF();
//ss2=dw.readUTF();
ss3=dw.readUTF();
ss4=dw.readUTF();
ss5=dw.readUTF();
ss6=dw.readUTF();
ss7=dw.readUTF();
ss8=dw.readUTF();
ss9=dw.readUTF();
ss10=dw.readUTF();
ss11=dw.readUTF();
if(ss2.equalsIgnoreCase(ss)==true)
{
    t7.setText(ss);
 t8.setText(ss1);
    t9.setText(ss3);
    t10.setText(ss4);
    t11.setText(ss5);
    t12.setText(ss6);
 t13.setText(ss7);
 t14.setText(ss8);
}
}
dw.close();
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
String filename="issue";
String ss;
int c;
FileOutputStream fw=new FileOutputStream(filename,true);
DataOutputStream dw=new DataOutputStream(fw);
ss=t15.getText();
dw.writeUTF(ss.trim());
ss=t16.getText();
dw.writeUTF(ss);
ss=t17.getText();
dw.writeUTF(ss);
ss=t18.getText();
dw.writeUTF(ss);
ss=t19.getText();
dw.writeUTF(ss);
ss=t20.getText();
dw.writeUTF(ss);
ss=t21.getText();
dw.writeUTF(ss);
ss=t22.getText();
dw.writeUTF(ss);
ss=t23.getText();
dw.writeUTF(ss);
dw.close();
}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
}
else
if(source==b4)
{
String s;
s=t1.getText();
t16.setText(s);
s=t7.getText();
t17.setText(s);
s=t2.getText();
t18.setText(s);
s=t3.getText();
t19.setText(s);
s=t8.getText();
t20.setText(s);
s=t9.getText();
t21.setText(s);
}
else
if(source==b5)
{
frame.setVisible(false);
//System.exit(0);
}
}
}





