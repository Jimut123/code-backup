
public class fork
{
    public static void main(int n)
    {
        int a=0,b=0;double s=0.0;
        for(int i=1;i<=n;i++)
        {
            a=(a*10)+1;
            
            b=(b*10)+i;
            s=s+(a/b);
        }
        System.out.println("Series="+s);
    }
}
        