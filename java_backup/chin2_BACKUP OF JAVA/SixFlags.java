import javax.swing.*;
 import java.awt.*;

 public class SixFlags extends JFrame {
 public SixFlags() {
 Image image1 = new ImageIcon("image/us.gif").getImage();
 Image image2 = new ImageIcon("image/ca.gif").getImage();
 Image image3 = new ImageIcon("image/india.gif").getImage();
 Image image4 = new ImageIcon("image/uk.gif").getImage();
 Image image5 = new ImageIcon("image/china.gif").getImage();
 Image image6 = new ImageIcon("image/norway.gif").getImage();

 setLayout(new GridLayout(2, 0, 5, 5));
 add(new ImageViewer(image1));
 add(new ImageViewer(image2));
 add(new ImageViewer(image3));
 add(new ImageViewer(image4));
 add(new ImageViewer(image5));
 add(new ImageViewer(image6));
 }

 public static void main(String[] args) {
 SixFlags frame = new SixFlags();
 frame.setTitle("SixFlags");
 frame.setSize(400, 320);
 frame.setLocationRelativeTo(null); // Center the frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }
 class ImageViewer extends JPanel
 {
     /** Hold value of property image. */
 private java.awt.Image image;

 /** Hold value of property stretched. */
 private boolean stretched = true;

 /** Hold value of property xCoordinate. */
 private int xCoordinate;

 /** Hold value of property yCoordinate. */
 private int yCoordinate;
 /** Construct an empty image viewer */
 public ImageViewer() {
 }

 /** Construct an image viewer for a specified Image object */
 public ImageViewer(Image image) {
 this.image = image;
 }
protected void paintComponent(Graphics g)
 {
 super.paintComponent(g);
if (image != null)

    if(isStretched() )
    g.drawImage(image, xCoordinate, yCoordinate,
    getWidth(), getHeight(), this);
    else
    g.drawImage(image, xCoordinate, yCoordinate, this);

 }

 /** Return value of property image */
 public java.awt.Image getImage() {
 return image;
 }

 /** Set a new value for property image */
 public void setImage(java.awt.Image image) {
 this.image = image;
 repaint();
 }

 /** Return value of property stretched */
 public boolean isStretched() {
 return stretched;
 }

 /** Set a new value for property stretched */
 public void setStretched(boolean stretched) {
 this.stretched = stretched;
 repaint();
 }

 /** Return value of property xCoordinate */
 public int getXCoordinate() {
 return xCoordinate;
 }

 /** Set a new value for property xCoordinate */
 public void setXCoordinate(int xCoordinate) {
 this.xCoordinate = xCoordinate;
 repaint();
 }

 /** Return value of property yCoordinate */
 public int getYCoordinate() {
 return yCoordinate;
 }

 /** Set a new value for property yCoordinate */
public void setYCoordinate(int yCoordinate) {
 this.yCoordinate = yCoordinate;
 repaint();
 }


 }