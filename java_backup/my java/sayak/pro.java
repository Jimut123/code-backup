

public class pro
{
    public static void main(int n)
    {
        for(int i=1;i<n;i++)
        {
           int s=0;
           for(int j=i;j<n;j++)
           {
               s=s+j;
               if(s==n)
               {
                   for(int k=i;k<=j;k++)
                   System.out.print(k+", ");
                   System.out.println("");
                   break;
                }
                else if(s>n)
                break;
            }
        }
    }
}