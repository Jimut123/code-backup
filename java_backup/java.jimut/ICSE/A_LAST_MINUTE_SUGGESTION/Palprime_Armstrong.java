package A_LAST_MINUTE_SUGGESTION;
import java.io.*;
class Palprime_Armstrong
{
    public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader(ab);
         int ch,n,a=0,b=1,c=0,i;
         System.out.println("Enter 1 for checking Palprime number and 2 for checking Armstrong number :");
         ch = Integer.parseInt(cd.readLine());
         System.out.println("Enter a number :");
         n = Integer.parseInt(cd.readLine());
         switch(ch)
         {
             case 1:
             {
                
                 
                 break;
             }
            }
             case 2:
             {
                 while(c<=n)
                 {
                     c++;
                     a=(int)(Math.pow(2,c)-1);
                     if(a==n)
                     {
                          System.out.println("It is a Mersenne number :");
                          break;
                     }
                     else if(a>n)
                     {
                          System.out.println("It is not a Mersenne number :");
                          break;
                        }
                 }
                 break;
             }
             default:System.out.println("Wrong choice .");
        }
    }
}