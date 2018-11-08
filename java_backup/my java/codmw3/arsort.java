import java.util.*;
public class arsort
{
    Scanner sc=new Scanner(System.in);
    int ar[][],a;
    arsort(int s)
    {
        a=s;
        ar=new int[a][a];
    }
    void input()
    {
        int m,n;
        for(m=0;m<a;m++)
        {
            for(n=0;n<a;n++)
            {
                System.out.println("Enter data");
                ar[m][n]=sc.nextInt();
            }
        }
    }
    void display()
    {
        int m,n;
        for(m=0;m<a;m++)
        {
            for(n=0;n<a;n++)
            {
                System.out.print(+ar[m][n]+" ");
            }
            System.out.println();
        }
    }
    void sort()
    {
         int m,n,k;
        for(m=0;m<a;m++)
        {
            for(n=0;n<a-1;n++)
            {
                if(ar[n][n]>ar[n+1][n+1])
                {
                  k=ar[n][n];
                  ar[n][n]=ar[n+1][n+1];
                  ar[n+1][n+1]=k;
                }
            }
        }
    }
    void main()
    {
        System.out.println("Enter size");
        arsort ob=new arsort(sc.nextInt());
        ob.input();
        ob.display();
        ob.sort();
        System.out.println();
        ob.display();
        System.out.println();
        ob.perisort();
        ob.display();
    }
    void perisort()
    {
        int m,n,k;
        for(m=0;m<a;m++)
        {
            for(n=0;n<a-1;n++)
            {
                if(ar[0][n]>ar[0][n+1])
                {
                    k=ar[0][n];
                    ar[0][n]=ar[0][n+1];
                    ar[0][n+1]=k;
                }
            }
            for(n=0;n<a-1;n++)
            {
                if(ar[n][a-1]>ar[n+1][a-1])
                {
                    k=ar[n][a-1];
                    ar[n][a-1]=ar[n+1][a-1];
                    ar[n+1][a-1]=k;
                }
            }
            for(n=0;n<a-1;n++)
            {
                if(ar[a-1][n]<ar[a-1][n+1])
                {
                    k=ar[a-1][n];
                    ar[a-1][n]=ar[a-1][n+1];
                    ar[a-1][n+1]=k;
                }
            }
            for(n=1;n<a-1;n++)
            {
                if(ar[n][0]<ar[n+1][0])
                {
                    k=ar[n][0];
                    ar[n][0]=ar[n+1][0];
                    ar[n+1][0]=k;
                }
            }
        }
    }
}