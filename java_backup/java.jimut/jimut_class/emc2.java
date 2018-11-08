import java.io.*;
class emc2
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         System.out.println("\f");
         
         int m,v;
         double e;
        
         System.out.println("Enter the value of mass:");
         m = Integer.parseInt(cd.readLine());
         System.out.println("Enter the value of velocity:");
         v = Integer.parseInt(cd.readLine());
         e = (double)(1.0/2.0)*m*v*v;
         System.out.println("Kinetic energy:"+e);
    }
}
              
 