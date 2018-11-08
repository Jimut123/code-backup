class term
{
    public static void main(int n)
    {
        int i,s;
        s=0;
        i=1;
        while(i<=n)
        {
            System.out.println((int)Math.pow(i,i));
            i+=2;
            s=s+i;
        }
    }
}