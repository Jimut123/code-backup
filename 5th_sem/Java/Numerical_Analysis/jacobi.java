import java.io.*;
class jacobi
{
  public void jac(float a[][],float b[],float x[],int n)
  {
    float xg[] = new float[10];
    float eps[] = new float[10];
    int i,j,itr,flag;
    double tot=1e-06;
    float s;
    for(i=0;i<n;i++)
      xg[i]=0;
    flag=1;
    itr=0;
    while(flag == 1)
    {
      flag=0;
      itr=itr+1;
      for(i=0;i<n;i++)
      {
        s=0;
        for(j=0;j<n;j++)
          if(i!=j)
            s=s+a[i][j]*xg[j];
        x[i]=(b[i]-s)/a[i][i];
      }
      for(i=0;i<n;i++)
      {
        eps[i]=x[i]-xg[i];
        if(eps[i]<0)
          eps[i]=-eps[i];
      }
      for(i=0;i<n;i++)
        if(eps[i]>tot)
        {
          flag=1;
          break;
        }
      for(i=0;i<n;i++)
        xg[i]=x[i];
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
     jacobi obj = new jacobi();
     obj.jac(a,b,x,n);
     System.out.println("Solutions are -->\n");
     for(i=0;i<n;i++)
       System.out.println("x["+(i+1)+"] = "+Math.ceil(x[i]));
   }
} 