class sr
{
 public static void main(int n)
 {
     int d,i,j,k,l;
     d=n-1;
     for(i=0;i<=n;i++)
     {
         for(j=0;j<=d;j++)
         {
            if((i==j)||(j==d))
             System.out.print("*");
            else
            System.out.print(" ");
            }
           d--;
           j++;
            System.out.println();
        }
        }
    }
