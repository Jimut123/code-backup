

public class Triangle2
{
 public static void main(int n)
 {int i=0,j=0,d=n-1;
    { for(i=0;i<n;i++)
      {  for(j=0;j<n;j++)
             {if((j==(n-1))||(i==j)||(j==d)||(i==(0)))
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


