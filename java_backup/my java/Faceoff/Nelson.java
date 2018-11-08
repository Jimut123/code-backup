class Nelson
{
    public static void main(int n, int temp)
    {
        n=temp;
        int p=temp%10;
        while(n>0)
        {
            int k=n%10;
            if(k==p)
            System.out.println("Nelson number");
            
            else
            System.out.println("Not a nelson number");
            n=n/10;
        }
    }
}
           