public class PATT6
{
    public static void main(String args[])
    {
        int x;
        for(int a = 100 ; a >= 94; a--)
        {
            if(a>=97)
            x = a;
            else
            x = 194-(a%97);
            for(int j = 97 ; j<=x ; j++)
            {
                System.out.print((char)j);
            }
            for(int j = x ; j > 96 ; j--)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
/**abcddcba
   abccba
   abba
   aa
   abba
   abccba
   abcddcba**/