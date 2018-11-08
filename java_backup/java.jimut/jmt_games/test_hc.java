
import java.io.*;
class test_hc
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
       int d;
       for(int i=1;i<=50;i++)
       {
           d = (int)(Math.random()*6);
           for(int j=1;j<d;j++)
           {
           System.out.print("-");
        }
         System.out.print("\n");
}
}
}