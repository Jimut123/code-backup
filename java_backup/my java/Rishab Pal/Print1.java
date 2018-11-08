class Print1
{
    public static void main (int n)
    {
        int i,s,j,k;
        s =0;
        j =1;
        k =1;
        for (i =1 ;i <=n ;i ++)
        {
            s =s +(j *k);
            j =j +2;
            k =k *-1;
        }
        System.out.println (s);
    }
}