import java.io.*;
 import number.*;
class number1
{
   int k;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
   void input()throws IOException
   {
       System.out.println("Enter number:");
       k=Integer.parseInt(br.readLine());
    }
   public int show()
    {
        int x=k;
        dig_count n=new dig_count();
        System.out.println("Count of digit:"+n.digit_count(x));
        //System.out.println(x);
        return x;
    }
}
