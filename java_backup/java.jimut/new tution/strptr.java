import java.io.*;
import java.lang.*;
class strptr
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader (ab);
         String s;
         int i,l,j;
         char ch;
         System.out.println("ENTER YOUR NAME");
         s = (cd.readLine());
         l = s.length();
         for (i=0;i<=l-1;i++)
         {
          for (j=0;j<=i-1;j++)
         {
           System.out.print(" ");
          }
          System.out.print(s.charAt(j));
        System.out.println();
        }
        }
      }
        