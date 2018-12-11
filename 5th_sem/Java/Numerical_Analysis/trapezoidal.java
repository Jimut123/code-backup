import java.io.*;
class trapezoidal
{
  public double function_1(double x)
  {
    double y;
    y=4/(1+x*x);
    return y;
  }
  public double trap(double a,double b,int n)
  {
    double s1,s2,it,h;
    int i;
    double y[] = new double[1000];
    h=(b-a)/n;
    s1=function_1(a)+function_1(b);
    for(i=1;i<n;i++)
      y[i]=function_1(a+i*h);
    s2=0;
    for(i=1;i<n;i++)
      s2=s2+y[i];
    it=0.5*h*(s1+2*s2);
    return it;
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double a,b,it;
    int n;
    System.out.print("Enter lower limit of your integral : ");
    a=Double.parseDouble(br.readLine());
    System.out.print("Enter upper limit of your integral : ");
    b=Double.parseDouble(br.readLine());
    System.out.print("Enter number of intervals : ");
    n=Integer.parseInt(br.readLine());
    trapezoidal tr = new trapezoidal();
    it=tr.trap(a,b,n);
    System.out.println("Value of integral : "+it);
  }
}