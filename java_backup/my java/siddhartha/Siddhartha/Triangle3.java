

public class Triangle3
{
 public static void main(int n)
 {int i=0,j=0,d=n-1;
    { for(i=n-1;i>=0;i--)
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


