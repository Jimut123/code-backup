import java.io.*;
class least
{
  public void gauss(double a[][],double b[],int n)
  {
    int i,j,k;
    double am,s;
    double x[] = new double[10];
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        if(i!=j)
        {
          am=a[j][i]/a[i][i];
          for(k=0;k<n;k++)
            a[j][k]=a[j][k]-a[i][k]*am;
          b[j]=b[j]-b[i]*am;
        }
    x[n-1]=b[n-1]/a[n-1][n-1];
    for(i=n-2;i>=0;i--)
    {
      s=0;
      for(j=i+1;j<n;j++)
        s=s+a[i][j]*x[j];
      x[i]=(b[i]-s)/a[i][i];
    }
    for(i=0;i<n;i++)
      System.out.print("x["+(i+1)+"] = "+Math.ceil(x[i]));
  }
  public void lea(double x[],double y[],int m,int n)
  {
    double s1,s2,p;
    int i,j,k,k1,k2;
    double a[][] = new double[10][10];
    double b[] = new double[10];
    for(i=0;i<=n;i++)
      for(j=0;j<=n;j++)
      {
        k=i+j;
        s1=0;
        for(k1=0;k1<m;k1++)
        {
          p=1;
          for(k2=1;k2<=k;k2++)
            p=p*x[k1];
          s1=s1+p;
        }
        a[i][j]=s1;
      }
    for(i=0;i<=n;i++)
    {
      k=i;
      s2=0;
      for(k1=0;k1<m;k1++)
      {
        p=1;
        for(k2=1;k2<=k;k2++)
          p=p*x[k1];
        s2=s2+y[k1]*p;
      }
      b[i]=s2;
    }
    for(i=0;i<=n;i++)
    {
      for(j=0;j<=n;j++)
        System.out.print(a[i][j]+"\t");
      System.out.println(b[i]);
    }
    gauss(a,b,n+1);
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double x[] = new double[50];
    double y[] = new double[50];
    int i,n,m;
    System.out.print("Enter number of points : ");
    m=Integer.parseInt(br.readLine());
    System.out.print("Enter order of polynomial : ");
    n=Integer.parseInt(br.readLine());
    for(i=0;i<m;i++)
    {
      System.out.print("x["+(i+1)+"] = ");
      x[i]=Double.parseDouble(br.readLine());
      System.out.print("y["+(i+1)+"] = ");
      y[i]=Double.parseDouble(br.readLine());
    }
    least l = new least();
    l.lea(x,y,m,n);
  }
}