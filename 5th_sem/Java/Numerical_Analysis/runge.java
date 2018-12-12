import java.io.*;
class runge
{
  public double runge4(double x,double y)
  {
    double y1;
    y1 = y + 0 * x;
    return y1;
  }
  public double function(double x,double y,double h)
  {
     double k1,k2,k3,k4,y1;
     k1 = h * runge4(x,y);
     k2 = h * runge4(x + 0.5 * h,y + 0.5 * k1);
     k3 = h * runge4(x + 0.5 * h,y + 0.5 * k2);
     k4 = h * runge4(x + h,y + k3);
     y1 = y + 1.0/6.0 * (k1 + 2 * k2 + 2 * k3 + k4);
     return y1;
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double x,y,x1,y1,h,xn;
    int i,n;
    System.out.print("Enter x :");
    x=Double.parseDouble(br.readLine());
    System.out.print("Enter y :");
    y=Double.parseDouble(br.readLine());
    System.out.print("Enter xn :");
    xn=Double.parseDouble(br.readLine());
    System.out.print("Enter h :");
    h=Double.parseDouble(br.readLine());
    n=(int)((xn-x)/h);
    System.out.println("n = "+n);
    System.out.println("x = "+x+" y = "+y);
    runge obj = new runge();
    for(i=1;i<=(n+1);i++)
    {
       x1=x+i*h;
       y1=obj.function(x,y,h);
       System.out.println("x = "+x1+" y = "+y1);
       y=y1;
    }
  }
}