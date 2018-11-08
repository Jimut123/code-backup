//Input n elements into an array and find n nos. in ascending order by selection sort.

import java.util.*;
class Selection
{
    public static void main()
    {
        int i,n,pos,k=0,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter a no.in Array:");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            pos=i;
            for(j=i+1;j<n;j++)
            if(a[pos]>a[j])
            pos=j;
            k=a[i];
            a[i]=a[pos];
            a[pos]=k;
        }
        System.out.println("Array after sort:");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}