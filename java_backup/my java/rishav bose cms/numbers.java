import java.io.*;
public class numbers
{
public static void main(String args[])throws IOException
      {
       int A,B;
       InputStreamReader read = new InputStreamReader(System.in);
       BufferedReader in = new BufferedReader(read);
       System.out.println("Enter the numbers");
       A=Integer.parseInt(in.readLine());
       B=Integer.parseInt(in.readLine());
       A=A+B;
       B=A-B;
       A=A-B;
       System.out.println("The swaping values of A"+A);
       System.out.println("The swaping values of B"+B);
      }
}      
    
    