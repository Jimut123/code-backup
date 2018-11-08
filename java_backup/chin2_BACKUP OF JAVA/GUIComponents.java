 import javax.swing.*;

 public class GUIComponents 
 {
    public static void main(String[] args) 
    {
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        JLabel jlblName = new JLabel("Enter your name: ");
        JTextField jtfName = new JTextField("Type Name Here");
        JCheckBox jchkBold = new JCheckBox("Bold");
        JCheckBox jchkSold = new JCheckBox("Sold");
        JCheckBox jchkItalic = new JCheckBox("Italic");
        JRadioButton jrbRed = new JRadioButton("Red");
        JRadioButton jrbYellow = new JRadioButton("Yellow");
        JRadioButton jrbWhite = new JRadioButton("White");
        JComboBox jcboColor = new JComboBox(new String[]{"Freshman","Sophomore", "Junior", "Senior" , "Chirantan", "Sana Bhoot" , "ULUBERIA"});
        JPanel panel = new JPanel();
        JPanel panela = new JPanel();
        panel.add(jbtOK); panel.add(jbtCancel);
        panel.add(jlblName); panel.add(jtfName);
        panel.add(jlblName);
        panel.add(jchkBold); panel.add(jchkItalic);
        panel.add(jchkSold);panel.add(jrbRed); 
        panel.add(jrbYellow);panel.add(jrbWhite);
        panel.add(jcboColor);
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.add(panel);
        frame.setTitle("Show GUI Components");
        frame.setSize(5000, 5000);
        frame.setVisible(true);
    }
 }