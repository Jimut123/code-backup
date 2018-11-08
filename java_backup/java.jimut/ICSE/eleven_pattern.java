import java.io.*;
class eleven_pattern
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the number of terms:");
        int n=Integer.parseInt(cd.readLine());
      int i,j;
      
      for(i=0;i<n;i++)
     {
      System.out.print((int)Math.pow(11,i));
      System.out.println();
 }
}
}