//this class will solve the 11th question of ISC 2013
import java.util.*;
class Perimeter
{
    protected double a;
    protected double b;
    public Perimeter(double a, double b)
    {
        this.a=a;
        this.b=b;
    }
    
    public double Calculate()
    {
        return 2*(a+b);
    }
    
    public void show()
    {
        System.out.println("a = " + a + "\nb = " + b + "\nPerimiter = " + Calculate());
    }
}

class Area extends Perimeter
{
    private double h;
    private double area;
    private double breadth;
    public Area(double length, double breadth, double height)
    {
        super(length, breadth);
        this.breadth=breadth;
        h=height;
    }
    
    public void doarea()
    {
        area=breadth*h;
    }
    
    public void show()
    {
        super.show();
        System.out.println("Height = " + h + "\nBreadth = " + breadth + "\nArea = " + area);
    }
}

public class Parallelogram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the parallelogram: ");
        double l=sc.nextDouble();
        System.out.print("Enter the breadth of the parallelogram: ");
        double b=sc.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double h=sc.nextDouble();
        
        Area a=new Area(l, b, h);
        a.doarea();
        a.show();
    }
}