import java.io.*;
class Point
{
    int x,y;
    Point()
    {
        x=0;
        y=0;
    }
    void readPoint()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the co-ordinates x and y of a point :");
        x=Integer.parseInt(cd.readLine());
        y=Integer.parseInt(cd.readLine());
    }
    void midPoint(Point A,Point B)
    {
        
        x=(A.x+B.x)/2;
        y=(A.y+B.y)/2;
        
    }
    void displayPoint()
    {
        System.out.println("X = "+x+"\t Y = "+y);
    }
  /*  public static void main (String args [])throws IOException
    {
        Point ob = new Point();
        ob.readPoint();
        Point ob1 = new Point();
        ob1.readPoint();
        Point ob2 = new Point();
        ob2=ob2.midPoint(ob,ob1);
        ob2.displayPoint();
    }*/
}
