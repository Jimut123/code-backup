import java.io.*;
class pattern2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the number of terms:");
        int n=Integer.parseInt(cd.readLine());
      int i,j;
      
      for(i=n;i>=1;i--)
     {
         for(j=1;j<=i;j++)
     {
      System.out.print(i);
     
    }
    System.out.println();
 }
}
}