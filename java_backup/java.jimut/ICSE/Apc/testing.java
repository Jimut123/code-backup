package Apc;


import java.io.*;
class testing
{
    public static void main(String args[])
    {
          int p=30,i;
         for(i=10;i>=2;i=i-2)
         {
             p++;
             System.out.println(p);
            }
        int j;
        String s="INDIA";
        int l = s.length();
        System.out.println("\f");
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(i=0;i<=l-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        int m=2,n=15;
        {m++;--n;}
        System.out.println("M="+m+"N="+n);
         
       p=30;
       i=10;
       while(i>=2)
        {
            System.out.println(p);
            p++;
            i=i-2;
        }
    }
}