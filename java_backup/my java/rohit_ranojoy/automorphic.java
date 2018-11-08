
public class automorphic
{
    public static void main(int n)
    { 
        int m=n*n;
        int c=0;
        int n1=n;
        while(n1>0)
        {
            c++;
            n1=n1/10;
        }
        int p=(int)Math.pow(10,(c-1));
        if(m%p==n)
        System.out.println("automorphic no");
        else
        System.out.println("not a automorphic no");
    }
}