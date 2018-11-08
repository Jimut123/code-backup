public class nelson
{
    public static void main(int n)
    {
        int s=n%10;
        int i=n;
        int f=0;
        while(i>0)
        {
            int k=i%10;
            if(k!=s)
            {
                f=1;
                break;
            }
            i=i/10;
        }
        if(f==0)
        System.out.println("nelson");
        else
        System.out.println("non nelson");
    }
}
