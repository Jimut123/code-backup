import java.io.*;
class compoundinterest2
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader (ab);
         float a,r,n,i;
         double fvan=0,s;
         System.out.println("Enter the time:");
         n =Integer.parseInt(cd.readLine());
         System.out.println("Enter the rate:");
         r =Integer.parseInt(cd.readLine());
         System.out.println("Enter the amount:");
         a =Integer.parseInt(cd.readLine());
         s=Math.pow(((100+r)/100),n);
         for(i=1;i<=n;i++)
         {
          fvan =fvan+ a*(((s-1)*100)/r);
          }
         System.out.println("the future value:"+fvan);
        }
    }
         
         