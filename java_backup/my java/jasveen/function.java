class function
{
    public static void main(int n)
    {
        int i,j,s,k;
        k=1;
        s=0;
        j=1;
        for(i=1;i<=n;i++)
        {
            s=s+(j*k);
            j=j+2;
            k=k*-1;
        }
        System.out.println(s);
    }
}
