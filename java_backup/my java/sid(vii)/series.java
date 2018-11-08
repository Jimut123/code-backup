public class series
{
    public static void main(String ar[])
    {
        int n=Integer.parseInt(ar[0]);
        System.out.println("Series");
        int i=1,s=0;
        while (i<=n);
        {
            System.out.println(i);
            s+=i;
        }
        System.out.println("Sum of series="+s);
    }
}