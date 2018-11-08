import java.io.*;
class patternns
{
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
        for(j=1;j<=i;j++)
        {
            System.out.print(j);
        }
            System.out.println();
        }
        
         for(i=1;i<=5;i++)
        {
        for(k=1;k<=(5-i);k++)
        {
             System.out.print("");
        }
        for(j=i;j>=1;j--)
        {
            System.out.print(j);
        }
            System.out.println();
        }
        }
    }
