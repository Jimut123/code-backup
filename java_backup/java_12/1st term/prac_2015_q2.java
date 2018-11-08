import java.io.*;
class prac_2015_q2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int M,i,j,cs=0;
        System.out.println("Enter the value of M : ");
        M=Integer.parseInt(cd.readLine());
        if((M>2)&&(M<10))
        {
        int a[][]=new int[M][M];
        System.out.println("Enter the numbers : ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                a[i][j]=Integer.parseInt(cd.readLine());
            }
        }
        System.out.println("ORIGINAL MATRIX : ");
         for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                 System.out.print(a[i][j]+"\t");
            }
             System.out.println();
        }
         System.out.println("MATRIX AFTER ROTATION : ");
           for(i=0;i<M;i++)
        {
            for(j=M-1;j>=0;j--)
            {
                 System.out.print(a[j][i]+"\t");
            }
             System.out.println();
        }
        cs=a[0][0]+a[0][M-1]+a[M-1][M-1]+a[M-1][0];
        System.out.println("Sum of the corner elements : "+cs);
      }
      else
      {
          System.out.println("SIZE OUT OF RANGE. ");
        }
    }
}