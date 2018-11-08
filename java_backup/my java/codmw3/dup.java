import java.util.*;
public class dup
{
    Scanner sc=new Scanner(System.in);
    int ar[],a,b;
    void input()
    {
        int m;
        System.out.println("Enter limit");
        a=sc.nextInt();
        ar=new int[a];
        for(m=0;m<a;m++)
        {
            System.out.println("Enter number");
            ar[m]=sc.nextInt();
            if(m==1)
            {
                b=ar[0];
            }
            else if(b<ar[m])
            {
                b=ar[m];
            }
        }
        b=b+9;
        el();
    }
    void el()
    {
        int m,n;
        for(m=0;m<a;m++)
        {
            for(n=1;n<a;n++)
            {
                if(m==n)
                {
                    continue;
                }
                if(ar[m]==ar[n])
                {
                    ar[n]=b;
                }
            }
        }
        for(m=0;m<a;m++)
        {
           if(ar[m]==b)
           {
              continue;
            }
            else
           {
                System.out.println(+ar[m]);
            }
        }
    }
}