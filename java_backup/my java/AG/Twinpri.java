import java.util.*;
class Twinpri
{
    public static void main()
    {
        int i,n,j,i1,f,f1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nos.:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            f=0;
            for(j=2;j<a[i];j++)
            if(a[i]%j==0)
            {
                f=1;
                break;
            }
            if(f==0)
            {
                for(i1=i+1;i1<n;i1++)
                {
                    f1=0;
                    for(j=2;j<a[i1];j++)
                    if(a[i1]%j==0)
                    {
                        f1=1;
                        break;
                    }
                    if(f==0 && f1==0)
                    {
                        if(a[i]-a[i1]==2||a[i1]-a[i]==2)
                        System.out.println(a[i]+","+a[i1]);
                    }
                }
            }
        }
    }
}
    

