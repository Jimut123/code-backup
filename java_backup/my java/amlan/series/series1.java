package series;

import java.io.*;
class series1
{
    public static void main()throws IOException
    {
        int i,j,k,sp;
        k=65;
        sp=10;
        for(i=1;i<=5;i++)
        {
            if(i!=3)
            {
             for(j=1;j<=sp;j++)
             {
                 System.out.print(" ");
                }
                System.out.print((char)k);
                System.out.println("");
                k++;
            }
            else
            {
             for(j=1;j<=6;j++)
             {
                 System.out.print(" ");
                }
                for(j=65;j<=69;j++)
             {
                 System.out.print((char)j+" ");
                }  
                System.out.println("");
                k++;
            }
        }
    }
}
