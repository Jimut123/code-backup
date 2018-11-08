public class palindrom
{
    public static void main(int n)
    {
        int s=0;
        int i=n;
        while(i>0)
        {
            int k=i%10;
            s=(s*10)+k;
            i=i/10;
        }
        if(s==n)
        System.out.println("palindrom");
        else
        System.out.println("non palindrom");
    }
}
