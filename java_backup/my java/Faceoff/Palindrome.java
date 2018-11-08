class Palindrome
{
    public static void main(int n)
    {
        int i,s=0,k;
        for (i=n;i>0;i=i/10)
        {
            k=i%10;
            s=(s*10)+k;
        }
            System.out.println(s);
        
    }
}
