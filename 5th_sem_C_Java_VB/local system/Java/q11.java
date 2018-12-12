import java.io.*;
class q11
{
  public double runge4_function(double x,double y)
  {
    double y1;
    y1=y+0*x;
    return y1;
  }
  public double runge4(double x0,double y0,double h)
  {
    double k1,k2,k3,k4,y1;
    k1=h*runge4_function(x0,y0);
    k2=h*runge4_function(x0+0.5*h,y0+0.5*k1);
    k3=h*runge4_function(x0+0.5*h,y0+0.5*k2);
    k4=h*runge4_function(x0+h,y0+k3);
    y1=y0+1.0/6.0*(k1+2*k2+2*k3+k4);
    return y1;
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double x0,y0,x1,y1,h,xn;
    int i,n;
    System.out.print("Enter x0 = ");
    x0=Double.parseDouble(br.readLine());
    System.out.print("Enter y0 = ");
    y0=Double.parseDouble(br.readLine());
    System.out.print("Enter xn = ");
    xn=Double.parseDouble(br.readLine());
    System.out.print("Enter h = ");
    h=Double.parseDouble(br.readLine());
    n=(int)((xn-x0)/h);
    System.out.println("n = "+n);
    q11 obj = new q11();
    System.out.println("x = "+x0+" y = "+y0);
    for(i=1;i<=n;i++)
    {
      x1=x0+i*h;
      y1=obj.runge4(x0,y0,h);
      System.out.println("x = "+x1+" y = "+y1);
      y0=y1;
    }
  }
}