import java.io.*;
public class output
{
public static void main(String args[])throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int k=5; 
      k=++k+k++ + --k+ ++k;
       System.out.println(k);
       
    }
}

