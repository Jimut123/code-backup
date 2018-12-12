import java.io.*;
class q14
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
     obj.mat_inv(a,b,x,n);
     System.out.println("Solutions are -->\n");
     for(i=0;i<n;i++)
       System.out.println("x["+(i+1)+"] = "+x[i]);
   }
}