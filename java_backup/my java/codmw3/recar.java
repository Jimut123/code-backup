import java.util.*;
public class recar
{
    Scanner sc=new Scanner(System.in);
    int high,low,i,ar[];
    void input()
    {
        int a,m;
        System.out.println("Enter limit");
        a=sc.nextInt();
        ar=new int[a];
        for(m=0;m<a;m++)
        {
            System.out.println("Enter data");
            ar[m]=sc.nextInt();
        }
        i=ar[0];
        for(m=0;m<a;m++)
        {
            if(ar[m]>i)
            {
                i=ar[m];
            }
        }
        i++;
        high=0;
        low=a;
        ch(0,ar[0],ar[0]);
    }
    void ch(int a,int m,int n)
    {
        int k;
        if(ar[a]!=i)
        {
            k=cnt(ar[a],0);
            if(k>high)
            {
                m=ar[a];
                high=k;
            }
            if(k<low)
            {
                n=ar[a];
                low=k;
            }
        }
        if(a+1==ar.length)
        {
            System.out.println("Highest :"+m);
            System.out.println("Lowest :"+n);
            return;
        }
        ch(a+1,m,n);
    }
    int cnt(int k,int m)
    {
        if(m==ar.length-1)
        {
            if(ar[m]==k)
               {
                   return 1;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                if(ar[m]==k)
               {
                   return (1+cnt(k,m+1));
                }
                else
                {
                    return (cnt(k,m+1));
                }
            }
        }
    }