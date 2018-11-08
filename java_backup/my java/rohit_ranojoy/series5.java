import java.io.*;
public class series5
{
    public static void main(String args[])throws IOException
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
                
            }
        
            for(j=i-1;j>=1;j--)
            {
                System.out.print(j);
                
            }
            System.out.println("");
        }
    }
}

        