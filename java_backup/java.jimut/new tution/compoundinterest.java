import java.io.*;
class compoundinterest
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader (ab);
         float r,n,pv;
         double fv;
         System.out.println("Enter the present value:");
         pv =Integer.parseInt(cd.readLine());
         System.out.println("Enter the time:");
         n =Integer.parseInt(cd.readLine());
         System.out.println("Enter the rate:");
         r =Integer.parseInt(cd.readLine());
         fv = pv*Math.pow((((100+r)/100)),n);
         System.out.println("the future value is:"+fv);
        
            }
        }
    

         
         
         
         
         
         
         