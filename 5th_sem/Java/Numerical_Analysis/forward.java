import java.io.*;
class forward
{
  public double forw(double x[],double y[],double xx,int n)
  {
    double diff[][] = new double[50][50];
    double p,h,fact,p1,p2,yy;
    int i,j,k;
    for(i=0;i<n;i++)
      diff[i][0]=y[i];
    for(i=1;i<n;i++)
    {
      k=n-i;
      for(j=0;j<k;j++)
        diff[j][i]=diff[j+1][i-1]-diff[j][i-1];
    }
    for(i=0;i<n;i++)
    {
      k=n-i;
      for(j=0;j<k;j++)
        System.out.print(diff[i][j]+"\t");
      System.out.println();
    }
    yy=y[0];
    h=x[1]-x[0];
    p=(xx-x[0])/h;
    for(i=1;i<n;i++)
    {
      p1=1;
      p2=p;
      fact=1;
      for(j=1;j<=i;j++)
      {
        p1=p1*p2;
        fact=fact*j;
        p2=p2-1;
      }
      yy=yy+p1*diff[0][i]/fact;
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
    forward f = new forward();
    yy=f.forw(x,y,xx,n);
  }
}