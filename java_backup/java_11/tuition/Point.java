import java.io.*;
class Point
{
    int x,y;
    Point()
    {
        x=0;
        y=0;
    }
    void getpoint()throws IOException
    {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
                System.out.print("Enter the values of x and y:");
                x=Integer.parseInt(cd.readLine());
                y=Integer.parseInt(cd.readLine());
            }
    void addpoint(Point p,Point q)

    {
        x=p.x+q.x;
        y=p.y+q.y;
    }
    void display()

    {
        System.out.print("The point is:"+x+","+y);
    }
   /* public static void main(String args[])throws IOException
    {
        Point ob1 = new Point();
        Point ob2 = new Point();
        Point ob3 = new Point();
        ob1.getpoint();
        ob2.getpoint();
        ob3.addpoint(ob1,ob2);
        ob3.display();
    }*/
}
        
    