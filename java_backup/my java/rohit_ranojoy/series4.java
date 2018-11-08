public class series4
{
    public static void main(int n,int x)
    {
        int i;int s=1;
        for(i=1;i<=n-1;i++)
        {
            s=s+(int)Math.pow(x,i);
        }
        System.out.print("Sum="+s);
    }
}