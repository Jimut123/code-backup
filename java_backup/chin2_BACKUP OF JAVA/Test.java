import javax.swing.*;
 import java.awt.*;
 public class Test extends JFrame {
    public static void main(String[] args) {
        // Create a frame and set its properties
        JFrame frame = new Test();
        frame.setTitle("ButtonIcons");
        frame.setSize(3100, 3100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public Test() {
        ImageIcon usIcon = new ImageIcon("image/us.gif");
        JButton jbt1 = new JButton(usIcon);
        JButton jbt2 = new JButton(usIcon);
        JPanel p1 = new JPanel();
        p1.add(jbt1);
        JPanel p2 = new JPanel();
        p2.add(jbt2);
        JPanel p3 = new JPanel();
        p2.add(jbt1);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        add(p3, BorderLayout.CENTER);
    }
 }