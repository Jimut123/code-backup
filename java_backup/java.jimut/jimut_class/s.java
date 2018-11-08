import java.io.*;
class s
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         System.out.println("\f");
         int u,t,a;
         double s;
         System.out.println("Enter the initial speed:");
         u = Integer.parseInt(cd.readLine());
         System.out.println("Enter the time taken:");
         t = Integer.parseInt(cd.readLine());
         System.out.println("Enter the acceleration:");
         a = Integer.parseInt(cd.readLine());
         s = (double)(u*t)+(double)((1.0/2.0)*a*t*t);
         System.out.println("Distance travelled:"+s);
    }
}
              
 