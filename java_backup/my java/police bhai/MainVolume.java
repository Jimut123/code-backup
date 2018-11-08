//program to calculate the volume
import java.io.*;
class volume
{
    private double vol;
    public void getData()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter the side of the cube");
        int side=Integer.parseInt(br.readLine());
        calc(side);
        System.out.println("enter the radius");
        double radius=Double.parseDouble(br.readLine());
        calc(radius);
        System.out.println("enter the lenght,breadth,height");
        int lenght=Integer.parseInt(br.readLine());
        int breadth=Integer.parseInt(br.readLine());
        int height=Integer.parseInt(br.readLine());
        calc(lenght, breadth, height);
    }
    public void calc(int s)
    {
        vol=Math.pow(s,3);
        System.out.println("the volume of the cube"+vol);
    }
    public void calc(double r)
    {
        double pie=3.14;
        vol=4/3*pie*Math.pow(r,3);
        System.out.println("the volume of the sphere"+vol);
    }
    public void calc(int l,int b,int h)
    {
        vol=l*b*h;
        System.out.println("volume of the cuboid"+vol);
    }
}//end of class
public class MainVolume
{
    public static void main(String args[])throws IOException
    {
        volume obj=new volume();
        obj.getData();
    }//end of main()
}//end of main class

        