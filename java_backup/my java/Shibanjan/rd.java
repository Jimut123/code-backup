
import java.io.*;
class rd
{
      public static void main(String arg[])throws IOException
      {
          int i,j,k,f,n,p,max,min;f=0;p=0;int m[][];
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter the value of n");

          n=Integer.parseInt(br.readLine());
          m=new int[n][n];
          System.out.println("enter the number of rows and columns");
          for(i=0;i<n;i++)
          {
              for(j=0;j<n;j++)
              {
                  System.out.println("m[i][j]");
                }
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.println("m[i][j]");
                    m[i][j]=Integer.parseInt(br.readLine());
                }
            }
            for(i=0;i<n;i++)
            {
                min=m[i][0];
                
                for(j=0;j<n;j++)
                {
                    if(m[i][j]<min)
                    {
                        p=j;
                    }
                }
            for(k=0;k<n;k++)
            {
                max=m[0][p];
                if(m[k][p]>max)
                {
                    max=m[k][p];
                }
            
            
            if(max==min)
            {
                f++;
            }
        }
    }
            if(f==1)
            {
                System.out.println("saddle point");
            }
            else
            {
                System.out.println("not saddle point");
            }
        
    }
}

                
            
            
                