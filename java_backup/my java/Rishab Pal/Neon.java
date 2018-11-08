class Neon
{
    public static void main (int n)
    {
        int digcount =0;
        int n1;
        n1 =n;
        int k;
        while(n1 >0)
        {
            digcount ++;
            n1 =n1 /10;
        }
        int m =n*n;
        int s =0;
        int c=0;
        n1=m;
        while (n1 >0)
        {
            k =n1 %10;
            s =(s*10) +k;
            c++;
            n1 =n1 /10;
            if (c == digcount)
            break;
        }
        int s1 =0;
        while (s >0)
        {
            k =s %10;
            s1 =(s1 *10) +k;
            s =s /10;
        }
        if ((s1 +n1) ==n)
        System.out.println ("Neon Number");
        else
        System.out.println ("Not Neon Number");
    }
}
        