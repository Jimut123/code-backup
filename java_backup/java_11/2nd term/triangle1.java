import java.io.*;
class triangle1
{
    public static void main(String args[])throws IOException
    {
      InputStreamReader ab = new InputStreamReader(System.in);
      BufferedReader cd = new BufferedReader(ab);
      int i,j;
      int a[][]=new int[3][3];
      System.out.println("Enter the elements of the array:");
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              a[i][j]=Integer.parseInt(cd.readLine());
            }
        }
      for(i=0;i<3;i++)
      {
          for(j=0;j<=i;j++)
          {
              System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}