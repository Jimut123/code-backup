import java.io.*;
class fibonacci
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader (ab);
         int a,b,c=0,n,i;
         System.out.println("Enter the number which you want to make the fibonacci series to continue :");
         n = Integer.parseInt(cd.readLine());
         a=0;
         b=1;
         System.out.print(a+","+b);
         for(i=1;i<=n;i++)
         {
            c=a+b; 
            a=b;
            b=c;
            System.out.print(","+c);
            }
        }
    }

         
         
         
         
         