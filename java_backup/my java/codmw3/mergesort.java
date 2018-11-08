import java.util.*;
public class mergesort
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter limit");
        a=sc.nextInt();
        int b,m,n;
        int ar[]=new int[a];
        int ab[]=new int[a];
        int ac[]=new int[a+a];
        for(b=0;b<a;b++)
        {
            System.out.println("Enter data for 1st array");
            ar[b]=sc.nextInt();
            System.out.println("Enter Data for 2nd Array");
            ab[b]=sc.nextInt();
        }
        m=0;
        n=0;
        for(b=0;b<(a+a);b++)
        {
            if(ar[m]>ab[n] && n!=a && m!=a)
            {
                ac[b]=ab[n];
                if(n+1!=a)
                {
                n++;
            }
        }
        else if(ar[m]<ab[n] && m!=a && n!=a)
        {
            ac[b]=ar[m];
            if(m+1!=a)
            {
            m++;
        }
    }
      else if(ar[m]==ab[n])
      {
          ac[b]=ar[m];
          if(m+1!=a)
          {
              m++;
            
          }
          if(n+1!=a)
          {
              n++;
          }
       }
    }
    for(m=0;m<a+a;m++)
    {
        System.out.println(+ac[m]);
    }   
    }
}