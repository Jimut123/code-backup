import java.io.*;
class lagrange
{
  public double lag(double x[],double y[],double xx,int n)
  {
    double diff[][] = new double[50][50];
    double num1,den1,yy;
    int i,j;
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        if(i==j)
          diff[i][j]=xx-x[i];
        else
          diff[i][j]=x[i]-x[j];
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
        System.out.print(diff[i][j]+"\t");
      System.out.println();
    }
    yy=0;
    for(i=0;i<n;i++)
    {
      num1=1;
      den1=1;
      for(j=0;j<n;j++)
        if(i!=j)
        {
          num1=num1*diff[j][j];
          den1=den1*diff[i][j];
        }
      yy=yy+num1/den1*y[i];
    }
    System.out.println("xx = "+xx+"\tyy = "+yy);
    return yy;
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double x[] = new double[50];
    double y[] = new double[50];
    double xx,yy;
    int i,n;
    System.out.print("Enter number of points : ");
    n=Integer.parseInt(br.readLine());
    for(i=0;i<n;i++)
    {
      System.out.print("x["+(i+1)+"] = ");
      x[i]=Double.parseDouble(br.readLine());
      System.out.print("y["+(i+1)+"] = ");
      y[i]=Double.parseDouble(br.readLine());
    }
    System.out.print("Enter xx = ");
    xx=Double.parseDouble(br.readLine());
    lagrange l = new lagrange();
    yy=l.lag(x,y,xx,n);
  }
}