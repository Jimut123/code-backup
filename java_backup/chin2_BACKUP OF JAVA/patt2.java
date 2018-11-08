public class patt2
{
    public static void main(String args[])
    {
        for(int i = 1; i<=4 ; i++)
        {
            for(int j = 1; j<=4-i ; j++)
            {
                 System.out.print(" ");
            }
            for(int j1 = 1; j1<=i ; j1++)
            {
                 System.out.print(j1+"");
            }
            for(int i1 = i-1; i1>=1 ; i1--)
            {
                 System.out.print(i1+"");
            }
            System.out.println();
        }
        for(int i = 3; i>=1 ; i--)
        {
            for(int j = 1; j<=4-i ; j++)
            {
                 System.out.print(" ");
            }
            for(int i1 = 1; i1<=i ; i1++)
            {
                 System.out.print(i1+"");
            }
            for(int j1 = i-1; j1>=1 ; j1--)
            {
                System.out.print(j1+"");
            }
            System.out.println();
        }
        for(int y = 0; y <= 10 ; y++)
        {
            System.out.println();
        }
    }
}
