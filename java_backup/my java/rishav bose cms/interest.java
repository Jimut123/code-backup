import java.io.*;
public class interest
{
public static void main(String args[])throws IOException
     {
      int P,R,T,SI;
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read);
      System.out.println("Enter the interest");
      P=Integer.parseInt(in.readLine());
      R=Integer.parseInt(in.readLine());
      T=Integer.parseInt(in.readLine());
      SI=(P*R*T)/100;
      System.out.println("The interest is"+SI);
     }
}     