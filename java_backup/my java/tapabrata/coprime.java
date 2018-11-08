//co-prime combinations in a mayrix
import java.io.*;
class CoPrime
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int a[][];
  int n;
  public void get()throws IOException
  {
      int i,j;
      System.out.println("enter no. of rows or columns");
       n=Integer.parseInt(br.readLine());
      a=new int[n][n];
      for(i=0;i<n;i++)
      {
          for(j=0;j<n;j++)
          {
              System.out.println("enter a no.");
               a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        show();
    }
    public void show()
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
             System.out.print(a[i][j]+" ");
            System.out.println("");
        }
        check();
    }
    public void check()
    {
        int num,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                num=a[i][j];
                boolean b=checkPrime(num);
                if (b==true)
                 checkCoPrime(num,i,j);
                }
            }
        }
        public boolean checkPrime(int n)
        {
            int i,c=0;
            for(i=2;i<n;i++)
            {
                if (n%i==0)
                 c++;
                }
                if (c>0)
                 return false;
                return true;
            }
            public void checkCoPrime(int num,int r,int c)
            {
                int i,j,sum,dif;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        if (i==r && j==c)
                         continue;
                        boolean b=checkPrime(a[i][j]);
                        if (b==true)
                        {
                            sum=a[i][j]+num;
                            dif=Math.max(a[i][j],num)-Math.min(a[i][j],num);
                            boolean b1=checkPrime(sum);
                            boolean b2=checkPrime(dif);
                            if (b1==true || b2==true)
                             System.out.println(a[i][j]+" "+num);
                            }
                        }
                    }
                }
            }
                    
      