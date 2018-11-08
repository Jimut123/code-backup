class palinodrom
{
    public static void main(int n)
    {
        int ni,s,k;
        ni=n;
        s=0;
        while(ni>0)
        {k=ni%10;
            s=(s*10)+k;
            ni=ni/10;
        }
        if(n==s)
        System.out.println("Palindrom..."+n);
        else
        System.out.println("Non Palindrom...."+n);

    }}