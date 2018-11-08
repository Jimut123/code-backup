package project;


 class reverse
{
    public static void main(int n)
    {
        int r,k;
        r=0;
        while(n>0)
        {
            k=n%10;
            r=(r*10)+k;
            n=n/10;
        }
        System.out.println(r);
    }
}
