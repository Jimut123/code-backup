import java.util.*;
public class sb
{
    public static void main (String args[])
    {
        int k, s, j, f, n;
        Scanner SC = new Scanner (System.in);
        System.out.println ("Enter a no.");
         n = SC.nextInt();
         f = 0;
        while (n > 0)
        {
         k = n % 10;
         
         s = 1;
        for ( j=1;j<=k;j++)
         s = s*j;
         f = f+s;
        n = n/10;
    }
    System.out.println (f);
}
}