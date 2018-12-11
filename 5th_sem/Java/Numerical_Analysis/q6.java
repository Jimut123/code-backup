/*Matrix factorization and matrix inversion*/
import java.io.*;
class q6
{
  public void display1(float aug[][],int n)
  {
    int i,j,n1;
    n1=2*n;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n1;j++)
         System.out.print(aug[i][j]+"\t");
      System.out.println();
    }
   System.out.println("-------------\n");
  }
  public void mat_inv(float a[][],float b[],float x[],int n)
  {
    int i,j,k,n1;
    float am,s;
    float aug[][] = new float[20][20];
    float inverse[][] = new float[20][20];
    n1=2*n;
    for(i=0;i<n;i++)
      for(j=0;j<n1;j++)
        aug[i][j]=0;
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        aug[i][j]=a[i][j];
    for(i=0;i<n;i++)
      aug[i][i+n]=1;
    System.out.println("Elements in Initial augmented matrix -->\n");
    display1(aug,n);
    for(i=0;i<n;i++)
    {
      am=aug[i][i];
      for(j=0;j<n1;j++)
        aug[i][j]=aug[i][j]/am;
      for(j=0;j<n;j++)
        if(i!=j)
        {
           am=aug[j][i];
           for(k=0;k<n1;k++)
             aug[j][k]=aug[j][k]-aug[i][k]*am;
        }
        System.out.println("Elements in augmented matrix -->\n");
        display1(aug,n);
    }
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        inverse[i][j]=aug[i][j+n];
    System.out.println("Elements in inverse matrix -->\n");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
        System.out.print(inverse[i][j]+"\t");
      System.out.println();
    }
    for(i=0;i<n;i++)
    {
      s=0;
      for(j=0;j<n;j++)
        s=s+inverse[i][j]*b[j];
      x[i]=s;
    }
  }
  public void display(float a[][],int n)
  {
    int i,j;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
         System.out.print(a[i][j]+"\t");
      System.out.println();
    }
  }
  public void mat_fact(float a[][],float b[],float x[],int n)
  {
    float l[][] = new float[10][10];
    float u[][] = new float[10][10];
    float s;
    int i,j,k;
    float y[] = new float[10];
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
      {
        l[i][j]=0;
        u[i][j]=0;
      }
    for(i=0;i<n;i++)
    {
      l[i][i]=1;
      for(j=0;j<n;j++)
        if(i>j)
        {
          s=0;
          for(k=0;k<j;k++)
            s=s+l[i][k]*u[k][j];
          l[i][j]=(a[i][j]-s)/u[j][j];
        }
        else
        if(i<=j)
        {
          s=0;
          for(k=0;k<i;k++)
            s=s+l[i][k]*u[k][j];
          u[i][j]=a[i][j]-s;
        }
     }
     System.out.println("Elements in l[][] -->\n");
     display(l,n);
     System.out.println("Elements in u[][] -->\n");
     display(u,n);
     y[0]=b[0];
    for(i=1;i<n;i++)
    {
      s=0;
      for(j=0;j<i;j++)
        s=s+l[i][j]*y[j];
      y[i]=b[i]-s;
    }
    x[n-1]=y[n-1]/u[n-1][n-1];
    for(i=(n-2);i>=0;i--)
    {
      s=0;
      for(j=(i+1);j<n;j++)
        s=s+u[i][j]*x[j];
      x[i]=(y[i]-s)/u[i][i];
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
     q6 obj = new q6();
     obj.mat_fact(a,b,x,n);
     System.out.println("Solutions are -->\n");
     for(i=0;i<n;i++)
       System.out.println("x["+(i+1)+"] = "+x[i]);
     obj.mat_inv(a,b,x,n);
     System.out.println("Solutions are -->\n");
     for(i=0;i<n;i++)
       System.out.println("x["+(i+1)+"] = "+x[i]);
   }
}