import java.util.*;
class Array3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,max,min;
        System.out.println("Even term");
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        max=min=a[0];
        for(i=0;i<n;i++)
        if(a[i]>max)
        max=a[i];
        else
        if(a[i]<min)
        min=a[i];
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
    }
}