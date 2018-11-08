import java.io.*;
class saddle1
{
      public static void main(String arg[])throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter the number of rows and columns");
          int n=Integer.parseInt(br.readLine());
          int a[][]=new int[n][n];
          int min=10000,max=0,p=0;
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                  a[i][j]=Integer.parseInt(br.readLine());
                }
            }
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                 System.out.print(a[i][j]);
                }
                System.out.println();
            }
          for(int i=0;i<n;i++)
          {
              if(a[n-1][i]<min)
              {
                  min=a[n-1][i];
                 p=i;
              }
          }
          for(int i=0;i<n;i++)
          {
              if(a[i][p]>max)
              {
                  max=a[i][p];
              }
          }
          int x=n-1;
          if(min==max)
          {
              System.out.println("Saddle point Exists in"+x+","+p);
            }
          else
          {
              System.out.println("Saddle point doed not exist");
        }
    }
}
          