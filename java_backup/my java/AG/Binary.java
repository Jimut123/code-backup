import java.util.*;
class Binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k;
        int l,h,m,f=0,v;
        System.out.println("Enter nos.of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
          for(j=i+1;j<n;j++)                     
          {
              if(a[i]>a[j])
              {
                 k=a[i];
                 a[i]=a[j];
                 a[j]=k;
                }
            }
        }
        v=sc.nextInt();
        
        l=0;
       
        h=n-1;
        m=(l+h)/2;
        f=0;
        
        
        while(l<=h)
        {
            if(a[m]==v)
            {
                f=1;
                break;
            }
            else
            if(v>a[m])
            l=m+1;
            else
            if(v<a[m])
            h=m-1;
            m=(l+h)/2;
        }
        if(f==1)
        System.out.println("found");
        else
        System.out.println("Not Found");
    }
}