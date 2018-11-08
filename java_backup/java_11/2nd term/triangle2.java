import java.io.*;
class triangle2
{
    public static void main(String args[])throws IOException
    {
      InputStreamReader ab = new InputStreamReader(System.in);
      BufferedReader cd = new BufferedReader(ab);
      int i,j,k=2,l;
      int a[][]=new int[3][3];
      System.out.println("Enter the elements of the array:");
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              a[i][j]=Integer.parseInt(cd.readLine());
            }
        }
      for(i=0;i<2;i++)
      {
          k--;
          for(l=2;l>=1;l--)
          {
              System.out.print(" ");
            }
          for(j=2;j>=k;j--)
          {
              System.out.print(a[i][j]);
             
            }
             
            System.out.println();
        }
    }
}