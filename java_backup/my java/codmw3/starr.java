import java.util.*;
public class starr
{
    Scanner sc=new Scanner(System.in);
    int ar[],a;
    void input()
    {
        int m;
        System.out.println("Enter number of elements");
        a=sc.nextInt();
        ar=new int[a];
        for(m=0;m<a;m++)
        {
            System.out.println("Enter number");
            ar[m]=sc.nextInt();
        }
    }
    void sort()
    { 
        int m,i,k;
        for(m=0;m<a;m++)
        {
            if(ar[m]%2==0)
            {
                for(i=m;i<a;i++)
                {
                    if(ar[i]%2==1 && m+1!=a)
                    {
                        k=ar[i];
                        ar[i]=ar[m+1];
                        ar[m+1]=k;
                    }
                }
                if(m+2!=a)
                {
                for(i=m+2;i<a;i++)
                {
                    if(ar[i]%2==1 && m+2!=a)
                    {
                        k=ar[i];
                        ar[i]=ar[m+2];
                        ar[m+2]=k;
                    }
                }
            }
            }
        }
    }
    void display()
    {
        System.out.println();
        int b;
        for(b=0;b<a;b++)
        {
            System.out.println(+ar[b]);
        }
    }
}