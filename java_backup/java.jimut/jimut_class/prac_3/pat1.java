package prac_3;

import java.io.*;
class pat1
{
    public static void main(String args[])
    {
        int i,j,k,l,m;
        for(i=1;i<=4;i++)
        {
            for(k=(4-i);k>=0;k--)
            {
                System.out.print(" ");
            
            
        }   
        for(l=i;i<=1;l++)
            {
                System.out.print(l);
            }
            if(i>1)
            {
            
            for(j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            }
            System.out.println();
        }
    }
}
             