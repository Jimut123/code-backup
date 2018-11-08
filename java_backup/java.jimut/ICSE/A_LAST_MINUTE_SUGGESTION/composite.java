package A_LAST_MINUTE_SUGGESTION;
import java.io.*;
class composite
{
    public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader(ab);
         int n,i,j,s=0;
         System.out.println("Enter the upper limit of displaying composite numbers :");
         n = Integer.parseInt(cd.readLine());
         for(i=3;i<=n;i++)
         {
             for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    s=s+j;
                }
            }
            if(s==i)
            {
                System.out.print(i+" ");
            }
            s=0;
         }
        }
    }