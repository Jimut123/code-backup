
import java.io.*;
class hcflcm
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader (ab);
         int hcf=1,lcm,n,m,p,i;
         System.out.println("Enter two nos.:");
         m =Integer.parseInt(cd.readLine());
         n =Integer.parseInt(cd.readLine());
         p=m*n;
         for(i=1;i<=p;i++)
         {
             if((m%i==0)&&(n%i==0))
             {
                 hcf =i;
                }
            }
            lcm=((m*n)/hcf);
         System.out.println("the lcm is:"+lcm);
         System.out.println("the hcf is:"+hcf);
            }
        }
    

         
         
         
         
         
         
         