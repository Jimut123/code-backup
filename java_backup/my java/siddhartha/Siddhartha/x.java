package Siddhartha;


public class x
{
   public static void main(int n)
   {int j,i,d;
       d=n-1;
       for(i=0;i<n;i++)
       {for(j=0;j<n;j++)
           {if((i==j)||(j==d))
               {System.out.print("*");
                }
                else
                {System.out.print(" ");
                }
                d--;
                System.out.println();
            }
        }
    }}