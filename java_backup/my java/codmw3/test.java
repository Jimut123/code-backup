import java.util.*;
public class test
{
    void main()
    {
    Scanner sc=new Scanner(System.in);
     int a;
        System.out.println("Enter limit");
        a=sc.nextInt();
        int b,m,n,k=0,st=0;
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
       for(m=0;m<a;m++)
       {
           for(n=0;n<a-1-m;n++)
           {
               if(ar[n]>ar[n+1])
               {
                   k=ar[n];
                   ar[n]=ar[n+1];
                   ar[n+1]=k;
                }
                if(ab[n]>ab[n+1])
                {
                    k=ab[n];
                    ab[n]=ab[n+1];
                    ab[n+1]=k;
                }
            }
        }
         m=0;
        n=0;
        
        for(b=0;b<(a+a);b++)
        {
            if(ar[m]>ab[n])
            {
                ac[b]=ab[n];   
                n++;
                if(n==a)
                {
                    
                    st=b;
                    break;
                }
    }
        else if(ar[m]<ab[n])
        {
            ac[b]=ar[m]; 
            m++;
            if(m==a)
            {
                 st=b;
                
                break;
            }
    }
      else if(ar[m]==ab[n])
      {
          ac[b]=ar[m];
          m=m+1;
          n=n+1;
          if(m==a)
          {
               st=b;
              break;
            }
            else if(n==a)
            {
                 st=b;
                break;
            }
       }
    }
    if(m==a)
    {
        for(b=(st+1);b<(a+a);b++)
        {
            ac[b]=ab[n];
            n++;
        }
    }
    else if(n==a)
    {
          for(b=st+1;b<(a+a);b++)
        {
            ac[b]=ar[m];
            m++;
        }
    }
    for(m=0;m<a+a;m++)
    {
        System.out.println(+ac[m]);
    }   
    /*
   for(m=0;m<a;m++)
   {
       System.out.println(+ar[m]);
    }
    System.out.println();
    for(n=0;n<a;n++)
{
    System.out.println(+ab[n]);
}*/
}
}
