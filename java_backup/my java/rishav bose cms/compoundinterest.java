import java.io.*;
public class compoundinterest
{
public static void main(String args[])throws IOException
       {
        int T;
        double P,R,CI;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the compoundinterest");
        P=Double.parseDouble(in.readLine());
        R=Double.parseDouble(in.readLine());
        T=Integer.parseInt(in.readLine());
        CI=P*Math.pow((1+R)/100,T);
        System.out.println("The compound interest is"+CI);
       }
}       
        
      