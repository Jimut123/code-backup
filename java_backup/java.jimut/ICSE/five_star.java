import java.io.*;
class five_star
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the number of terms:");
        int n=Integer.parseInt(cd.readLine());
      int i,j;
      
      for(i=1;i<=n;i++)
     {
         for(j=1;j<=i;j++)
     {
      System.out.print("*");
     
    }
    System.out.println();
 }
}
}