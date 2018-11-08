import java.util.*;
class Swap
{
    public static void main()
    {
        int i,n,max,min,p,p1,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nos.:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        max=min=a[0];
        p=0;
        p1=0;
        for(i=0;i<n;i++)
        {
        if(a[i]>max)
        {
            p=i;
            max=a[i];
        }
        else
        if(a[i]<min)
        {
            p1=i;
            min=a[i];
        }
    }
        k=a[p];
        a[p]=a[p1];
        a[p1]=k;
        //System.out.println("After swaping the array:");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}