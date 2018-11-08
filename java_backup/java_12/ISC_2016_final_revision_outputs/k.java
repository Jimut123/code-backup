class k
{
    void Recur(int n)
    {
        if(n>1)
        {
            System.out.println(n+" ");
            if(n%2!=0)
            {
                n=3*n+1;
                System.out.println(n+" ");
            }
            Recur(n/2);
        }
    }
}