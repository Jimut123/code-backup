import java.io.*;
class gauss_eli
{
  public void gauss(float a[][],float b[],float x[],int n)
  {
    int i,j,k;
    float am,s;
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
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float a[][] = new float[10][10];
    float b[] = new float[10];
    float x[]= new float[10];
    int i,j,n;
    System.out.print("Enter number of equations(1-10) = ");
    n=Integer.parseInt(br.readLine());
    System.out.println("Enter coefficients of simultaneous equations -->\n");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        System.out.print("a["+(i+1)+"]["+(j+1)+"] = ");
        a[i][j]=Float.parseFloat(br.readLine());
      }
      System.out.print("b["+(i+1)+"] = ");
      b[i]=Float.parseFloat(br.readLine());
     }
     gauss_eli obj = new gauss_eli();
     obj.gauss(a,b,x,n);
     System.out.println("Solutions are -->\n");
     for(i=0;i<n;i++)
       System.out.println("x["+(i+1)+"] = "+Math.ceil(x[i]));
   }
}