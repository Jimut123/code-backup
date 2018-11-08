import java.io.*;
public class temperature
{
public static void main(String args[])throws IOException
      {
       int F,c;
       InputStreamReader read = new InputStreamReader(System.in);
       BufferedReader in = new BufferedReader(read);
       System.out.println("Enter the temperature");
       F=Integer.parseInt(in.readLine());
       c=(5*F-100)/9;
       System.out.println("The temp.in celcius scale="+c);
      }
}      
