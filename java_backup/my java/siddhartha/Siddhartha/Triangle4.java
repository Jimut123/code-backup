

public class Triangle4
{
  public static void main(int n)
 {int i=0,j=0,d=n;
    { for(i=0;i<n;i++)
      {  for(j=0;j<n;j++)
             {if((j==(0))||(i==j)||(j==d)||(i==(n-1)))
             {System.out.print("*");
                }
                else
                {System.out.print(" ");
                }
             d--;
             }
               System.out.println();
            }
        }
    }}


