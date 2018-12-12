import java.io.*;
class simpson
{
  public double function_1(double x)
  {
    double y;
    y=4/(1+x*x);
    return y;
  }
  public double simp(double a,double b,int n)
  {
    double s1,s2,s3,is,h;
    int i;
    double y[] = new double[1000];
    h=(b-a)/n;
    s1=function_1(a)+function_1(b);
    for(i=1;i<n;i++)
      y[i]=function_1(a+i*h);
    s2=s3=0;
    for(i=1;i<n;i++)
      if(i%2 == 0)
       s2=s2+y[i];
      else
       s3=s3+y[i];
    is=1/3.0*h*(s1+4*s3+2*s2);
    return is;
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double a,b,is;
    int n;
    System.out.print("Enter lower limit of your integral : ");
    a=Double.parseDouble(br.readLine());
    System.out.print("Enter upper limit of your integral : ");
    b=Double.parseDouble(br.readLine());
    System.out.print("Enter number of intervals : ");
    n=Integer.parseInt(br.readLine());
    simpson sp = new simpson();
    is=sp.simp(a,b,n);
    System.out.println("Value of integral : "+is);
  }
}