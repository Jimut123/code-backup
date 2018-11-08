import java.util.*;
public class binary
 {
     public void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[]=new int[10];
         int i,n,v,f,low,high,mid;
         for(i=0;i<10;i++)
         {
         System.out.println("give value");
         a[i]=sc.nextInt();
        
        }
         for(i=0;i<10;i++)
         {
            System.out.println(a[i]);
        }
        System.out.println("Give Searching Element");
        v=sc.nextInt();
        low=0;
        high=10-1;
        mid=(low+high)/2;
         f=0;
        while(low<=high)
        {
            if(v==a[mid])
            {
                f=1;
                break;
            }
            else
            if(v>a[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if(f==1)
        System.out.println("Element found....."+v);
        else
        System.out.println("Element not found....."+v);
        }
    }
    
                