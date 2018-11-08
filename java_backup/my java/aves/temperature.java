
import java.io.*;
public class temperature
{
public static void main (String args[])
          throws IOException
{
 int F,c;
 
 InputStreamReader isr = new InputStreamReader(System.in);
 
 BufferedReader br = new BufferedReader (isr);
 
 F= Integer.parseInt(br.readLine());
 c= (5*F)/9+32;
 
 System.out.println("The temperature in Centrigrade:"+c);
}
}
