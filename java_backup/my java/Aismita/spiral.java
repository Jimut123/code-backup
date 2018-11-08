import java.io.*;
class spiral
{
   public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the number of rows and columns");
        n=Integer.parseInt(br.readLine());
        int s[][]=new int[n][n];
        int p=1; int a=0; int d=n;
        for(int i=0;i<d;i++)
        {
            for(int j=a;j<d;j++)
            {
                if(i==a)
                s[i][j]=p++;
                else
                if(a==(d-1))
                {
                    for(int k=d;k>=a;k--)
                    {
                        s[i][k]=p++;
                        if(k==a)
                        {
                            for(int m=d-1;m>a;m--)
                            s[m][k]=p++;
                            d--;a++;
                        }
                    }
                }
                else if((i!=d-1)&&(i!=a))
                {
                    for(int f=d-1;f>a;f--)
                     s[f][j]=p++;
            }
        
    }
     for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}