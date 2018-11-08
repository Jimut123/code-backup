import java.io.*;
class series_2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the number of terms:");
        int n=Integer.parseInt(cd.readLine());
      int i,j,p;
      float s=0;
      for(i=1;i<=n;i++)
      {
       p=4*i;  
       System.out.print(1+"/"+p+" "+"+"+" ");
       s=s+(float)(1/p);
      }
    
       System.out.println();
 
    System.out.println("sum="+s);
 
}
}