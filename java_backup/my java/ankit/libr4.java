 import javax.swing.*;
//import java.sql.*;
//import java.awt.event;
import java.awt.event.*;
import java.io.*;
public class libr4  implements ActionListener
{
static JFrame frame;
static JPanel panel;
JLabel fn;
JLabel ln;
JLabel au;
JLabel au1;
JLabel cp;
JLabel  tp;
JLabel dp;
JLabel vname;
JLabel pr;
JLabel vl;
JLabel v22;
JLabel v23;
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
//JButton b2;
JButton b3;
JButton b4;
JButton b5;
public static void main(String args[])
{
new libr4();
}
public libr4()
{
panel=new JPanel();
frame=new JFrame("Book Return Mode.....");
frame.setVisible(true);
frame.setSize(300,200);
frame.getContentPane().add(panel);
fn=new JLabel("Transaction Code:");
ln=new JLabel("Book Code:");
au=new JLabel("Member Code:");
cp=new JLabel("Book Name:");
au1=new JLabel("Author Name:");
tp=new JLabel("First Name:");
dp=new JLabel("Last Name:");
vname=new JLabel("Issue_Date(dd/mm/yyyy):");
pr=new JLabel("Return_Date(dd/mm/yyyy):");
vl=new JLabel("Fine:");
b1=new JButton("Save");
//b2=new JButton("Fine");
b3=new JButton("Cancel");
b4=new JButton("Exit");
b5=new JButton("Search");
t1=new JTextField(25);
t2=new JTextField(10);
t3=new JTextField(25);
t4=new JTextField(10);
t5=new JTextField(13);
t6=new JTextField(10);
t7=new JTextField(10);
t8=new JTextField(10);
t9=new JTextField(10);
t10=new JTextField(10);
panel.add(fn);
panel.add(t1);
panel.add(b5);
//panel.setLayout(new BoxLayout(panel,BoxLayout.vertical));
//panel.add("  ");
panel.add(ln);
panel.add(t2);
//panel.add(new JTextArea());
panel.add(au);
panel.add(t3);
panel.add(au1);
panel.add(t5);
panel.add(cp);
panel.add(t4);
panel.add(tp);
panel.add(t6);
panel.add(dp);
panel.add(t7);
panel.add(vname);
panel.add(t8);
panel.add(pr);
panel.add(t9);
panel.add(vl);
panel.add(t10);
panel.add(b1);
//panel.add(b2);
panel.add(b3);
panel.add(b4);
b1.addActionListener(this);
//b2.addActionListener(this);
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
String filename="Return";
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
/*else
if(source==b2)
{

try
{
String ss,ss1,ss2,ss3,ss4,ss5,ss6,s7,s8;
int d9,m,y,d1,m1,y1,i;
long dd,dd1,t;
ss6="";
t=0;
ss=ss1=ss2=ss3=ss4=ss5=ss6=s7=s8="";
d9=m=y=d1=m1=y1=0;
s7=t8.getText();
s8=t9.getText();
ss=ss+s7.charAt(0);
ss=ss+s7.charAt(1);
ss1=ss1+s7.charAt(3);
ss1=ss1+s7.charAt(4);
ss2=ss2+s7.charAt(6);
ss2=ss2+s7.charAt(7);
ss2=ss2+s7.charAt(8);
ss2=ss2+s7.charAt(9);
ss3=ss3+s8.charAt(0);
ss3=ss3+s8.charAt(1);
ss4=ss4+s8.charAt(3);
ss4=ss4+s8.charAt(4);
ss5=ss5+s8.charAt(6);
ss5=ss5+s8.charAt(7);
ss5=ss5+s8.charAt(8);
ss5=ss5+s8.charAt(9);
d9=Integer.parseInt(ss);
m=Integer.parseInt(ss1);
y=Integer.parseInt(ss2);
d1=Integer.parseInt(ss3);
m1=Integer.parseInt(ss4);
y1=Integer.parseInt(ss5);
dd=0;
for(i=1900;i<y;i++)
{
if(i%4==0||i%400==0)
 dd=dd+366;
else
dd=dd+365;
}
for(i=1;i<m;i++)
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
 dd=dd+31;
else
 if(y==2)
{
if(y%4==0||y%400==0)
  dd=dd+29;
else
dd=dd+28;
}
else
dd=dd+30;
}
dd=dd+d9;
dd1=0;
for(i=1900;i<y1;i++)
{
if(i%4==0||i%400==0)
 dd1=dd1+366;
else
dd1=dd1+365;
}
for(i=1;i<m1;i++)
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
 dd1=dd1+31;
else
 if(i==2)
{
if(y1%4==0||y1%400==0)
  dd1=dd1+29;
else
dd1=dd1+28;
}
else
dd1=dd1+30;
}
dd1=dd1+d1;
t=dd1-dd;
ss6=Long.toString(t);
t10.setText(ss6);
v23=new JLabel("dd"+ss6);
panel.add(v23);
}
catch(Exception ex)
{
}
}*/
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

else
if(source==b4)
{
frame.setVisible(false);
//System.exit(0);
}
else
if(source==b5)
{
try
{
String filename="issue";
String ss,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9;
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
if(ss2.equalsIgnoreCase(ss)==true)
{
    t1.setText(ss);
 t2.setText(ss1);
    t3.setText(ss3);
    t4.setText(ss4);
    t5.setText(ss5);
    t6.setText(ss6);
 t7.setText(ss7);
 t8.setText(ss8);
 t9.setText(ss9);
}
}
dw.close();

}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
}
}
}





