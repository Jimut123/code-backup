//90 degree rotation of matrix
import java.io.*;
class Matrix
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void accept()throws IOException
  {
      int n,i,j;
      System.out.println("enter dimensions of matrix");
       n=Integer.parseInt(br.readLine());
      int arr[][]=new int[n][n];
      for(i=0;i<n;i++)
      {
          for(j=0;j<n;j++)
          {
              System.out.println("enter a no.");
               arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }
}