import java.util.*;
class Arrey1
{
    public static void main()
    {
        int i,n,t,t1,t2,f,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nos:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        int b[]=new int[n];
        int c[]=new int[n];
        int d[]=new int[n];
        t=t1=t2=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                b[t++]=a[i];
                
            }
            else
            {
                f=0;
                for(j=2;j<a[i];j++)
                {
                    if(a[i]%j==0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==0)
                {
                    d[t2++]=a[i];
                }
                else
                c[t1++]=a[i];
            }
        }
        System.out.println("Even:");
        for(i=0;i<t;i++)
        System.out.println(b[i]);
        System.out.println("Odd:");
        for(i=0;i<t1;i++)
        System.out.println(c[i]);
        System.out.println("Prime:");
        for(i=0;i<t2;i++)
        System.out.println(d[i]);
    }
}
