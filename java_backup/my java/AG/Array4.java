import java.util.*;
class Array4
{
    public static void main()
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        int b[]=new int[n];
        for(i=0;i<n;i++)
         b[i]=sc.nextInt();
          int c[]=new int[n];
        for(i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(i=0;i<n;i++)
        System.out.print(c[i]);
    }
}