package A_LAST_MINUTE_SUGGESTION;
import java.io.*;
import java.lang.*;
class pattern_q9
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,i,j,s=0,c=0;
        System.out.println("Enter the number of lines :");
        n = Integer.parseInt(cd.readLine());
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
        } 
}