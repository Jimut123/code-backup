import javax.swing.*;
import java.awt.*;
public class TestImageIcon extends JFrame 
{
    private ImageIcon myIcon = new ImageIcon("image/my.jpg");int input1;
    private ImageIcon frIcon = new ImageIcon("image/fr.gif");
    private ImageIcon ukIcon = new ImageIcon("image/uk.gif");
    public TestImageIcon()
    {
        setLayout(new GridLayout(1, 40, 40, 50));
        int unittest = input1;
        add(new JLabel(myIcon));
        add(new JButton(ukIcon));
    }
    public static void main(String[] args)
    {
        TestImageIcon frame = new TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}