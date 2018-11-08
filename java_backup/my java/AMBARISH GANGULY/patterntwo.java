class patterntwo
{
  public static void main (int n)
   { int sp=15;int k=65;int j;int k1;
       for(int i=1;i<=n;i++)
       {
           for(k1=1;k1<=sp;k1++)
           System.out.print("   ");
           for(j=1;j<=i;j++)
            { System.out.print((char)k+" "+" ");
                k++;
            }
            k=k-2;
            for(j=i-1;j>=1;j--)
             { 
                 System.out.print((char)k+" "+" ");
                 k--;
                }
                k=65;
                sp=sp-1;
               
                System.out.println("");
            }
        }
    }

       