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
JTextField t1;
JTextField t2;
JTextField t3;
JTextField t4;
JTextField t5;
JTextField t6;
JButton b1;
public static void main(String args[])
{
new libr3();
}
public libr3()
{
//String ss1[]={"Science","Arts","Commerce","Story-Book","Others....."};
panel=new JPanel();
frame=new JFrame("Storing data");
frame.setVisible(true);
frame.setSize(300,200);
frame.getContentPane().add(panel);
ln=new JLabel("Book Code:");
fn=new JLabel("Book Name:");
au=new JLabel("Author:");
cp=new JLabel("Copy:");
tp=new JLabel("Type:");
dp=new JLabel("Date_Of_Purchase(dd/mm/yyyy):");
b1=new JButton("Search");
t1=new JTextField(50);
t2=new JTextField(50);
t3=new JTextField(50);
t4=new JTextField(2);
t5=new JTextField(50);
t6=new JTextField(50);

panel.add(ln);
panel.add(t1);

//panel.setLayout(new BoxLayout(panel,BoxLayout.vertical));
//panel.add("  ");
panel.add(fn);
panel.add(t2);
//panel.add(new JTextArea());
panel.add(au);
panel.add(t3);
panel.add(cp);
panel.add(t4);
panel.add(tp);
panel.add(t5);
panel.add(dp);
panel.add(t6);
panel.add(b1);
b1.addActionListener(this);
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
String ss,ss1,ss2,ss3,ss4,ss5,ss6;
boolean EOF=false;
int c;
FileInputStream fw=new FileInputStream(filename);
DataInputStream dw=new DataInputStream(fw);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ss2=t2.getText();
while(!EOF)
{
ss=dw.readUTF();
ss1=dw.readUTF();
ss2=dw.readUTF();
ss3=dw.readUTF();
ss4=dw.readUTF();
ss5=dw.readUTF();
ss6=dw.readUTF();
if(ss2.equalsIgnoreCase(ss1)==true)
{
    t2.setText(ss);
    t3.setText(ss2);
    t4.setText(ss3);
    t5.setText(ss4);
    t6.setText(ss5);
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





