/** 1 3 5 7 9
    3 5 7 9 1
    5 7 9 1 3
    7 9 1 3 5
    9 1 3 5 7
    1 3 5 7 9 */
public class patt
{
    public static void main(String args[])
    {
        int x = 0;
        for(int i = 1; i <= 6 ; i++)
        {
            System.out.print("");
            for(int j = x+1 ; j <= 9 ; j+=2)
            {
                System.out.print(j+" ");
            }
            for(int k = 1; k <(1+x); k+=2)
            {
                System.out.print(k+" ");
            }            
            x = x+2;
            System.out.println();
            System.out.println();
        }
    }
}


   
