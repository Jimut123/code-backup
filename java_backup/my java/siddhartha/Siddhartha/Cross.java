

public class Cross
{
  public static void main(int n)
  {int i,j,d;
      d=(n-1);
      for (i=0;i<n;i++)
      {for(j=i;j<n;j++)
          {if (i==j||j==d)
             { System.out.print("*");
            }
            else
            {System.out.print(" ");
            }
            d--;
        
            System.out.println();
        }
    }
}}