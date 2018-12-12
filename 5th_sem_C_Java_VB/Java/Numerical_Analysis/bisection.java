import java.io.*;
class bisection
{
  public double function_1(double x1)
  {
    double y;
    y=x1*x1-3;
    return y;
  }
  public int bisect(double x[])
  {
    double c,f1,f2,f12,f3,a,b,ff,x1;
    int n;
    a=-50;
    n=0;
    for(x1=-49.99;x1<=50;x1+=0.01)
    {
       b=x1;
       f1=function_1(a);
       f2=function_1(b);
       f12=f1*f2;
       if(f12<0)
       {
          do
          {
             c=(a+b)/2;
             f3=function_1(c);
             if(f3<0 && f1<0)
               a=c;
             else if(f3<0 && f2<0)
                b=c;
             else if(f3>0 && f1>0)
                a=c;
             else if(f3>0 && f2>0)
                b=c;
             else if(f3<0 && f2>0)
                a=c;
             else if(f3>0 && f1<0)
                b=c;
             f1=function_1(a);
             f2=function_1(b);
             if(f3<0)
               ff=-f3;
             else
               ff=f3;
             if(ff<1e-06)
             {
                x[n++]=c;
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
    bisection b = new bisection();
    n=b.bisect(x);
    for(i=0;i<n;i++)
      System.out.print("\nx["+(i+1)+"] = "+x[i]);
  }
}