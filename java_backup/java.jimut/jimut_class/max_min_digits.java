import java.io.*;
class max_min_digits
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         long n;
         long m,max=0,s,k,j,min=9;
         System.out.println("Enter a long number::");
         n = Long.parseLong(cd.readLine());
         while(n!=0)
         {
             k=n%10;
             
         if(k>max)
         {
            max =k;
         }
          if(k<min)
         {
            min =k;
         }
         n=n/10;
       }
            System.out.println(" The largest number is="+max);
            System.out.println(" The smallest number is="+min);
 }
}   
            
            
            
            
            
            