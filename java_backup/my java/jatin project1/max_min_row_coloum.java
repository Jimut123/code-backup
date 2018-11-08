import java.io.*;
class max_min_row_coloum
    {
        public static void main(String args[])throws IOException
            {
                int n,m,i,j;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                m=Integer.parseInt(br.readLine());
                n=Integer.parseInt(br.readLine());
                int a[][]=new int[m][n];
                int max,min;
                for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                    {
                        System.out.println("give value");
                        a[i][j]=Integer.parseInt(br.readLine());
                    }
                }   
                 for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                    {
                        System.out.print(a[i][j]+",");
                        
                    }
                    System.out.println("");
                }   
                
                for(i=0;i<m;i++)
                {
                    min=a[i][0];
                for(j=0;j<n;j++)
                if(a[i][j]<min)
                min=a[i][j];
                 System.out.println("Minimum of the row:"+min);
                }
                 for(i=0;i<n;i++)
                 {
                     max=0;
                for(j=0;j<m;j++)
                if(a[j][i]>max)
                max=a[j][i];
               
                System.out.println("Maximum of the column:"+max);
            }
                    }
                }