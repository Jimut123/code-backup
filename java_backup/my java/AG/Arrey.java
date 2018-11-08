import java.util.*;
class Arrey
{
    public static void main()
    {
        int i,n,s,avg;
        s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nos:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s=s+a[i];
        }
        avg=s/n;
        System.out.println("Sum="+s);
        System.out.println("Average="+avg);
    }
}
        
