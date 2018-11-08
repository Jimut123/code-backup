public class happyno
{
    public static void main(int n)
    {
        while(n>=10)
        {
          int s=0;
          int n1=n;
            while(n1>0)
            {
              int k=n1%10;
               s=s+(k*k);
                n1=n1/10;
            }
            n=s;
        }
        if(n==1)
        System.out.println("Happy no="+n);
        else
        System.out.println("not a happy no="+n);
    }
}

