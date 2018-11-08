import java.io.*;
class series_1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the number of terms:");
        int n=Integer.parseInt(cd.readLine());
      int i,j,s=0;
      
      for(i=1;i<=n;i++)
      {
       System.out.print(i+"+");
       s=s+i;
      }
    
       System.out.println();
 
    System.out.println("sum="+s);
 
}
}