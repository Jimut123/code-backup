import java.io.*;
class newton
{
  public double function_1(double x1)
  {
    double y;
    y=x1*x1-3;
    return y;
  }
  public double function_1d(double x1)
  {
    double y;
    y=2*x1;
    return y;
  }
  public int raphson(double x[])
  {
    double xg,f1,f2,f12,a,b,x1;
    double h,hh;
    int n;
    a=-50;
    n=0;
    for(x1=-49.99;x1<=50;x1+=0.1)
    {
      b=x1;
      f1=function_1(a);
      f2=function_1(b);
      f12=f1*f2;
      if(f12<0)
      {
        xg=(a+b)/2;
        do
        {
          h=-function_1(xg)/function_1d(xg);
          xg=xg+h;
          if(h<0)
            hh=-h;
          else
            hh=h;
          if(hh<1e-06)
          {
            x[n++]=xg;
            break;
          }
         }while(1==1);
       }
       a=x1;
     }
     return n;
  }
  public static void main(String args[])throws IOException
  {
    double x[] = new double[10];
    int i,n;
    newton r = new newton();
    n=r.raphson(x);
    for(i=0;i<n;i++)
      System.out.print("\nx["+(i+1)+"] = "+x[i]);
  }
}