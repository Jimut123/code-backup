                                                 //wonderous square
import java.io.*;
class WonderousSquare
{
  int n;
  int a[][];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void get()throws IOException
  {
      int i,j;
      do
      {
          System.out.println("enter no. of rows or columns");
           n=Integer.parseInt(br.readLine());
        }while(n<2 || n>10);
        a=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("enter a no.");
                 a[i][j]=Integer.parseInt(br.readLine());
              }
          }
          boolean b=check();
          if (b==true)
           System.out.println("It is a Wonderous Square");
          else
           System.out.println("It is not a Wonderous Square");
          prime();
        }
        public boolean check()
        {
            int i,j,k,c=0,s=0;
            for(i=1;i<=(n*n);i++)
            {
                for(j=0;j<n;j++)
                {
                    for(k=0;k<n;k++)
                    {
                        if (a[j][k]==i)
                         c++;
                        }
                    }
                    if (c!=1)
                     return false;
                    c=0;
                }
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                     s=s+a[i][j];
                    if (s!=(0.5*n*(n*n+1)))
                     return false;
                    s=0;
                }
                s=0;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                     s=s+a[j][i];
                    if (s!=(0.5*n*(n*n+1)))
                     return false;
                    s=0;
                }
                return true;
            }
            public void prime()
            {
                int i,j;
                System.out.println("Prime   Row index   Column index");
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        boolean b=isPrime(a[i][j]);
                        if (b==true)
                         System.out.println(a[i][j]+"           "+(i)+"           "+(j));
                        }
                    }
                }
                public boolean isPrime(int num)
                {
                    int i;
                    if (num==1)
                     return false;
                    for(i=2;i<num;i++)
                    {
                        if (num%i==0)
                         return false;
                        }
                        return true;
                    }
                }