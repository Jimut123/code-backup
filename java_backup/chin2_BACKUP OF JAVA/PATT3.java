
/**
 * Write a description of class PATT3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PATT3
{
    public static void main(String args[]) 
    {
        int p = 0;
        for(int i = 1 ; i <= m ; i = i+2)
        {
            for(int j = 4-p ; j > 0 ; j--)
            {
                System.out.print(" ");
            }
            for(int j = i-p ; j <= i ; j++)
            {
                System.out.print(j);
            }
            for(int j = i-1 ; j >= i-p && j!=0 ; j--)
            {
                System.out.print(j);
            }
            p++;System.out.println();
        }
    }
}
