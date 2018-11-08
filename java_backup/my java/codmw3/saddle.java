import java.util.*;
public class saddle
{
    Scanner sc=new Scanner(System.in);
    int a[][],b;
    void input()
    {
        int c,d;
        System.out.println("Enter limit");
        b=sc.nextInt();
        a=new int[b][b];
        for(c=0;c<b;c++)
        {
            for(d=0;d<b;d++)
            {
                System.out.println("Enter number");
                a[c][d]=sc.nextInt();
            }
        }
    }
    void check()
    {
        int c,e,d,g=0;
        for(c=0;c<b;c++)
        {
            e=a[c][0];
            for(d=0;d<b;d++)
            {
                if(e<a[c][d])
                {
                    e=a[c][d];
                    g=d;
                }
            }
            g=lw(c,g);
            if(g==e)
            {
                System.out.println("Saddle point present");
                break;
            }
        }
    }
    int lw(int m,int n)
    {
        int i,k;
        k=a[0][n];
        for(i=0;i<b;i++)
        {
            if(k>a[0][i])
            {
                k=a[0][i];
            }
        }
        return i;
    }
}    