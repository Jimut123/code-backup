import java.util.*;
public class rss
{
 public void main()
 {
     Scanner sc=new Scanner(System.in);
     int n;
     n=sc.nextInt();
     int a[]=new int[n];
     int i,max,min;
     for(i=0;i<n;i++)
     {
         System.out.println("give value");
         a[i]=sc.nextInt();
        }
        max=min=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
            else
            if(a[i]<min)
            min=a[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
