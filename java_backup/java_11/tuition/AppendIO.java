import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class AppendIO extends JFrame implements ActionListener {
JLabel text;
JButton button;
JPanel panel;
JTextField textField;
private boolean _clickMeMode = true;
AppendIO() { //Begin Constructor
text = new JLabel("Text to save to file:");
button = new JButton("Click Me");
button.addActionListener(this);
textField = new JTextField(30);
panel = new JPanel();
panel.setLayout(new BorderLayout());
panel.setBackground(Color.white);
getContentPane().add(panel);
panel.add(BorderLayout.NORTH, text);
panel.add(BorderLayout.CENTER, textField);
panel.add(BorderLayout.SOUTH, button);
} //End Constructor
public void actionPerformed(ActionEvent event){
Object source = event.getSource();
if (source == button){
String s = null;
if (_clickMeMode){
try {
//Write to file
String text = textField.getText();
byte b[] = text.getBytes();
String outputFileName = System.getProperty("user.home",
File.separatorChar + "home" +
File.separatorChar + "zelda") +
File.separatorChar + "text.txt";
File outputFile = new File(outputFileName);
RandomAccessFile out = new RandomAccessFile(outputFile, "rw");
out.seek(outputFile.length());
out.write(b);
//Write a new line (NL) to the file.
out.writeByte('\n');
out.close();
//Read from file
String inputFileName = System.getProperty("user.home",
File.separatorChar + "home" +
File.separatorChar + "zelda") +
File.separatorChar + "text.txt";
File inputFile = new File(inputFileName);
FileInputStream in = new FileInputStream(inputFile);
byte bt[] = new byte[(int)inputFile.length()];
in.read(bt);
s = new String(bt);
in.close();
} catch(java.io.IOException e) {
System.out.println(e.toString());
}
//Clear text field
textField.setText("");
}
}}}